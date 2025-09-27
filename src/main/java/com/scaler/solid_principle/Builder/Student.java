package com.scaler.solid_principle.Builder;

public class Student {
    private String name;
    private int age;
    private String batch;
    private String universityname;
    private double psp;
    private int gradyear;
    private String phonenumber;

    private Student(Builder builder) {
        //validation
        if(builder.getGradyear() < 2021){
            throw new RuntimeException("Gradyear must be >= 2021");
        }
        if(builder.getAge() <= 21){
            throw new RuntimeException("Age must be > 21");
        }
        this.name = builder.getName();
        this.age = builder.getAge();
        this.batch = builder.getBatch();
        this.universityname = builder.getUniversityname();
        this.psp = builder.getPsp();
        this.gradyear = builder.getGradyear();
        this.phonenumber = builder.getPhonenumber();

    }
    public static Builder getBuilder() {
        return new Builder();
    }
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
    public String getUniversityname() {
        return universityname;
    }
    public void setUniversityname(String universityname) {
        this.universityname = universityname;
    }
    public double getPsp() {
        return psp;
    }
    public void setPsp(double psp) {
        this.psp = psp;
    }
    public int getGradyear() {
        return gradyear;
    }
    public void setGradyear(int gradyear) {
        this.gradyear = gradyear;
    }
    public String getPhonenumber() {
        return phonenumber;
    }
    public void setPhonenumber(String phonenumber) {
        this.phonenumber = phonenumber;
    }

}
