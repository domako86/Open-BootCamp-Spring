package org.example;

import org.springframework.stereotype.Component;

@Component
public class GestorFacturas {

    // 1. atributos
    Calculadora calculadora;
    //String nombre;

    // 2. constructores
    public GestorFacturas(Calculadora calculadora){
        System.out.println("Ejecutando contructor GestorFacturas");
        this.calculadora = calculadora;
        //this.nombre = nombre;
    }


    // 3. metodos...
}
