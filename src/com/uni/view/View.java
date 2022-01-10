package com.uni.view;

import com.uni.controller.bestellungen;
import com.uni.controller.bestellungenController;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

    public class View {
        private bestellungenController produkteController;


        public View(bestellungen produkteController) {
            this.produkteController = (bestellungenController) produkteController;

            bestellungenController.addProdukt(1, "Masina", 20000, "Cluj-Napoca");

        }


        public void run() {
            Scanner scanner = new Scanner(System.in);

            loop:
            while (true) {
                System.out.println("""
                     
                     0. Exit Program \r
                     1. Show all Produkte \r
                     2. FindById \r
                     3. Add a Produkt \r
                     4. Show all Produkte by Adresse \r
                    """);
                System.out.println("Enter input: ");
                int variant = scanner.nextInt();
                System.out.println("You've entered: " + variant);
                switch (variant) {
                    case 0:
                        break loop;
                    case 1:
                        ShowAll();
                        break;
                    case 2:
                        FindById();
                        break;
                    case 3:
                        addProdukt();
                        break;
                    case 4:
                        //ProdukteByAdresse();
                        break;

                }

            }
        }

        private void ShowAll() {
            System.out.println(bestellungenController.getAll());
        }


}
