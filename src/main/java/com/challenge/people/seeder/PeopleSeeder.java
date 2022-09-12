package com.challenge.people.seeder;

import com.challenge.people.entity.People;
import com.challenge.people.repository.PeopleRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

/**
 *
 * @author Rodrigo Caro
 */
@Component
public class PeopleSeeder implements CommandLineRunner {

    @Autowired
    PeopleRepository peopleRepository;
    
    @Override
    public void run(String... args) throws Exception {
        loadPeople();
    }
    
     private void loadPeople() {
    if (peopleRepository.count() == 0) {
      loadPeopleSeed();
    }
  }

  private void loadPeopleSeed() {
    peopleRepository.save(buildPeople(37315716, "Rodrigo Caro", "Argentina", 29, true,33333333,null));
  }

  private People buildPeople(Integer document, String name, String country,Integer age, Boolean hasChildren,Integer son, Integer dad ) {
    return new People(document, name, country, age, hasChildren, son, dad);
  }
    
    
}
