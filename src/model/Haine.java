package model;

import static model.marimi.*;
import static model.tip_de_haine.*;
import static model.culori.*;

enum tip_de_haine { Tip_de_haine_necunoscut, Jacheta, Palton, Sacou, Pulover, Cardigan, Vesta, Tricou, Camasa, Bluza, Pantaloni, Blugi, Rochie, Fusta, Lenjerie, Costum_de_baie }

enum marimi { Marime_necunoscuta, XXS, XS, S, M, L, XL, XXL, XXXL }

enum culori { Culoare_necunoscuta, Negru, Alb, Rosu, Albastru, Galben, Verde, Gri, Violet, Roz, Maro }

public class Haine extends Product implements Welcome {

    private tip_de_haine tip;
    private marimi marime;
    private culori culoare;

    public String conversieTipdehaine(tip_de_haine tip)
    {
        return switch (tip) {
            case Tip_de_haine_necunoscut -> "Tip de haine necunoscut";
            case Jacheta -> "Jacheta";
            case Palton -> "Palton";
            case Sacou -> "Sacou";
            case Pulover -> "Pulover";
            case Cardigan -> "Cardigan";
            case Vesta -> "Vesta";
            case Tricou -> "Tricou";
            case Camasa -> "Camasa";
            case Bluza -> "Bluza";
            case Pantaloni -> "Pantaloni";
            case Blugi -> "Blugi";
            case Rochie -> "Rochie";
            case Fusta -> "Fusta";
            case Lenjerie -> "Lenjerie intima";
            case Costum_de_baie -> "Costum de baie";
        };
    }
    public tip_de_haine conversieTipdehaine1(int nrtip)
    {
        return switch (nrtip) {
            case 0 -> Tip_de_haine_necunoscut;
            case 1 -> Jacheta;
            case 2 -> Palton;
            case 3 -> Sacou;
            case 4 -> Pulover;
            case 5 -> Cardigan;
            case 6 -> Vesta;
            case 7 -> Tricou;
            case 8 -> Camasa;
            case 9 -> Bluza;
            case 10 -> Pantaloni;
            case 11 -> Blugi;
            case 12 -> Rochie;
            case 13 -> Fusta;
            case 14 -> Lenjerie;
            case 15 -> Costum_de_baie;
            default -> throw new IllegalStateException("Unexpected value: " + nrtip);
        };
    }

    public String conversieMarimi(marimi marime)
    {
        return switch (marime) {
            case Marime_necunoscuta -> "Marime necunoscuta";
            case XXS -> "XXS";
            case XS -> "XS";
            case S -> "S";
            case M -> "M";
            case L -> "L";
            case XL -> "XL";
            case XXL -> "XXL";
            case XXXL -> "XXXL";
        };
    }
    public marimi conversieMarimi1(int nrmarime)
    {
        return switch (nrmarime)
        {
            case 0 -> Marime_necunoscuta;
            case 1 -> XXS;
            case 2 -> XS;
            case 3 -> S;
            case 4 -> M;
            case 5 -> L;
            case 6 -> XL;
            case 7 -> XXL;
            case 8 -> XXXL;
            default -> throw new IllegalStateException("Unexpected value: " + nrmarime);
        };
    }

    public String conversieCulori(culori culoare)
    {
        return switch (culoare) {
            case Culoare_necunoscuta -> "Culoare necunoscuta";
            case Negru -> "Negru";
            case Alb -> "Alb";
            case Rosu -> "Rosu";
            case Albastru -> "Albastru";
            case Galben -> "Galben";
            case Verde -> "Verde";
            case Gri -> "Gri";
            case Violet -> "Violet";
            case Roz -> "Roz";
            case Maro -> "Maro";
        };
    }
    culori conversieCulori1(int nrculoare)
    {
        return switch (nrculoare)
        {
            case 0 -> Culoare_necunoscuta;
            case 1 -> Negru;
            case 2 -> Alb;
            case 3 -> Rosu;
            case 4 -> Albastru;
            case 5 -> Galben;
            case 6 -> Verde;
            case 7 -> Gri;
            case 8 -> Violet;
            case 9 -> Roz;
            case 10 -> Maro;
            default -> throw new IllegalStateException("Unexpected value: " + nrculoare);
        };
    }

    public Haine(Boolean eco, int adaugate_cos, int nrMateriale, String[] materiale, float pret,
                 char gen, int nrtip, int nrmarime, int nrculoare)
    {
        super(eco, adaugate_cos, nrMateriale, materiale, pret, gen);
        this.tip = conversieTipdehaine1(nrtip);
        this.marime = conversieMarimi1(nrmarime);
        this.culoare = conversieCulori1(nrculoare);
    }

    public Haine()
    {
        super();
        this.tip = Tip_de_haine_necunoscut;
        this.marime = Marime_necunoscuta;
        this.culoare = Culoare_necunoscuta;
    }

    public void setTip(tip_de_haine tip) { this.tip = tip; }
    public String getTip() { return conversieTipdehaine(tip); }

    public void setMarime(marimi marime) { this.marime = marime; }
    public String getMarime() { return conversieMarimi(marime); }

    public void setCuloare(culori culoare) { this.culoare = culoare; }
    public String getCuloare() { return conversieCulori(culoare); }

    public void welcome() {
        System.out.println("\nSunteti la Sectia Haine!\n");
    }

    public void afisareTipdehaine()
    {
        System.out.println(java.util.Arrays.asList(tip_de_haine.values()));
    }

    public void afisareMarimi()
    {
        System.out.println(java.util.Arrays.asList(marimi.values()));
    }

    public void afisareCulori()
    {
        System.out.println(java.util.Arrays.asList(culori.values()));

    }

    public void alege_task() {
        System.out.println("\nVa rugam alegeti urmatorul pas:\n");
        System.out.println("1. Vreau sa imi aleg un articol pentru a adauga in cos\n");
        System.out.println("2. Vreau sa ma intorc la meniul principal\n");
    }
}
