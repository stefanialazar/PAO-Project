package model;

import static model.tip_de_incalt.*;
import static model.culori_incalt.*;

enum tip_de_incalt { Tip_necunoscut, Adidasi, Sandale, Pantofi, Pantofi_cu_toc, Ghete, Bocanci, Papuci } //toate tipurile de incaltaminte
enum culori_incalt { Culoare_necunoscuta1, Negru1, Alb1, Rosu1, Albastru1, Galben1, Verde1, Gri1, Violet1, Roz1, Maro1 }

public class Incaltaminte extends Product implements Welcome{

    private tip_de_incalt tip;
    private culori_incalt culoare;
    private float marime;

    public String conversieTipdeincalt(tip_de_incalt tip)
    {
        return switch (tip) {
            case Tip_necunoscut -> "Tip de incaltaminte necunoscut";
            case Adidasi -> "Adidasi";
            case Sandale -> "Sandale";
            case Pantofi -> "Pantofi";
            case Pantofi_cu_toc -> "Pantofi cu toc";
            case Ghete -> "Ghete";
            case Bocanci -> "Bocanci";
            case Papuci -> "Papuci";
        };
    }
    public tip_de_incalt conversieTipdeincalt1(int nrtip)
    {
        return switch (nrtip)
        {
            case 0 -> Tip_necunoscut;
            case 1 -> Adidasi;
            case 2 -> Sandale;
            case 3 -> Pantofi;
            case 4 -> Pantofi_cu_toc;
            case 5 -> Ghete;
            case 6 -> Bocanci;
            case 7 -> Papuci;
            default -> throw new IllegalStateException("Unexpected value: " + nrtip);
        };
    }

    public String conversieCuloriincalt(culori_incalt culoare)
    {
        return switch (culoare) {
            case Culoare_necunoscuta1 -> "Culoare necunoscuta";
            case Negru1 -> "Negru";
            case Alb1 -> "Alb";
            case Rosu1 -> "Rosu";
            case Albastru1 -> "Albastru";
            case Galben1 -> "Galben";
            case Verde1 -> "Verde";
            case Gri1 -> "Gri";
            case Violet1 -> "Violet";
            case Roz1 -> "Roz";
            case Maro1 -> "Maro";
        };
    }
    culori_incalt conversieCuloriincalt1(int nrculoare)
    {
        return switch (nrculoare)
        {
            case 0 -> Culoare_necunoscuta1;
            case 1 -> Negru1;
            case 2 -> Alb1;
            case 3 -> Rosu1;
            case 4 -> Albastru1;
            case 5 -> Galben1;
            case 6 -> Verde1;
            case 7 -> Gri1;
            case 8 -> Violet1;
            case 9 -> Roz1;
            case 10 -> Maro1;
            default -> throw new IllegalStateException("Unexpected value: " + nrculoare);
        };
    }


    public Incaltaminte(Boolean eco, int adaugate_cos, int nrMateriale, String[] materiale, float pret,
                               char gen, int nrtip, float marime, int nrculoare)
    {
        super(eco, adaugate_cos, nrMateriale, materiale, pret, gen);
        this.tip = conversieTipdeincalt1(nrtip);
        this.marime = marime;
        this.culoare = conversieCuloriincalt1(nrculoare);
    }

    public Incaltaminte()
    {
        super();
        this.tip = Tip_necunoscut;
        this.marime = 0;
        this.culoare = Culoare_necunoscuta1;
    }


    public void setTip(tip_de_incalt  tip) { this.tip = tip; }
    public String getTip() { return conversieTipdeincalt(tip); }

    public void setCuloare(culori_incalt culoare) { this.culoare = culoare; }
    public String getCuloare() { return conversieCuloriincalt(culoare); }

    public void setMarime(float marime) { this.marime = marime; }
    public float getMarime() { return this.marime; }

    public void welcome() {
        System.out.println("Sunteti la Sectia Incaltaminte!");
    }

    public void alege_task() {
        System.out.println("Va rugam alegeti urmatorul pas:");
        System.out.println("1.Vreau sa aleg tipul de incaltaminte, marimea si culoarea pentru a adauga articolul in cos");
        System.out.println("2.Vreau sa ma intorc la meniul principal");
    }

    public void afisareTipdeincalt()
    {
        System.out.println(java.util.Arrays.asList(tip_de_incalt.values()));
    }
    public void afisareCuloriincalt()
    {
        System.out.println(java.util.Arrays.asList(culori_incalt.values()));
    }
}
