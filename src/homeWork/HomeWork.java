package homeWork;

import java.util.Scanner;

public class HomeWork {
    public static void main(String[] args) {

        //Task 1
        boolean isWeekend = true;
        boolean isRain = false;
        boolean canWalk = false;
        if (isWeekend == true) {
            canWalk = true;
        }
        if (isRain == false) {
            canWalk = true;
        }
        //Task 2
        boolean isEdekaOpen = true;
        boolean isReweOpen = true;
        boolean canBuy = false;
        if (isEdekaOpen == true) {
            canBuy = true;
            System.out.println("Я могу купить еду, это Edeka ");
        }
        if (isReweOpen == true) {
            canBuy = true;
            System.out.println("Я могу купить еду, это Rewo");
        }


        //Task 3 input

        Scanner scanner = new Scanner(System.in);
        int f = scanner.nextInt();
        HomeWork task3 =new HomeWork();
        System.out.println(task3.method(f));

        // Task 4 input
        Scanner scanner1 = new Scanner(System.in);
        String s = scanner1.nextLine();
        HomeWork task4 = new HomeWork();
        System.out.println(task4.isLongThenTen(s));

    }

    //Task 3

    public boolean method(int f) {
        if ((f % 7 == 0) || (f % 5 == 0)) {
            return true;
        }
        return false;
        }


    //Task 4
    public boolean isLongThenTen(String s) {
       int dlina = s.length();
       if (dlina > 10){
           return true;
       }

        return false;
    }
}

