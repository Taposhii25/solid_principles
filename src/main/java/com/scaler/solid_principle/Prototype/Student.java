package com.scaler.solid_principle.Prototype;

public class Student implements Prototype<Student> {
    private String name;
    private int age;
    private String batch;
    private double psp;
    private double averagePsp;
    private String city;

    public Student(){

    }
    //copy constructor
    public Student(Student student) {
        this.name = student.getName();
        this.age = student.getAge();
        this.batch = student.getBatch();
        this.psp = student.getPsp();
        this.averagePsp = student.getAveragePsp();
        this.city = student.getCity();

    }

    @Override
    public Student clone() {
        return new Student(this);
    }

    /*
    public Student clone() {
        Student st= new Student();
        this.st= name;
        .....in case you dont have copy constructor
    }
     */

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    public int getAge() {
        return age;

    }
    public void setAge(int age) {
        this.age = age;
    }
    public String getBatch() {
        return batch;
    }
    public void setBatch(String batch) {
        this.batch = batch;
    }
    public double getPsp() {
        return psp;
    }
    public void setPsp(double psp) {
        this.psp = psp;
    }
    public double getAveragePsp() {
        return averagePsp;
    }
    public void setAveragePsp(double averagePsp) {
        this.averagePsp = averagePsp;
    }
    public String getCity() {
        return city;
    }
    public void setCity(String city) {
        this.city = city;
    }

}
