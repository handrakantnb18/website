package com.example.demo.aiagent;

import org.springframework.ai.chat.client.ChatClient;
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
		String answer = 
				chatClient
				.prompt(question)
				.call()
				.content();
		
		ChatHistory chat = new ChatHistory();
		chat.setQuestion(question); 
		chat.setAnswer(answer);
		
		repository.save(chat);
		
		return answer;
		
	}
	
	
//	public String askAI(String question)
//	{
//		
//		return chatClient
//				.prompt(question)
//				.call()
//				.content();
//	}
//	
	
	
}
