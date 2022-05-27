import java.util.*;
public class ReverseStrinng {
    

    public static void main(String args[]){    
        Scanner  scan=new Scanner(System.in);
        String str;
        String recvstr="";
        System.out.println("Enter the string:");
        str=scan.nextLine();
        
        int n=str.length();
       
       for(int i=n-1;i>=0;i--){
         recvstr+=str.charAt(i);
       }              

     if(str.equals(recvstr)){
       System.out.print("first=[");
       for(int i=0;i<n/2;i++){
         System.out.print(str.charAt(i)+" ,");
         }
         System.out.print("]\n");
         System.out.print("second=[");
       for(int i=n/2+1;i<n;i++){
         System.out.print(str.charAt(i)+" ,");
         }
         System.out.print("]\n");
         System.out.print("Output : Palindrome");
        }
     else{
        System.out.println("first=[]");
        System.out.println("second=[]");
        System.out.print("Output : Not Palindrome");     
     }
    scan.close(); 
  }
} 
