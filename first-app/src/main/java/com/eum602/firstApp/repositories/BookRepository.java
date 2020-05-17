package com.eum602.firstApp.repositories;

import com.eum602.firstApp.model.Book;
import org.springframework.data.repository.CrudRepository;

public interface BookRepository extends CrudRepository<Book,Long> {
}
