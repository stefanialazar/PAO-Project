package model;

import java.util.*;

public class Cos {

    private ArrayList<Haine> toate_hainele = new ArrayList<Haine>();
    private ArrayList<Incaltaminte> toate_incal = new ArrayList<Incaltaminte>();

    private int prod_total_cos; //cate produse sunt in cos
    private double pret_total_cos; //pretul total din cos
    private ArrayList<String> nume_produse = new ArrayList<String>(); //contine numele produselor din cos
    private String nume_client; //numele clientului

    public void adauga_haina(Haine h)
    {
        this.toate_hainele.add(h);
        this.prod_total_cos += h.getAdaugate_cos();
        for(int i=0 ; i< h.getAdaugate_cos(); i++)
            this.nume_produse.add(h.getTip());
        for (int i = 0; i < h.getAdaugate_cos(); i++)
            this.pret_total_cos += h.calc_pret_cu_TVA();
    }
    public void adauga_incal(Incaltaminte incal)
    {
        this.toate_incal.add(incal);
        this.prod_total_cos += incal.getAdaugate_cos();
        for (int i = 0; i < incal.getAdaugate_cos(); i++)
            this.nume_produse.add(incal.getTip());
        for (int i = 0; i < incal.getAdaugate_cos(); i++)
            this.pret_total_cos += incal.calc_pret_cu_TVA();
    }

    public void elimina_haina(Haine h) {
        for (int i = 0; i < this.toate_hainele.size(); i++)
            if (Objects.equals(toate_hainele.get(i).getTip(), h.getTip()) && Objects.equals(toate_hainele.get(i).getCuloare(), h.getCuloare())
                    && Objects.equals(toate_hainele.get(i).getMarime(), h.getMarime()))
                this.toate_hainele.remove(this.toate_hainele.get(i));

        for (int i = 0; i < h.getAdaugate_cos(); i++)
            this.pret_total_cos -= h.calc_pret_cu_TVA();

        for (int i = 0; i < prod_total_cos; i++)
            if (Objects.equals(this.nume_produse.get(i), h.getTip())) {
                this.nume_produse.remove(this.nume_produse.get(i));
                i--;
                this.prod_total_cos -= 1;
            }
    }

    public void elimina_incal(Incaltaminte incal)
    {
        for (int i = 0; i < this.toate_incal.size(); i++)
            if (Objects.equals(toate_incal.get(i).getTip(), incal.getTip()) && Objects.equals(toate_incal.get(i).getCuloare(), incal.getCuloare())
                    && toate_incal.get(i).getMarime() == incal.getMarime())
                this.toate_incal.remove(this.toate_incal.get(i));

        for (int i = 0; i < incal.getAdaugate_cos(); i++)
            this.pret_total_cos -= incal.calc_pret_cu_TVA();

        for (int i = 0; i < prod_total_cos; i++)
            if (Objects.equals(this.nume_produse.get(i), incal.getTip())) {
                this.nume_produse.remove(this.nume_produse.get(i));
                i--;
                this.prod_total_cos -= 1;
                }
    }

//setter & getter

    public ArrayList<Haine> getToate_hainele() { return this.toate_hainele; }
    public ArrayList<Incaltaminte> getToate_incal() { return this.toate_incal; }

    public void setNume_produse(ArrayList<String> nume_produse)
    {
        this.nume_produse = nume_produse;
    }
    public ArrayList<String> getNume_produse() { return this.nume_produse; }

    public void setProd_cos(int prod_total_cos) { this.prod_total_cos = prod_total_cos; }
    public int getProd_cos() { return this.prod_total_cos; }

    public void setTotal_cos(double pret_total_cos) { this.pret_total_cos = pret_total_cos; }
    public double getTotal_cos() { return this.pret_total_cos; }

    public void setNumeclient(String nume_client) { this.nume_client = nume_client; }
    public String getNumeclient() { return this.nume_client; }

//constructor bun la toate
    public Cos(ArrayList<Haine> toate_hainele, ArrayList<Incaltaminte> toate_incal, int prod_total_cos, double pret_total_cos, ArrayList<String> nume_produse, String nume_client)
    {
        this.toate_hainele = toate_hainele;
        this.toate_incal = toate_incal;
        this.prod_total_cos = prod_total_cos;
        this.pret_total_cos = pret_total_cos;
        this.nume_produse = nume_produse;
        this.nume_client = nume_client;
    }

    public Cos()
    {
        this.prod_total_cos = 0;
        this.pret_total_cos = 0;

    }
}
