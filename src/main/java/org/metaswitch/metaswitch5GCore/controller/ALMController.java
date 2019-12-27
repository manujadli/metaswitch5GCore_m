package org.metaswitch.metaswitch5GCore.controller;

import org.metaswitch.metaswitch5GCore.model.Assembly;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ALMController {
	
	@RequestMapping(value = "/assembly", method = RequestMethod.GET)
	public Assembly create() {

		Assembly assembly = new Assembly();
		assembly.setAsseblyName("Metaswitch MDM");
		assembly.setOpenstackImageName("5G Core");
		assembly.setNetworkPrivateKey("!@!@#$!@#$$$$");
		assembly.setConnectionTimeout(1000);		
		return assembly;
	}
	
	@GetMapping("/hello")
	public String hello() {		
		return "Hello world!";
	}
	
}
