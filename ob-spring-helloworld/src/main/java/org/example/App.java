package org.example;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args ){
        //System.out.println( "Hello World!" );
        ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");

        //Ejemplo 1
        //Opción 1. Crtear un objeto de forma normal
        Calculadora service = new Calculadora();

        //Opción 2. Recibir un objeto de Spring
        Calculadora calculadora = (Calculadora) context.getBean("calculadora");
        String texto = calculadora.holaMundo();
        System.out.println(texto);


        //Se puede volver a obtener
        //OJO: Se recupera del mismo objeto
        Calculadora calculadora2 = (Calculadora) context.getBean("calculadora");
        texto = calculadora.holaMundo();
        System.out.println(texto);

        //Ejemplo 2: Cargar un bean dentro de otro bean
        GestorFacturas gestor = (GestorFacturas) context.getBean("gestorFacturas");
        System.out.println(gestor.calculadora.holaMundo());

        //Concepto 3: Scope o alcance
        //Los beans por defecto son singleto, se crea el objeto y se reutiliza para toda la aplicación, podemos cambiarlo
        // a scope="prototype" si queremos qu e se cree el nuevo objeto cada vez
        // se puede verificar viendo como se ejecuta varias veces el construcotr


    }
}
