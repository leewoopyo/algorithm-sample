package com.woopi.algorithm.sort;

import java.util.logging.Logger;

/**
 * BubbleSortMain
 * 버블정렬
 */
public class BubbleSortMain {

    private static final Logger log = Logger.getLogger(BubbleSortMain.class.getName());

    public static void main(String[] args) {
        
        

        int[] sample = new int[100];
        for (int i = 0; i < 100; i++) {
            sample[i] = (int)(Math.random()*100 + 1);
            log.info("before sort : " + sample[i]);
        }

        boolean sorted = false;

        for (int i = 0; i < sample.length-1; i++) {
            sorted = true;
            for (int j = 0; j < (sample.length-i)-1; j++) {
                if (sample[j] > sample[j+1]) {
                    sample = swap(sample, j);
                    sorted = false;
                }
            }
            if (sorted) {
                break;
            }
        }

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