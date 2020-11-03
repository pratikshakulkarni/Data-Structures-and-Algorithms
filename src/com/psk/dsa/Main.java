package com.psk.dsa;

import java.sql.SQLOutput;

public class Main {
    public static void main(String[] args) {
        DynamicArrayImpl1 dArray = new DynamicArrayImpl1();

        for(int i=0;i<7;i++){
            dArray.insert(i);
        }
        dArray.display();

        System.out.println("Get");
        dArray.get(0);

        System.out.println("Delete");
        dArray.delete(1);

        dArray.display();

    }

}
