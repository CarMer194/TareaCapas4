package com.uca.capas.tarea4.controller;

import javax.validation.Valid;

import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.uca.capas.tarea4.domain.Producto;
import com.uca.capas.tarea4.domain.Usuario;

@Controller
public class MainController {
	
	@RequestMapping("/producto")
	public ModelAndView producto() {
		ModelAndView model=new ModelAndView();
		model.addObject("producto",new Producto());
		model.setViewName("/producto");
		
		return model;
	}
	
	@RequestMapping("/procesarProduc")
	public ModelAndView procesarProducto(@Valid @ModelAttribute Producto producto,BindingResult result) {
		ModelAndView model=new ModelAndView();
		if(result.hasErrors()) {
			model.setViewName("producto");
		}else {
			model.addObject("producto",producto.getNombre());
			model.setViewName("resultadoPro");
		}
		
		return model;
	}
	
	@RequestMapping("/login")
	public ModelAndView login() {
		ModelAndView model=new ModelAndView();
		model.addObject("usuario", new Usuario());
		model.setViewName("/login");
		return model;
	}
	
	@RequestMapping("/procesar")
	public ModelAndView procesar(@Valid @ModelAttribute Usuario user, BindingResult result) {
		ModelAndView model=new ModelAndView();
		if(result.hasErrors()) {
			model.setViewName("/login");
		}else {
			model.addObject("user",user.getUsuario());
			model.addObject("pass",user.getContrsenia());
			model.setViewName("resultado");
		}
		return model;
	}
	
}
