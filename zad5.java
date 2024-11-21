public class zad5 {
    public static void main(String[] args){
        String message = "   Hello World" + "!!   ";//printira i space-ovete
        // stringovete sa REFERENTNI,oba4e ne pishem new,zashtoto se izpolzvat chesto i nqma nujda

        System.out.println(message.replace("!", "*"));
        System.out.println(message);
        //purviq sout printira suobshtenieto sus zadadena komanda ot men
        //vtoriq sout printira NEZAVISIMOTO(kakto pri x i y)

        //endsWith()-proverqva dali zavurshva s edi kakvo si;ako da->true;ako ne->false
        //lenght()-printira duljinata na stringa
        //sout(message.indexOf("H"))-primer-printira 0,zashtoto zapo4va da broi ot 0;ako ne sushtestvuva->print. -1;
        //replace zamestva targetasus replacementa,kojto sme mu zadali
    }
}
