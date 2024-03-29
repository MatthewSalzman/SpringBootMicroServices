package com.plantplaces;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 @author Administrator
 Handle the /start endpoint
 @return
*/
@Controller
public class PlantPlacesController {
	
	@RequestMapping(value="/start", method=RequestMethod.GET)
	public String start() {
		return "start";
	}
	
	@RequestMapping(value="/start", method=RequestMethod.GET, headers={"content-type=text/json"})
	public String readJSON() {
		return "start";
	}
	
	
	@RequestMapping(value="/start", method=RequestMethod.GET, params = {"loyalty=blue"})
	public String readBlue() {
		return "start";
	}
	@RequestMapping(value="/start", method=RequestMethod.GET, params = {"loyalty=silver"})
	public String readSilver() {
		return "start";
	}
	
	
	
	@PostMapping("/start")
	public String create() {
		return "start";
	}
	
	/**
	 @author Administrator
	 @ Handle the /start end point
	 @return
	*/
	@RequestMapping("/index")
	public String index() {
		return "start";
	}
}

