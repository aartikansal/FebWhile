import java.util.Scanner;

public class WhileNumberPlayerRunner {
    public static void main(String[] args) {
        /*WhileNumberPlayer player = new WhileNumberPlayer(90);
        player.printSquaresUptoLimit();
        //for limit= 30, output would be 1 4 6 9 16 25'
        player.printCubesUptoLimit();
        //for limit= 30, output would be 18 27*/
        Scanner scanner = new Scanner(System.in);
        int number = 0;
        do {
            System.out.println("Cube is " + (number * number * number));
            System.out.print(" Enter a number :");
            number = scanner.nextInt();
        }
        while (number >= 0);
        System.out.print("Thank you!");
    }
}
