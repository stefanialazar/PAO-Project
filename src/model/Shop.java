package model;

import java.util.*;

public class Shop implements Welcome {
    private ArrayList<Product> products = new ArrayList<Product>();

    public ArrayList<Product> getProducts() {
        return products;
    }

    public void setProducts(ArrayList<Product> products) {
        this.products = products;
    }

    public void choose() {
        System.out.println("Alegeti daca sunteti user sau administrator: \n");
        System.out.println("1. administrator \n");
        System.out.println("2. user \n");
        System.out.println("3. exit \n");
    }
    public  void task_admin() {
        System.out.println("Selectati un task:\n");
        System.out.println("1. Sa vizionez toate tipurile de haine\n");
        System.out.println("2. Sa vizionez toate tipurile de incaltaminte\n");
        System.out.println("3. Adaug produse\n");
        System.out.println("4. Elimin produse\n");
        System.out.println("5. Schimb pretul unui produs\n");
        System.out.println("6. Mi-am indeplinit task-urile, doresc sa ies din magazin\n");
    }
    public void task_user() {
        System.out.println("Selectati un task:\n");
        System.out.println("1. Sa vizionez toate tipurile de haine\n");
        System.out.println("2. Sa vizionez toate tipurile de incaltaminte\n");
        System.out.println("3. Sa vad toate articolele din cos si pretul total al articolelor\n");
        System.out.println("4. Sa elimin articole din cos\n");
        System.out.println("5. Sa cumpar articolele selectate, sa primesc bonul fiscal si sa parasesc magazinul\n");
        System.out.println("6. Sa renunt la cosul de cumparaturi si sa parasesc magazinul\n");
    }
}
