import java.util.*;
public class factroil {
    public static void printFac(int n){

        if (n>0){
            System.out.println("invalid");
            return;
        }
        //loop
        int fac =1;
        for (int i = n; i>=1; i--) {
             fac =fac*i;
            
        }
        System.out.println(fac);
        

        return;

    }
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter a number");
        int n = sc.nextInt();
        printFac(n);
    }
    
}
