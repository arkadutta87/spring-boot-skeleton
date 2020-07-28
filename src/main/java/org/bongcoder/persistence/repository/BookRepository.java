package org.bongcoder.persistence.repository;

import java.util.List;

import org.bongcoder.persistence.model.Book;
import org.springframework.data.repository.CrudRepository;

public interface BookRepository extends CrudRepository<Book, Long> {

  List<Book> findByTitle(String title);
}
