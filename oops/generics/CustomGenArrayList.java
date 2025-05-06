
  package oops.generics;

import java.util.ArrayList;
import java.util.Arrays;

public class CustomGenArrayList<T extends Number > {


    private Object[] data;
    
    private static int DEFAULT_SIZE = 10;

    private int size = 0; //also worked as index value 
  

    public CustomGenArrayList(){
        data = new Object[DEFAULT_SIZE];
    }

    public void add(T num){
        if (isFull()) {
            resize();
        }

        data[size++] = num;
    }

    private void resize(){
        Object[] temp = new Object[data.length * 2]; 

        //copy the current items in the new array
        for (int i = 0; i < data.length; i++) {
             temp[i] = data[i];
        }

        data = temp;

    }

    private boolean isFull(){
        return size == data.length;
    }

    public T remove(){
        T removed = (T) (data[--size]);
        return removed;
    }
    
    public T get(int index){
        return (T) data[index];
    }

    public int size(){
        return size;
    }

    public void set( int index , T value ){
         
        data[index] = value;
    }

    @Override

    public String toString(){
        return  "{CustomGenArrayList{" + 

        "data=" + Arrays.toString(data) + 
        ", size=" + size + '}';
    }

    public static void main(String[] args) {


         
        // ArrayList list  = new ArrayList<>();
        // list.add(23);

        // System.out.println(list);
           
        // CustomArrayList list = new CustomArrayList();

        // list.add(23);
        // list.add(232);
        // list.add(231);

        // System.out.println(list);

        ArrayList<String> list2 = new ArrayList<>();
        list2.add("hoolo");
        list2.add("world");

        System.out.println(list2);

        CustomGenArrayList<Integer> list3 = new CustomGenArrayList<>();

        
        for (int i = 0; i <14; i++) {
            list3.add( 2 * i);
        }
        
       
        System.out.println(list3);

    }
}


    

