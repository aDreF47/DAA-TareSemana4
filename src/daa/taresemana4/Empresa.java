package daa.taresemana4;

public class Empresa{

    private Empleado empleados[];
    private Empleado aux[];
    static final int NUMERO_EMPLEADOS = 20;
    private int intercambios = 0;
    private int comparaciones = 0;

    String matriz[][] = new String[NUMERO_EMPLEADOS][3];

    public Empresa() {
        int codigos[] = {204, 305, 105, 205, 415, 106, 500, 100, 540, 420,
            100, 215, 340, 180, 600, 312, 147, 165, 510, 601};
        String nombres[] = {"Juan", "Ana", "Rosa", "Carlos", "Raul", "Pedro",
            "Rosario", "Martha", "Saul", "Karen",
            "Rosa", "Francis", "Ricardo", "Luis", "Damaris",
            "Diana", "Pablo", "Marcelo", "Carolina", "Ingrid"};
        float sueldos[] = {1500, 800, 2000, 550, 1200, 3500, 1800, 900, 750, 4000,
            750, 1500, 1200, 3500, 4000, 1800, 950, 1400, 600, 5500};

//        int codigos[] = {100, 100, 105, 106, 147, 165, 180, 204, 204, 215, 305, 312, 340, 415, 420, 500, 510, 540, 600, 601};
//        String nombres[] = {"Martha", "Rosa", "Rosa", "Pedro", "Pablo", "Marcelo", "Luis", "Juan", "Carlos", "Francis", "Ana",
//            "Diana", "Ricardo", "Raul", "Karen", "Rosario", "Carolina", "Saul", "Damaris", "Ingrid"};
//        float sueldos[] = {900, 750, 2000, 3500, 950, 1400, 3500, 1500, 550, 1500, 800, 1800, 1200, 1200, 4000, 1800, 600, 750, 4000, 5500};
//        
//        int codigos[] = {601, 600, 540, 510, 500, 420, 415, 340, 312, 305, 215, 204, 204, 180, 165, 147, 106, 105, 100, 100};
//        String nombres[] = {"Ingrid","Dámaris","Saúl","Carolina","Rosario","Karen","Raúl","Ricardo","Diana","Ana","Francis",
//            "Carlos","Juan","Luis","Marcelo","Pablo","Pedro","Rosa","Rosa","Martha"};
//        float sueldos[] = {5500, 4000, 750, 600, 1800, 4000, 1200, 1200, 1800, 800, 1500, 550, 3500, 1400, 950, 3500, 2000, 750, 900, 900};

        empleados = new Empleado[NUMERO_EMPLEADOS];
        aux = new Empleado[NUMERO_EMPLEADOS];

        for (int i = 0; i < empleados.length; i++) {
            empleados[i] = new Empleado(codigos[i], nombres[i], sueldos[i]);
            aux[i] = new Empleado(codigos[i], nombres[i], sueldos[i]);
        }
    }
      // Método para obtener el arreglo de empleados
    public Empleado[] getEmpleados() {
        return empleados;
    }

    public void ArrayOrdenado() {
        QuickSort();

    }

    public String[][] ArrayInverso() {
        int j = 0;
        for (int i = NUMERO_EMPLEADOS - 1; i >= 0; i--) {
            matriz[j][0] = String.valueOf(empleados[i].getCodigoDelEmpleado());
            matriz[j][1] = empleados[i].getNombreDelEmpleado();
            matriz[j][2] = String.valueOf(empleados[i].getSueldoDelEmpleado());
            j++;
        }
        return matriz;
    }

    public String[][] arrayOriginal() {

        for (int i = 0; i < NUMERO_EMPLEADOS; i++) {
            matriz[i][0] = String.valueOf(aux[i].getCodigoDelEmpleado());
            matriz[i][1] = aux[i].getNombreDelEmpleado();
            matriz[i][2] = String.valueOf(aux[i].getSueldoDelEmpleado());
        }
        return matriz;
    }

    public int getCodigoDelEmpleado(int i) {
        return empleados[i].getCodigoDelEmpleado();
    }

    public void setCodigoDelEmpleado(int codigo, int i) {
        empleados[i].setCodigoDelEmpleado(codigo);
    }

    public String getNombreDelEmpleado(int i) {
        return empleados[i].getNombreDelEmpleado();
    }

    public void setNombreDelEmpleado(String nombre, int i) {
        empleados[i].setNombreDelEmpleado(nombre);
    }

