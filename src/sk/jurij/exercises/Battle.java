package sk.jurij.exercises;

import sk.jurij.classes.Warrior;

public class Battle {
    public static int battle(Warrior w1, Warrior w2){
        if (w1.getTotalForce() == w2.getTotalForce()) return 0;
        if (w1.getTotalForce() > w2.getTotalForce()){
            w2.damage();
            w2.moveItem(w2.getBestItem(), w1);
            return 1;
        }
        w1.damage();
        w1.moveItem(w1.getBestItem(), w2);
        return 2;
    }
}
