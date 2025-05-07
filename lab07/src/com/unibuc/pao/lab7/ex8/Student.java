package com.unibuc.pao.lab7.ex8;

public class Student {

    private String cnp;

    private String name;

    private int age;

    private short group;

    private byte studyYear;

    public Student(String cnp, String name, int age, short group, byte studyYear) {
        this.cnp = cnp;
        this.name = name;
        this.age = age;
        this.group = group;
        this.studyYear = studyYear;
    }

    public String getCnp() {
        return cnp;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public short getGroup() {
        return group;
    }

    public byte getStudyYear() {
        return studyYear;
    }

    @Override
    public String toString() {
        return "Student{" +
                "cnp='" + cnp + '\'' +
                ", name='" + name + '\'' +
                ", age=" + age +
                ", group=" + group +
                ", studyYear=" + studyYear +
                '}';
    }
}
