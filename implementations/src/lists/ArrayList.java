package lists;

public class ArrayList implements MyList {
    private int[] array;
    private int size;
    private int i;

    public ArrayList() {
        this.array = new int[5];
        this.size = 0;
    }

    //return the index of list
    public int get(int index) {
        //check if the value is larger than the array size or less than the index size
        if (index > this.size || index < 0) {
            throw new RuntimeException("Value not found");
        }

        return this.array[index];
    }

    public void add(int element) {
        //checks whether the array values will exceed its size
        //if yes, will increase a new list size
        if(this.size == this.array.length-1) {
            IncreaseList();
        }

        this.array[this.size] = element;
        this.size++;
    }

    //If the array is complete, this method will increase it
    private void IncreaseList() {
        int[] arrayCount = new int [this.array.length*2];
        for (i = 0; i < this.array.length; i++ ) {
            arrayCount[i] = this.array[i];
        }
        this.array = arrayCount;
    }

    public void add(int element, int index) {
        if (index >= this.array.length) {
            throw new RuntimeException("Index Out Of Bounds");
        }
        //check if exist space in the array
        if((this.array.length - this.size) == 0) {
            IncreaseList();
        }
        if (index < this.size) {
            replace(element, index);
        } else {
            this.array[index] = element;
            size++;
        }
    }


    public void remove(int index) {
        //check if exist value in this position and relocate the others
        if (index < size && index >= 0) {
            for (i = index; i <= size; i++) {
                array[i] = array[i + 1];
            }
            size--;
        } else {
            throw new RuntimeException("Index Out Of Bounds");
        }
    }

    //check if exist some value in this position and replaces it
    public void replace(int element, int index) {
        if (index < size && index >= 0) {
            array[index] = element;
        } else {
            throw new RuntimeException("Index Out Of Bounds");
        }
    }

    public int getSize() {
        return this.size;
    }
}
