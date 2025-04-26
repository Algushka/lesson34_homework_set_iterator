import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
//Дан лист String. Необходимо определить, есть ли в данном листе
// повторяющиеся объекты. (данный метод можно реализовать в общем виде,
// для листа любых объектов)

public class Main {
    public static void main(String[] args) {

        List<String> list = new ArrayList<>();
        /* hash сравнивает по hash code и equals*/
        list.add ("Jack");
        list.add ("Nick");
        list.add ("Ann");
        list.add ("Xet");
        list.add ("Xet");
        list.add ("Xet");
        list.add ("Lena");
        list.add ("Ira");
        list.add ("Jack");
        list.add ("Max");
        list.add ("Tim");
        System.out.println("Our primary list");
        System.out.println(list);
        //положим весь list в set:

        if (thereAreRepetativeElements(list)) {System.out.println("Есть повторы");
            System.out.println("Number Of repetative elements:" + numberOfRepetativeElements( list));}
    }


    public static <T> boolean thereAreRepetativeElements( List<T> list) {
        Set<T> set = new HashSet<>(list);
        return (set.size()< list.size());
    }
    public static <T> int numberOfRepetativeElements(List <T> list) {
        if (thereAreRepetativeElements(list)) {
            Set<T> set = new HashSet<>(list);
            return list.size()-set.size();
        }
        return 0;
    }





}