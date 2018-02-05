package com.mkdika.springbootdatarest.repository;

import com.mkdika.springbootdatarest.model.Author;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

/**
 *
 * @author Maikel Chandika <mkdika@gmail.com>
 */
@RepositoryRestResource(path = "author")
public interface AuthorRepository extends JpaRepository<Author, Long>{   
}
