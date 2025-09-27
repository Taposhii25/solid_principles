package com.scaler.solid_principle.Builder;

public class Client {
    public static void main(String[] args) {
        Builder builder = new Builder();
        builder.setName("John Doe");
        builder.setAge(22);
        builder.setBatch("beginner's batch 24");
        builder.setGradyear(2022);
        builder.setPhonenumber("123456789");

        //Student st = new Student(builder);
        System.out.println("debug");
    }
}
