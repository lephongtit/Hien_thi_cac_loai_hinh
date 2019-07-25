import java.lang.invoke.SwitchPoint;
import java.util.Scanner;
public class Hien_thi_cac_loai_hinh {
    public static void main(String[] args) {
        Scanner sr =new Scanner(System.in);
        System.out.println("Menu");
        System.out.println("1. Print the rectangle");
        System.out.println("2. Print the square triangle");
        System.out.println("3. Print isosceles triangle");
        System.out.println("0. Exit");
        System.out.println("Enter your choice: ");

        while (true) {
            int choise;
            choise = sr.nextInt();

            switch (choise) {
                case 1:
                    System.out.println("Print the rectangle");
                    for (int i = 0; i < 3; i++) {
                        for (int j = 0; j < 7; j++) {
                            System.out.print("*" + " ");
                        }
                        System.out.println();
                    }
                    break;
                case 2:
                    System.out.println("Print the square triangle ( botton-left): ");
                    for (int i = 0; i < 5; i++) {
                        for (int j = 0; j <= i; j++) {
                            System.out.print("* ");
                        }
                        System.out.println("");
                    }
                    System.out.println();
                    System.out.println("Print the square triangle ( top-left): ");
                    for (int i = 5; i >= 0; i--) {
                        for (int j = 0; j < i; j++) {
                            System.out.print("* ");
                        }
                        System.out.println();
                    }

                    System.out.println();
                    System.out.println("Print the square triangle ( top-right): ");
                    for (int i = 5; i >= 1; i--) {
                        for (int j = 1; j <= 5 - i; j++) {
                            System.out.print("0 ");
                        }
                        for (int k = 0; k < i; k++) {
                            System.out.print("* ");
                        }
                        System.out.println();
                    }
                    System.out.println();

                    System.out.println("Print the square triangle ( button-right): ");
                    for (int i = 5; i >= 1; i--) {
                        for (int j = 1; j < i; j++) {
                            System.out.print("0 ");
                        }
                        for (int k = i; k <= 5; k++) {
                            System.out.print("* ");
                        }
                        System.out.println();
                    }
                    break;
                case 3:
                    System.out.println("Print isosceles triangle: ");
                    for (int i = 0; i < 5; i++) {
                        for (int j = 0; j < 5 - i; j++) {
                            System.out.print(" ");
                        }
                        for (int j = 2 - i; j <= 2 + i; j++) {
                            System.out.print("*");
                        }
                        System.out.println();
                    }

                    System.out.println();
                    for (int i = 1; i <= 5; i++) {
                        for (int j = 5 - i + 1; j >= 1; j--) {
                            System.out.print(" ");
                        }
                        for (int k = 1; k <= i; k++) {
                            System.out.print("*");
                        }
                        for (int f = i - 1; f >= 1; f--) {
                            System.out.print("*");
                        }
                        System.out.println();
                    }
                    break;
            }
            }
        }

    }

