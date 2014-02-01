package tum.lab.dto;

import javax.xml.bind.annotation.XmlRootElement;

/**
 * Created by tum on 2/1/2014 AD.
 */

@XmlRootElement(name = "Person")
public class PersonDto {

    private String name;
    private int age;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
