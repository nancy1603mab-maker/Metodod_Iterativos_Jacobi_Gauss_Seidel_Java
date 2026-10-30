// Importa las clases de cada paquete
import Ecuaciones_Lineales_Jacobi.MetodoJacobi;
import Ecuaciones_lineales.Gauss_Seidel.MetodoGaussSeidel;

public class Main {
    public static void main(String[] args) {
        // Matriz de coeficientes del sistema
        double[][] A = {
                {5, 1, 1},
                {1, 4, 1},
                {1, 2, 5}
        };
        // Vector de términos independientes
        double[] b = {7, 6, 8};
        // Vector inicial x⁰ = [0, 0, 0]
        double[] x0 = {0, 0, 0};
        double tol = 0.0001; // Tolerancia de error
        int maxIter = 100; // Límite de iteraciones

        // Ejecuta método Jacobi
        double[] resJacobi = MetodoJacobi.jacobi(A, b, x0, tol, maxIter);
        // Ejecuta método Gauss‑Seidel
        double[] resGS = MetodoGaussSeidel.gaussSeidel(A, b, x0, tol, maxIter);

        // Muestra resultado de Jacobi
        System.out.println("Resultado Jacobi:");
        System.out.printf("x = %.6f, y = %.6f, z = %.6f%n", resJacobi[0], resJacobi[1], resJacobi[2]);
        // Muestra resultado de Gauss‑Seidel
        System.out.println("Resultado Gauss‑Seidel:");
        System.out.printf("x = %.6f, y = %.6f, z = %.6f%n", resGS[0], resGS[1], resGS[2]);
    }
}
