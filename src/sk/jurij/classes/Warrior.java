package sk.jurij.classes;

import java.util.ArrayList;

public class Warrior {
    String name;
    int life;
    int speed;
    int muscle;
    ArrayList<Item> items;

    public Warrior(String name, int life, int speed, int muscle, ArrayList<Item> items) {
        this.name = name;
        this.life = life;
        this.speed = speed;
        this.muscle = muscle;
        this.items = items;
    }

    public String getName() {
        return name;
    }

    public int getLife() {
        return life;
    }

    public int getSpeed() {
        return speed;
    }

    public int getMuscle() {
        return muscle;
    }

    public ArrayList<Item> getItems() {
        return items;
    }

    public void setLife(int life) {
        this.life = life;
    }

    public int getTotalForce(){
        return speed+muscle+life;
    }
}
