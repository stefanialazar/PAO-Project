package main;

import model.*;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws FileNotFoundException {
        Shop shop = new Shop();
        Haine h = new Haine();
        Incaltaminte incal = new Incaltaminte();


        File file_haine = new File("D:\\FMI\\ANUL_2_INFO\\SEM_II\\ProgAvOb\\PAO_Lazar_Stefania_233\\IvyLakesHaine.in");
        Scanner scanner_haine = new Scanner(file_haine);

        File file_incal = new File("D:\\FMI\\ANUL_2_INFO\\SEM_II\\ProgAvOb\\PAO_Lazar_Stefania_233\\IvyLakesHaine.in");
        Scanner scanner_incal = new Scanner(file_incal);

        ArrayList<Haine> haine_magazin = new ArrayList<Haine>();
        int nr_haine;
        nr_haine = scanner_haine.nextInt();
        for (int i = 0; i < nr_haine; i++) //citim din fisierul cu haine
        {
            Haine h0 = new Haine();

            haine_magazin.add(h0);
        }

        ArrayList<Incaltaminte> incal_magazin = new ArrayList<Incaltaminte>();
        int nr_incalt;
        nr_incalt = scanner_incal.nextInt();
        for (int i = 0; i < nr_incalt; i++) //citim din fisierul cu incaltaminte
        {
            Incaltaminte incal0 = new Incaltaminte();

            incal_magazin.add(incal0);
        }

        Scanner scanner = new Scanner(System.in);
        shop.welcome();
        int choice = 0;
        while (choice != 3) {
            shop.choose();
            choice = scanner.nextInt();
            if (choice == 1) //administrator
            {
                System.out.print("Bine ati revenit la munca :(. Ce task-uri indeplinim astazi? \n");
                int task_admin = 0;
                while (task_admin != 13) {
                    shop.task_admin();
                    task_admin = scanner.nextInt();
                    Haine h0 = new Haine();
                    Incaltaminte incal0 = new Incaltaminte();
                    switch (task_admin) {
                        case 1 -> { // Sa vizionez toate tipurile de haine (bun)
                            h.welcome();
                            h.afisareTipdehaine();
                            h.afisareMarimi();
                            h.afisareCulori();
                        }
                        case 2 -> { //Sa vizionez toate tipurile de incaltaminte (bun)
                            incal.welcome();
                            incal.afisareTipdeincalt();
                            incal.afisareCuloriincalt();
                        }
                        case 3 -> { //Adaug produse (de terminat)
                            int k = 0;
                            System.out.println("Doriti sa adaugati haine sau incaltaminte? (introduceti numarul)\n");
                            System.out.println("1. Haine\n");
                            System.out.println("2. Incaltaminte\n");
                            System.out.println("3. Inapoi la meniul principal\n");
                            k = scanner.nextInt();
                        }
                        case 4 -> { //Elimin produse (de terminat)
                            int k = 0;
                            while (k != 3) {
                                System.out.println("Doriti sa eliminati haine sau incaltaminte? (introduceti numarul)\n");
                                System.out.println("1. Haine\n");
                                System.out.println("2. Incaltaminte\n");
                                System.out.println("3. Inapoi la meniul principal\n");
                                k = scanner.nextInt();
                                if (k == 1) {
                                    if (haine_magazin.size() != 0) {
                                        System.out.println("Avem urmatoarele atribute pentru haine: ");
                                        for (int i = 0; i < haine_magazin.size(); i++) {
                                            System.out.print(i + 1);
                                            System.out.print(". ");
                                            System.out.print(haine_magazin.get(i));
                                            System.out.print("\n");
                                        }
                                        System.out.println("Alegeti atributele ce doriti sa fie sterse: (introduceti numarul)");
                                        int j = scanner.nextInt();
                                        haine_magazin.remove(haine_magazin.get(j - 1));
                                    } else {
                                        System.out.println("Nu avem atribute pentru haine introduse in sistem");
                                    }
                                } else if (k == 2) {
                                    if (incal_magazin.size() != 0) {
                                        System.out.println("Avem urmatoarele atribute pentru incaltaminte: ");
                                        for (int i = 0; i < incal_magazin.size(); i++) {
                                            System.out.print(i + 1);
                                            System.out.print(". ");
                                            System.out.print(incal_magazin.get(i));
                                            System.out.print("\n");
                                        }
                                        System.out.println("Alegeti atributele ce doriti sa fie sterse: (introduceti numarul)");
                                        int j = scanner.nextInt();
                                        incal_magazin.remove(incal_magazin.get(j - 1));
                                    } else {
                                        System.out.println("Nu avem atribute pentru incaltaminte introduse in sistem");
                                    }
                                }
                            }
                        }
                        case 5 -> {//Schimb pretul unui produs (de terminat)
                            int k = 0;
                            while (k != 3) {
                                System.out.println("Doriti sa schimbati pretul pentru haine sau incaltaminte? (introduceti numarul)");
                                System.out.println("1. Haine");
                                System.out.println("2. Incaltaminte");
                                System.out.println("3. Inapoi la meniul principal");
                                k = scanner.nextInt();
                                if (k == 1) {
                                    if (haine_magazin.size() != 0) {
                                        System.out.println("Avem urmatoarele atribute pentru haine: ");
                                        for (int i = 0; i < haine_magazin.size(); i++) {
                                            System.out.print(i + 1);
                                            System.out.print(". ");
                                            System.out.print(haine_magazin.get(i));
                                            System.out.print("\n");
                                        }
                                        System.out.println("Alegeti carui produs doriti sa schimbati pretul: (introduceti numarul)");
                                        int j = scanner.nextInt();
                                        System.out.println("Scrieti noul pret al produsului: ");
                                        float pret_nou = scanner.nextFloat();
                                        haine_magazin.get(j - 1).setPret(pret_nou);
                                    } else {
                                        System.out.println("Nu avem atribute pentru haine introduse in sistem");
                                    }
                                } else if (k == 2) {
                                    if (incal_magazin.size() != 0) {
                                        System.out.println("Avem urmatoarele atribute pentru incaltaminte: ");
                                        for (int i = 0; i < incal_magazin.size(); i++) {
                                            System.out.print(i + 1);
                                            System.out.print(". ");
                                            System.out.print(incal_magazin.get(i));
                                            System.out.print("\n");
                                        }
                                        System.out.println("Alegeti carui produs doriti sa schimbati pretul: (introduceti numarul)");
                                        int j = scanner.nextInt();
                                        System.out.println("Scrieti noul pret al produsului: ");
                                        float pret_nou = scanner.nextFloat();
                                        incal_magazin.get(j - 1).setPret(pret_nou);
                                    } else {
                                        System.out.println("Nu avem atribute pentru incaltaminte introduse in sistem");
                                    }
                                }
                            }
                        }
                    }
                }
            }
            else if (choice == 2) //user
            {
                Cos cos = new Cos();
                System.out.println("Ne bucuram ca ati ales magazinul nostru! Cum va numiti?");
                String nume = scanner.next();
                cos.setNumeclient(nume);
                System.out.print("Ce ati dori sa faceti astazi, ");
                System.out.print(nume);
                System.out.print("?");
                System.out.print("\n");
                int task_user = 0;
                while (task_user != 5 && task_user != 6) {
                    shop.task_user();
                    task_user = scanner.nextInt();
                    switch (task_user) {
                        case 1 -> { //Sa vizionez toate tipurile de haine (bun)
                            h.welcome();
                            h.afisareTipdehaine();
                            h.afisareMarimi();
                            h.afisareCulori();
                            int task_haine = 0;
                            while (task_haine != 2) {
                                h.alege_task();
                                task_haine = scanner.nextInt();
                                if (task_haine == 1) //aleg pt a cumpara
                                {
                                    int tip;
                                    int marime;
                                    int culoare;
                                    int produs;
                                    System.out.println("Alegeti ce atribute doriti sa aiba produsul: ");
                                    for (int i = 0; i < haine_magazin.size(); i++) {
                                        System.out.print(i + 1);
                                        System.out.print(".");
                                        System.out.print(haine_magazin.get(i));
                                        System.out.print("\n");
                                    }
                                    produs = scanner.nextInt();
                                    Haine h1 = new Haine();
                                    h1 = haine_magazin.get(produs - 1);
                                    // h1 = scanner.nextLine();
                                    System.out.print("\n");
                                    System.out.print("Cate produse de acest tip doriti sa cumparati?");
                                    System.out.print("\n");
                                    int prod;
                                    prod = scanner.nextInt();
                                    h1.setAdaugate_cos(prod);
                                    cos.adauga_haina(h1);
                                }  //meniu principal
                            }
                        }
                        case 2 -> { //Sa vizionez toate tipurile de incaltaminte (bun)
                            incal.welcome();
                            System.out.print("\n");
                            incal.afisareTipdeincalt();
                            System.out.print("\n");
                            incal.afisareCuloriincalt();
                            System.out.print("\n");
                            int task_incal = 0;
                            while (task_incal != 2) {
                                incal.alege_task();
                                task_incal = scanner.nextInt();
                                if (task_incal == 1) //aleg pt a cumpara
                                {
                                    int tip;
                                    int marime;
                                    int culoare;
                                    int produs;
                                    System.out.print("Alegeti ce atribute doriti sa aiba produsul: ");
                                    for (int i = 0; i < incal_magazin.size(); i++) {
                                        System.out.print(i + 1);
                                        System.out.print(".");
                                        System.out.print("\n");
                                        System.out.print(incal_magazin.get(i));
                                        System.out.print("\n");
                                    }
                                    produs = scanner.nextInt();
                                    Incaltaminte incal1 = new Incaltaminte();
                                    incal1 = incal_magazin.get(produs - 1);
                                    // incal1 = scanner.nextInt();
                                    System.out.print("Cate produse de acest tip doriti sa cumparati?");
                                    System.out.print("\n");
                                    int prod;
                                    prod = scanner.nextInt();
                                    incal1.setAdaugate_cos(prod);
                                    cos.adauga_incal(incal1);
                                }
                            }
                        }
                        case 3 -> { // toate articolele din cos si pretul total (de terminat)
                            System.out.print(cos);
                        }
                        case 4 -> { //Sa elimin articole din cos (de terminat)
                            int k = 0;
                            while (k != 3) {
                                System.out.println("Doriti sa eliminati haine sau incaltaminte? (introduceti numarul)");
                                System.out.println("1. Haine");
                                System.out.println("2. Incaltaminte");
                                System.out.println("3. Inapoi la meniul principal");
                                k = scanner.nextInt();
                                if (k == 1) {
                                    ArrayList<Haine> vect_haine = cos.getToate_hainele();
                                    if (vect_haine.size() == 0) {
                                        System.out.print("Nu avem haine in cos");
                                        System.out.print("\n");
                                    } else {
                                        System.out.print("Ce produs doriti sa eliminati din cos? (introduceti numarul)");
                                        System.out.print("\n");
                                        for (int i = 0; i < vect_haine.size(); i++) {
                                            System.out.print(i + 1);
                                            System.out.print(". ");
                                            System.out.print(vect_haine.get(i));
                                            System.out.print("\n");
                                        }
                                        int j = scanner.nextInt();
                                        cos.elimina_haina(vect_haine.get(j - 1));
                                    }
                                } else if (k == 2) {
                                    ArrayList<Incaltaminte> vect_incal = cos.getToate_incal();
                                    if (vect_incal.size() == 0) {
                                        System.out.print("Nu avem incaltaminte in cos");
                                        System.out.print("\n");
                                    } else {
                                        System.out.print("Ce produs doriti sa eliminati din cos? (introduceti numarul)");
                                        System.out.print("\n");
                                        for (int i = 0; i < vect_incal.size(); i++) {
                                            System.out.print(i + 1);
                                            System.out.print(". ");
                                            System.out.print(vect_incal.get(i));
                                            System.out.print("\n");
                                        }
                                        int j = scanner.nextInt();
                                        cos.elimina_incal(vect_incal.get(j - 1));
                                        if (vect_incal.size() == 0) {
                                            break;
                                        }
                                    }
                                }
                            }
                        }
                        case 5 -> { //Sa cumpar articolele selectate, sa primesc bonul fiscal si sa parasesc magazinul (bun)
                            if (cos.getToate_hainele().size() == 0 && cos.getToate_incal().size() == 0) {
                                System.out.println("Cosul este gol!");
                            } else {
                                System.out.println("Cosul a fost cumparat!");
                            }
                        }
                        case 6 -> { //Sa renunt la cosul de cumparaturi si sa ies din magazin(bun)
                            System.out.println("Ne bucuram ca ati ales magazinul nostru, o zi frumoasa!");
                        }
                    }
                }
            }
        }
    }
}
