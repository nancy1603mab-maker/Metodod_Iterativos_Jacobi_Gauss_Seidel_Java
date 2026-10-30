# Práctica: Métodos Iterativos Jacobi y Gauss‑Seidel
Implementación modular en Java para resolver sistemas de ecuaciones lineales.

## Estructura
- "Ecuaciones_lineales/Jacobi/MetodoJacobi.java" → Lógica del método Jacobi y función para calcular el error
- "Ecuaciones_lineales/Gauss_Seidel/MetodoGaussSeidel.java" → Lógica de Gauss‑Seidel (reutiliza el cálculo de error)
- "Main.java" → Clase principal para ejecutar y mostrar resultados

## EcuacionLineal
5x + y + z = 7
x + 4y + z = 6
x + 2y + 5z = 8
Vector inicial: [0, 0, 0]
Tolerancia: 0.0001

## Cómo ejecutar
- Abre el proyecto Ecuaciones_lineales/Jacobi/MetodoJacobi.java y Ecuaciones_lineales/Gauss_Seidel/MetodoGaussSeidel.java
- Ejecuta solo el archivo `Main.java`
No ejecutes las otras clases, no tienen método main.

## Nota
Gauss‑Seidel converge más rápido que Jacobi porque usa valores nuevos dentro de la misma iteración.
