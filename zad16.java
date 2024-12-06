public class zad16 {
    public static void main(String[] args) {
        //while loop
        while(true){//ако условието е true влиза в цикъл
            //тяло
            System.out.println("start");
            break;//прекъсваме цикъла
        }
        //външни променливи може да са условието на цикъла
        //може да добавяме if, else-if,else,for и т.н. в него
        //break и continue показват как да процедира цикъла ПРИМЕР:
        int counter = 0;
        while(counter >= 0){
            System.out.println("hello");
            counter++;
            if(counter == 10){
                break;
            }else{
                continue;
            }
        }
        /*
        задаваме променлива counter със стойност 0
        правим while цикъл за counter >= 0;Ако условиетое вярно, започваме цикъл;То е винаги вярно, така че може да напишем само true;
        Отпечатваме hello и counter нараства с 1
        ако counter достигне стойност 10 прекъсваме цикъла, ако ли не продължи
        continue е излишен, но го слагаме за да не изпадне в безкрайност
         */
    }
}
