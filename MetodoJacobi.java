
package Ecuaciones_Lineales_Jacobi;

public class MetodoJacobi {
    // Calcula el error como la mayor diferencia entre dos vectores
    public static double calcularError(double[] xAnt, double[] xNuevo) {
        double err = 0; // Inicializa el error máximo
        for (int i = 0; i < xAnt.length; i++) { // Recorre cada variable
            double dif = Math.abs(xNuevo[i] - xAnt[i]); // Diferencia absoluta
            if (dif > err) err = dif; // Actualiza si es mayor
        }
        return err;
    }
    // Método iterativo de Jacobi
    public static double[] jacobi(double[][] A, double[] b, double[] xInicial, double tol, int maxIter) {
        int n = xInicial.length; // Número de variables
        double[] x = xInicial.clone(); // Copia el vector inicial
        for (int iter = 0; iter < maxIter; iter++) { // Bucle de iteraciones
            double[] xAnt = x.clone(); // Guarda valores completos de la vuelta anterior
            for (int i = 0; i < n; i++) { // Calcula cada variable nueva
                double suma = b[i]; // Empieza con el término independiente
                for (int j = 0; j < n; j++) {
                    if (j != i) { // Omite el elemento diagonal
                        suma -= A[i][j] * xAnt[j]; // Usa valores de la iteración anterior
                    }
                }
                x[i] = suma / A[i][i]; // Calcula el nuevo valor
            }
            if (calcularError(xAnt, x) < tol) { // Verifica si cumple la tolerancia
                return x; // Sale al cumplir el criterio
            }
        }
        return x; // Devuelve último valor si no converge antes
    }
}