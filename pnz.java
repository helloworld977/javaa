import java.util.*;
public class pnz {
    public static void pn(){
        Scanner sc =new Scanner(System.in);
        int pos =0 ,neg =0 ,zer =0;
        char choice;
        do {
            System.out.println("enter number");
            int n = sc.nextInt();
            if (n>0) {
                pos ++;
                
            }
            else if(n<0){
                neg++;
            }
            else{
                zer++;
            }
            System.out.println("You want to enter another number (y/n)");
            choice =sc.next().toLowerCase().charAt(0);
        } while (choice == 'y');
        System.out.println("/n Summary");
        System.out.println("Possitive User Entered Is "+ pos);
        System.out.println("Negative User Entered is" +neg);
        System.out.println("Zero User Entred Is " +zer);

    }
    public static void main(String[] args) {
       pn();
    }
    
}
