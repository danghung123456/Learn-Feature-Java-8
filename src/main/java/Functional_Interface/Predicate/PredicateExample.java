package Functional_Interface.Predicate;

import java.util.function.Predicate;

public class PredicateExample {
    public static void main(String[] args) {
        /* Gia su check dieu kien cua mot so dien thoai
        Predicate dai dien cho mot boolean cho tham so truyen vao
        Represents a predicate (boolean-valued function) of one argument.
        * */
//        non function way
        System.out.println("non function way");
        System.out.println(isNumberValid("0939283123"));
        System.out.println(isNumberValid("0778683639"));
//        function way
        System.err.println("function way");
        Predicate<String> isNumberValidFunc =
                phoneNum -> phoneNum.startsWith("093") && phoneNum.length() == 10;

        System.out.println(isNumberValidFunc.test("0939283123"));
        System.out.println(isNumberValidFunc.test("0778683639"));
    }

    static boolean isNumberValid(String phoneNum) {
        return phoneNum.startsWith("093") && phoneNum.length() == 10;
    }
}
