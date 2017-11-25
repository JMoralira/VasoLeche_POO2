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

import com.sv.udb.modelos.Lotes;
import com.sv.udb.servicios.LotesService;

@Controller
@RequestMapping(value = {"/lotes"})
public class LotesController {
private static final Logger logger = Logger.getLogger(Lotes.class);
	
	public LotesController(){
		System.out.println("lotesController()");
	}
	
	@Autowired
	private LotesService LotesService;
	
	@RequestMapping(value = "/")
	public ModelAndView listLote(ModelAndView model) throws IOException{
		List<Lotes> listLote = LotesService.consTodo();
		   model.addObject("listLote", listLote);
	        model.setViewName("lotes/home");
	        return model;
	    }
	
	@RequestMapping(value= "/nuevoLote", method = RequestMethod.GET)
	public ModelAndView newContact(ModelAndView model){
		Lotes lote = new Lotes();
		model.addObject("objeLote", lote);
		model.setViewName("lotes/loteForm");
		return model;
	}
	
	@RequestMapping(value = "/guardarLote", method = RequestMethod.POST)
	public ModelAndView guarLote(@ModelAttribute Lotes lote){
		if (lote.getCodiLote() == null){
			//si es 0 hay que crearlo
			LotesService.guarLote(lote);
	}
		else {
			LotesService.actuLote(lote);
		}
		return new ModelAndView("redirect:/lotes/");
	}

	@RequestMapping(value = "/editarLote", method = RequestMethod.GET)
	public ModelAndView editarLote(HttpServletRequest  request){
	int codiLote = Integer.parseInt(request.getParameter("codi"));
	Lotes lote = LotesService.consLote(codiLote);
	ModelAndView model = new ModelAndView("lotes/loteForm");
	model.addObject("objeLote", lote);
	return model;
	}
	
	@RequestMapping(value = "/eliminarLote", method = RequestMethod.GET)
	public ModelAndView eliminarLote(HttpServletRequest  request){
		int codiLote = Integer.parseInt(request.getParameter("codi"));
		LotesService.elimLote(codiLote);
		return new ModelAndView("redirect:/lotes/");
	}
}
