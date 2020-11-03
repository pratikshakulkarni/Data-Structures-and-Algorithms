package com.psk.dsa;

import java.sql.SQLOutput;

public class DynamicArrayImpl1 {

    int Array1[] = new int[5];
    int count = 0;

    public DynamicArrayImpl1(){
        System.out.println("Object Created");
    }

    public void insert(int number){

        if(count== Array1.length)
            resize();

        Array1[count]=number;
        count++;

        //System.out.println("Value Inserted into the Array" + count);
    }

    private void resize() {
        //System.out.println("Arrray resizing");
        int newArray[]= new int[Array1.length*2];
        for(int i =0;i<Array1.length;i++){
            newArray[i]=Array1[i];
        }
        Array1=newArray;
    }

    public void display(){
        //System.out.println("Length = " + Array1.length);
        System.out.println(Array1);
    }

    public void get(int index){
        if(index>Array1.length)
            System.out.println("Array out of bound");
        else
            System.out.println(Array1[index]);
    }

    public void delete(int index){
        int[] newArray = new int[Array1.length];
        for(int i=0;i<Array1.length;i++){
            if(i==index){
                continue;
            }
            else{
                newArray[i]=Array1[i];
            }
        }

    }
}
