package com.uni.main;

import com.uni.controller.bestellungen;
import com.uni.controller.bestellungenController;
import com.uni.view.View;

public class Main {
    public static void main(String[] args) {

        bestellungen bestellungenController = (bestellungen) new bestellungenController();
        View view = new View(bestellungenController);
        view.run();
    }
}