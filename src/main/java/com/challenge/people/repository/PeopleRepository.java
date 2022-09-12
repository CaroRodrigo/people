package com.challenge.people.repository;

import com.challenge.people.entity.People;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 *
 * @author Rodrigo Caro
 */
@Repository
public interface PeopleRepository extends JpaRepository<People, Integer> {
    
}
