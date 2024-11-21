import java.awt.*;//otnove se generira avtomatichno ot reference Point !!! awt e tiput

public class zad4i2 {
    public static void main(String[] args) {
        Point point1 = new Point(1, 1);//Point si gi opredelq,prosto pishem 1 , 1 i taka
        Point point2 = point1;//point2 e adresut v pametta
        point1.x = 2;    //x i y sushtestvuvat v klasa
        System.out.println(point2);//tuk shte printira java.awt.Point[x=2,y=1],koeto e vidimata promqna
        //REFERENCE NE suhranqvat deistvitelnite stojnosti,te suhranqvat prepretka kum obeckta nqkude v pametta
        //reference tipovete se kopirat ot referenciite(Point)
    }
}
