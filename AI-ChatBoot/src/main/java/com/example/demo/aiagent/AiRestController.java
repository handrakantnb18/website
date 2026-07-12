package com.example.demo.aiagent;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/chat")
public class AiRestController {

	
	private final AIService aiService;
	
	public AiRestController(AIService aiService)
	{
		this.aiService = aiService;
	}
	
	@GetMapping
	public String chat(String message)
	{
		return aiService.askAI(message);
	}
}
