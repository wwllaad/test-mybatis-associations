package com.bve.testmybatisassociations.service;

import com.bve.testmybatisassociations.model.Author;
import com.bve.testmybatisassociations.model.Book;
import com.bve.testmybatisassociations.serialize.BookDTO;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import org.apache.ibatis.session.SqlSession;
import org.springframework.stereotype.Service;

@Service
public class BookService {

    private SqlSession sqlSession;

    public BookService(SqlSession sqlSession) {
        this.sqlSession = sqlSession;
    }

    @JsonSerialize
    public BookDTO getBookById(int id){
        Book book = sqlSession.selectOne("getBookById",id);
        BookDTO bookDTO = new BookDTO(book);
        return bookDTO;
    }


}
