package com.example.service;
 
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.model.Sample;
import com.example.repository.SampleRepository;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by jt on 1/10/17.
 */
@Service
public class SampleServiceImpl implements SampleService {

    private SampleRepository sampleRepository;

    @Autowired
    public SampleServiceImpl(SampleRepository sampleRepository) {
        this.sampleRepository = sampleRepository;
    }

	@Override
	public Sample getById(Long id) {
		// TODO Auto-generated method stub
		return sampleRepository.findOne(id);
	}

	@Override
	public void save(Sample task) {
		sampleRepository.save(task);
		
	}

 
}
