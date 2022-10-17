package com.woopi.algorithm.stack.sample;

/**
 * recursive(재귀함수)는 스택 구조의 프로세스를 가지고 있다.
 */
public class Recursive {

    public static void main(String[] args) {
        recursive(4);
    }

    public static void recursive (int data) {

        if (data < 0) {
            System.out.println("Process Ended....");
            System.out.println("Result Printed....");
        } else {
            System.out.printf("push ==> %d\n" , data);
            //재귀함수 호출
            recursive(data - 1);
            System.out.printf("pop : %d\n",data);
        }
    }

}