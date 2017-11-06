package com.zzh;

public class Student {
    public String name;
    public int age;
    public School school;
    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Student(String name, int age ,School school) {
        this.name = name;
        this.age = age;
        this.school=school;
    }

    public Student() {
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", school=" + school +
                '}';
    }
}
