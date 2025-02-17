
// Escriba un programa Java para crear un método que tome un número entero como parámetro y produzca una excepción si el número es impar.

import java.util.Scanner;

public class Excepciones1 {
    public static void prueba (int numero) throws Exception{
        if (numero % 2 != 0){
            throw new Exception("El numero es impar");
        }
        
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Ingrese un numero");
        int numero = input.nextInt();
        try {
            prueba(numero);
            System.out.println("El numero es par");
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
