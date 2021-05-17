package net.setlog.example.jwt;

import lombok.Data;

@Data
public class UsernameAndPasswordAuthencationRequest {

	private String username;
	private String password;
	
}
