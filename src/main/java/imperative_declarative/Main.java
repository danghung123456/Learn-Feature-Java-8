package imperative_declarative;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Function;

public class Main {
    public static void main(String[] args) {

        List<Person> personList = Arrays.asList(
                new Person("Alex", Gender.Male),
                new Person("Alice", Gender.Female),
                new Person("Michael", Gender.Male),
                new Person("Annie", Gender.Female),
                new Person("Dolly", Gender.Another)
        );
/*              imperative approach
With imperative programming, you tell the compiler what you want to happen, step by step. (how to get what you want)!
https://stackoverflow.com/questions/1784664/what-is-the-difference-between-declarative-and-imperative-paradigm-in-programming
* */
        System.out.println("Imperative");
        List<Person> gender = new ArrayList<>();
        for (Person person : personList) {
            if (Gender.Male.equals(person.getGender())) {
                gender.add(person);
            }
        }
        for (Person person : gender) {
            System.out.println(person);
        }

        /*              Declarative approach
With declarative programming, on the other hand, you write code that describes what you want, (just what you want)!
but not necessarily how to get it (declare your desired results, but not the step-by-step)
https://stackoverflow.com/questions/1784664/what-is-the-difference-between-declarative-and-imperative-paradigm-in-programming
* */
        System.out.println("Declarative");
        personList.stream()
                .filter(person -> Gender.Male.equals(person.getGender()))
                .forEach(person -> System.out.println(person));
        System.out.println(increment.apply(1));



    }

    static Function<Integer, Integer> increment = number -> number + 1;

}
