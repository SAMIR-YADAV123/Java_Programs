abstract class pig{
    public abstract void sound();

    void show(){
        System.out.print("\nANIMAL NAME IS COW.");
     }

 }

 class subclass extends pig
 {  public void sound(){
     System.out.print("\nsound of cow is : baaa");
       }

 }

public class Inheritance{

 
     public void finalize(){
        System.out.print("\nGARBAGE COLLECTOR.");
     } 
    public static void main(String args[]){
     
        System.out.print("SAMIR YADAV.");
        subclass obj=new subclass();
        obj.show();
        obj.sound();
        System.gc();
       
    }
}