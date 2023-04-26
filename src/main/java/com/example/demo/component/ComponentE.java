package com.example.demo.component;

import org.springframework.beans.factory.annotation.*;
import org.springframework.stereotype.*;

@Component
public class ComponentE {
	
	@Autowired
	private ComponentD comp;

	public ComponentD getComp() {
		return comp;
	}

	public void setComp(ComponentD comp) {
		this.comp = comp;
	}
	
	
}
