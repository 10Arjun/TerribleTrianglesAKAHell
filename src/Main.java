import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int TriangleType;

        Scanner sc = new Scanner(System.in);
        System.out.println("Input the Number associated with the Triangle");
        TriangleType = sc.nextInt();
        System.out.println("Input the Number of rows");
        int Value = sc.nextInt();
        if (Value % 2 == 0) {
            while (Value % 2 == 0) {
                System.out.println("This is not an accepted value, please enter an odd number");
                Value = sc.nextInt();
            }
        }

        //Normal Triangle
        if (TriangleType == 1) {
            for (int i = 0; i < Value; i++) {
                for (int j = 0; j <= i; j++) {
                    System.out.print("W");
                }
                System.out.println();
            }
        }

        //Normal Triangle Rotates 180 Degrees
        if (TriangleType == 2) {
            for (int i = 0; i < Value; i++) {
                for (int j = Value; j >= i + 1; j--) {
                    System.out.print("W");
                }
                System.out.println();
            }

        }

        //Normal Triangle Flipped across Y Axis
        if (TriangleType == 3) {
            for (int i = 0; i < Value; i++) {
                for (int j = Value; j >= i + 1; j--) {
                    System.out.print(" ");
                }
                for (int j = 0; j <= i; j++) {
                    System.out.print("W");
                }
                System.out.println();
            }

        }

        //Normal Triangle Rotates 180 Degrees, then Flipped across X axis
        if (TriangleType == 4) {
            for (int i = 0; i < Value; i++) {
                for (int j = 0; j <= i; j++) {
                    System.out.print(" ");
                }
                for (int j = Value; j >= i + 1; j--) {
                    System.out.print("W");
                }
                System.out.println();
            }
        }

        //Isosceles Triangle Facing Downward
        if (TriangleType == 5) {
            for (int i = Value; i >= 1; i -= 2) {
                for (int j = Value; j >= i; j -= 2) {
                    System.out.print(" ");
                }
                for (int j = 1; j <= i; j++) {
                    System.out.print("W");
                }
                System.out.println();
            }
        }

        //Weird Diamond Rhombus Looking thing
        if (TriangleType == 6) {

            for (int i = 1; i <= Value; i += 2) {
                for (int j = Value; j >= i; j -= 2) {
                    System.out.print(" ");
                }
                for (int j = 1; j <= i; j++) {
                    System.out.print("W");
                }
                System.out.println();
            }
            for (int i = Value - 2; i >= 1; i -= 2) {
                    for (int j = Value; j >= i; j -= 2) {
                    System.out.print(" ");
                }
                    for (int j = 1; j <= i; j++) {
                    System.out.print("W");
                }
                System.out.println();
            }
        }
    }
}


