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

import com.sv.udb.modelos.Usuarios;
import com.sv.udb.servicios.UsuariosService;


@Controller
@RequestMapping(value = {"/usuarios"})
public class UsuariosController {
	private static final Logger logger = Logger.getLogger(Usuarios.class);
	 
    public UsuariosController() {
        System.out.println("usuasController()");
    }
 
    @Autowired
    private UsuariosService usuariosService;
 
    @RequestMapping(value = "/")
    public ModelAndView listUsua(ModelAndView model) throws IOException {
    	List<Usuarios> listUsua = usuariosService.consTodo();
        model.addObject("listUsua", listUsua);
        model.setViewName("usuarios/home");
        return model;
    }
    
    @RequestMapping(value = "/nuevoUsua", method = RequestMethod.GET)
    public ModelAndView newContact(ModelAndView model) {
    	Usuarios usua = new Usuarios();
        model.addObject("objeUsua", usua);
        model.setViewName("usuarios/usuaForm");
        return model;
    }
    
    @RequestMapping(value = "/guardarUsua", method = RequestMethod.POST)
    public ModelAndView guarUsua(@ModelAttribute Usuarios usua) {
        if (usua.getCodiUsua() == null) { // Si es 0 hay que crearlo
        	usuariosService.guarUsua(usua);
        } else {
        	usuariosService.actuUsua(usua);
        }
        return new ModelAndView("redirect:/usuarios/");
    }
    
    @RequestMapping(value = "/editarUsua", method = RequestMethod.GET)
    public ModelAndView editarUsua(HttpServletRequest request) {
        int codiUsua = Integer.parseInt(request.getParameter("codi"));
        Usuarios usua = usuariosService.consUsua(codiUsua);
        ModelAndView model = new ModelAndView("usuarios/usuaForm");
        model.addObject("objeUsua", usua);
        return model;
    }
    
    @RequestMapping(value = "/eliminarUsua", method = RequestMethod.GET)
    public ModelAndView eliminarUsua(HttpServletRequest request) {
        int codiUsua = Integer.parseInt(request.getParameter("codi"));
        usuariosService.elimUsua(codiUsua);
        return new ModelAndView("redirect:/usuarios/");
    }
}