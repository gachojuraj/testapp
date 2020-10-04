package sk.jurij.classes;

import java.util.ArrayList;
import java.util.regex.Pattern;

public class Shiritori {
    ArrayList<String> words = new ArrayList<>();
    boolean gameOver = false;
    Pattern p = Pattern.compile("[^a-z]", Pattern.CASE_INSENSITIVE);

    public void runGame(String[] arr){
        for (String s : arr){
            System.out.println(play(s));
            if (gameOver) return;
        }
    }

    public String play(String word){
        if (words.isEmpty()
                || words.get(words.size()-1).toLowerCase().endsWith(String.valueOf(word.charAt(0)).toLowerCase())
                && words.stream().noneMatch(s -> s.equalsIgnoreCase(word)) && !gameOver
                && !p.matcher(word).find()){
            words.add(word);
            return (String.format("Correct word. Used words: %s", getWords()));
        }
        gameOver = true;
        return "Game Over";
    }

    public void restart(){
        words.clear();
        gameOver = false;
        System.out.println("Game restarted");
    }

    public String getWords(){
        StringBuilder builder = new StringBuilder();
        for(String s : words) builder.append(String.format("%s ", s));
        return builder.toString();
    }
}
