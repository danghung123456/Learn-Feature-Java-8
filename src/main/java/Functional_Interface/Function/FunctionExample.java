package Functional_Interface.Function;


//import java.util.function.Function;

import java.util.function.Function;

public class FunctionExample {
    public static void main(String[] args) {
        /* Gia su viet 2 function tra ve mot so, thi viet binh thuong khac gi voi viet kieu functional programming
         * */
//        viet kieu binh thuong thi minh phai tu dinh nghia ra hai ham` la` increment va multiply
        int increment = increment(1);
        System.out.println(multiply(increment));

//        viet kieu functional programming
//        function interface nhu mot return type method, nhan mot tham so va tra ve mot ket qua
//        Represents a function that accepts one arguments and produces a result. This is the two-arity specialization of Function.
        Function<Integer,Integer> incrementFunc = num -> num + 1;
        int storeIncrementFunc = incrementFunc.apply(1);

        Function<Integer,Integer> multiplyFunc = num-> num  * 10;
        multiplyFunc.apply(storeIncrementFunc);
//        or
        Function<Integer, Integer> addByOneAndThenMultiply = incrementFunc.andThen(multiplyFunc);
        addByOneAndThenMultiply.apply(1);


    }

//    normal
    static int increment(int num) {
        return num + 1;
    }

    static int multiply(int num) {
        return num * 10;
    }
}
