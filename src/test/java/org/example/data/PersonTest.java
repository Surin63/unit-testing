package org.example.data;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Assumptions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PersonTest {

    Person person;

    @BeforeEach
    void setUp() {
        person = new Person("Dusan", "Surin", 33);
    }

    @Test
    void getName() {
        String actual = person.getName();
        String excepted = "Dusan";

        Assertions.assertEquals(actual, excepted);
    }

    @Test
    void setName() {
        person.setName("Gabriela");

        String actual = person.getName();
        String excepted = "Gabriela";

        Assertions.assertEquals(actual, excepted);
    }

    @Test
    void getSurename() {
        String actual = person.getSurename();
        String excepted = "Surin";

        Assertions.assertEquals(actual, excepted);
    }

    @Test
    void setSurename() {
        Person person1 = new Person();
  //      Assertions.assertNull(person1.getSurename());
  //     person1.setSurename("Tester");
        Assumptions.assumeTrue(person1.getSurename()==(null));

        person1.setSurename("Tester");
        String actual = person1.getSurename();
        Assertions.assertEquals(actual, "Tester");

    }

    @Test
    void getAge() {
        int actual = person.getAge();
        int expected = 33;

        Assertions.assertEquals(actual, expected);
    }

    @Test
    void setAge() {
        person.setAge(63);
        int expected = 63;
        int actual = person.getAge();

        Assertions.assertEquals(actual, expected);
    }
}