import java.util.ArrayList;
import java.util.Collections;

class main{
    public static void main(String[] args) {

        ArrayList<String> list = new ArrayList<>();

        list.add("Apple");
        list.add("Banana");
        list.add("Cherry");
        list.add("Date");
        list.add("Elderberry");

        list.remove(2);

        Collections.sort(list);

        System.out.println("Modified List " + list);
    }
}



