import java.util.*;

public class average {
    public static void avg(int a , int b, int c){
        float average =(a+b+c)/3.0f;
        System.out.println(average);


    }
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter First Number");
        int a = sc.nextInt();
        System.out.println("Enter Second  Number ");
        int b =sc.nextInt();
        System.out.println("Enter Third Number");
        int c  =sc.nextInt();
        avg(a, b, c);

    
        
    }
    
}
