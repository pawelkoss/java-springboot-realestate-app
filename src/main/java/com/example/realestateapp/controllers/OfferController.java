package com.example.realestateapp.controllers;

import com.example.realestateapp.models.Client;
import com.example.realestateapp.models.Offer;
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
@RequestMapping("/offer")
public class OfferController {

    private OfferService offerService;

    public OfferController(OfferService offerService) {
        this.offerService = offerService;
    }

    @GetMapping("")
    public List<Offer> getOffer(){
        return offerService.getAll();
    }

    @GetMapping("/{id}")
    public Offer getOffer(@PathVariable("id") int id){
        return offerService.get(id);
    }

    @PostMapping("/create")
    @ResponseStatus(HttpStatus.CREATED)
    public Offer createOffer(@RequestBody Offer offer){
        return offerService.create(offer);
    }

    @PutMapping("/{id}")
    public Offer updateOffer(@PathVariable("id") int id, @RequestBody Offer offer){
        return offerService.update(id, offer);
    }

    @DeleteMapping("/{id}")
    public String deleteOffer(@PathVariable("id") int id){
        offerService.delete(id);
        return "OK";
    }
}
