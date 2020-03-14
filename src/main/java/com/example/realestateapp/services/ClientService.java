package com.example.realestateapp.services;

import com.example.realestateapp.models.Client;
import com.example.realestateapp.repositories.ClientRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ClientService {

    private ClientRepository clientRepository;

    public ClientService(ClientRepository clientRepository){
        this.clientRepository = clientRepository;
    }

    public List<Client> getAll(){
        return clientRepository.getAll();
    }

    public Client get(int id){
        return clientRepository.findById(id);
    }

    public Client create(Client client){

        return clientRepository.add(client);
    }

    public Client update(int id, Client client){

        return clientRepository.updateById(id, client);
    }

    public void delete(int id){

        clientRepository.deleteById(id);
    }
}
