import java.util.*;
//задача 3 ( с внутренним итератором)
//Дана строка с именами вида Jack,John,Nick,John.
//Необходимо написать метод, который удалит из этой
//
//строки повторяющиеся имена. Т.е. например, в случае
//        строки  “Jack,John,Nick,John” вернет строку
//с именами  Jack,John,Nick

public class Main4 {
    public static void main(String[] args) {
        String str ="John,Jack,Nick,Dick,Olga,Pick";
        String str1="";
        str.trim();/* избавимся от лишних пробелов*/
        String [] words = str.split(",");
        Set<String> set = new HashSet<>();
        for (String word: words) {
            set.add(word);
        }
        System.out.println("Список без повторений:");
        set.forEach(s-> System.out.println(s));
        List <String> list = setToList(set);
        System.out.println("Cписок без повторений с запятыми:" + list);
        list.sort(String::compareToIgnoreCase);
        System.out.println("Сортировано по алфавиту"+list);

    }
    public static List<String> setToList(Set <String> set) {
        List <String> list = new ArrayList<>();
        int index=0;
        for (String element: set ) {
            list.add(element);
            index++;
        }
        return list;
    }




}
