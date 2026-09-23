package lists.utils.TestApps;

import lists.utils.DynamicArray;

import java.util.Random;

public class DynamicArrayTestBed {
    static void main (String[] args){
        DynamicArray myList = new DynamicArray();
        Random rg = new Random();

        for (int i = 0; i < 10 ; i++) {
            myList.add(rg.nextInt(100));
        }

        System.out.print(myList.get(0));
    }
}
