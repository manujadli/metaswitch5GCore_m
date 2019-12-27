package org.metaswitch.metaswitch5GCore.service;

import org.metaswitch.metaswitch5GCore.respsitory.HelloRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class HelloServiceImpl implements HelloService {

	@Autowired
    HelloRepository helloRepository;
	
	@Override
	public String get() {		
		return helloRepository.get();
	}

}
