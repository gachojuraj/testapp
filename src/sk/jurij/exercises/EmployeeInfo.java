package sk.jurij.exercises;

import sk.jurij.classes.Employee;
import sk.jurij.classes.JobPosition;

import java.util.Calendar;
import java.util.GregorianCalendar;

public class EmployeeInfo {
    public static void main(String[] args) {
        Employee employee1 = new Employee("Jozko", "Mrkvicka",
                new GregorianCalendar(1990, Calendar.AUGUST, 4).getTime(),
                new JobPosition("IT Programmer", 2100));
        System.out.printf("%s %s, %s %.2f€", employee1.getName(),
                employee1.getSurname(),
                employee1.getJobPosition().getName(),
                employee1.getJobPosition().getSalary());
    }
}
