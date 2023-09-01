package org.example;

public class Student {
    private String num;
    private String name;

    public Student(String num, String name) {
        this.num = num;
        this.name = name;
    }

    public Student() {

    }

    public String getNum() {
        return num;
    }

    public void setNum(String num) {
        this.num = num;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Student{" +
                "num='" + num + '\'' +
                ", name='" + name + '\'' +
                '}';
    }
}
