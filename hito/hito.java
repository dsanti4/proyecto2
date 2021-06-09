package hito;
import java.util.ArrayList;
import java.util.*;


/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author david
 */
public class hito {

    public static void main(String[] args) {

// declara las variables y los ArrayList donde luego van a ir los datos.
        int tmp;
        int numero;
        int adicional;
        ArrayList<Integer> boleto = new ArrayList();
        ArrayList<Integer> pares = new ArrayList();
        ArrayList<Integer> impares = new ArrayList();
        ArrayList<Character> mensaje = new ArrayList();

//genera el numero adicional.
        adicional = (int) (Math.random() * 49);

// Genera los 6 numeros entre 0 y 49 y los guarda en un ArrayList(boleto).
        for (int i = 0; i <= 5; i++) {
            numero = (int) (Math.random() * 49);
            if (boleto.contains(numero)) {
                i--;
            } else {
                boleto.add(numero);
            }
        }

//Rellena los Arraylist de pares e impares.    
        for (int i = 0; i < boleto.size(); i++) {
            if ((int) boleto.get(i) % 2 == 0) {
                pares.add(boleto.get(i));
            } else {
                impares.add(boleto.get(i));
            }
        }

//Imprime la estructura visual.
        System.out.println("   COMBINACION GANADORA           COMPLEMENTARIO");
        System.out.println("   --------------------           --------------");
        System.out.print("     ");

        for (int i = 0; i < boleto.size(); i++) {
            System.out.print(boleto.get(i));
            if (i < boleto.size() - 1) {
                System.out.print("-");
            }
        }
        System.out.print("                   " + adicional);
        

//imprime la lista de pares e impares
        System.out.print("\n\nPARES:");

        for (int i = 0; i < pares.size(); i++) {
            System.out.print(pares.get(i));
            if (i < pares.size() - 1) {
                System.out.print("-");
            }
        }
        System.out.print("\nIMPARES:");
        for (int i = 0; i < impares.size(); i++) {
            System.out.print(impares.get(i));
            if (i < impares.size() - 1) {
                System.out.print("-");
            }
        }
        System.out.print("\n\n");

//codifica el mensaje secreto.
        for (int i = 0; i < boleto.size(); i++) {
            tmp = boleto.get(i);
            mensaje.add((char) tmp);
        }

        //imprime el mensaje.
        System.out.print("Mensaje: ");

        for (int i = 0; i < mensaje.size(); i++) {
            System.out.print(mensaje.get(i) + " ");
        }
    }
}