import java.util.*;
public class DeterMinant {
  static  int detMant(int mat[][],int n){
          int i,j,k,det,q,r;
          det=0;
          int sqmat[][]=new int[n][n];  
        if(n==2)
           return  ((mat[0][0]*mat[1][1])-(mat[0][1]*mat[1][0]));     
        else{
         for(i=0;i<n;i++){
              q=0;
              for(j=1;j<n;j++){
                  r=0;
                 for(k=0;k<n;k++){
                     if(k==i)
                      continue;
                     
                      sqmat[q][r]=mat[j][k];
                     r++; 
                 }
                 q++; 
              }
            det+=(Math.pow(-1,i)*mat[0][i])*detMant(sqmat,n-1);  
          }
        }
      return  det;
   }
 
   public static void main(String args[]){
    int n,i,j,detn;
    detn=0;
    Scanner scan=new Scanner(System.in);
    System.out.println("Enter the size of matrix:");
     n=scan.nextInt();
    int mat1[][]=new  int[n][n];
    System.out.println("Enter the matrix elements:");
    for(i=0;i<n;i++)
        for(j=0;j<n;j++)
          mat1[i][j]=scan.nextInt();
       
       System.out.println("Matrix elements are:\n"); 
       for(i=0;i<n;i++){
        for(j=0;j<n;j++){
         System.out.print(mat1[i][j]+" ");
           }
         System.out.println();   
       }   
       detn=detMant(mat1,n);
       System.out.println("Determination of Matrix is : "+detn); 
    }
}
