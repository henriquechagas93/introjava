// 1 - pacote
package intro;

// 2 Referência as bibliotecas


import java.util.Scanner;

// 3 - Classe
public class Medidas {
    // 3.1 - Atributos - caracteristicas

    // 3.2 - Métodos e funções
    public static void main(String[] args){
        // Condicional = verificar uma condição - Fazer uma pergunta para uma pessoa, hardware ou software

        // utilizar a classe scanner do java para ler a escolha do usuário no console
        Scanner scanner = new Scanner(System.in);
        System.out.println("M E N U   D E   O P Ç Õ E S");
        System.out.println("c - calcular Area Modo Curto");
        System.out.println("d - Contar ate Dez");
        System.out.println("e - calcular Area Modo Extenso");
        System.out.println("i - If Simples");
        System.out.println("r - Contagem Regressiva de 10 a 0");
        System.out.println("Digite a opção desejada");
        String opcao = scanner.next();

        // switch = selecionar o comportamento do programa conforme a escolha da pessoa ou software

       // String opcao = "outro";

        switch (opcao){
            case "c":
            case "C":
                System.out.println("Voçê escolheu executar o método calcularAreaModoCompacto");
                calcularAreaModoCompacto();
                break;
            case "d":
            case "D":
                System.out.println("Voçê escolheu o método ContarAte10");
                contarAteDez();
                break;
            case "e":
            case "E":
                System.out.println("Voçê escolheu executar o método calcularAreaModoExtenso");
                calcularAreaModoExtenso();
                break;
            case "i":
            case "I":
                System.out.println("Voçê escolheu executar o método ifSimples");
                ifSimples();
                break;
            case "r":
            case "R":
                System.out.println("Voçê escolheu Executar o método contagemRegressiva");
                contagemRegressiva();
                break;
            default:
                System.out.println("Voçê escolheu outro valor que não tem uma ação associada");
                break;
        }

    }

    public static void ifSimples (){
        // Condicional = verificar uma condição - Fazer uma pergunta para uma pessoa, hardware ou software

        // if = se
        // else = senão

        String modo = "compacto";

        if (modo == "compacto"){
            calcularAreaModoCompacto();
        }
        else {
            calcularAreaModoExtenso();
        }
    }

    public static void calcularAreaModoExtenso(){
            System. out.println("Calculo de Areas Modo Extenso");

        // Calculo de área - Exemplo: o tamanho do tapete ou piso
        int largura;
        int comprimento;
        int resultado;

        largura = 5; // largura recebe 4
        comprimento = 6;

        resultado = largura * comprimento;
        System.out.println(" Para largura de " + largura + "m e o comprimento de "
                + comprimento + "m a área e de " + resultado + "m2");
    }
    public static void calcularAreaModoCompacto(){
            System. out.println("Calculo de Areas Modo Compacto");

            // calculo de área - reduzido
            int largura = 4;
            int comprimento = 3;

            System.out.println("Para a largura de " + largura + "m e o comprimento de "
                    + comprimento + "m a área e de " + largura * comprimento + "m2");
    }
    public static void contarAteDez(){

        // loops ou Repetições
        // for = repetição incondicional
        System.out.println("Contagem Crescente");

        for (int numero = 1; numero <= 10; numero++){
            System.out.println(numero);
        }
    }

    public static void contagemRegressiva(){
        System.out.println("Contagem Regressiva");

        for (int numero = 10; numero > -1; numero--){
            System.out.println(numero);
        }
    }
}
