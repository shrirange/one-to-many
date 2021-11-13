package com.example.onetomany;

import org.springframework.data.jpa.repository.JpaRepository;
public interface AuthorRepository extends JpaRepository<Author, Integer> {

}
