package com.ex.rest.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.ex.rest.dao.BookDao;
import com.ex.rest.model.Book;

@Service
@Transactional(readOnly = true)
public class BookServiceImpl implements BookService {

	@Autowired
	private BookDao bookDao;
	
	@Transactional
	public long save(Book book) {
		return bookDao.save(book);
	}

	public Book get(long id) {
		return bookDao.get(id);
	}

	public List<Book> list() {
		return bookDao.list();
	}

	public void update(long id, Book book) {
		bookDao.update(id, book);
	}

	public void delete(long id) {
		bookDao.delete(id);
	}

}
