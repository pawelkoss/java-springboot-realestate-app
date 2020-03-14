package com.example.realestateapp.controllers;

import com.example.realestateapp.models.Client;
import com.example.realestateapp.services.ClientService;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/client")
public class ClientController {

    private ClientService clientService;

    public ClientController(ClientService clientService) {
        this.clientService = clientService;
    }

    @GetMapping("")
    public List<Client> getClient(){
        return clientService.getAll();
    }

    @GetMapping("/{id}")
    public Client getClient(@PathVariable("id") int id){
        return clientService.get(id);
    }

    @PostMapping("/create")
    @ResponseStatus(HttpStatus.CREATED)
    public Client createClient(@RequestBody Client client){
        return clientService.create(client);
    }

    @PutMapping("/{id}")
    public Client updateClient(@PathVariable("id") int id, @RequestBody Client client){
        return clientService.update(id, client);
    }

    @DeleteMapping("/{id}")
    public String deleteClient(@PathVariable("id") int id){
        clientService.delete(id);
        return "OK";
    }
}
