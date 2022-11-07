package com.woopi.algorithm.sort;

import java.util.logging.Logger;

/**
 * SelectionSort
 * 선택 정렬
 * for문들 돌면서 최소값을 찾아서 0번 인덱스와 교체
 */
public class SelectionSort {

    private static final Logger log = Logger.getLogger(SelectionSort.class.getSimpleName());

    public static void main(String[] args) {
        int[] sample = new int[5];
        for (int i = 0; i < sample.length; i++) {
            sample[i] = (int)(Math.random()*100 + 1);
            log.info("before sort : " + sample[i]);
        }

        for (int i = 0; i < sample.length-1; i++) {
            int lowestIndex = i;
            
            for (int j = i+1; j < sample.length; j++) {
                if (sample[j] < sample[lowestIndex]) {
                    lowestIndex = j;
                }
            }
            sample = swap(sample, i, lowestIndex);
        }

        log.info("================================================");
        for (int value : sample) {
            log.info("after sort : " + value);
        }
    }

    public static int[] swap(int[] arrInt, int baseIndex, int lowestIndex) {
        int tmp = 0;
        // log.info("===============================================================================");
        // log.info("Swap Function Start !!!");
        // log.info("Swap_Index : [" + index + "]");
        // log.info("Swap_Value_1 : [" + arrInt[index] + "]," + " Swap_Value_2 : [" + arrInt[index+1] + "]");
        // log.info("===============================================================================");
        //1
        tmp = arrInt[baseIndex];
        //2
        arrInt[baseIndex] = arrInt[lowestIndex];
        //3
        arrInt[lowestIndex] = tmp;

        return arrInt;
    }
    
}
