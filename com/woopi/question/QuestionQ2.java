package com.woopi.question;

import java.io.*;
import java.util.StringTokenizer;

/**
 * QuestionQ2
 * 백준 문제 : 블랙잭
 * https://www.acmicpc.net/problem/2798
 * 백준에 제출 시엔 class 명을 'Main'으로 수정 후 제출한다.
 */
public class QuestionQ2 {

    public static void main(String[] args) throws Exception {
        new QuestionQ2().solution_1();
    }

    public static void solution_1 () throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        int count = Integer.parseInt(st.nextToken());
        int num= Integer.parseInt(st.nextToken());

        st = new StringTokenizer(br.readLine(), " ");
        int[] inputArr_2 = new int[st.countTokens()];

        for (int i = 0; i < inputArr_2.length; i++) {
            inputArr_2[i] = Integer.parseInt(st.nextToken());
        }
        
        int result = 0;

        loop:
        for (int i = 0; i < count-2; i++) {
            for (int j = i + 1; j < count-1; j++) {
                for (int k = j + 1; k < count; k++) {
                    int tmp = inputArr_2[i] + inputArr_2[j] + inputArr_2[k];
                    
                    if (tmp <= num) {
                        if (tmp == num) {
                            result = tmp;
                            break loop;
                        } else if (result <= tmp) {
                            result = tmp;
                        }
                    }
                }
            }
        }

        bw.write(String.valueOf(result));
        bw.flush();
    }
}
