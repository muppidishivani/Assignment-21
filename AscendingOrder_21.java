package com.web.java;

import java.util.Scanner;

public class AscendingOrder_21 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
        int[] nums = new int[5];

        System.out.println("Enter 5 numbers:");

       
        for (int i = 0; i < 5; i++) {
            nums[i] = scanner.nextInt();
        }

        
        for (int i = 0; i < 5; i++) {
            for (int j = i + 1; j < 5; j++) {
                if (nums[i] > nums[j]) {
                    int temp = nums[i];
                    nums[i] = nums[j];
                    nums[j] = temp;
                }
            }
        }

        for(Integer n:nums)
        {
        	System.out.println(n);
        }
       
    }



	}

