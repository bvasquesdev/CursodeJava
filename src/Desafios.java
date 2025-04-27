public class Desafios {
    public static void main(String[] args){
        double nota1 = 7.0;
        double nota2 = 8.5;
        double media = (nota1 + nota2) / 2;

        System.out.println("Média " + media);

        double num1 = 8.6;
        int numInteiro = (int) num1;
        System.out.println("Casting de double para int: " + numInteiro);

        char letra = 'A';
        String palavra = "MARELO";
        String mensagem = "A letra é " + letra + " e a palavra é " + palavra;
        System.out.println(mensagem);

        double precoProduto = 70;
        int quantidade = 2;
        double resultado = precoProduto * quantidade;
        String valor = "O valor total da compra é R$" + resultado;
        System.out.println(valor);

        double valorEmDolares = 100.5;
        double taxaDeConversao = 4.94;

        double valorEmReais = valorEmDolares * taxaDeConversao;
        System.out.println("O valor em reais é: " + valorEmReais);

        double precoOriginal = 50.99;
        double percentualDesconto = 10.0;
        double valorDesconto = (percentualDesconto / 100.0) * precoOriginal;
        double novoPreco = precoOriginal - valorDesconto;

        System.out.println("Preço original: R$" + precoOriginal);
        System.out.println("Desconto: R$" + valorDesconto);
        System.out.println("Novo preço com desconto R$:" + novoPreco);
    }
}