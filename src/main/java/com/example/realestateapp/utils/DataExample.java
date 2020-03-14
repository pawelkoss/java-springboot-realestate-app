package com.example.realestateapp.utils;

import com.example.realestateapp.models.City;
import com.example.realestateapp.models.Client;
import com.example.realestateapp.models.HomeType;
import com.example.realestateapp.models.Offer;
import com.example.realestateapp.repositories.ClientRepository;
import com.example.realestateapp.repositories.OfferRepository;
import org.springframework.stereotype.Component;

@Component
public class DataExample {

    private OfferRepository offerRepository;
    private ClientRepository clientRepository;

    public DataExample(OfferRepository offerRepository, ClientRepository clientRepository) {
        this.offerRepository = offerRepository;
        this.clientRepository = clientRepository;
    }

    public void initializeRepository(){

        Client client1 = Client.of("Jan", "Nowak");
        Client client2 = Client.of("James", "Brown");
        Client client3 = Client.of("Agata", "Stone");

        clientRepository.add(client1);
        clientRepository.add(client2);
        clientRepository.add(client3);

        Offer offer1 = Offer.of(client1, HomeType.HOUSE, City.WARSZAWA, "Karolkowa 4", 189, 6);
        Offer offer2 = Offer.of(client2, HomeType.FLAT, City.WARSZAWA, "Aleje 400", 89, 4);
        Offer offer3 = Offer.of(client3, HomeType.APARTMENT, City.WARSZAWA, "Nowa 4", 69, 3);
        Offer offer4 = Offer.of(client1, HomeType.HOUSE, City.WARSZAWA, "Karolkowa 14", 119, 4);

        offerRepository.add(offer1);
        offerRepository.add(offer2);
        offerRepository.add(offer3);
        offerRepository.add(offer4);



    }
}
