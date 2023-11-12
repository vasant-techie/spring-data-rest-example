package com.example.springdatarest.repo;

import com.example.springdatarest.entities.Author;
import org.springframework.data.repository.CrudRepository;

public interface AuthorRepository extends CrudRepository<Author, Long> {
}