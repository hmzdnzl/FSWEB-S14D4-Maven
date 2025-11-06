package org.example.model;

public class Coke extends ProductForSale{
    private int sugarRate;

    public Coke(int sugarRate, String gazlı, int i, String gazlıIçecek) {
        this.sugarRate=sugarRate;
    }


    public Coke(String type, double price, String description) {
        super(type, price, description);
    }
    @Override
    public void showDetails() {
        System.out.println("Tür: "+ getType());
        System.out.println("Fiyat: "+ getPrice());
        System.out.println("Açıklama: "+getDescription());
        System.out.println("Şeker Oranı: "+sugarRate);
    }
}
