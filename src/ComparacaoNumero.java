import java.util.Scanner;

public class ComparacaoNumero {
    public static void main(String[] args) {
        Scanner leitura = new Scanner(System.in);

        System.out.println("Digite um número inteiro: ");
        int numero1 = leitura.nextInt();

        System.out.println("Digite um outro número inteiro: ");
        int numero2 = leitura.nextInt();

        if (numero1 == numero2){
            System.out.println("Os números são iguais!");
        } else if (numero1 > numero2) {
            System.out.println("O número " + numero1 + " é maior que " + numero2);
        } else {
            System.out.println("O número " + numero1 + " é menor que " + numero2);
        }
    }
}
