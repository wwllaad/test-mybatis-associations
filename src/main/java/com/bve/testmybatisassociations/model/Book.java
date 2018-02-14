package com.bve.testmybatisassociations.model;

public class Book extends AbstractEntity {

    private String name;
    private Author author;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Author getAuthor() {
        return author;
    }

    public void setAuthor(Author author) {

        this.author = author;
    }

    public Book(int id) {
        super(id);
    }

    public Book() {
    }

    public Book(int id, String name, Author author) {
        super(id);
        this.name = name;
        this.author = author;
    }

    public Book(String name, Author author) {
        this.name = name;
        this.author = author;
    }

}
