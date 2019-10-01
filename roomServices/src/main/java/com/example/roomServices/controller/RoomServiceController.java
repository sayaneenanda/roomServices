package com.example.roomServices.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
//import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.example.roomServices.model.roomServiceModel;

@Controller
public class RoomServiceController {

	@GetMapping("addroomService")
    public String sendForm(roomServiceModel user) {

        return "addroomService";
    }

    @PostMapping("/addroomService")
    public String processForm(@RequestParam(value = "roomService", required = false) String [] checkboxValue) {
    	int i=0;
    	while(checkboxValue!=null) {
    		if(i==2) break;
    		System.out.println(checkboxValue[i].toString());
    		
    		i++;
    	}
    	//totalcost calculation and return in a web page
        return "showMessage";
    }
}
