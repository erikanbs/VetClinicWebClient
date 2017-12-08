package com.ekholabs.service;

import java.util.List;

import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;

import com.ekholabs.dto.ClientDto;

@FeignClient(serviceId = "vet-clinic")
public interface ClientService {
	
	@RequestMapping(path="/vet/client/getAll")
	public List<ClientDto> findAll();

}