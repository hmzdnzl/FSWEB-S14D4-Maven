package org.example.model;

public class Chocolate extends ProductForSale{
    private boolean isMilk;

    public Chocolate(String sütlü, double v, String sütlüÇikolata, boolean isMilk) {
        this.isMilk=isMilk;
    }

    public boolean getIsMilk() {
        return isMilk;
    }

    public Chocolate(String type, double price, String description) {
        super(type, price, description);
    }

    @Override
    public void showDetails() {
        System.out.println("Tür: "+ getType());
        System.out.println("Fiyat: "+ getPrice());
        System.out.println("Açıklama: "+getDescription());
        System.out.println("Sütlü mü: "+isMilk);
    }
}
