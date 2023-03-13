package model;

import java.util.ArrayList;
import java.util.List;

public class FighterFactory {


    public ArrayList<Fighter> generateFighters() {
        Fighter fighter1 = new Fighter("Ryu", 17, 12, new ArrayList<>(List.of(new Weapon("Throwing Knife", "Missle Weapon", "10 Feet", 6))));
        Fighter fighter2 = new Fighter("One Punch Man", 15, 15);
        Fighter fighter3 = new Fighter("Sailor Moon", 11, 9);

        ArrayList<Fighter> fighters = new ArrayList<>(List.of(fighter1, fighter2, fighter3));

        return fighters;

    }
}
