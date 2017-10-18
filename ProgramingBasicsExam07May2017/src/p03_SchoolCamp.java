import java.util.Scanner;

public class p03_SchoolCamp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String season = scanner.nextLine();
        String group = scanner.nextLine();
        double studentsCount = Double.parseDouble(scanner.nextLine());
        double nightCount = Double.parseDouble(scanner.nextLine());

        if (studentsCount >= 50) {
            if (season.equals("Winter")) {
                if (group.equals("boys")) {
                    double money = 9.60 * studentsCount * nightCount;
                    double discount = money * 0.5;
                    double finalPrice = money - discount;
                    System.out.printf("Judo %.2f lv.", finalPrice);

                } else if (group.equals("girls")) {
                    double money = 9.60 * studentsCount * nightCount;
                    double discount = money * 0.5;
                    double finalPrice = money - discount;
                    System.out.printf("Gymnastics %.2f lv.", finalPrice);

                } else if (group.equals("mixed")) {
                    double money = 10.0 * studentsCount * nightCount;
                    double discount = money * 0.5;
                    double finalPrice = money - discount;
                    System.out.printf("Ski %.2f lv.", finalPrice);
                }
            } else if (season.equals("Spring")) {
                if (group.equals("boys")) {
                    double money = 7.20 * studentsCount * nightCount;
                    double discount = money * 0.5;
                    double finalPrice = money - discount;
                    System.out.printf("Tennis %.2f lv.", finalPrice);

                } else if (group.equals("girls")) {
                    double money = 7.20 * studentsCount * nightCount;
                    double discount = money * 0.5;
                    double finalPrice = money - discount;
                    System.out.printf("Athletics %.2f lv.", finalPrice);

                } else if (group.equals("mixed")) {
                    double money = 9.50 * studentsCount * nightCount;
                    double discount = money * 0.5;
                    double finalPrice = money - discount;
                    System.out.printf("Cycling %.2f lv.", finalPrice);
                }
            } else if (season.equals("Summer")) {
                if (group.equals("boys")) {
                    double money = 15.0 * studentsCount * nightCount;
                    double discount = money * 0.5;
                    double finalPrice = money - discount;
                    System.out.printf("Football %.2f lv.", finalPrice);

                } else if (group.equals("girls")) {
                    double money = 15.0 * studentsCount * nightCount;
                    double discount = money * 0.5;
                    double finalPrice = money - discount;
                    System.out.printf("Volleyball %.2f lv.", finalPrice);

                } else if (group.equals("mixed")) {
                    double money = 20.0 * studentsCount * nightCount;
                    double discount = money * 0.5;
                    double finalPrice = money - discount;
                    System.out.printf("Swimming %.2f lv.", finalPrice);
                }
            }
        } else if (studentsCount >= 20 && studentsCount < 50) {
            if (season.equals("Winter")) {
                if (group.equals("boys")) {
                    double money = 9.60 * studentsCount * nightCount;
                    double discount = money * 0.15;
                    double finalPrice = money - discount;
                    System.out.printf("Judo %.2f lv.", finalPrice);

                } else if (group.equals("girls")) {
                    double money = 9.60 * studentsCount * nightCount;
                    double discount = money * 0.15;
                    double finalPrice = money - discount;
                    System.out.printf("Gymnastics %.2f lv.", finalPrice);

                } else if (group.equals("mixed")) {
                    double money = 10.0 * studentsCount * nightCount;
                    double discount = money * 0.15;
                    double finalPrice = money - discount;
                    System.out.printf("Ski %.2f lv.", finalPrice);
                }
            } else if (season.equals("Spring")) {
                if (group.equals("boys")) {
                    double money = 7.20 * studentsCount * nightCount;
                    double discount = money * 0.15;
                    double finalPrice = money - discount;
                    System.out.printf("Tennis %.2f lv.", finalPrice);

                } else if (group.equals("girls")) {
                    double money = 7.20 * studentsCount * nightCount;
                    double discount = money * 0.15;
                    double finalPrice = money - discount;
                    System.out.printf("Athletics %.2f lv.", finalPrice);

                } else if (group.equals("mixed")) {
                    double money = 9.50 * studentsCount * nightCount;
                    double discount = money * 0.15;
                    double finalPrice = money - discount;
                    System.out.printf("Cycling %.2f lv.", finalPrice);
                }
            } else if (season.equals("Summer")) {
                if (group.equals("boys")) {
                    double money = 15.0 * studentsCount * nightCount;
                    double discount = money * 0.15;
                    double finalPrice = money - discount;
                    System.out.printf("Football %.2f lv.", finalPrice);

                } else if (group.equals("girls")) {
                    double money = 15.0 * studentsCount * nightCount;
                    double discount = money * 0.15;
                    double finalPrice = money - discount;
                    System.out.printf("Volleyball %.2f lv.", finalPrice);

                } else if (group.equals("mixed")) {
                    double money = 20.0 * studentsCount * nightCount;
                    double discount = money * 0.15;
                    double finalPrice = money - discount;
                    System.out.printf("Swimming %.2f lv.", finalPrice);
                }
            }
        } else if (studentsCount >= 10 && studentsCount < 20) {
            if (season.equals("Winter")) {
                if (group.equals("boys")) {
                    double money = 9.60 * studentsCount * nightCount;
                    double discount = money * 0.05;
                    double finalPrice = money - discount;
                    System.out.printf("Judo %.2f lv.", finalPrice);

                } else if (group.equals("girls")) {
                    double money = 9.60 * studentsCount * nightCount;
                    double discount = money * 0.05;
                    double finalPrice = money - discount;
                    System.out.printf("Gymnastics %.2f lv.", finalPrice);

                } else if (group.equals("mixed")) {
                    double money = 10.0 * studentsCount * nightCount;
                    double discount = money * 0.05;
                    double finalPrice = money - discount;
                    System.out.printf("Ski %.2f lv.", finalPrice);
                }
            } else if (season.equals("Spring")) {
                if (group.equals("boys")) {
                    double money = 7.20 * studentsCount * nightCount;
                    double discount = money * 0.05;
                    double finalPrice = money - discount;
                    System.out.printf("Tennis %.2f lv.", finalPrice);

                } else if (group.equals("girls")) {
                    double money = 7.20 * studentsCount * nightCount;
                    double discount = money * 0.05;
                    double finalPrice = money - discount;
                    System.out.printf("Athletics %.2f lv.", finalPrice);

                } else if (group.equals("mixed")) {
                    double money = 9.50 * studentsCount * nightCount;
                    double discount = money * 0.05;
                    double finalPrice = money - discount;
                    System.out.printf("Cycling %.2f lv.", finalPrice);
                }
            } else if (season.equals("Summer")) {
                if (group.equals("boys")) {
                    double money = 15.0 * studentsCount * nightCount;
                    double discount = money * 0.05;
                    double finalPrice = money - discount;
                    System.out.printf("Football %.2f lv.", finalPrice);

                } else if (group.equals("girls")) {
                    double money = 15.0 * studentsCount * nightCount;
                    double discount = money * 0.05;
                    double finalPrice = money - discount;
                    System.out.printf("Volleyball %.2f lv.", finalPrice);

                } else if (group.equals("mixed")) {
                    double money = 20.0 * studentsCount * nightCount;
                    double discount = money * 0.05;
                    double finalPrice = money - discount;
                    System.out.printf("Swimming %.2f lv.", finalPrice);
                }
            }
        } else {
            if (season.equals("Winter")) {
                if (group.equals("boys")) {
                    double money = 9.60 * studentsCount * nightCount;
                    System.out.printf("Judo %.2f lv.", money);

                } else if (group.equals("girls")) {
                    double money = 9.60 * studentsCount * nightCount;
                    System.out.printf("Gymnastics %.2f lv.", money);

                } else if (group.equals("mixed")) {
                    double money = 10.0 * studentsCount * nightCount;
                    System.out.printf("Ski %.2f lv.", money);
                }
            } else if (season.equals("Spring")) {
                if (group.equals("boys")) {
                    double money = 7.20 * studentsCount * nightCount;
                    System.out.printf("Tennis %.2f lv.", money);

                } else if (group.equals("girls")) {
                    double money = 7.20 * studentsCount * nightCount;
                    System.out.printf("Athletics %.2f lv.", money);

                } else if (group.equals("mixed")) {
                    double money = 9.50 * studentsCount * nightCount;
                    System.out.printf("Cycling %.2f lv.", money);
                }
            } else if (season.equals("Summer")) {
                if (group.equals("boys")) {
                    double money = 15.0 * studentsCount * nightCount;
                    System.out.printf("Football %.2f lv.", money);

                } else if (group.equals("girls")) {
                    double money = 15.0 * studentsCount * nightCount;
                    System.out.printf("Volleyball %.2f lv.", money);

                } else if (group.equals("mixed")) {
                    double money = 20.0 * studentsCount * nightCount;
                    System.out.printf("Swimming %.2f lv.", money);
                }
            }
        }
    }
}
