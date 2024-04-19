package org.example;

public class Main {
    public static void main(String[] args) {
Numbers myData = new Numbers();
        for (int i = 0;i<100;i++){
        myData.put(i);
        }
        for (int i = 0;i<100;i++){
            myData.get();
        }
    }
}