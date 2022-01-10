package com.uni.model;

import java.util.Objects;

public class Produkte {
    private Integer id;
    private String name;
    private int preis;
    private String adresse;

    public Produkte(Integer id, String name, int preis, String adresse) {
        this.name = name;
        this.preis = preis;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getAdresse() {
        return adresse;
    }

    public void setAdresse(String adresse) {
        this.adresse = adresse;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPreis() {
        return preis;
    }

    public void setPreis(int preis) {
        this.preis = preis;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Produkte produkte = (Produkte) o;
        return preis == produkte.preis && Objects.equals(id, produkte.id) && Objects.equals(name, produkte.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name, preis);
    }

    @Override
    public String toString() {
        return "Produkte{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", preis=" + preis +
                '}';
    }
}
