/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.tareaarraylist;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author guill
 */
public class TareaArraylist {

    public static void main(String[] args) {
       
        
        //1
        
        ArrayList <String> nombres = new ArrayList <String>();
        
        nombres.add("Manuel");
        nombres.add("Juan");
        nombres.add("Laura");
        nombres.add("Carla");
        
        System.out.println(nombres);
        
        //2
        
        Scanner datosp = new Scanner (System.in);
        int numero1;
        int numero2;
        int numero3;
        int numero4;
        int numero5;
        
        System.out.println("Introduce el valor 1: ");
       
        numero1 = datosp.nextInt();
        
        System.out.println("Introduce el valor 2: ");
        
        numero2 = datosp.nextInt();
        
        System.out.println("Introduce el valor 3: ");
        
        numero3 = datosp.nextInt();
        
        System.out.println("Introduce el valor 4: ");
        
        numero4 = datosp.nextInt();
        
        System.out.println("Introduce el valor 5: ");
        
        numero5 = datosp.nextInt();
        
        ArrayList <Integer> numeros = new ArrayList<Integer>();
        
        numeros.add(numero1);
        numeros.add(numero2);
        numeros.add(numero3);
        numeros.add(numero4);
        numeros.add(numero5);
        
        String respuesta = "";
        
        System.out.println("¿Desea imprimir los datos?");
        
        respuesta = datosp.next();
        
        if (respuesta.equals ("si") || respuesta.equals("Si") || respuesta.equals ("SI")){
            
             System.out.println(numeros);
            
        }
        
        else System.out.println("No se imprimen los datos");
        
            
        
        //3
        
        ArrayList<String> nombres2 = new ArrayList<String>();
        
        nombres2.add("Sofia");
        nombres2.add("Chema");
        nombres2.add("Alex");
        nombres2.add("Rosa");
        
        System.out.println(nombres2.size());
        System.out.println(nombres2.lastIndexOf("Juan"));
        
        nombres2.remove(3);
        
        
        
        //4
        
        String animal;
        
        ArrayList<String> animales = new ArrayList<String>();
        
        System.out.println("Introduce el nombre de un animal: ");
        
        animal = datosp.next();
        
        while (!animal.equals ("salir")){
            
            animales.add(animal);
            System.out.println("Los animales son " + animales);
            System.out.println("El numero de animales son " + animales.size());
            System.out.println("Introduce el nombre de un animal o escribe salir para acabar: ");
            animal = datosp.next();
            
        }
        
        System.out.println("Has terminado la lista de animales. Los animales registrados son: " + animales);
        
    }
    
   
}
