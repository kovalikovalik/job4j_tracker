package ru.job4j.pojo;

import java.util.Date;

public class College {
    public static void main(String[] args) {
        Student student = new Student();
        student.setName("Anastasiia Bogomolova ");
        student.setGroup("B182 ");
        student.setEntrance(new Date());
        System.out.println(student.getName() + "is in a group " + student.getGroup() + System.lineSeparator()
                + "The date of entrance is " + student.getEntrance());
    }
}
