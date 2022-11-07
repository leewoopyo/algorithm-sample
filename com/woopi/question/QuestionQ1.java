package com.woopi.question;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

/**
 * QuestionQ1
 * 백준 문제 : 음계
 * https://www.acmicpc.net/problem/2920
 * 백준에 제출 시엔 class 명을 'Main'으로 수정 후 제출한다.
 */
public class QuestionQ1 {
    public static void main(String[] args) throws Exception {
        //new QuestionQ1().solution_1();
        new QuestionQ1().solution_2();
    }

    public static void solution_1 () throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        
        //sample : "8 1 7 2 6 3 5 4"
        String input = br.readLine();
        String[] strArr = input.split(" ");

        String result = "";

        for (int i = 0; i < strArr.length; i++) {

            if (i == 0) {
                if ("1".equals(strArr[i])) {
                    result = "ascending";
                } else if ("8".equals(strArr[i])) {
                    result = "descending";
                } else {
                    result = "mixed";
                    break;
                }
            } else {
                if ("ascending".equals(result) && (Integer.parseInt(strArr[i - 1]) < Integer.parseInt(strArr[i]))) {
                    result = "ascending";
                } else if ("descending".equals(result) && (Integer.parseInt(strArr[i - 1]) > Integer.parseInt(strArr[i]))) {
                    result = "descending";
                } else {
                    result = "mixed";
                    break;
                }
            }
        }
        //출력
        bw.write(String.valueOf(result));
        bw.flush();
    }

    public static void solution_2 () throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        
        //sample : "8 1 7 2 6 3 5 4"
        String input = br.readLine();
        String[] strArr = input.split(" ");

        boolean ascending = true;
        boolean descending = true;

        for (int i = 1; i < strArr.length; i++) {
            if (Integer.parseInt(strArr[i-1]) > Integer.parseInt(strArr[i])) {
                ascending = false;
            } else if (Integer.parseInt(strArr[i-1]) < Integer.parseInt(strArr[i])) {
                descending = false;
            }
        }

        //출력
        if (ascending) {
            bw.write(String.valueOf("ascending"));
        } else if (descending) {
            bw.write(String.valueOf("descending"));
        } else {
            bw.write(String.valueOf("mixed"));
        }
        bw.flush();
    }
}