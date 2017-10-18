import java.util.Scanner;

public class p12_Volleyball {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);

        String year = console.nextLine();                           //  kakva e godinata
        int holidays = Integer.parseInt(console.nextLine());               //  praznici
        int weekendsAtHome = Integer.parseInt(console.nextLine());         //  yikendi v kashti

        double weekendsSofia = 48 - weekendsAtHome;                 //  yikendi v sofia
        double gamesSofia = weekendsSofia * 3.0 / 4;                  // igri v Sofia
        double gamesHolidays = holidays * 2.0 / 3;                    // igri po praznici
        double allGames = gamesHolidays + gamesSofia + weekendsAtHome;
        double leap = allGames * 0.15 + allGames;
        double l = Math.floor(leap);
        double n = Math.floor(allGames);

        if (year.equals("leap"))
        {
            System.out.println(l);
        }
        else if (year.equals("normal"))
        {
            System.out.println(n);
        }
    }
}
