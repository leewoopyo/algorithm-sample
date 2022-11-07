package com.woopi.algorithm.recursive_call;

/**
 * RecursiveCallMain
 * 재귀용법
 */
public class RecursiveCallMain {

    public static void main(String[] args) {
        System.out.println(factorial(5));        
    }

    //팩도리얼 함수
    public static int factorial(int input) {

        System.out.println("--> input_value : " + input);

        if (input > 1) {
            return input * factorial(input - 1);
        } else {
            return 1;
        }
    }

}