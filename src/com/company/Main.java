package com.company;


import java.io.*;
import java.util.ArrayList;

import java.util.LinkedList;
import java.util.Vector;

public class Main {

    public static void main(String[] args) throws IOException {
        //Ejercicio 1 Array unidimensional Strings
        System.out.println("Ejercicio 1 Array unidimensional: ");
        Arrays arrayUnion = new Arrays();
        String nombres[] = {
                "Nicolas",
                "Pepe",
                "Sebastian",
                "Manuel"
        };
        arrayUnion.leerNombres(nombres);

        // Ejeercicio 2 Array Bidi
        System.out.println("\n"+"Ejercicio 2 Array Bidi");
        Arrays arrayBidi = new Arrays();
        int numeros[][] = {{1,2,3,4,5,6},{100,200,300,400,500}};
        arrayBidi.leerBidi(numeros);

        //Ejercicio 3 VECTOR
        System.out.println("\n"+"Ejercicio 3 Vector");
        Vector<Integer> vectorEj = new Vector<>();
        vectorEj.add(14);
        vectorEj.add(200);
        vectorEj.add(325);
        vectorEj.add(2359);
        vectorEj.add(26);
        vectorEj.remove(1);
        vectorEj.remove(1);
        System.out.println(vectorEj);
        System.out.println("El vector se duplica en cantidad de espacio cada vez que ocupa su capacidad max," +
                " con lo cual ocupa demasiada memoria.");

        //Ejercicio 4 ArraList String
        System.out.println("\n" +"Ejercicio 4 ArrayList to LinkedList");
        ArrayList<String> lista = new ArrayList<>();
        //Traingo los nombres que estan en el Array del ejercicio 1 y los incorporo a mi ArrayList
        for(String nombre : nombres) {
            lista.add(nombre);
        }
        LinkedList<String> listaLinkedList = new LinkedList<>(lista);
        for (String nombre : listaLinkedList) {
            System.out.print(nombre + " ");
        }

        //Ejercicio 6 ArrayList con Int
        System.out.println("\n\n" +"Ejercicio 6 ArrayList con int");
        ArrayList<Integer> numerosArrayList = new ArrayList<>();
            for(int i = 0; i < 10;i++){
                numerosArrayList.add(i+1);
            }
            for (int i = 0; i < numerosArrayList.size(); i++){
                if (numerosArrayList.get(i)%2==0){
                    numerosArrayList.remove(i);
                }
            }
            for(int numero : numerosArrayList){
                System.out.print(numero + " ");
            }

            //Ejercicio 7 Divide por CERO
        System.out.println("\n\n"+"Ejercicio 7 Divide por CERO");
            dividePorCero(3,0);

            //Ejercicio 8 InputStream
        System.out.println("\n"+"Ejercicio 8 InputStream - PrintStream");
        //Cambiar la direccion del fichero en base a uno que ya exista en su PC
        copiarFicheros(new FileInputStream("C:\\Users\\Nicolas\\Desktop\\Devop\\InputStreampractica.txt"),
                new PrintStream("C:\\Users\\Nicolas\\Desktop\\Devop\\SeguimosProbando.txt"));

    }

    public static void copiarFicheros (InputStream fileIn,PrintStream fileOut) throws IOException {
        InputStream lectorFichero = fileIn;
        BufferedInputStream lectorFicheroBuffer = new BufferedInputStream(lectorFichero);
        PrintStream escritorFichero = fileOut;
        int dato = lectorFicheroBuffer.read();
        while(dato != -1){
            System.out.print((char)dato);
            escritorFichero.print((char)dato);
            dato = lectorFicheroBuffer.read();
        }
    }




    public static void dividePorCero(int a, int b) throws ArithmeticException {
        try {
         int c= a / b;
    } catch (ArithmeticException e){
            System.out.println("Esto no puede h acerce "+ e.getMessage());
        }finally {
            System.out.println("Demo de codigo");
        }
    }
}
