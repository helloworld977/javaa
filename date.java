import java.util.*;
public class date {
    public static void datea(int a ){
        if (a>2082) {
            System.out.println("Error");
            
        }
        int m = 2082 - a;
        if (m>=25) {
            System.out.println("You are alloed to vote , drink and marry");
        }else if (m>=21 && m<25){
            System.out.println("You are  alloed to Drink");
        }
        else if(m>=18){
            System.out.println("You are allow to Vote");

        }
        else{
            System.out.println("Error");
        }
        
            

        
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a Year You have born");
        int a= sc.nextInt();
        datea(a);
   
    }
    
}
