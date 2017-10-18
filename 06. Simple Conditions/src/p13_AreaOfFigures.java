import java.util.Scanner;

public class p13_AreaOfFigures {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);

        String figure = console.nextLine();

        if (figure.equals("square")){
            double sideA = Double.parseDouble(console.nextLine());
            double area = sideA * sideA;

            System.out.printf("%.3f",area);
        }else if (figure.equals("rectangle")){
            double sideA = Double.parseDouble(console.nextLine());
            double sideB = Double.parseDouble(console.nextLine());
            double area = sideA * sideB;

            System.out.printf("%.3f",area);
        }else if (figure.equals("circle")){
            double r = Double.parseDouble(console.nextLine());
            double area = Math.PI * r * r;

            System.out.printf("%.3f",area);
        }else if (figure.equals("triangle")){
            double sideA = Double.parseDouble(console.nextLine());
            double h = Double.parseDouble(console.nextLine());
            double area = sideA * h / 2;

            System.out.printf("%.3f",area);
        }
    }
}
