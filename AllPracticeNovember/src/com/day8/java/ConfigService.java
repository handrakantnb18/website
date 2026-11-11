package com.day8.java;

// Multi-line Strings & JSON Mocking

public class ConfigService {

	public String getMockJsonConfig(String env, int timeout) {
        return """
        {
            "environment": "%s",
            "connection": {
                "timeout": %d,
                "retryAttempts": 3
            },
            "features": ["auth", "billing", "analytics"]
        }
        """.formatted(env, timeout); 
    }
	
}
