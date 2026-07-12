package com.example.demo.aiagent;

import org.springframework.data.jpa.repository.JpaRepository;

public interface AIRepository extends JpaRepository<ChatHistory, Long>  {

	
}
