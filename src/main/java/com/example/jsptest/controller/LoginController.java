package com.example.jsptest.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

import com.example.jsptest.model.LoginDTO;

@Controller
@RequestMapping("/login")
public class LoginController {
	
	@PostMapping("/submit")
	public ResponseEntity<LoginDTO> loginSubmit(@RequestBody final LoginDTO loginDTO) {
		return ResponseEntity.ok(loginDTO);
	}

}
