package org.example;

import java.util.*;
public class UsoEmpleado {
    public static void main(String[] args) {


        ArrayList<Empleado> listaEmpleados= new ArrayList<Empleado>();
        listaEmpleados.add(new Empleado("Juan", 30, 25000));
        listaEmpleados.add(new Empleado("Ana", 28, 28000));
        listaEmpleados.add(new Empleado("Luis", 35, 32000));
        listaEmpleados.add(new Empleado("Yana", 28, 31000));

        System.out.println();
        System.out.println(listaEmpleados.size());
        System.out.println();

        listaEmpleados.set(1, new Empleado("Olga", 32, 22000));
        System.out.println(listaEmpleados.get(3).dameDatos());

        System.out.println();





        // Iteramos sobre cada empleado en el array y mostramos sus datos
        for (Empleado e : listaEmpleados) {
            System.out.println(e.dameDatos());
        }
    }

    // Clase Empleado como static para poder ser usada en el método main
    static class Empleado {
        public Empleado(String nombre, int edad, double salario) {
            this.nombre = nombre;
            this.edad = edad;
            this.salario = salario;
        }

        public String dameDatos() {
            return "El empleado se llama " + nombre + ". Tiene " + edad + " años. " + "Y un salario de " + salario;
        }

        private String nombre;
        private int edad;
        private double salario;
    }
}
