package com.mkdika.springbootdatarest.repository;

import com.mkdika.springbootdatarest.model.Book;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

/**
 *
 * @author Maikel Chandika <mkdika@gmail.com>
 */
public interface BookRepository extends JpaRepository<Book, Long>{    
}
