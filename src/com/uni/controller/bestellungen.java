package com.uni.controller;

import com.uni.model.Produkte;

import java.util.List;

public interface bestellungen {
    Produkte FindById(Integer id);

    Produkte ProdukteByAdresse(String adresse);

    List<Produkte> getAll();

    Produkte addProdukt(Integer Id, String name, int preis, String adresse);



}
