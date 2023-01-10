import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("a: ");
        double a = scanner.nextDouble();
        System.out.print("b: ");
        double b = scanner.nextDouble();
        System.out.print("c: ");
        double c = scanner.nextDouble();

        QuadraticEquation quadraction = new QuadraticEquation(a, b, c);
        double delta;
        delta = quadraction.getDiscriminant();
        if (delta > 0) {
            System.out.println("Chuong trinh co 2 nghiem" + quadraction.getRoot1() + " " + quadraction.getRoot2());
        }else if ( delta == 0) {
            System.out.println("Co 1 nghiem" + quadraction.getRoot1());
        }else {
            System.out.println("Vo nghiem");
        }

    }
}