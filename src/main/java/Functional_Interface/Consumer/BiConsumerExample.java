package Functional_Interface.Consumer;

import imperative_declarative.Gender;
import imperative_declarative.Person;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.function.BiConsumer;
import java.util.function.Consumer;

public class BiConsumerExample {
    public static void main(String[] args) {
/*  Gia su ban co mot chuc nang in ra thong tin neu voi dk la neu la male thi nam, female thi la nu
    BiConsumer nhan vao 2 tham so va khong tra ve gi het
    Muon duyet mot BiComsumer phai dung map.forEach
    Represents an operation that accepts two input arguments and returns no result.
    This is the two-arity specialization of Consumer. Unlike most other functional interfaces,
    BiConsumer is expected to operate via side-effects.

**/
        List<Person> personList = Arrays.asList(
                new Person("Alex", Gender.Male),
                new Person("Alice", Gender.Female),
                new Person("Michael", Gender.Male),
                new Person("Annie", Gender.Female),
                new Person("Dolly", Gender.Another)
        );
        Map<Person, Boolean> map = new HashMap<>();
        map.put(new Person("Alex", Gender.Male), true);
        map.put(new Person("Alice", Gender.Female), false);
        map.put(new Person("Michael", Gender.Male), true);
        map.put(new Person("Annie", Gender.Female), true);
        map.put(new Person("Dolly", Gender.Another), true);
//        non function way
        System.out.println("non function way");
        info(personList, false);

//        function way
        System.err.println("function way");
        BiConsumer<Person, Boolean> infoBiFunc = (person, checkGender) -> {
            System.out.println("Name is: " + person.getName() +
                    (checkGender ? " | gender is: " + person.getGender() : " | gender is: "+"**********"));
        };

        map.forEach(infoBiFunc);
    }

    static void info(List<Person> list, boolean checkGender) {
        for (Person person : list) {
//           person.getGender().equals(Gender.Male) ? "Nam" :(person.getGender().equals(Gender.Female)?"Nu" : "Gioi tinh khac");
            if (checkGender) {
                if (person.getGender().equals(Gender.Male)) {
                    System.out.println("Name is: " + person.getName() + " | gender is: " + "Nam");
                } else if (person.getGender().equals(Gender.Female)) {
                    System.out.println("Name is: " + person.getName() + " | gender is: " + "Nu");
                } else {
                    System.out.println("Name is: " + person.getName() + " | gender is: " + "Gioi tinh khac");
                }
            } else {
                if (person.getGender().equals(Gender.Male)) {
                    System.out.println("Name is: " + person.getName() + " | gender is: " + "*******");
                } else if (person.getGender().equals(Gender.Female)) {
                    System.out.println("Name is: " + person.getName() + " | gender is: " + "*******");
                } else {
                    System.out.println("Name is: " + person.getName() + " | gender is: " + "*******");
                }
            }

        }
    }
}
