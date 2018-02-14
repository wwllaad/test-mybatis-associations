package com.bve.testmybatisassociations.serialize;

import com.bve.testmybatisassociations.model.AbstractEntity;
import com.bve.testmybatisassociations.model.Author;
import com.bve.testmybatisassociations.model.Book;

public class BookDTO extends AbstractEntity {

    private String name;
    private Author author;

    public BookDTO(int id, String name, int author_id, String author_name, int author_age){
        this.id = id;
        this.name = name;
        this.author = new Author(author_id, author_name, author_age);
    }

    public BookDTO(int id, String name, Author author){
        this.id = id;
        this.name = name;
        this.author = author;
    }

    public BookDTO(Book book){
        this.id = book.getId();
        this.name = book.getName();
        this.author = book.getAuthor();
    }

    public BookDTO(int id) {
        super(id);
    }

    public BookDTO() {
    }

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
}
