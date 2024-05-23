package com.pluralsight.services;

import com.pluralsight.models.Employee;
import com.pluralsight.models.Person;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class PersonService
{

    public List<Person> findPeople(List<Person> people, String name)
    {
        // search for people by first name
        // return a new List<Person> with the search results
        List<Person> result = new ArrayList<>();
        for (Person person : people)
        {
            if (person.getFirstName().equalsIgnoreCase(name))
            {
                result.add(person);
            }
        }
        return result;
        // return new ArrayList<>();
    }

    public List<Person> findPeople(List<Person> people, int age)
    {
        // search for people by age
        List<Person> result = new ArrayList<>();
        for (Person person : people)
        {
            if (person.getAge() == age)
            {
                result.add(person);
            }
        }
        return result;
        // return new ArrayList<>();
    }

    public int calculateAverageAge(List<Person> people)
    {
        // search for people by average age

        // calculate total age
        int totalAge = 0;
        for (Person person : people)
        {
           totalAge += person.getAge();
        }

        // calculate the average age
        int averageAge = 0;
        if (!people.isEmpty())
        {
            averageAge = totalAge / people.size();
        }
        return averageAge;
    }

    public int findOldestAge(List<Person> people)
    {
        // search for person who is the oldest
        int oldestAge = Integer.MIN_VALUE;

        for (Person person : people)
        {
            if (person.getAge() > oldestAge)
            {
                oldestAge = person.getAge();
            }
        }
        return oldestAge;
    }

    public int findYoungestAge(List<Person> people)
    {
        // search for person who is the youngest
        int youngestAge = Integer.MAX_VALUE;

        for (Person person : people)
        {
            if (person.getAge() < youngestAge)
            {
                youngestAge = person.getAge();
            }
        }
        return youngestAge;
    }

    public List<Person> sortYoungestFirst(List<Person> people)
    {
        // display all people sorted by age (youngest to oldest)

        int youngestAge = Integer.MAX_VALUE;
        List<Person> youngestFirst = new ArrayList<>();

        // find the youngest age in the list
        for (Person person : people)
        {
            if (person.getAge() < youngestAge)
            {
                youngestAge = person.getAge();
            }
        }

        // add people with the youngest age first to the result list
        for (Person person : people)
        {
            if (person.getAge() == youngestAge)
            {
                youngestFirst.add(person);
            }
        }

        // Sort the list of people by age (youngest to oldest)
        Collections.sort(people, Comparator.comparingInt(Person::getAge));

        return people;
    }

    public List<Person> sortOldestFirst(List<Person> people)
    {
        // display all people sorted by age (oldest to youngest)
        int oldestAge = Integer.MIN_VALUE;
        List<Person> oldestFirst = new ArrayList<>(people);

        // Sort the list of people by age (oldest to youngest)
        Collections.sort(oldestFirst, Comparator.comparingInt(Person::getAge).reversed());

        return oldestFirst;
    }

    public List<Employee> createEmployees(List<Person> people)
    {
        // Create a list of Employees - display them

        // populate the list of Employees with...
        // create a new Employee for each person in your people list
        // the salary of each employee is based on their age $3,000 per year
        // i.e. a 10 year old = $30,000, a 40 year old = $120,000 etc

     //  List<Employee> employees = new ArrayList<>();
     //
     //  // iterate through each person in the list
     //  for (Person person : people)
     //  {
     //      Employee employee = new Employee(person.getFirstName(), person.getLastName(), person.getAge());
     //      employees.add(employee);
     //  }
     //
     //  return employees;
        return null;
    }
}
