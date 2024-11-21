import java.util.Date;//Dobavq se avtomatichno

public class zad3 {
    public static void main(String[] args){
        byte age = 30;//na primitivne ne razpr. pamet(tq se razpr. ot JAVA)
        Date now = new Date();//Date e promenliva
        //new se dobavq za da razpredelim pamet za prom.(ot tuk idva i razlikata m/u primetive i reference)
        //vinagi se razpr. pametta za referentite
        //new e ekzemplqr na Date
        now.getTime();//get time e 4len na now
        //PRIMITIVNITE NQMAT takiva 4lenove
        System.out.println(now);
    }
}


//primitivnite tipove(ot zad 2) se izpolzvat za chisla
//refrentnite(zad3) se izpolzvat za suhranenie za po-slojni obekti s danni