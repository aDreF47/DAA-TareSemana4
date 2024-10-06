package daa.taresemana4;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
       /* Empresa miEmpresa1 = new Empresa();
        Empresa miEmpresa2 = new Empresa();
        System.out.println("\nMetodo de la Burbuja");
        System.out.println("--------------------------------");
        miEmpresa1.OrdenBurbuja();
        
        for (int i = 0; i < miEmpresa1.getNumeroDeEmpleados(); i++) {
            System.out.printf("%10d%10s%10.2f\n",
                    miEmpresa1.getCodigoDelEmpleado(i),
                    miEmpresa1.getNombreDelEmpleado(i),
                    miEmpresa1.getSueldoDelEmpleado(i));
        }
        System.out.printf("Numero de comparaciones: %d\n",
                miEmpresa1.getComparaciones());
        System.out.printf("Numero de intercambios: %d\n",
                miEmpresa1.getIntercambios());
        System.out.println("\nMetodo Insercion Directa");
        System.out.println("--------------------------");
        miEmpresa2.OrdenInsercionDirecta();
        System.out.println();
        for (int i = 0; i < miEmpresa2.getNumeroDeEmpleados(); i++) {
            System.out.printf("%10d%10s%10.2f\n",
                    miEmpresa2.getCodigoDelEmpleado(i),
                    miEmpresa2.getNombreDelEmpleado(i),
                    miEmpresa2.getSueldoDelEmpleado(i));
        }
        System.out.printf("Numero de comparaciones: %d\n",
                miEmpresa2.getComparaciones());
        System.out.printf("Numero de intercambios: %d\n",
                miEmpresa2.getIntercambios());
        */
        /*
        System.out.println("Busqueda Secuencial Por Bloques: ");
        Scanner scanner = new Scanner(System.in);
        Empresa empresa = new Empresa();
        empresa.OrdenarArray();
        System.out.print("Ingrese el codigo del empleado a buscar: ");
        int codigoABuscar = scanner.nextInt(); 
        Empleado[] empleadosA = empresa.getEmpleados();// Arreglo de empleados
        int n = empleadosA.length;  // Número de empleados
        // Llamada al método usando los parámetros (A, n, valor)
        int indice = empresa.busquedaSecuencialPorBloques(empleadosA, n, codigoABuscar);

        if (indice != -1) {
            Empleado emp = empresa.getEmpleado(indice);
            System.out.println("Empleado encontrado:");
            System.out.println("Codigo: " + emp.getCodigoDelEmpleado());
            System.out.println("Nombre: " + emp.getNombreDelEmpleado());
            System.out.println("Sueldo: " + emp.getSueldoDelEmpleado());
        } else {
            System.out.println("Empleado con codigo " + codigoABuscar + " no encontrado.");
        }
        System.out.printf("Numero de comparaciones: %d\n",
            empresa.getComparaciones());
        */
        /*
        System.out.println("busqueda Secuencial Desordenada: ");
        Scanner scanner = new Scanner(System.in);
        Empresa empresa2 = new Empresa();
        System.out.print("Ingrese el codigo del empleado a buscar: ");
        int codigoABuscar = scanner.nextInt(); 
        Empleado[] empleadosB = empresa2.getEmpleados();// Arreglo de empleados
        int n = empleadosB.length;  // Número de empleados
        int indice = empresa2.busquedaSecuencialDesordenada(empleadosB, n, codigoABuscar);
        if (indice != -1) {
            Empleado emp = empresa2.getEmpleado(indice);
            System.out.println("Empleado encontrado:");
            System.out.println("Codigo: " + emp.getCodigoDelEmpleado());
            System.out.println("Nombre: " + emp.getNombreDelEmpleado());
            System.out.println("Sueldo: " + emp.getSueldoDelEmpleado());
        } else {
            System.out.println("Empleado con codigo " + codigoABuscar + " no encontrado.");
        }
        
        System.out.printf("Numero de comparaciones: %d\n",
            empresa2.getComparaciones());*/
        /*System.out.println("busqueda Secuencial Ordenada: ");
        Scanner scanner = new Scanner(System.in);
        Empresa empresa3 = new Empresa();
        System.out.print("Ingrese el codigo del empleado a buscar: ");
        int codigoABuscar = scanner.nextInt(); 
        empresa3.OrdenarArray();
        Empleado[] empleadosC = empresa3.getEmpleados();// Arreglo de empleados
        int n = empleadosC.length;  // Número de empleados
        int indice = empresa3.busquedaSecuencialOrdenada(empleadosC, n, codigoABuscar);
            if (indice != -1) {
            Empleado emp = empresa3.getEmpleado(indice);
            System.out.println("Empleado encontrado:");
            System.out.println("Codigo: " + emp.getCodigoDelEmpleado());
            System.out.println("Nombre: " + emp.getNombreDelEmpleado());
            System.out.println("Sueldo: " + emp.getSueldoDelEmpleado());
        } else {
            System.out.println("Empleado con codigo " + codigoABuscar + " no encontrado.");
        }
        System.out.printf("Numero de comparaciones: %d\n",
            empresa3.getComparaciones());*/
        System.out.println("Busqueda Binaria Recursiva ");
        Scanner scanner = new Scanner(System.in);
        Empresa empresa4 = new Empresa();
        System.out.print("Ingrese el codigo del empleado a buscar: ");
        int codigoABuscar = scanner.nextInt(); 
        empresa4.OrdenarArray();
        Empleado[] empleadosD = empresa4.getEmpleados();// Arreglo de empleados
        int n = empleadosD.length;  // Número de empleados
        int indice = empresa4.busquedaBinariaRecursiva(empleadosD, 0, empleadosD.length - 1, codigoABuscar);
            if (indice != -1) {
            Empleado emp = empresa4.getEmpleado(indice);
            System.out.println("Empleado encontrado:");
            System.out.println("Codigo: " + emp.getCodigoDelEmpleado());
            System.out.println("Nombre: " + emp.getNombreDelEmpleado());
            System.out.println("Sueldo: " + emp.getSueldoDelEmpleado());
        } else {
            System.out.println("Empleado con codigo " + codigoABuscar + " no encontrado.");
        }
        System.out.printf("Numero de comparaciones: %d\n",
            empresa4.getComparaciones());
    }
}
   



     
