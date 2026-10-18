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

    public String get(int index) {
        if (index < 0 || index >= size) {
            throw new IndexOutOfBoundsException();
        }
        return data[index];
    }
}