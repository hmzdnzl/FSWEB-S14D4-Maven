package org.example.rpg;

public class Troll extends Monster implements Bleedable, Poisonable{
    public Troll(String name, int hitPoints, double damage) {
        super(name, hitPoints, damage);
    }

    @Override
    public String getName() {
        return super.getName();
    }

    @Override
    public double getDamage() {
        return super.getDamage();
    }

    @Override
    public int getHitPoints() {
        return super.getHitPoints();
    }

    @Override
    public double bleed() {
        return 0;
    }
    @Override
    public double poison() {
        return 0;
    }
}
