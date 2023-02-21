package lessons.test;

import java.util.*;

public class SetTest {
    public static void main(String[] args) {
        Comparator<CollectionElement> comparator = new Comparator<CollectionElement>() {
            @Override
            public int compare(CollectionElement o1, CollectionElement o2) {
                return o1.getSeries().compareTo(o2.getSeries()) == 0? o1.getId() - o2.getId(): o1.getSeries().compareTo(o2.getSeries());
            }
        };
        Set<CollectionElement> set = new TreeSet<>(comparator);
        set.add(new CollectionElement("Физика",  "AAA"));
        set.add(new CollectionElement("Математика",  "ADA"));
        set.add(new CollectionElement("Русский яз",  "AAA"));
        set.add(new CollectionElement("English",  "BBB"));
        set.add(new CollectionElement("Music",  "BBB"));
        set.add(new CollectionElement("Физкультура",  "CAA"));
        set.add(new CollectionElement("ОБЖ",  "ABA"));
        set.add(new CollectionElement("История",  "ABA"));
        set.add(new CollectionElement("Литература",  "AAA"));
        set.add(new CollectionElement("Информатика",  "BBA"));
        for (CollectionElement collectionElement : set) {
            System.out.println(collectionElement);
        }
        System.out.println(getNumberWithEqualsSymbols("AAA"));
        System.out.println((getNumberWithEqualsSymbols("BAA")));
        System.out.println(getNumberWithEqualsSymbols("111"));
        System.out.println(getNumberWithEqualsSymbols("123"));
    }
    private static boolean getNumberWithEqualsSymbols(String s){
        char[] c = s.toCharArray();
        return (c[0] == c[1]) && (c[1] == c[2]);
    }

    static class CollectionElement{
        private String s;

        private String series;
        private static int id = 0;

        public CollectionElement(String s, String series) {

            this.s = s;
            id = id ++;
            this.series = series;
        }

        public String getS() {
            return s;
        }
        public String getSeries(){
            return series;
        }
        public int getId() {
            return id;
        }

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            CollectionElement that = (CollectionElement) o;
            return id == that.id && Objects.equals(s, that.s);
        }

        @Override
        public int hashCode() {
            return Objects.hash(s, id);
        }

        @Override
        public String toString() {
            return  series + " " + id + ") " + s ;
        }
    }
}
