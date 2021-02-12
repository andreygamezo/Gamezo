import java.util.Scanner;
 
 
public class num2 {
    private static final String Вячеслав = null;

	public static void main(String[] args) {
    String name = "Вячеслав";
    Scanner scan = new Scanner(System.in);
    
    System.out.println("Введите Имя: ");
    if(scan.hasNext(name)){
        
            System.out.println("Привет! "+name);
        }
    }
