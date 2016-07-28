package com.chronicler;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.chronicler.model.Involvement;
import com.chronicler.repo.InvolvementRepository;

@RestController
public class BeingController {
	@Autowired
	InvolvementRepository involvementRepository;
	
	@RequestMapping(value="/beingStory", method=RequestMethod.POST)
	public Involvement createBeingStoryRelationship(@RequestBody Involvement involvement) {
		involvementRepository.save(involvement);		
		return involvement;
		
	}	
}
