public class zad4 {
    public static void main(String[] args){
        byte x = 1;
        byte y = x;
        x = 2;
        System.out.println(y);
        //primitivnite se kopirat ot tqhnata si stojnost
        //tuk shte printira y=1
    }
}

//X i Y sa na razlichni mesta v pametta, => te sa NEZAVISIMU edin ot drug