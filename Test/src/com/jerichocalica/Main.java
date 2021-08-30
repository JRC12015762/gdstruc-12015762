package com.jerichocalica;

public class Main {

    public static void main(String[] args) {
	float[] arrayFloat;
    arrayFloat = new float[20];
    arrayFloat[0] = 1.123f;
    arrayFloat [19] = 20.123f;
        System.out.println("Java float Array Example");
        for(int i=0;i<arrayFloat.length;i++)
        {
            System.out.println("Element at Index : "+ i + " " + arrayFloat[i]);
        }
//comments
    }
}
