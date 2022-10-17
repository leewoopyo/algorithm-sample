package com.woopi.algorithm.stack.sample;

import java.util.Stack;

public class Basic {
    public static void main(String[] args) {
		Stack<String> stack = new Stack<>();

		// Stack에 데이터 추가
		stack.push("Data1");
		stack.push("Data2");
		stack.push("Data3");

		// Stack에서 데이터 꺼내기
		System.out.println(stack.pop());

		// Stack의 최상단 값 출력(제거하지 않음)
		System.out.println(stack.peek());

		// Stack에서 데이터 꺼내기
		System.out.println(stack.pop());
    }
}
