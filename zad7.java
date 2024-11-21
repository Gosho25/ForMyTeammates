import java.lang.reflect.Array;
import java.util.Arrays;

public class zad7 {
    public static void main(String[] args){
        int[] numbers = new int[5];//tova e masiv(array)
        numbers[0] = 1;//tuk pokazvame 4e purviq element[0] e = na 1
        numbers[1] = 2;//a tuk 4e e = na 2
        //ako dobavim nesushtestuvash el -> numbers[10] = 3; , printira greshka
        System.out.println(Arrays.toString(numbers));//tova shte vurne stringovoto predstavqne na masiva
    }
}
//printira nuli zashtoto ne sa zadadeni
//!!!!!!!!!!!!!!!!!!!!!!!!   NA ZAD7i3 E PO_DETAILNO!!!!!!!!!!!!!!!!!!