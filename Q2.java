package Recursion;

public class Q2 {
    
    static void func(int i, int n){
        
    
        if(i>n) return;
        System.out.println("PRATHAM");
        func(i+1,n);

}
public static void main(String[] args) {

   // Here, let’s take the value of n to be 4.
   int n = 4;
   func(1,n);
}
}
