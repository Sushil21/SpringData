package com.example.demo;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController; 
import com.example.model.Sample;
import com.example.repository.SampleRepository;
import com.example.service.SampleService;
 


@RestController
public class HelloController {
	
	@Autowired
	 private SampleRepository sampleRepository;
	
	@RequestMapping(value="/testing",method=RequestMethod.GET)
	public @ResponseBody String sampleAPI(){
		Sample task = new Sample();
		task.setFirstName("sushil");
		sampleRepository.save(task);
		
		Sample task1  = sampleRepository.findFirstById(1L);
		System.out.println("data received"+task1);
		
		
		List<Sample> list = sampleRepository.findByFirstName("sushil");
		System.out.println("list::"+list);
		return "Hello World!!!!!";
	}

	
	 
}
