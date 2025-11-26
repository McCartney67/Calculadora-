/**
 * Classe de teste para a calculadora.
 * 
 * Esta classe contém testes unitários para validar o funcionamento da classe Calculadora.
 * Testa operações matemáticas básicas (adição, subtração e divisão) e também valida
 * o tratamento de exceções para casos de erro, como divisão por zero e operadores inválidos.
 * 
 * @author Vinicius Motta Santana
 */
public class TesteCalculadora {

    /**
     * Método principal que executa os testes da calculadora.
     * 
     * Realiza os seguintes testes:
     * - Adição: 2 + 3
     * - Subtração: 10 - 4
     * - Adição: 3 + 5
     * - Divisão: 8 / 2
     * - Divisão por zero: 8 / 0 (deve lançar exceção)
     * - Operador inválido: 5 x 5 (deve lançar exceção)
     * 
     * As exceções são capturadas e exibidas na saída padrão.
     * 
     * @param args argumentos de linha de comando (não utilizados)
     */
    public static void main(String[] args) {
        Calculadora calc = new Calculadora();
        
        System.out.println(calc.calcular(2, 3, "+"));
        System.out.println(calc.calcular(10, 4, "-"));
        System.out.println(calc.calcular(3, 5, "+"));
        System.out.println(calc.calcular(8, 2, "/"));

        try {
            System.out.println(calc.calcular(8, 0, "/")); // exceção
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }

        try {
            System.out.println(calc.calcular(5, 5, "x")); // exceção
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }
    }
}