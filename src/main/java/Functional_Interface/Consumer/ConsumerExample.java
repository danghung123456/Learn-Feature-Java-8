package Functional_Interface.Consumer;

import imperative_declarative.Gender;
import imperative_declarative.Person;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class ConsumerExample {
    public static void main(String[] args) {
        List<Person> personList = Arrays.asList(
                new Person("Alex", Gender.Male),
                new Person("Alice", Gender.Female),
                new Person("Michael", Gender.Male),
                new Person("Annie", Gender.Female),
                new Person("Dolly", Gender.Another)
        );
        /* Gia su ban co mot chuc nang in thong tin ra
Consumer nhu mot void function, nhan vao mot tham so va khong tra ve gi het
Represents an operation that accepts a single input argument and returns no result. Unlike most other functional interfaces, Consumer is expected to operate via side-effects.

         **/
//        non function way
        System.out.println("non function way");
        info(personList);
//        function way
        System.err.println("function way");
        Consumer<Person> infoFunc = person
                ->  System.out.println("Name is: "+person.getName() + " | gender is: "+person.getGender());
        personList.forEach(infoFunc);
    }
    static void info(List<Person> list){
       for(Person person:list){
           System.out.println("Name is: "+person.getName() + " | gender is: "+person.getGender());
       }
    }
}
