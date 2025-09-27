package com.scaler.solid_principle.Builder;

public class Builder {
    private String name;
    private int age;
    private String batch;
    private String universityname;
    private double psp;
    private int gradyear;
    private String phonenumber;

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
