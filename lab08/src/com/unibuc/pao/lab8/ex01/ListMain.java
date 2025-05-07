package com.unibuc.pao.lab8.ex01;

import com.unibuc.pao.lab7.ex8.Student;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Vector;

public class ListMain {

    public static void main(String[] args) {

        Student student1 = new Student("1234567890123", "John Doe", 20, (short) 1, (byte) 1);
        Student student1Again = new Student("1234567890123", "John Doe", 20, (short) 1, (byte) 1);
        Student student2 = new Student("1234567890124", "Jane Doe", 20, (short) 1, (byte) 1);

        vectorMethods(student1, student2);

        arrayListMethods(student1, student2, student1Again);

    }

    private static void arrayListMethods(Student student1, Student student2, Student student1Again) {
        List<Student> students = new ArrayList<>();
        students.add(student1);
        students.add(student2);

        System.out.println("\nStudents in the list:" + students);
        System.out.println("Size of ArrayList: " + students.size());

        System.out.println("Students in the list:" + students);
        System.out.println("Index of student1: " + students.indexOf(student1Again));
    }

    private static void vectorMethods(Student student1, Student student2) {
        Vector<Student> students = new Vector<>();
        students.add(student1);
        students.addFirst(student2);

        System.out.println("\nStudents in the list:" + students);

        Iterator<Student> iterator = students.iterator();

        iterator.forEachRemaining(student -> {
            System.out.println("Student: " + student);
        });

        students.set(0, null);

        iterator = students.iterator();
        while (iterator.hasNext()) {
            Student student = iterator.next();
            System.out.println("Student: " + student);
            // students.add(new Student("12345678956753", "Jill White", 20, (short) 1, (byte) 1)); // causes ConcurrentModificationException to be thrown
        }

    }
}
