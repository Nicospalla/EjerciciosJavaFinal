package com.company;

public class Arrays {

    public void leerNombres(String nombres[]) {
        for (String nombre : nombres) {
            System.out.println(nombre);
        }
    }
    public void leerBidi(int numeros[][]){
        for (int i=0; i<numeros.length; i++){
            for(int j=0; j<numeros[i].length; j++){
                System.out.println("En pos i: "+i+" en pos j:"+j+" el valor es: "+numeros[i][j]);
            }
        }
    }
}
