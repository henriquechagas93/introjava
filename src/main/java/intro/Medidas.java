// 1 - pacote
package intro;

// 2 Referência as bibliotecas

// 3 - Classe
public class Medidas {
    // 3.1 - Atributos - caracteristicas

    // 3.2 - Métodos e funções
    public static void main (String[] args) {

        calcularAreaModoCompacto();
        calcularAreaModoExtenso();

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
}
