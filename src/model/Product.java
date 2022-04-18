package model;

import java.io.File;
import java.util.Scanner;

public abstract class Product extends ProductTVA {

    protected static String nume_magazin;
    protected int id_produs; //id-ul propriu al unui produs
    protected Boolean eco; //1 daca produsul este eco-friendly/sustainable, 0 daca nu
    protected int adaugate_cos; //numarul de articole dintr-un anumit produs adaugat in cos
    protected int nrMateriale;
    protected String[] materiale; //materialele din care este facut un produs
    protected char gen; // F - female, M - male, U - unisex


    //setter & getter
    public String getNume_magazin() { return nume_magazin; }

    public void setId_produs(int id_produs){ this.id_produs = id_produs; }
    public int getId_produs() { return this.id_produs; }

    public void setEco(Boolean eco) { this.eco = eco; }
    public Boolean getEco() { return this.eco; }

    public void setAdaugate_cos(int adaugate_cos) { this.adaugate_cos = adaugate_cos; }
    public int getAdaugate_cos() { return this.adaugate_cos; }

    public void setNrmateriale(int nrMateriale) { this.nrMateriale = nrMateriale; }
    public int getNrmateriale() { return this.nrMateriale; }

    public void setMateriale(String[] materiale, int nrMateriale) {
        this.materiale = new String[this.nrMateriale];
        if (nrMateriale >= 0) System.arraycopy(materiale, 0, this.materiale, 0, nrMateriale);
    }
    public String[] getMateriale() { return this.materiale; }

    public void setPret(float pret) { this.pret = pret; }
    public float getPret() { return this.pret; }

    public void setGen(char gen){ this.gen = gen; }
    public char getGen(){ return this.gen; }

    public Product(Boolean eco, int adaugate_cos, int nrMateriale, String[] materiale, float pret, char gen) {

        this.eco = eco;
        this.adaugate_cos = adaugate_cos;
        this.materiale = new String[this.nrMateriale];
        if (nrMateriale >= 0) System.arraycopy(materiale, 0, this.materiale, 0, nrMateriale);
        this.pret = pret;
        this.gen = gen;
    }

    public Product()
    {
        this.eco = false;
        this.adaugate_cos = 0;
        this.nrMateriale = 0;
        this.materiale = new String[1];
        this.pret = 0;
        this.gen = ' ';
    }

//    public void citireFisier(Scanner file)
//    {
//        this.eco = file.nextLine();
//        this.adaugate_cos = file.nextLine();
//        fisier >> this->nrMateriale;
//        if (this->materiale != NULL)
//        delete[] this->materiale;
//        this->materiale = new string[this->nrMateriale];
//        for (int i = 0; i < this->nrMateriale; i++)
//        fisier >> this->materiale[i];
//        fisier >> this->pret;
//        fisier >> this->nrVarste;
//        if (this->varste != NULL)
//        delete[] this->varste;
//        this->varste = new int[this->nrVarste];
//        for (int i = 0; i < this->nrVarste; i++)
//        fisier >> this->varste[i];
//        fisier >> this->gen;
//    }
}
