import java.util.Scanner;



public class ImageFromLoop {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("give me the money:");
        int size = sc.nextInt();
//      int size = 15;

//      ***
//       **
//        *
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size - i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
        // *
        // **
        // ***
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < i + 1; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
        //***
        // **
        //  *
        for (int i = size; i >= 0; i--) {
            for (int j = 0; j < size - i; j++) {
                System.out.print(" ");
            }
            for (int k = 0; k < i; k++) {
                System.out.print("*");
            }

            System.out.println();
        }
//          *
//         ***
//        *****
//          |

        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size - i; j++) {
                System.out.print(" ");
            }
            for (int k = 0; k < (i * 2) + 1; k++) {
                System.out.print("*");

            }
            System.out.println();
        }
        if (size <= 3) {

            for (int m = 0; m < size; m++) {
                System.out.print(" ");
            }
            for (int n = 0; n < 1; n++) {
                System.out.print("|");
            }
        } else {
            for (int m = 0; m < size-1; m++) {
                System.out.print(" ");
            }
            for (int o = 0; o < 3; o++) {
                System.out.print("|");
            }
        }
    }
}


