import java.util.Arrays;

public class zad8 {
    public static void main(String[] args){
        int[][] numbers = new int[2][3];//2 e redovete a 3 sa koloniite
        numbers[0][0] = 1;//tova e za da imame dostup do otdelnite kolonii(toest koordinati kato s 'cars')
        System.out.println(Arrays.deepToString(numbers));//deep to String e za da moje da printira to 4nite 4isla
}
}


//kato v pitona :
//int[][] numbers = {{1,2,3}, {4,5,6}};
//sout(Arrays.deepToString(numbers)) <- deep e malki bukvi zaradi kamilskoto pisane

//printira      [[1,2,3], [4,5,6]]