import java.util.Scanner;
// import java.io.*;
// import java.util.*; 

public class reverse_array{
    static void reverse(int arr[],int start,int end){

        int temp;
        while(start<end){
            temp=arr[start];
            arr[start]=arr[end];
            arr[end]=temp;
            start++;
            end--;
        }
    }

    static void display(int arr[], int n){
        for(int i=0;i<n;i++)
            System.out.print(arr[i]+"");
            System.out.println();
        }
    
    public static void main(String[]args){
        Scanner scn=new Scanner(System.in);
        System.out.println("Enter the nos of elment you want");
        int n=scn.nextInt();
        System.out.println("enter the array element");

        int arr[]=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=scn.nextInt();
        }
        System.out.println("Reversed Array");
        reverse(arr,0,n-1);
        display(arr,n);
        

    }

    
}



   

    