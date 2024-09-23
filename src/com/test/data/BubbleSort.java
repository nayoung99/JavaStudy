package com.test.data;

import java.util.Arrays;

public class BubbleSort {

    public static void main(String[] args) {
        System.out.println("<정렬전>");
        int[] nums = {1,7,2,4,3,5,0,9,8,6};

        System.out.println(Arrays.toString(nums));

        for(int i = nums.length-1; i>0; i--){ // i = 9
            for(int j = 0; j < i; j++){ // j = 0
                if(nums[j] > nums[j+1]){ // 0과 1, 1이랑 7이랑 비교
                    int temp = nums[j]; // 임시변수 temp
                    nums[j] = nums[j+1];
                    nums[j+1] = temp; // swap
                } 
            }
        }
        
        System.out.println("<정렬후>");
        System.out.println(Arrays.toString(nums));
    }

}
