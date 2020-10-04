package sk.jurij;

import sk.jurij.classes.Shiritori;

public class Main {
    public static void main(String[] args){
        Shiritori shiritori = new Shiritori();
        shiritori.runGame(new String[]{"Word", "Dowrw", "wlord", "deader", "righteous", "serpent"});

        shiritori.restart();
        shiritori.runGame(new String[]{"motive", "ebeach", "event"});

    }
}