import java.util.Scanner;

public class InvertedTriangle {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Give a number for inverted triangle=");
        int n = input.nextInt();

        for (int i= n ; i > 0 ; i--){
            for (int j = 0 ; j < (n-i) ; j++){
                System.out.print(" ");
            }
            for (int s = 1 ; s <= (2 * i) - 1 ; s++){
                System.out.print("*");
            }
            System.out.println( );
        }

    }
}