    public float getSueldoDelEmpleado(int i) {
        return empleados[i].getSueldoDelEmpleado();
    }

    public void setSueldoDelEmpleado(float sueldo, int i) {
        empleados[i].setSueldoDelEmpleado(sueldo);
    }

    public int getNumeroDeEmpleados() {
        return NUMERO_EMPLEADOS;
    }

    public int getIntercambios() {
        return intercambios;
    }

    public int getComparaciones() {
        return comparaciones;
    }
    public int busquedaSecuencialDesordenada (Empleado[] A, int n, int valor){
        int i =0;
        int pos = -1;
        boolean encontrado = false;
        while (i<=n-1 && encontrado== false){
            comparaciones++;
            if(A[i].getCodigoDelEmpleado()== valor){
                comparaciones++;
                pos=i;
                encontrado = true;
            }
            i=i+1;
        }
        return pos;
    }
    public int busquedaSecuencialOrdenada (Empleado[] A, int n, int valor){
        int comparaciones = 0;
        int i =0;
        int pos = -1;
        boolean encontrado = false;
        while (i<=n-1 && encontrado== false && valor>=A[i].getCodigoDelEmpleado()){
            //comparaciones++;
            //comparaciones++;
            if(A[i].getCodigoDelEmpleado()== valor){
               // comparaciones++;
                pos=i;
                encontrado = true;
            }
            i=i+1;
        }
        return pos;
    }
    public int busquedaBinariaRecursiva(Empleado[] A, int ini, int fin, int valor) {
        if (ini > fin) {
            comparaciones++;
            return -1; // Caso base: valor no encontrado
        } else {
            int medio = (ini + fin) / 2; // Encontramos el punto medio
            if (valor == A[medio].getCodigoDelEmpleado()) {
                comparaciones++;
                return medio; // Caso base: valor encontrado
            } else if (valor < A[medio].getCodigoDelEmpleado()) {
                comparaciones++;
                return busquedaBinariaRecursiva(A, ini, medio - 1, valor); // Buscamos en la mitad izquierda
            } else {
                return busquedaBinariaRecursiva(A, medio + 1, fin, valor); // Buscamos en la mitad derecha
            }
        }
    }
 // Método busquedaSecuencialPorBloques con parámetros (A, n, valor)
    public int busquedaSecuencialPorBloques(Empleado[] A, int n, int valor) {
        int k = (int) Math.sqrt(n); // Tamaño del bloque
        int inicio = 0;
        int fin = k - 1; // Fin del primer bloque
        int i = 1;
        int m;
            if (n % k ==0){
                m = (n/k);
            }
            else{// Número de bloques
                m = (n/k + 1); 
            }
        // Búsqueda secuencial ordenada en los últimos elementos de cada bloque
        while (i <= m && A[Math.min(fin, n - 1)].getCodigoDelEmpleado() <= valor) {
            comparaciones++; //Contando la comparación del while
            comparaciones++; //Contando la comparación de A[fin] <= valor
            if (valor == A[Math.min(fin, n - 1)].getCodigoDelEmpleado()) {
                comparaciones++;  // Contando la comparación del if
                return Math.min(fin, n - 1); // Valor encontrado
            }
            i = i + 1;
            inicio = inicio + k;
            fin = fin + k;

            if (fin > n - 1) {
                fin = n - 1; // Ajusta para el último bloque que puede ser de menor tamaño
            }
        }

        // Búsqueda secuencial ordenada dentro del bloque correspondiente
        int j = inicio;
        while (j <= Math.min(fin - 1, n - 1) && A[j].getCodigoDelEmpleado() <= valor) {
            comparaciones++; //Contando la comparación del while
            comparaciones++; //Contando la comparación de  A[j] <= valor
            if (valor == A[j].getCodigoDelEmpleado()) {
                comparaciones++;  // Contando la comparación del if
                return j; // Valor encontrado dentro del bloque
            }
            j=j+1;
        }
        return -1; // Valor no encontrado
    }
      public Empleado getEmpleado(int indice) {
        if (indice >= 0 && indice < NUMERO_EMPLEADOS) {
            return empleados[indice];
        }
        return null;
    }
      public void OrdenBurbuja() {
        Empleado temp;
        comparaciones = 0;
        intercambios = 0;

        for (int i = 1; i < empleados.length; i++) {
            for (int j = empleados.length - 1; j >= i; j--) {
                comparaciones++;
                if (empleados[j - 1].getCodigoDelEmpleado() > empleados[j].getCodigoDelEmpleado()) {

                    temp = empleados[j - 1];
                    empleados[j - 1] = empleados[j];
                    empleados[j] = temp;
                    intercambios++;
                }
            }
        }
    }
    public void OrdenarArray() {
        Empleado temp;
        
        for (int i = 1; i < empleados.length; i++) {
            for (int j = empleados.length - 1; j >= i; j--) {
                if (empleados[j - 1].getCodigoDelEmpleado() > empleados[j].getCodigoDelEmpleado()) {
                    temp = empleados[j - 1];
                    empleados[j - 1] = empleados[j];
                    empleados[j] = temp;
                    
                }
            }
        }
    }

