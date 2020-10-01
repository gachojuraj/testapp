package sk.jurij.classes;

public class Student {
    String name;
    int number;
    String address;
    int phone;

    public Student(String name, int number, int phone, String address){
        this.name = name;
        this.number = number;
        this.address = address;
        this.phone = phone;
    }

    public String getName() {
        return name;
    }

    public int getStudentNumber() {
        return number;
    }

    public int getPhoneNumber() {
        return phone;
    }

    public String getAddress() {
        return address;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public void setPhone(int phone) {
        this.phone = phone;
    }
}
