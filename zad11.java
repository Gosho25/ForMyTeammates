public class zad11 {
    public static  void main(String[] args){
        //byte > short > int > long
        String x = "1";
        //Integer.parseInt() e ot vida obvivachni klasove/tozi Integer vzima Stringa i go prevrushta v cqlo chislo
        int y = Integer.parseInt(x) + 1;
        System.out.println(y);
    }
}

//        short x = 1;
//        int y = x + 1;
//        System.out.println(y);
//  short ima bytes = 2 a int bytes = 4,taka 4e short se prevrishta v int i prinira y = 2
// pri double ne e taka,zatova pishem i na dvete double
//         double x = 1.1;
//        double y = x + 1;


//        double x = 1.1;
//        int y = (int)x + 1; prevrushta go v cqlo

//Obvivachnite klasove imat za short.float i t.n(ot zad2)
//Float.parseFloat() vzima Stringa i go prevrushta vuv flaot,taka i drugite