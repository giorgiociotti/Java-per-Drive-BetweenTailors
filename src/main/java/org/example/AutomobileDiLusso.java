package org.example;

public class AutomobileDiLusso extends Automobile {
    Boolean frigoBar;
    
    public AutomobileDiLusso(int ruote, String targa, int posti, Boolean frigoBar) {
        super(ruote, targa, posti);
        this.frigoBar = frigoBar;
    }
    @Override
    public String toString(){
        return "presenza del frigobBar "+ frigoBar;
    }
}
