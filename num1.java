import java.util.Scanner;
 
public class num1 {
   
    public static void main(String[] args) {
           
        Scanner in = new Scanner(System.in);
        System.out.print("Ведите число: ");
        int num = in.nextInt();
          
        System.out.printf("Привет ", num);
        in.close();
    }
}
