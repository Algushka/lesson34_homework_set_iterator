import java.util.Iterator;

public class IterableString implements Iterable<String> {

/*переменная, где храним строчку текста: */
    private String value;
/* конструктор*/
    public IterableString(String value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return "IterableString{" +
                "value='" + value + '\'' +
                '}';
    }

    @Override
            /* у интерфейса Iterable есть один метод Iterator*/
    //он делает абстрактный класс интерфейса Iterator

    public Iterator<String> iterator() {
        return new Iterator<String>() {
            //сделаем массив из слов, разделив нашу строчку на слова
            private String[] words = value.split(",");
            int index=0;
            @Override
            public boolean hasNext() {
                return index<words.length;
            }

            @Override
            public String next() {
                return words[index++];
            }
        };
    }








}
