package com.example.demo.aiagent;

import org.springframework.stereotype.Service;

@Service
public class AIService {

	
	private final ChatClient chatClient;
	
	public AIService(ChatClient.Builder builder)
	{
		this.chatClient = builder.build();
	}
	
	public String askAI(String question)
	{
		
		return chatClient
				.prompt(question)
				.call()
				.content();
		
	}
	
}
