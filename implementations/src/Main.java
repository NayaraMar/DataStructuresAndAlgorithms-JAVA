import lists.ArrayList;
import lists.MyList;

public class Main {

    public static void main(String[] args) {
        MyList count = new ArrayList();

        count.add(1);
        count.add(1);
        count.add(1);
        count.add(1);
        count.add(7, 2);
        count.add(10);
        count.replace(3, 0);
        count.remove(4);

        int value = count.get(2);
        int size = count.getSize();

        System.out.println("value = " + value + " size: " +  size);
    }
}
