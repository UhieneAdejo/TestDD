package main.java;

public class Maths {

    public int addTwoNumbers(int x, int y){
        return x + y;
    }

    public boolean numberIsPrime(int number){

        boolean flag = true;

        for(int i = 2; i < number / 2; i++){
            if (number % i == 0){
                flag = false;
            }
        }
        return flag;
    }
}
