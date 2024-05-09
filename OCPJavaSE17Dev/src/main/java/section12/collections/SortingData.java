package section12.collections;

import java.util.*;

public class SortingData {
    static class Person implements Comparable<Person>{
        private final String name;
        private final int age;

        public Person(String name, int age){
            this.name = name;
            this.age = age;
        }
        @Override
        public int compareTo(Person other) {
            return this.age - other.getAge();
            //return this.name.compareTo(other.getName());
        }

        public String getName(){
            return this.name;
        }
        public int getAge(){
            return this.age;
        }

        public String toString(){
            return "Person{" + "name: " + this.name + ", age: " + this.age + "}";
        }
    }
    public static void main(String[] args) {
        /*
        String[] names = new String[]{"Ben", "ben", "1"};
        Arrays.sort(names);
        //[1, "Ben", "ben"]
        System.out.println(Arrays.toString(names));
         */

        /*
        List<Person> people = Arrays.asList(
                new Person("John", 20),
                new Person("George", 25),
                new Person("Ben", 30)
        );

        Collections.sort(people);
        System.out.println(people.toString());
         */

        /*
        List<Person> people = Arrays.asList(
                new Person("John", 20),
                new Person("George", 25),
                new Person("Ben", 30)
        );

        Comparator<Person> byAge = (p1, p2) -> p1.getAge() - p2.getAge();
        Comparator<Person> byName = (p1, p2) -> p1.getName().compareTo(p2.getName());

        people.sort(byAge);
        System.out.println(people.toString());

        people.sort(byName);
        System.out.println(people.toString());
         */

        /*
        List<Person> people = Arrays.asList(
                new Person("John", 20),
                new Person("George", 25),
                new Person("Ben", 30)
        );

        Comparator<Person> byAgeOldWay = new Comparator<Person>() {
            @Override
            public int compare(Person o1, Person o2) {
                return o1.getAge() - o2.getAge();
            }
        };

        people.sort(byAgeOldWay);
        System.out.println(people.toString());
       */

        List<Person> people = Arrays.asList(
                new Person("Ben", 20),
                new Person("George", 25),
                new Person("Ben", 30)
        );

        Comparator<Person> byNameComparator = Comparator.comparing(Person::getName);
        Comparator<Person> byRevNameComparator = Comparator.comparing(Person::getName).reversed();
        Comparator<Person> byNameAndAgeComparator = Comparator.comparing(Person::getName).thenComparingInt(Person::getAge);

        people.sort(byRevNameComparator);

        System.out.println(people.toString());
    }
}
