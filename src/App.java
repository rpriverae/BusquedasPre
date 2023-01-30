import java.util.Scanner;

public class App {

    public static void main(String[] args) throws Exception {

        Scanner sc = new Scanner(System.in);

        System.out.println("Ingresa cuantos elementos tendrá tu arreglo: ");
        int t = sc.nextInt();

        int[] arreglo = new int[t];

        for (int i=0; i<arreglo.length; i++) {
            System.out.println("Ingresa en cada posición: ");
            arreglo[i] = sc.nextInt();
        }

        System.out.println("Tu arreglo ingresado: ");

        for (int j=0; j<arreglo.length; j++) {
            System.out.println(arreglo[j]);
        }

        int valor = 6;
        int menor = 0;
        int mitad;
        int mayor = t-1;

        while (menor <= mayor) {
            mitad = (mayor + menor)/2;

            if (arreglo[mitad] == valor) {
                System.out.println("El numero se encuentra en la posición: "+mitad);
                break;
            } else if (valor < arreglo[mitad]) {
                mayor = mitad - 1;
            } else {
                menor = mitad + 1;
            }
        }
        
    }
}
