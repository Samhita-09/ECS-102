import java.util.Scanner;

public class Tshirt {
    public static void main(String[] args){
    //     Scanner input = new Scanner(System.in);
    //     int cost = 22;
    //     System.out.println("How many t-shirts you want");
    //     int count = input.nextInt();
    //     System.out.println(count + " t-shirts costs $" + (cost*count) + ".");
    //     System.out.println("A personalized t-shirt costs $" + (cost+1) + ".");
    //     System.out.println("Without personalization, a t-shirt costs $" + cost + ".");
    //     input.close();

    int a = 5;
    int b = 2;
    double outcome = a / b;
    System.out.println(outcome);        // Line 1: _______________
 
    double precise = (double) a / b;
    System.out.println(precise);        // Line 2: _______________
 
    int mystery = 'A' + 3;
    System.out.println(mystery);        // Line 3: _______________
 
    char letter = (char)('A' + 3);
    System.out.println(letter);         // Line 4: _______________

    int offset = 3;
    char result = (char)('A' + offset);
    System.out.println(result);

    char lettr = 'B';
    int step = 2;
    lettr += step;
    System.out.println(lettr);
    
    char low = 'a';
    int distance = 100 - low;
    System.out.println(distance);

    
    }
}