package com.woopi.question;

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

/**
 * QuestionQ3
 * 백준 문제 : 스택 수열
 * https://www.acmicpc.net/problem/1874
 * 백준에 제출 시엔 class 명을 'Main'으로 수정 후 제출한다.
 */
public class QuestionQ3 {
    public static void main(String[] args) throws Exception {
        //new QuestionQ3().solution_1();
        new QuestionQ3().solution_2();
    }

    public static void solution_1 () throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int count = Integer.parseInt(br.readLine());
        int stackCount = 1;
        Stack<Integer> stack = new Stack<Integer>();
        
        List<String> resultList = new ArrayList<>();

        loop:
        for (int i = 0; i < count; i++) {
            int data = Integer.parseInt(br.readLine());
            while (stackCount <= data) {
                stack.push(stackCount);
                stackCount++;
                resultList.add("+");
            }
            if (!stack.isEmpty()) {
                if (data == stack.peek()) {
                    stack.pop();
                    resultList.add("-");
                } else {
                    resultList.clear();
                    resultList.add("NO");
                    break loop;
                }
            }
        }

        for (String str : resultList) {
            System.out.println(str);
        }
    }

    public static void solution_2 () throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringBuilder sb = new StringBuilder();

        int num = Integer.parseInt(br.readLine());
        int[] stack = new int[num];
        int stackIdx = 0;
        int top = 0;
        
        for (int i = 0; i < num; i++) {
            int data = Integer.parseInt(br.readLine());
            if (data > top) {
                for (int j = top+1; j <= data; j++) {
                    stack[stackIdx] = j;
                    stackIdx++;
                    sb.append("+").append("\n");
                }
                stackIdx--;
                sb.append("-").append("\n");   
                top = data;
            } else if (stack[stackIdx-1] == data) {
                stackIdx--;
                sb.append("-").append("\n");   
            } else {
                System.out.print("NO");
        		System.exit(0);
            }
        }
        System.out.print(sb);
    }
}
