package org.example;

public class Automobile {
    private int ruote;
    private String targa;
    private int posti;
    int velocita;
    
    //costruttore1
    public Automobile(int ruote, String targa, int posti) {
        this.ruote = ruote;
        this.targa = targa;
        this.posti = posti;
    }
    
    //costruttore2
    public Automobile(int ruote, String targa) {
        this.ruote = ruote;
        this.targa = targa;
    }
    
    public int getRuote() {
        return ruote;
    }
    
    public void setRuote(int ruote) {
        this.ruote = ruote;
    }
    
    public String getTarga() {
        return targa;
    }
    
    public void setTarga(String targa) {
        this.targa = targa;
    }
    
    public int getPosti() {
        return posti;
    }
    
    public void setPosti(int posti) {
        this.posti = posti;
    }
    
    
    public void accellera(int accellerazione) {
        velocita = velocita + accellerazione;
        System.out.println(velocita);
    }
    
    
    public int somma(int valore1, int valore2) {
        int somma = valore1 + valore2;
        return somma;
    }
    
    
    @Override
    public String toString(){
       return "numero di ruote "+ ruote;
    }
}
