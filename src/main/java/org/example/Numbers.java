package org.example;

public class Numbers implements DataStructure {
    Object[] objects = new Object[100];
    int x;
    int num;

    public boolean put(Object obj) {
        NUMBERS[x] = obj;
        x++;
        return false;
    }
    public Object get() {
        System.out.print(NUMBERS[x-1]+" ");
        x--;
        return null;
    }
}