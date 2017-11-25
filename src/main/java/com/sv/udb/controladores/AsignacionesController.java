package com.sv.udb.controladores;

import java.io.IOException;
import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.jboss.logging.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.sv.udb.modelos.Asignaciones;
import com.sv.udb.modelos.Permisos;
import com.sv.udb.modelos.Usuarios;
import com.sv.udb.servicios.AsignacionesService;;

/**
 * @author Luis Araujo
 * @version 1.0
 * @since 17-11-2017 
 * Class constructor.
 */
@Controller
@RequestMapping( value = {"/asignaciones"})
public class AsignacionesController {
	private static final Logger logger = Logger.getLogger(Asignaciones.class);
	
	/**
	 * Metodo para que se busque en cualquier parte del sitio
	 */
	@Autowired
	private AsignacionesService asignacionesService;
	
	
	/**
	 * 
	 * RequestMapping metodo que se utiliza para obtener la url actual en la que se esncuentra
	 * listAsig() metodo para llenar el modelo con los datos de la base
	 * @param model variable donde se almacenan los resultados de la consulta
	 * @return model
	 */
	@RequestMapping(value = "/")
    public ModelAndView listAsig(ModelAndView model) throws IOException {
    	List<Asignaciones> listAsig = asignacionesService.consTodo();
        model.addObject("listAsig", listAsig);
        model.setViewName("asignaciones/home");
        return model;
    }
	
	/**
	 * RequestMapping metodo que se utiliza para obtener la url actual en la que se esncuentra
	 * newContact() metodo para añadir el nuevo registro
	 * @param model variable en la cual se le añade el nuevo registro
	 * @return model
	 */
	@RequestMapping(value = "/nuevoAsig", method = RequestMethod.GET)
    public ModelAndView newContact(ModelAndView model) {
		//Objeto de la asignación
    	Asignaciones asig = new Asignaciones();
        model.addObject("objeAsig", asig);
        
        /**
         * @param listUsua lista donde se almacenan los registros de usuarios
         */
        //Lista de usuarios para el comboBox
        List<Usuarios> listUsua = asignacionesService.consTodoUsua();
        model.addObject("listUsua", listUsua);
        
        /**
         * @param listPerm lista donde se almacenan los registros de permisos
         */
        //Lista de permisos para el comboBox
        List<Permisos> listPerm = asignacionesService.consTodoPerm();
        model.addObject("listPerm", listPerm);
        
        model.setViewName("asignaciones/asigForm");
        return model;
    }
	
	/**
	 * 
	 * guarAsig() metodo en el cual se guarda y decide si actualizar tambien
	 * @param asig variable de tipo Asignaciones para manejar los datos
	 * @return ModelAndView
	 */
	@RequestMapping(value = "/guardarAsig", method = RequestMethod.POST)
    public ModelAndView guarAsig(@ModelAttribute Asignaciones asig) {
        if (asig.getCodiAsig() == null) { // Si es 0 hay que crearlo
        	asignacionesService.guarAsig(asig);
        } else {
        	asignacionesService.actuAsig(asig);
        }
        return new ModelAndView("redirect:/asignaciones/");
    }
	
	
	/**
	 * 
	 * @param request
	 * @return model
	 */
	@RequestMapping(value = "/editarAsig", method = RequestMethod.GET)
    public ModelAndView editarAsig(HttpServletRequest request) {
        int codiAsig = Integer.parseInt(request.getParameter("codi"));
        Asignaciones asig = asignacionesService.consAsig(codiAsig);
        ModelAndView model = new ModelAndView("asignaciones/asigForm");
        model.addObject("objeAsig", asig);
        
        /**
         * listUsua lista donde se almacenan los registros de usuarios
         */
        //Lista de usuarios para el comboBox
        List<Usuarios> listUsua = asignacionesService.consTodoUsua();
        model.addObject("listUsua", listUsua);
        
        /**
         * listPerm lista donde se almacenan los registros de permisos
         */
        //Lista de permisos para el comboBox
        List<Permisos> listPerm = asignacionesService.consTodoPerm();
        model.addObject("listPerm", listPerm);
        return model;
    }
	
	@RequestMapping(value = "/eliminarAsig", method = RequestMethod.GET)
    public ModelAndView eliminarAsig(HttpServletRequest request) {
        int codiAsig = Integer.parseInt(request.getParameter("codi"));
        asignacionesService.elimAsig(codiAsig);
        return new ModelAndView("redirect:/asignaciones/");
    }
}
