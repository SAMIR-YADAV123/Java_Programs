import java.util.Scanner;

public class pascalTriangle {

    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the value of N :");
        int n=sc.nextInt();
        int arr[][]=new int[n][100000];
        int p;
      for(int i=0;i<n;i++){
         
           for(int j=0;j<n-1-i;j++){
               System.out.print(" ");
              }
             p=1;
          for(int k=0;k<=i;k++){
             System.out.print(p+" ");
              arr[i][k]=p;
              p=p*(i-k)/(k+1);
            } 
            System.out.println();
         }
      System.out.println("Printing the Pascal triangle using array");   
         for(int i=0;i<n;i++){
            for(int j=0;j<n-1-i;j++){
                System.out.print(" ");
            }
            p=1;
           for(int k=0;k<=i;k++){
              System.out.print(arr[i][k]+" ");
               
             } 
             System.out.println();
          }
    
    sc.close();
    }   
}
