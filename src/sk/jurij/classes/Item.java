package sk.jurij.classes;

public class Item {
    String name;
    int value;

    public String getName() {
        return name;
    }

    public int getValue() {
        return value;
    }

    public Item(String name, int value) {
        this.name = name;
        this.value = value;
    }
}
