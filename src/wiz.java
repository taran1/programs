import java.util.Scanner;
 
 
public class wiz {
 
    public static void main(String[] args) {
       
         Scanner scanner = new Scanner(System.in);
       
        System.out.println("Podaj pierwsz� liczb�");
        String firstNumber = scanner.nextLine();
       
       
        System.out.println("Podaj drug� liczb�");
        String secondNumber = scanner.nextLine();
        
        System.out.println("Podaj trzeci� liczb�");
        String thirdNumber = scanner.nextLine();
        
       
        int result = Integer.parseInt(firstNumber) + Integer.parseInt(secondNumber) + Integer.parseInt(thirdNumber);
       
        System.out.println("Wynik: " + result);
    }
}
