
package Ecuaciones_lineales.Gauss_Seidel;
// Reutiliza la función de error de la clase Jacobi
import static Ecuaciones_Lineales_Jacobi.MetodoJacobi.calcularError;

public class MetodoGaussSeidel {
    public static double[] gaussSeidel(double[][] A, double[] b,
                                       double[] xInicial, double tol, int maxIter) {
        int n = xInicial.length; // Número de variables
        double[] x = xInicial.clone(); // Vector que se va actualizando
        for (int iter = 0; iter < maxIter; iter++) { // Bucle principal
            double[] xAnt = x.clone(); // Guarda el estado antes de empezar la vuelta
            for (int i = 0; i < n; i++) {
                double suma = b[i]; // Empieza con el término independiente
                for (int j = 0; j < n; j++) {
                    if (j != i) {
                        suma -= A[i][j] * x[j]; // Usa valores ya nuevos de esta misma vuelta
                    }
                }
                x[i] = suma / A[i][i]; // Actualiza inmediatamente
            }
            if (calcularError(xAnt, x) < tol) { // Comprueba tolerancia
                return x;
            }
        }
        return x; // Último resultado si no converge
    }
}
