package Functional_Interface.Function;

import java.util.function.BiFunction;

public class BiFunctionExample {
    public static void main(String[] args) {

/* Gia su ta co mot tinh nang tra ve mot so sau do nhan voi mot so
Bi function nhan vao 2 tham so va tra ve mot ket qua
  Represents a function that accepts two arguments and produces a result. This is the two-arity specialization of Function.

* */
//        non function way
        int increment = increment(4);
        int increment2 = multiply(increment);

//        function way
        BiFunction<Integer,Integer,Integer> incrementBiFunc =
                (incrementBi,multiplyBi) -> (incrementBi + 1) * multiplyBi;
        Integer apply = incrementBiFunc.apply(5, 10);
        System.out.println(incrementBiFunc.apply(4, 10));
    }


    static int increment(int num){
        return num + 1;
    }
    static int multiply(int num){
        return num * 10;
    }
}
