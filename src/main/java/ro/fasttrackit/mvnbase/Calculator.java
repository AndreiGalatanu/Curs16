package ro.fasttrackit.mvnbase;

public class Calculator {

    public int add(int a, int b){
        if ((long)a+b >=Integer.MAX_VALUE){
            throw new IllegalArgumentException();
        }
        return  a+b;
    }


    public int substract(int a, int b){
        return a-b;
    }

    public int multiply(int a, int b){


        return a;
    }

}
