package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
        double[] numbers = {1.2, 2.23, 9.65, -3.5, -4.7, 8.7, 9.2, 7.8, -3.1, 1.4, 5.6, -3.4, 7.6, 9.8, 3.7};//15 element
       double result =0;
        //int masIV = 0;
        for (double masiv:numbers) {
            result+=masiv;

        }
        System.out.println("Среднее арифметическое "+ result/ numbers.length);
        //
        for (int i =0; i< numbers.length -1; i++) {
            for (int j = numbers.length-1; j>1; j--){
                if (numbers[j]<numbers[j-1]){
                    double tmp = numbers[j];
                    numbers[j]=numbers[j-1];
                    numbers[j-1]=tmp;
                }
            }
        }
        for(double number: numbers){
            System.out.println(number);
        }
    }

    }

