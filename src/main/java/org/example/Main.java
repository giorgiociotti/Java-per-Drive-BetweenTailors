package org.example;

public class Main {
    public static void main(String[] args) {
        Automobile oggetto = new Automobile(4,"targa1",4);
        AutomobileDiLusso oggettoDiLusso = new AutomobileDiLusso(4,"targa1",4,true);
        AutomobileDiLusso oggettoDiLusso2 = new AutomobileDiLusso(4,"targa1",4,false);
        
        
        System.out.println(oggetto.getRuote());
        
        
        
        oggetto.somma(1,1);
        System.out.println(oggetto.somma(1,1));
        int gay= oggetto.somma(1,1);
        System.out.println(gay);
        
        int danial= oggetto.somma(gay,gay);
        
        System.out.println(oggetto.toString());
        System.out.println(oggettoDiLusso.toString());
        System.out.println(oggettoDiLusso2.toString());
    }
}