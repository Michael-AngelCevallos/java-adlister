package model;

public class Weapon {

    private String name;
    private String type;
    private String range;
    private int maxDamage;


    public Weapon() {

    }

    public Weapon(String name, String type, String range, int maxDamage) {
        this.name = name;
        this.type = type;
        this.range = range;
        this.maxDamage = maxDamage;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getRange() {
        return range;
    }

    public void setRange(String range) {
        this.range = range;
    }

    public int getMaxDamage() {
        return maxDamage;
    }

    public void setMaxDamage(int maxDamage) {
        this.maxDamage = maxDamage;
    }




}

