package model;

public abstract class ProductTVA {
    protected float pret;

    public float calc_pret_cu_TVA(){

        return (this.pret * 19 / 100) + this.pret;

    }
}
