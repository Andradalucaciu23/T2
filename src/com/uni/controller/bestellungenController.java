package com.uni.controller;

import com.uni.model.Produkte;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class bestellungenController {
    private static List<Produkte> produkteList;
    private bestellungenController bestellungenController;

    public bestellungenController() {
        this.produkteList = new ArrayList<>();
        this.bestellungenController = bestellungenController;
    }

    public Produkte FindById(Integer id) {
        for (Produkte produkte:
                produkteList) {
            if(Objects.equals(produkte.getId(), id))
                return produkte;
        }
        return null;

    }

    /*
    @Override
    public Produkte ProdukteByAdresse(String adresse){

    }
*/
    @Override
    public static List<Produkte> getAll() {
        return produkteList;
    }

    @Override
    public static Produkte addProdukt(Integer id, String name, int preis, String adresse) {
        Produkte tempProdukt = new Produkte(id, name, preis, adresse);
        produkteList.add(tempProdukt);
        return tempProdukt;
    }


}
