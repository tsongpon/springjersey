package tum.lab.mapper;

import tum.lab.domain.Person;
import tum.lab.dto.PersonDto;

/**
 * Created by tum on 2/1/2014 AD.
 */
public final class PersonMapper {

    private PersonMapper(){}

    public static PersonDto map(Person person) {
        PersonDto personDto = new PersonDto();
        personDto.setName(person.getFirstName() + " " + person.getLastName());
        personDto.setAge(person.getAge());

        return personDto;
    }
}
