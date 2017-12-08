package com.ekholabs.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.ekholabs.dto.ClientDto;
import com.ekholabs.service.ClientService;

@Controller()
@RequestMapping(path = "/vetweb")
public class MainController {
	
    private ClientService clientService;
	
    @Autowired
	public MainController(ClientService clientService) {
		this.clientService = clientService;
	}

	@GetMapping("/clients")
	public ResponseEntity<List<ClientDto>> getAllClients() {
        return ResponseEntity.ok(clientService.findAll());
    }
}