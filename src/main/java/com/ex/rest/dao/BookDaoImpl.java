package com.ex.rest.dao;

import java.util.List;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;

import com.ex.rest.model.Book;

public class BookDaoImpl implements BookDao {

	@Autowired
	private SessionFactory sessionFactory;
	
	public long save(Book book) {
		// TODO Auto-generated method stub
		return 0;
	}

	public Book get(long id) {
		// TODO Auto-generated method stub
		return null;
	}

	public List<Book> list() {
		// TODO Auto-generated method stub
		return null;
	}

	public void update(long id, Book book) {
		// TODO Auto-generated method stub

	}

	public void delete(long id) {
		// TODO Auto-generated method stub

	}

}
