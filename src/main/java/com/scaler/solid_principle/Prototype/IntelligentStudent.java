package com.scaler.solid_principle.Prototype;

public class IntelligentStudent extends Student {
    private double iq;
    public IntelligentStudent(IntelligentStudent student) {
        super(student);
        this.iq = student.iq;
    }

    public IntelligentStudent() {
        
    }
    public double getIq() {
        return iq;
    }

    public void setIq(double iq) {
        this.iq = iq;
    }
}
