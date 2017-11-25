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

import com.sv.udb.modelos.Permisos;
import com.sv.udb.servicios.PermisosService;

@Controller
@RequestMapping(value = {"/permisos"})
public class PermisosController {
	private static final Logger logger = Logger.getLogger(Permisos.class);
	 
    public PermisosController() {
        System.out.println("permsController()");
    }
 
    @Autowired
    private PermisosService PermisosService;
 
    @RequestMapping(value = "/")
    public ModelAndView listPerm(ModelAndView model) throws IOException {
    	List<Permisos> listPerm = PermisosService.consTodo();
        model.addObject("listPerm", listPerm);
        model.setViewName("permisos/home");
        return model;
    }
    
    @RequestMapping(value = "/nuevoPerm", method = RequestMethod.GET)
    public ModelAndView newContact(ModelAndView model) {
    	Permisos perm = new Permisos();
        model.addObject("objePerm", perm);
        model.setViewName("permisos/permForm");
        return model;
    }
    
    @RequestMapping(value = "/guardarPerm", method = RequestMethod.POST)
    public ModelAndView guarPerm(@ModelAttribute Permisos perm) {
        if (perm.getCodiPerm() == null) { // Si es 0 hay que crearlo
        	PermisosService.guarPerm(perm);
        } else {
        	PermisosService.actuPerm(perm);
        }
        return new ModelAndView("redirect:/permisos/");
    }
    
    @RequestMapping(value = "/editarPerm", method = RequestMethod.GET)
    public ModelAndView editarPerm(HttpServletRequest request) {
        int codiPerm = Integer.parseInt(request.getParameter("codi"));
        Permisos perm = PermisosService.consPerm(codiPerm);
        ModelAndView model = new ModelAndView("permisos/permForm");
        model.addObject("objePerm", perm);
        return model;
    }
    
    @RequestMapping(value = "/eliminarPerm", method = RequestMethod.GET)
    public ModelAndView eliminarPerm(HttpServletRequest request) {
        int codiPerm = Integer.parseInt(request.getParameter("codi"));
        PermisosService.elimPerm(codiPerm);
        return new ModelAndView("redirect:/permisos/");
    }
}