    public void resetArray() {
        for (int i = 0; i < NUMERO_EMPLEADOS; i++) {
            empleados[i] = new Empleado(aux[i].getCodigoDelEmpleado(), aux[i].getNombreDelEmpleado(), aux[i].getSueldoDelEmpleado());
        }
    }

    public void OrdenInsercionDirecta() {
        Empleado temp;
        comparaciones = 0;
        intercambios = 0;
        int k;

        for (int i = 1; i < empleados.length; i++) {
            comparaciones++;
            temp = empleados[i];
            k = i - 1;
            while (k >= 0 && temp.getCodigoDelEmpleado() < empleados[k].getCodigoDelEmpleado()) {
                empleados[k + 1] = empleados[k];
                k--;
                intercambios++;
                comparaciones++;
            }
            empleados[k + 1] = temp;
        }
    }

    public void QuickSort() {
        comparaciones = 0;
        intercambios = 0;
        ReduceQuickSort(0, NUMERO_EMPLEADOS - 1);
    }

    public void ReduceQuickSort(int inicio, int fin) {
        Empleado temp;

        int izq = inicio, der = fin;
        int pos = izq;
        boolean flag = true;

        while (flag) {
            flag = false;
            while (empleados[pos].getCodigoDelEmpleado() <= empleados[der].getCodigoDelEmpleado() && pos != der) {
                der--;
                comparaciones++;
            }
            if (pos != der) {
                temp = empleados[pos];
                empleados[pos] = empleados[der];
                empleados[der] = temp;
                pos = der;
                intercambios++;

                while (empleados[pos].getCodigoDelEmpleado() >= empleados[izq].getCodigoDelEmpleado() && pos != izq) {
                    izq++;
                    comparaciones++;
                }
                if (pos != izq) {
                    temp = empleados[pos];
                    empleados[pos] = empleados[izq];
                    empleados[izq] = temp;
                    pos = izq;
                    flag = true;
                    intercambios++;
                }
            }
        }
        if (pos - 1 > inicio) {
            ReduceQuickSort(inicio, pos - 1);
        }
        if (fin > pos + 1) {
            ReduceQuickSort(pos + 1, fin);
        }
    }

    public void OrdenSeleccionDirecta() {
        Empleado temp;
        comparaciones = 0;
        intercambios = 0;
        int menor, pos;

        for (int i = 0; i < NUMERO_EMPLEADOS - 1; i++) {
            pos = i;
            for (int j = i + 1; j < NUMERO_EMPLEADOS; j++) {
                comparaciones++;
                if (empleados[j].getCodigoDelEmpleado() < empleados[pos].getCodigoDelEmpleado()) {

                    pos = j;
                }
            }

            intercambios++;

            temp = empleados[i];
            empleados[i] = empleados[pos];
            empleados[pos] = temp;
//                temp.setCodigoDelEmpleado(empleados[i].getCodigoDelEmpleado());
//                empleados[i].setCodigoDelEmpleado(empleados[pos].getCodigoDelEmpleado());
//                empleados[pos].setCodigoDelEmpleado(temp.getCodigoDelEmpleado());
//
//                temp.setNombreDelEmpleado(empleados[i].getNombreDelEmpleado());
//                empleados[i].setNombreDelEmpleado(empleados[pos].getNombreDelEmpleado());
//                empleados[pos].setNombreDelEmpleado(temp.getNombreDelEmpleado());
//
//                temp.setSueldoDelEmpleado(empleados[i].getSueldoDelEmpleado());
//                empleados[i].setSueldoDelEmpleado(empleados[pos].getSueldoDelEmpleado());
//                empleados[pos].setSueldoDelEmpleado(temp.getSueldoDelEmpleado());

        }
    }

}
