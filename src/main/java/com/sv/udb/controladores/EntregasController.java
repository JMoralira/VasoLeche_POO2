package com.sv.udb.controladores;

import java.io.IOException;
import java.util.Collections;
import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.jboss.logging.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.sv.udb.modelos.Entregas;
import com.sv.udb.modelos.Escuelas;
import com.sv.udb.modelos.Lotes;
import com.sv.udb.servicios.EntregasService;

@Controller
@RequestMapping(value = {"/entregas"})
public class EntregasController {
	private static final Logger logger = Logger.getLogger(Entregas.class);
	 
    public EntregasController() {
        System.out.println("entrsController()");
    }
    
    @Autowired
    private EntregasService entregasService;
    
    @RequestMapping(value = "/")
    public ModelAndView listEntr(ModelAndView model) throws IOException {
    	List<Entregas> listEntr = entregasService.consTodo();
        model.addObject("listEntr", listEntr);
        model.setViewName("entregas/home");
        return model;
    }
    
    @RequestMapping(value = "/nuevoEntr", method = RequestMethod.GET)
    public ModelAndView newContact(ModelAndView model) {
    	//Objeto de la entrega
    	Entregas entr = new Entregas();
        model.addObject("objeEntr", entr);
        
        //Lista de escuelas para el comboBox
        List<Escuelas> listEscu = entregasService.consTodoEscu();
        model.addObject("listEscu", listEscu);
        
        //Lista de lotes para el comboBox
        List<Lotes> listLote = entregasService.consTodoLote();
        model.addObject("listLote", listLote);
        
        model.setViewName("entregas/entrForm");
        return model;
    }
    
    @RequestMapping(value = "/guardarEntr", method = RequestMethod.POST)
    public ModelAndView guarEntr(@ModelAttribute Entregas entr) {
        if (entr.getCodiEntr() == null) {
        	entregasService.actuEntr(entr);
        } else {
        	entregasService.actuEntr(entr);
        }
        return new ModelAndView("redirect:/entregas/");
    }
    
    @RequestMapping(value = "/editarEntr", method = RequestMethod.GET)
    public ModelAndView editarEntr(HttpServletRequest request) {
        int codiEntr = Integer.parseInt(request.getParameter("codi"));
        Entregas entr = entregasService.consEntr(codiEntr);
        ModelAndView model = new ModelAndView("entregas/entrForm");
        model.addObject("objeEntr", entr);
        
        //Lista de escuelas para el comboBox
        List<Escuelas> listEscu = entregasService.consTodoEscu();
        model.addObject("listEscu", listEscu);
        
        //Lista de lotes para el comboBox
        List<Lotes> listLote = entregasService.consTodoLote();
        model.addObject("listLote", listLote);
        
        return model;
    }
    
    @RequestMapping(value = "/eliminarEntr", method = RequestMethod.GET)
    public ModelAndView eliminarEntr(HttpServletRequest request) {
        int codiEntr = Integer.parseInt(request.getParameter("codi"));
        entregasService.elimEntr(codiEntr);
        return new ModelAndView("redirect:/entregas/");
    }
    
}
