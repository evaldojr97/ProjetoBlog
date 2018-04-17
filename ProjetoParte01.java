package projetoparte01;

import java.io.IOException;
import java.util.Scanner;

public class ProjetoParte01 {

    public static void main(String[] args) throws IOException {
        //Declarando variaveis
        Scanner entrada = new Scanner(System.in);
        int cod;
        int soma, sub, div, n1, n2;
        int quantP, idade, mediaIdade, somaIdade = 0, idadeM = 0, idadeF = 0;
        int mediaIdadeM, mediaIdadeF, contM = 0, contF = 0;
        char sexo;
        //Estrutura de repetição para apresentar o menu e suas operações relacionadas
        do {
            //Apresentando ao usuario as opções do menu
            System.out.println("--------------------------------------------------------------------");
            System.out.println("Escolha um dos numeros abaixo para realizar as seguintes operações: ");
            System.out.println("1. Soma");
            System.out.println("2. Subtração");
            System.out.println("3. Divisão");
            System.out.println("4. Faixa etária");
            System.out.println("5. Números primos");
            System.out.println("6. Mudança de Base");
            System.out.println("7. Sair");
            System.out.println("--------------------------------------------------------------------");
            //Requisitando ao usuario que escolha um numero correspondente a alguma operação do menu
            System.out.println("Digite o numero correspondente a operação: ");
            cod = entrada.nextInt();
            System.out.println("--------------------------------------------------------------------");
            //Estrutura condicional para se escolher e realizar alguma das operações presentes no menu
            switch (cod) {
                //Opção do menu para realizar a soma
                case 1:
                    System.out.println("\\\\Soma////");
                    //Requisita ao usuario os valores para "n1" e "n2"
                    System.out.println("Digite um numero para realizar a soma: ");
                    n1 = entrada.nextInt();
                    System.out.println("Digite outro numero: ");
                    n2 = entrada.nextInt();
                    //Realiza a soma de "n1" e "n2", guardando o resultado na variavel "soma"
                    soma = n1 + n2;
                    //Apresenta o resultado para o usuario
                    System.out.println("A soma de " + n1 + " + " + n2 + " é: " + soma);
                    break;
                //Opção do menu para realizar a subtração
                case 2:
                    System.out.println("\\\\Subtração////");
                    //Requisita ao usuario os valores para "n1" e "n2"
                    System.out.println("Digite um numero para realizar a subtração: ");
                    n1 = entrada.nextInt();
                    System.out.println("Digite outro numero: ");
                    n2 = entrada.nextInt();
                    //Realiza a subtração de "n1" e "n2", guardando o resultado na variavel "sub"
                    sub = n1 - n2;
                    //Apresenta o resultado para o usuario
                    System.out.println("A subtração de " + n1 + " - " + n2 + " é: " + sub);
                    break;
                //Opção do menu para realizar a divisão
                case 3:
                    System.out.println("\\\\Divisão////");
                    //Requisita ao usuario os valores para "n1" e "n2"
                    System.out.println("Digite um numero para realizar a divisão: ");
                    n1 = entrada.nextInt();
                    System.out.println("Digite outro numero: ");
                    n2 = entrada.nextInt();
                    //Realiza a divisão de "n1" e "n2", guardando o resultado na variavel "div"
                    div = n1 / n2;
                    //Apresenta o resultado para o usuario
                    System.out.println("A divisão de " + n1 + " / " + n2 + " é: " + div);
                    break;
                //Opção do menu para realizar os calculos da faixa etária
                case 4:
                    System.out.println("\\\\Faixa etária////");
                    System.out.println("-> Digite a quantidade de pessoas: ");
                    //Requisita ao usuario a quantidade de pessoas
                    quantP = entrada.nextInt();
                    //Estrutura de repetição para executar enquanto o valor em "h" for menor que...
                    //...o numero de pessoas informado anteriormente
                    for (int h = 0; h < quantP; h++) {
                        System.out.print("-> Digite a idade: ");
                        //Requisita ao usuario a idade da pessoa
                        idade = entrada.nextInt();
                        //Realiza a soma de todas idades
                        somaIdade = idade + somaIdade;
                        System.out.println("-> Digite 'm' para sexo masculino ou 'f' para feminino: ");
                        //Requisita ao usuario o sexo da pessoa
                        sexo = (char) System.in.read();
                        //Realiza a operação e apresenta a media das idades informadas de cada sexo
                        //Se o valor em "sexo" for igual a "m" 
                        if (sexo == 'm') {
                            //idadeM recebe idade e soma com o valor ja guardado em idadeM
                            idadeM = idade + idadeM;
                            //Incrementa mais um valor a variavel contadora "contM" a cada vez que sexo for igual a "m"
                            contM++;
                        } //Se o valor em "sexo" for igual a "f" 
                        else if (sexo == 'f') {
                            //idadeF recebe idade e soma com o valor ja guardado em idadeF
                            idadeF = idade + idadeF;
                            //Incrementa mais um valor a variavel contadora "contF" a cada vez que sexo for igual a "f"
                            contF++;
                        }
                    }
                    //Realiza o calculo da media das idades referentes a cada sexo                    
                    mediaIdadeM = idadeM / contM;
                    mediaIdadeF = idadeF / contF;
                    //Apresenta para o usuario a media das idades referentes a cada sexo
                    System.out.println("-> A média das idades do sexo masculino : " + mediaIdadeM);
                    System.out.println("-> A média das idades do sexo feminino : " + mediaIdadeF);

                    //Realiza a operação e apresenta a media de todas as idades informadas
                    System.out.println("-> A soma das idades: " + somaIdade);
                    mediaIdade = somaIdade / quantP;
                    System.out.println("-> A média da(s) idade(s) desta(s) pessoa(s) é(são): " + mediaIdade);
                    break;
                //Opção do menu para calcular a soma dos numeros primos
                case 5:
                    System.out.println("\\\\Números primos////");                    
                    //Declarando mais variaveis
                    int sprimo = 0;
                    int num;
                    System.out.println("Informe um numero: ");
                    //Requisita ao usuario um numero inteiro para a variavel "num"
                    num = entrada.nextInt();
                    //Estrutura de repetição para verificar todos os números entre 1 e o valor informado
                    for (int j = 1; j <= num; j++) {
                        int cont = 0;
                        //Estrutura de repetição para verificar os numeros que são primos
                        for (int i = 1; i <= num; i++) {
                            if (j % i == 0) {
                                cont++;
                            }
                        }
                        //Realiza a soma de todos os numeros primos
                        if (cont == 2) {
                            sprimo = sprimo + j;
                        }
                    }
                    //Apresenta ao usuario a soma dos numeros primos 
                    System.out.println("A soma dos números primos entre 1 e " + num + " é: " + sprimo);
                    break;
                //Opção do menu para realizar a conversão de bases binario e decimal
                case 6:
                    System.out.println("\\\\Mudança de Base////");
                    System.out.println("Digite '1' para binario e '2' para decimal: ");
                    //Declarando mais variaveis
                    int dec,d1 = 0,mod;
                    //Requisita ao usuario um numero,'1' para binario e '2' para decimal  
                    int bindec = entrada.nextInt();
                    switch (bindec) {
                        case 1:
                            System.out.println("Digite um numero em binario: ");
                            //Requisita ao usuario um numero em binario
                            String ler = entrada.next();
                            //Declarando mais variaveis
                            int pot = 0;
                            int decimal = 0;
                            for (int i = ler.length() - 1; i >= 0; i--) {
                                decimal += Math.pow(2, pot) * Character.getNumericValue(ler.charAt(i));
                                //Incrementa mais 1 a variavel "pot"
                                pot++;
                            }
                            //Apresenta ao usuario o numero em decimal
                            System.out.println("A representação em decimal é: " + decimal);
                            break;
                        case 2:
                            String bin1 = "";
                            System.out.println("Digite um numero em decimal: ");
                            //Requisita ao usuario um numero em decimal
                            dec = entrada.nextInt();
                            //Enquanto o numero informado em "dec" for maior que 0
                            while (dec > 0) {
                                //Realiza as operações
                                mod = (dec % 2);
                                bin1 = mod + bin1;
                                dec = dec / 2;
                            }
                            //Apresenta ao usuario o numero em binario
                            System.out.println("A representação em binario é: " + bin1);
                    }
                    break;
            }
            //Apenas quando o valor informado na variavel "cod" for "7", o programa ira finalizar 
        } while (cod != 7);
        System.out.println("Saiu do programa com sucesso! :)");
    }
}