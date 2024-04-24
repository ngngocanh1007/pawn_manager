package com.pawn_manager.dto;

import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@NoArgsConstructor
public class AuthToken {
	
	private String token;
	
	public AuthToken(String token) {
		this.token = token;
	}
}
