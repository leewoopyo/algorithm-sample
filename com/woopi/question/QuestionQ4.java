package com.woopi.question;

import java.io.*;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.StringTokenizer;

/**
 * QuestionQ4
 * 백준 문제 : 프린터 큐
 * https://www.acmicpc.net/problem/1966
 * 백준에 제출 시엔 class 명을 'Main'으로 수정 후 제출한다.
 */
public class QuestionQ4 {

    public static void main(String[] args) throws Exception {
        new QuestionQ4().solution_1();
    }

    public static void solution_1 () throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        StringTokenizer st = null;
        int testCase = Integer.parseInt(br.readLine());
        
         for (int i = 0; i < testCase; i++) {
            int[] info = new int[2];
            st = new StringTokenizer(br.readLine(), " ");
            for (int j = 0; j < info.length ; j++) {
                info[j] = Integer.parseInt(st.nextToken());
            }

            List<int[]> queue = new ArrayList<>();
            st = new StringTokenizer(br.readLine(), " ");
            for (int j = 0; j < info[0]; j++) {
                queue.add(new int[] {j,Integer.parseInt(st.nextToken())});
            }

            int count = 0;
            while (true) {
                if (queue.get(0)[1] == queue.stream().map(x -> x[1]).max(Comparator.comparing(x -> x)).get()) {
                    count++;
                    if (queue.get(0)[0] == info[1]) {
                        System.out.println(count);
                        break;
                    } else {
                        queue.remove(0);
                    }
                } else {
                    queue.add(queue.get(0));
                    queue.remove(0);
                }
            }
        }
    }
}
