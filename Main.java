package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	/* crear una funcion que recibe 2 parametros (una cadena de texto y un char) vamos hacer que la
	funcion recorra toda la cadena y nos diga cuantas veces se encuentra el caracter en la cadena de texto*/
        Scanner r = new Scanner(System.in);
        String texto;
        char caracter;

        System.out.println("Bienvenido, porfavor ingrese a continuacion la cadena de texto: ");
        texto = r.nextLine();
        System.out.println("Porfavor ingrese el caracter que desea: ");
        caracter = r.next().charAt(0);
        lectura(texto, caracter);
    }
    public static void lectura(String texto,char caracter){
        int cantidad = 0;
        for(int x = 0;x<texto.length();x++){
            if(texto.charAt(x)==caracter){
                cantidad++;
            }
        }
        System.out.println("La candidad de caracteres: "+caracter+" es: "+cantidad);
    }
}
