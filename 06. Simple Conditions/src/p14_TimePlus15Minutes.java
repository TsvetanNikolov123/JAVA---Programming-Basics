import java.util.Scanner;

public class p14_TimePlus15Minutes {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);

        int hour = Integer.parseInt(console.nextLine());
        int minutes = Integer.parseInt(console.nextLine());

        if (minutes + 15 >= 60) {
            minutes = (minutes + 15) % 60;
            hour++;
        }else {
            minutes += 15;
        }

        if (hour == 24){
            hour = 0;
        }

        if (minutes < 10){
            System.out.printf("%d:0%d", hour, minutes);
        } else {
            System.out.printf("%d:%d", hour, minutes);
        }

    }
}
