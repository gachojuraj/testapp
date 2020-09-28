package sk.jurij.exercises;

import sk.jurij.classes.Person;

public class Budget {
    public static int sumBudgets(Person[] arr){
        int sum = 0;
        for (Person i : arr) sum += i.getBudget();
        return sum;
    }
}