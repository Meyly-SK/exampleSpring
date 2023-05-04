package com.cibertec.edu.Example.Controller;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.cibertec.edu.Example.Service.serviceMes;

@Controller
public class mesController {
	
	 @Autowired
	    private serviceMes serviceMes;

	    @GetMapping("/")
	    public String index(Model model) {
	        model.addAttribute("meses", Arrays.asList(
	            "Enero", "Febrero", "Marzo","Abril" , "Mayo" , "Junio" ,"Julio" ,"Agosto","Septiembre","Octubre","Noviembre","Diciembre"
	        ));
	        return "index";
	    }

	    @GetMapping("/days-until-month") 
	    public String MesesDia(@RequestParam String nombreMes, @RequestParam int anio, Model model) {
	    	int days = serviceMes.getDiasHastaMes(nombreMes, anio);
	    	model.addAttribute("dias", days);
	    	return "resultado";
	    	}
	    	}
	    		
	    
