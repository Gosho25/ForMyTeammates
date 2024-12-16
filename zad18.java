import java.util.Scanner;

public class zad18 {
    public static void main(String[] args) {
        //Класът Scanner се използва за четене на данни от потребителя
        Scanner scan = new Scanner(System.in);// <Клас> <обект> = нов Метод(атрибути) / да се знае за по-нататък при създаване на обекти

        System.out.println("Enter your Name: ");
        String name = scan.nextLine();// името.next<тип>(); създава променлива която събира инф. подадена от потребителя

        //scan.nextLine();//това го слагам за да създаде нов ред, в който потребителя не въвежда нищо, защото се получава един спец. проблем
        System.out.println("Age: ");
        int age = scan.nextInt();
        System.out.println("Born Year: ");
        short bYear = scan.nextShort();

        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Born Year: " + bYear);

        scan.close();//това е излишно, просто мяха излишната памет
    }
}
