
/**
 * <p>
 * <strong>Projeto Calculadora</strong>
 * </p>
 *
 * <p>
 * Este classe fornece operações matemáticas básicas como soma, subtração,
 * multiplicação e divisão, além de um método principal que seleciona a operação
 * desejada com base em um operador informado pelo usuário.
 * </p>
 * <p>
 * Esse projeto é utilizado para demonstrar:
 * </p>
 * <ul>
 * <li>Técnicas de revisão estática (caixa branca)</li>
 * <li>Técnicas de revisão (caixa branca)</li>
 * <li>Aplicação de refatoração em código Java</li>
 * <li>Documentação com Javadoc</li>
 * </ul>
 * <p>
 * Após a refatoração, os métodos desta classe são <strong>métodos
 * puros</strong>,
 * sem efeitos colaterais, permitindo maior legibilidade e facilitando testes
 * unitários.
 * </p>
 *
 * @author vinicius Motta Santana
 * 
 */

public class Calculadora {

    /**
     * Soma dois números inteiros.
     *
     * @param a primeiro operando
     * @param b segundo operando
     * @return o resultado da soma de {@code a} e {@code b}
     */
    public int somar(int a, int b) {
        return a + b;
    }

    /**
     * Subtrai o segundo número inteiro do primeiro.
     *
     * @param a primeiro operando
     * @param b segundo operando
     * @return o resultado da subtração de {@code b} de {@code a}
     */
    public int subtrair(int a, int b) {
        return a - b;
    }

    /**
     * Multiplica dois números inteiros.
     *
     * @param a primeiro operando
     * @param b segundo operando
     * @return o resultado da multiplicação de {@code a} e {@code b}
     */
    public int multiplicar(int a, int b) {
        return a * b;
    }
 
    /**
     * Divide o primeiro número inteiro pelo segundo.
     *
     * @param a primeiro operando
     * @param b segundo operando
     * @return o resultado da divisão de {@code a} por {@code b}
     * @throws IllegalArgumentException se {@code b} for zero
     */
    public int dividir(int a, int b) {
        if (b == 0) {
            throw new IllegalArgumentException("Divisão por zero não é permitida.");
        }
        return a / b;
    }
 
    /**
     * <p>
     * Executa a operação matemática solicitada com base no operador informado.
     * </p>
     * <p>
     * Operadores aceitos:
     * </p>
     * <ul>
     * <li>"+" -> Soma</li>
     * <li>"-" -> Subtração</li>
     * <li>"*" -> Multiplicação</li>
     * <li>"/" -> Divisão</li>
     * </ul>
     * <p>
     * Qualquer operador inválido resulta em exceção.
     * </p>
     *
     * @param a        O primeiro operando
     * @param b        O segundo operando
     * @param operador O símbolo da operação desejada
     * @return O resultado da operação correspondente ao operador informado
     * @throws IllegalArgumentException Se o operador não for um símbolo válido
     */
    public int calcular(int a, int b, String operador) {
        switch (operador) {
            case "+":
                return somar(a, b);
            case "-":
                return subtrair(a, b);
            case "*":
                return multiplicar(a, b);
            case "/":
                return dividir(a, b);
            default:
                throw new IllegalArgumentException("Operador inválido: " + operador);
        }
    }
}