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
        size = 0;
    }
}