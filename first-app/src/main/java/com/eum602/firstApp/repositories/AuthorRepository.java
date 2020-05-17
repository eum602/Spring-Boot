package com.eum602.firstApp.repositories;

import com.eum602.firstApp.model.Author;
import org.springframework.data.repository.CrudRepository;

public interface AuthorRepository extends CrudRepository<Author,Long> {//author is the class and Long is the type of "id" in Author class

}
