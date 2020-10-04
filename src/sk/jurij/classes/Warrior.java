package sk.jurij.classes;

import java.util.ArrayList;
import java.util.Comparator;

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

    public ArrayList<Item> getItems() {
        return items;
    }

    public int getTotalForce(){
        return speed+muscle+life;
    }

    public Item getBestItem(){
        if (items.size() == 0) return null;
        return items.stream().max(Comparator.comparing(Item::getValue)).get();
    }

    public void moveItem(Item item, Warrior warrior){
        if (item == null) return;
        items.remove(item);
        warrior.getItems().add(item);
    }

    public void damage(){
        life--;
    }
}
