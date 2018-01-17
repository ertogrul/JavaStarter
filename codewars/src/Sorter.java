import java.util.*;
/*class Sorter {
    public static List<String> sort(List<String> textbooks) {
        System.out.println(textbooks);
        return Collections.sort(textbooks);
        //return textbooks;
    }*/

class Sorter {
    static List<String> sort(final List<String> textbooks) {
        textbooks.sort(String::compareToIgnoreCase);
        return textbooks;
    }

    public static void main (String[] args) {
       Sorter pointer = new Sorter();
       System.out.println(pointer.sort(Arrays.asList("Algebra", "History", "Geometry", "English")));
       //pointer.sum(new int[]    { 6, 2, 1, 8, 10 });
    }
}



// https://stackoverflow.com/questions/13395114/how-to-initialize-liststring-object-in-java