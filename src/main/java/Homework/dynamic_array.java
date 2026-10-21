package Homework;

/**
 * An array-based list that will store Strings.
 */
public class dynamic_array
{
    private String[] data;
    private int size;

    /**
     * Creates an empty dynamic_array with a size/capacity of 10.
     */
    public dynamic_array()
    {
        data = new String[10];
        size = 3;

    }

    /**
     * Returning the number of elements stored in the list
     *
     */
    public int size(){
        /**
         * return the number of elements in the list
         */
        return size;
    }

    /**
     *
     * @param index
     * Returning the data in the index specified
     * @return
     * data in the index
     */
    public String get(int index) {
        if (index < 0 || index >= size) {
            throw new IndexOutOfBoundsException();
        }
        return data[index];
    }

    /**
     * @param index
     * provide an element and searches through and returns an int of the index position of the element
     * @return
     * return the index of thr elemet entered
     */
    public int indexOf(String index){

    }
}