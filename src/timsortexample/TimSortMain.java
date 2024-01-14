package timsortexample;

import java.util.Comparator;

public class TimSortMain {
    public static void main(String[] args) {
        Person[] people = {
                new Person(18, "Muhammed", 25),
                new Person(8, "Java", 29),
                new Person(10, "Core", 22),
                new Person(3, "Example", 24)
        };

        System.out.println("\nBefore sorting by age:");
        TimSortPerson.printArray(people);
        System.out.println("--------------------------------------------------------------------");


        TimSortPerson.sort(people, Comparator.comparingInt(person -> person.age));
        System.out.println("After sorting by age:");
        TimSortPerson.printArray(people);
        System.out.println("--------------------------------------------------------------------");

        TimSortPerson.sort(people, Comparator.comparing(person -> person.name));
        System.out.println("After sorting by name:");
        TimSortPerson.printArray(people);
        System.out.println("--------------------------------------------------------------------");


        TimSortPerson.sort(people, Comparator.comparingLong(person -> person.id));
        System.out.println("After sorting by id:");
        TimSortPerson.printArray(people);
        System.out.println("--------------------------------------------------------------------");
    }
}
