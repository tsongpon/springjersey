package tum.lab.service;

import org.springframework.stereotype.Service;
import tum.lab.domain.Person;

/**
 * Created by tum on 2/1/2014 AD.
 */

@Service
public class PersonService {

    public Person getPerson(String name) {
        return new Person(name, "Imyen", 30);
    }
}
