package model;

//DON'T NEED TO ADD/IMPLEMENT SERIALIZABLE BUT IS GOOD PRACTICE TOO  <----------
import java.io.Serializable;

public class Fighter implements Serializable {
    private int id;
    private String name;
    private int maxDamage;
    private int hitPoints;


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getMaxDamage() {
        return maxDamage;
    }

    public void setMaxDamage(int maxDamage) {
        this.maxDamage = maxDamage;
    }

    public int getHitPoints() {
        return hitPoints;
    }

    public void setHitPoints(int hitPoints) {
        this.hitPoints = hitPoints;
    }

    public Fighter(){

    }

    public Fighter(String name, int maxDamage, int hitPoints) {
        this.name = name;
        this.maxDamage = maxDamage;
        this.hitPoints = hitPoints;

    }

}

