import java.util.Scanner;
public class minmax {
    public static void main(String[]args){
        Scanner scn= new Scanner(System.in);
        System.out.println("Enter number of element");
        int n=scn.nextInt();
        System.out.println("Enter the array element");
        int arr[]=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=scn.nextInt();

        }
        int max=arr[0];
        int min=arr[1];
        for(int i=0;i<n;i++){
            if(arr[i]>max){
                max=arr[i];
            }
            if(arr[i]<min){
                min=arr[i];
            }
        }
System.out.println("minimum element is "+min);
System.out.println("maximum element is "+max);


        
    }
    
}
