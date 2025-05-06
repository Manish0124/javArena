package oops.generics;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;

import practiceStuff.ArraysQ.string;

public class CustomArrayList {


    private int[] data;
    
    private static int DEFAULT_SIZE = 10;

    private int size = 0; //also worked as index value 


    public CustomArrayList(){
        this.data = new int[DEFAULT_SIZE];
    }

    public void add(int num){
        if (isFull()) {
            resize();
        }

        data[size++] = num;
    }

    private void resize(){
        int[] temp = new int[data.length * 2];

        //copy the current items in the new array
        for (int i = 0; i < data.length; i++) {
             temp[i] = data[i];
        }

        data = temp;

    }

    private boolean isFull(){
        return size == data.length;
    }

    public int remove(){
        int removed = data[--size];
        return removed;
    }
    
    public int get(int index){
        return data[index];
    }

    public int size(){
        return size;
    }

    public void set( int index , int value ){
         
        data[index] = value;
    }

    @Override

    public String toString(){
        return  "{CustomArrayList{" + 

        "data=" + Arrays.toString(data) + 
        ", size=" + size + '}';
    }

    public static void main(String[] args) {


         
        // ArrayList list  = new ArrayList<>();
        // list.add(23);

        // System.out.println(list);
           
        CustomArrayList list = new CustomArrayList();

        list.add(23);
        list.add(232);
        list.add(231);

        System.out.println(list);

        ArrayList<String> list2 = new ArrayList<>();
        list.add(2);

    }
}
