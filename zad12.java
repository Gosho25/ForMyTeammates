public class zad12 {
    public static void main(String[] args) {
        int result = (int)Math.round(Math.random() * 100);
        System.out.println(result);
    }
}

/*
        int result = Math.round(1.1F); .round zakryglq zapetaqta do naj-blizkoto 4etno
        System.out.println(result);

        int result = (int)Math.ceil(1.1F); .ceil vrushta naj malkoto cqlo 4islo,koeto e po-golqmo ili = na tova 4islo
        System.out.println(result); tuk printira 2
        slagame (int) pred Math,zashtoto ceil vrushta v double,zatova go pravim v int

        int result = (int)Math.floor(1.1F); .floor e obratnoto na ceil
        System.out.println(result);

         .ceil e tavanut, a .floor e podut

        int result = Math.max(1, 2);  .max printira naj-golqmoto 4islo
        System.out.println(result);

        int result = Math.min(1, 2);  . min naj-malkoto
        System.out.println(result);

        double result = Math.random(); print. 4islo m/u  0 i 1
        System.out.println(result);

        double result = Math.random() * 100;
        System.out.println(result); kogato slojim * po 4islo G,printira 4isla m/u 0 i G
        -w tozi slu4aj m/u 0 i 100-

        double result = Math.round(Math.random() * 100); kakto znaem, . round zakruglq do naj blizkoto 4etno 4islo
        System.out.println(result); .0 v kraja e zaradi double

        int result = (int) Math.round(Math.random() * 100);
        System.out.println(result); int-a maha   '.0' v kraja

        int result = (int) Math.random() * 100; bez skobite na Math,print. 0,zashtoto randoma printira 23.4534535(da kajem) umnojeno po 0,i stava 4islo m/u 0 i 0.
        System.out.println(result);

 Mnogo vajno e da gledame podskazkite i error-rite,zashtoto taka shte opravi zada4ata sami

 (int,long,double) Math -> Math moje da e teference ili preference,4isla i t.n. . (int,long,double) promenq Math v primitiva,izpisan v skobite.
 */