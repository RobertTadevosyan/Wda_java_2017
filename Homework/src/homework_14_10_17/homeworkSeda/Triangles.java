package homework_14_10_17.homeworkSeda;

public class Triangles {
    public static void main(String[] args) {
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
        System.out.println();
        /////////////////

        for (int i = 10; i >= 0; i--) {
            for (int j = i; j > 0; j--) {
                System.out.print("* ");
            }
            System.out.println();
        }
        System.out.println();
//////////////////
        for (int i = 1; i <= 10; i++) {
            for (int j = 1; j < i; j++) {
                System.out.print("  ");
            }
            for (int j = 0; j <= 10 - i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
        System.out.println();
/////////////
        for (int i = 10; i > 0; i--) {
            for (int j = i; j > 0; j--) {
                System.out.print("  ");
            }
            for (int j = 0; j <= 10 - i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
