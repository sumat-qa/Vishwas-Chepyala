package com.test.find;

import java.util.List;

import java.util.Arrays;
import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class PersonFinderTest {

  private PersonFinder finder = new PersonFinder();

  @Test
  @DisplayName("should find josdem")
  void shouldFindPersonByNickname(){
    List<Person> persons = Arrays.asList(
      new Person("josdem", "josdem@dominos.com"),
      new Person("skye", "skye@dominos.com")
    );
    Person person = finder.findByNickname("josdem", persons);
    assertEquals("josdem@dominos.com", person.getEmail(), "should found josdem");
  }

  @Test
  @DisplayName("should return an empty person")
  void shouldNotFindAnyPerson(){
    Person person = finder.findByNickname("thisNicknameDoesNotExist", new ArrayList<>());
    assertNotNull(person, "return type should not be null");
  }

}
