package com.flexisaf.flexisafinternship.week1;


//import static com.sun.org.apache.bcel.internal.classfile.Utility.printArray;

public class GenericMethodExample<T extends Integer> {
    public static void main(String[] args) {
        Integer[] intArray = {1, 2, 3, 4, 5, 6};
        String[] stringArray = {"Hello", "World", "!"};

        System.out.print("Integer Array: ");
        printArray(intArray);

        System.out.print("String Array: ");
        printArray(stringArray);
    }

    public static <T> void printArray (T[] arr){
        for (T element : arr) {
            System.out.print(element + " ");
        }
        System.out.println();
    }
}

