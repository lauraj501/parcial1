import java.util.Scanner;
public class logica {

    public static int contarVocales(String cadena) {
        String vocales = "aeiou";
        int contador = 0;

        for (int i = 0; i < cadena.length(); i++) {
            char caracter = cadena.charAt(i);
            if (vocales.indexOf(caracter) != -1) { 
                contador++;
            }
        }

        return contador;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Introduce una cadena de texto: ");
        String cadena = scanner.nextLine();
        System.out.println("El número de vocales en la cadena es: " + contarVocales(cadena));
        scanner.close();
    }
}
