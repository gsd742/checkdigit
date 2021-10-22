package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Integer [] barcode = new Integer[13];
        for (int i =0; i<13 ; i++){
            System.out.println("whats the "+(i+1)+ " digit?");
            barcode[i] = input.nextInt();
        }
        int check1 = barcode[1]+barcode[3]+barcode[5]+barcode[7]+barcode[9]+barcode[11];
        int check2 = barcode[0]+barcode[2]+barcode[4]+barcode[6]+barcode[8]+barcode[10];
        check1 = check1*3;
        int check3 = check1+check2;
        int checkDigit = 80 - check3;
        if (barcode[12]==checkDigit){
            System.out.println("the check digit is correct");
        }
        else{
            System.out.println("the check digit is incorrect, it should be "+checkDigit);
        }
    }
}
