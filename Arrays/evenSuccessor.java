package Arrays;

import java.util.Scanner;

/*
Write a program to input 10 values in an array and print only those numbers that are
succeeded by an even value
*/

public class evenSuccessor {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int arr[]=new int [10];
        for (int i=0;i<10;i++)
        arr[i]=sc.nextInt();

        for (int i=0;i<9;i++){ // i<9  to avoid index out of bounds on i+1 --> i=10
            if (arr[i+1]%2==0)
            System.out.print(arr[i]+" ");
        }
        sc.close();
    }
}