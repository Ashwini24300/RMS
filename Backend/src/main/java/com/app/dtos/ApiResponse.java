package com.app.dtos;

import java.time.LocalDateTime;


// Generic response from the server.
public class ApiResponse {

	// message to return to client.
	private String message;
	
	// timestamp of the action.
	private LocalDateTime timestamp;

	public ApiResponse(String message) {
		this.message = message;
		this.timestamp = LocalDateTime.now();

	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public LocalDateTime getTimestamp() {
		return timestamp;
	}

	public void setTimestamp(LocalDateTime timestamp) {
		this.timestamp = timestamp;
	}
	
}


