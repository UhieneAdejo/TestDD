package main.java;

public class Fib {

    int  first = 0;

    int second = 1;

    int next;

    Fib(int number) {

        for(int i = 0; i < number; i++){

            if (i < 2 ){
                System.out.println(i);
            } else {

                next = first + second;
                first = second;
                second = next;

                System.out.println(next);
            }
        }
    }

}
