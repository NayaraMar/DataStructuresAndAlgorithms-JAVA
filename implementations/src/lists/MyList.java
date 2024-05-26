package lists;

public interface MyList {

    int get(int index);

    void add(int element);

    void add(int element, int index);

    void remove(int index);

    void replace(int element, int index);

    int getSize();


}
