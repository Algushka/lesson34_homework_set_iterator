import java.util.HashSet;
import java.util.Set;
//задача 3
//Дана строка с именами вида Jack,John,Nick,John.
//Необходимо написать метод, который удалит из этой
//
//строки повторяющиеся имена. Т.е. например, в случае
//        строки  “Jack,John,Nick,John” вернет строку
//с именами  Jack,John,Nick
//сделаем итератором:



public class Main3 {

    public static void main(String[] args) {
        Set <String> set = new HashSet();
        String str = "John,Jack,Nick,Dick,Olga,Pasha,Olga,Pavel";
        IterableString iterableString = new IterableString(str);
        for (String word: iterableString) {
            System.out.println(word);
            set.add (word);
           }
        System.out.println("Убрали одинаковые элементы");
       // for (String element:set) {
        //    System.out.println(element);
       // set.forEach(s-> System.out.println(s));
        set.forEach(System.out::println);



    }



    }

