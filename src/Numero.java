import java.util.Scanner;

public class Numero {
    public static void main(String[] args) {
        Scanner leitura = new Scanner(System.in);

        System.out.println("Digite um número: ");
        int numero = leitura.nextInt();

        if (numero > 0){
            System.out.println("Número Positivo!");
        } else {
            System.out.println("Número Negativo");
        }
    }
    }
