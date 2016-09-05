package Lesson3;

import java.util.Scanner;
public class DrawRect {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter length of rectangle: ");
        int x = sc.nextInt();
        System.out.println("Enter height of rectangle:");;
        int y = sc.nextInt();

        for(int i = 0; i <= y; i++) {
            for(int j = 1; j <= x; j++) {
                if((i>0) && (i<y)) {
                    if(j==1) {
                        System.out.print("* ");
                    } else {
                        System.out.print("  ");
                    }
                } else {
                    System.out.print("* ");
                }
            }
            System.out.print("*");
            System.out.println();
        }
    }
}
