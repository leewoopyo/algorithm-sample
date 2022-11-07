package com.woopi.algorithm.sort;

import java.util.logging.Logger;

/**
 * InsertionSort
 * 삽입정렬
 */
public class InsertionSort {

    private static final Logger log = Logger.getLogger(InsertionSort.class.getSimpleName());

    public static void main(String[] args) {
        int[] sample = new int[5];
        for (int i = 0; i < sample.length; i++) {
            sample[i] = (int)(Math.random()*100 + 1);
            log.info("before sort : " + sample[i]);
        }

        for (int i = 1; i < sample.length; i++) {
            for (int j = i; j > 0; j--) {
                if (sample[j-1] > sample[j]) {
                    sample = swap(sample, j-1);
                } else {
                    break;
                }
            }
        }
        log.info("================================================");
        for (int value : sample) {
            log.info("after sort : " + value);
        }

    }

    public static int[] swap(int[] arrInt, int index) {
        int tmp = 0;
        // log.info("===============================================================================");
        // log.info("Swap Function Start !!!");
        // log.info("Swap_Index : [" + index + "]");
        // log.info("Swap_Value_1 : [" + arrInt[index] + "]," + " Swap_Value_2 : [" + arrInt[index+1] + "]");
        // log.info("===============================================================================");
        //1
        tmp = arrInt[index];
        //2
        arrInt[index] = arrInt[index+1];
        //3
        arrInt[index+1] = tmp;

        return arrInt;
    }
}