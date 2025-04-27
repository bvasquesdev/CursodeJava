public class Main{

    public static void main(String[] args) {
        System.out.println("Esse é o Screen Match");
        System.out.println("Filme: King Richard: Criando Campeãs");

        int ano = 2021;
        System.out.println("Ano de lançamento: " + ano);
        boolean incluidoNoPlano = true;
        double notaDoFilme = 8.1;

        //Média calculada pelas 3 notas dadas no filme
        double media = (9.8 + 6.3 + 8.0) / 3;
        System.out.println(media);
        String sinopse;
        sinopse = """
                Filme: King Richard: Criando Campeãs
                Ano de lançamento: 2021
                8.033333333333333
                Filme que conta a história das irmãs Williamss
                """ + ano;
        System.out.println(sinopse);

        int classificacao = (int) (media /2);
        System.out.println(classificacao);
    }
}