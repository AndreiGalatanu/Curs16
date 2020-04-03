package ro.fasttrackit.mvnbase.DiffrentTests.PersonTests;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import ro.fasttrackit.mvnbase.Person.Person;


public class PersonTests {




    @Test
    @DisplayName("WHEN a simple person is created Then no exception are thrown")
    void simplePerson() {
        Person person = new Person(133, "Mihai Popescu", 30);

        Assertions.assertThat(person.getId()).isEqualTo(133);
        Assertions.assertThat(person.getName()).isEqualTo("Mihai Popescu");
        Assertions.assertThat(person.getAge()).isEqualTo(30);

    }


    @Test
    @DisplayName("When name is null THEN IllegalArgumentException is thrown")
    void nullNamePerson() {


        var exception = org.junit.jupiter.api.Assertions.assertThrows(IllegalArgumentException.class, () -> new Person(1, null, 22));

        Assertions.assertThat(exception.getMessage()).isEqualTo("Invalid name: null is not allowed");


    }

    @Test
    @DisplayName("When name contains numbers THEN IllegalArgumentException is thrown")
    void numberInName() {
        //Setup
        //run
        var exception = org.junit.jupiter.api.Assertions.assertThrows(IllegalArgumentException.class, () -> new Person(1, "PopescuIsNr1", 22));
        //assert
        Assertions.assertThat(exception.getMessage()).isEqualTo("Invalid name");
    }

    @Test
    @DisplayName("When name contains illegal chars THEN IllegalArgumentException is thrown")
    void specialCharInName(){

        //Setup
        //run
        var exception = org.junit.jupiter.api.Assertions.assertThrows(IllegalArgumentException.class, () -> new Person(1, "#Emma", 22));
        //assert
        Assertions.assertThat(exception.getMessage()).isEqualTo("Invalid name");


    }



}
