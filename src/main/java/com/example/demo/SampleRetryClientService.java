package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class SampleRetryClientService {
	@Autowired
	private SampleRetryService sampleRetryService;

	public String callRetryService() {
		return sampleRetryService.retryWhenException();
	}
}