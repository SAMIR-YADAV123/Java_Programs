import java.util.Scanner;

public class matrixcon {
   static void mulmat(int A[][],int B[][],int n){
         int C[][]=new int [n][n];
         
               for(int i=0;i<n;i++){
                 for(int j=0;j<n;j++){
                     C[i][j]=0;
                     for(int k=0;k<n;k++){
                     C[i][j]+=A[i][k]*B[k][j];
                  
                  }
              
                 }
               } 
               System.out.println("multiplications(C):");
               for(int i=0;i<n;i++){
                  for(int j=0;j<n;j++){  
                     System.out.print(C[i][j]+" ");
                  }
                  System.out.println();
               } 
         }
    
    static void transpose(int X[][],int n,int m){
        int Y[][]=new int [n][m];   
        for(int i=0;i<n;i++){
             for(int j=0;j<m;j++){
                 Y[i][j]=X[j][i];
              }
            }
        System.out.println("Transpose of matrix A:");
           for(int i=0;i<n;i++){
             for(int j=0;j<m;j++){
              System.out.print(Y[i][j]+" ");
              }
           System.out.println();
            }   
        }     
    public static void main(String args[]){
        Scanner scan=new Scanner(System.in);
        int n,m;
        System.out.print("Enter the no. of row of matrices:");
        n=scan.nextInt();
         
        System.out.print("\nEnter the no. of column of matrices:");
        m=scan.nextInt();
        
        int A[][]=new int[n][m];
        int B[][]=new int[n][m];
        

        System.out.println("Enter the element of matrix A:");
        for(int i=0;i<n;i++)
         for(int j=0;j<m;j++)
          A[i][j]=scan.nextInt();

          System.out.println("Enter the element of matrix B:");
          for(int i=0;i<n;i++)
           for(int j=0;j<m;j++)
            B[i][j]=scan.nextInt();

         System.out.println("Element of matrix A:");
            for(int i=0;i<n;i++){
             for(int j=0;j<m;j++){
              System.out.print(A[i][j]+" ");
              }
           System.out.println();
            }
              System.out.println("Element of matrix B :");
              for(int i=0;i<n;i++){
                for(int j=0;j<m;j++){
                 System.out.print(B[i][j]+" ");
                 }
              System.out.println();
               }

         mulmat(A,B,n);
         //transpose(A, n, m);
         scan.close();
         
    }
    
}
