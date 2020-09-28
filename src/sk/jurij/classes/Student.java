package sk.jurij.classes;

public class Student {
    String name;
    int roll_no;
    String address;
    int phone;

    public Student(String name, int roll_no, int phone, String address){
        this.name = name;
        this.roll_no = roll_no;
        this.address = address;
        this.phone = phone;
    }

    public String getName() {
        return name;
    }

    public int getRollNo() {
        return roll_no;
    }

    public int getPhoneNumber() {
        return phone;
    }

    public String getAddress() {
        return address;
    }
}
