package com.scaler.solid_principle.Prototype;

public class Client {

    public void initRegistry(StudentRegistry registry) {
        Student April25Morning = new Student();
        April25Morning.setName("lohith");
        April25Morning.setAveragePsp(75.0);
        April25Morning.setBatch("April 25 Morning");
        registry.register("April25Morning", April25Morning);

    }
    public static void main(String[] args) {
        StudentRegistry studentRegistry = new StudentRegistry();
        //create 100,000 copies of it
        Student student = new Student();
    }
}
