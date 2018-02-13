package com.bve.testmybatisassociations.model;

public class Author extends AbstractEntity {

    private String name;
    private int age;

    public Author(int id) {
        super(id);
    }

    public Author() {
    }

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

    public Author(int id, String name, int age) {
        super(id);
        this.name = name;
        this.age = age;
    }

    public Author(String name, int age) {
        this.name = name;
        this.age = age;
    }
}
