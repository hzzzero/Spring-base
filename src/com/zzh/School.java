package com.zzh;

public class School {

    private String name;

    public void setName(String name) {
        this.name = name;
    }

    public School() {
    }

    @Override
    public String toString() {
        return "School{" +
                "name='" + name + '\'' +
                '}';
    }

    public School(String name) {
        this.name = name;
    }
}
