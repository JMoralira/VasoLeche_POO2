package com.sv.udb.controladores;

import java.io.IOException;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.transaction.Transactional;

import org.jboss.logging.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.sv.udb.modelos.Departamentos;

import com.sv.udb.servicios.DepartamentosService;

@Transactional
@Controller
@RequestMapping(value = {"/departamentos"})
public class DepartamentosController {
	private static final Logger logger = Logger.getLogger(Departamentos.class);
	 
    public DepartamentosController() {
        System.out.println("DepartamentosController()");
    }
 
    @Autowired
    private DepartamentosService departamentosService;
 
    @RequestMapping(value = "/")
    public ModelAndView listUsua(ModelAndView model) throws IOException {
    	List<Departamentos> listUsua = departamentosService.consTodo();
        model.addObject("listDepa", listUsua);
        model.setViewName("departamentos/home");
        return model;
    }
    
    @RequestMapping(value = "/nuevoDepa", method = RequestMethod.GET)
    public ModelAndView newContact(ModelAndView model) {
    	Departamentos depa = new Departamentos();
        model.addObject("objeDepa", depa);
        model.setViewName("departamentos/depaForm");
        return model;
    }
    
    @RequestMapping(value = "/guardarDepa", method = RequestMethod.POST)
    public ModelAndView guarDepa(@ModelAttribute Departamentos depa) {
        if (depa.getCodiDepa() == null) { // Si es 0 hay que crearlo
        	departamentosService.guarDepa(depa);
        } else {
        	departamentosService.actuDepa(depa);
        }
        return new ModelAndView("redirect:/departamentos/");
    }
    
    @RequestMapping(value = "/editarDepa", method = RequestMethod.GET)
    public ModelAndView editarUsua(HttpServletRequest request) {
        int codiDepa = Integer.parseInt(request.getParameter("codi"));
        Departamentos depa = departamentosService.consDepa(codiDepa);
        ModelAndView model = new ModelAndView("departamentos/depaForm");
        model.addObject("objeDepa", depa);
        return model;
    }
    
    @RequestMapping(value = "/eliminarDepa", method = RequestMethod.GET)
    public ModelAndView eliminarDepa(HttpServletRequest request) {
        int codiDepa = Integer.parseInt(request.getParameter("codi"));
        departamentosService.elimDepa(codiDepa);
        return new ModelAndView("redirect:/departamentos/");
    }
}


