public class Operacion {

    public int sumar(int a, int b) {
        if (a < 0 || b < 0) {
            System.out.println("No se puede sumar numeros negativos");
            return -1;
        }
        return a + b;
    }

    public double sumar(double a, double b) {
        return a + b;
    }

    public int sumar(int a, int b, int c) {
        return a + b + c;
    }

    public long sumar(int a, long b) {
        return a + b;
    }

    public long sumar(long a, int b) {
        return a + b;
    }

    public void sumar() {

    }

    public void imprimirNumerosImpares(int a) {
        if (a % 2 == 1) {
            System.out.println("El número es impar: " + a);
        }
        a--;
        if (a > 0) {
            imprimirNumerosImpares(a);
        }
    }

}
