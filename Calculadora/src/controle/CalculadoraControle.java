package controle;

import Enums.EnumOperação;

/**
 *
 * @author hugop
 */
public class CalculadoraControle {

    private Double total;

    public CalculadoraControle() {
        total = 0.0;
    }

    public Double realizaoperação(EnumOperação operacao, Double valor) {
        if (operacao.equals(EnumOperação.SOMA)) {
            total += valor;
        } else if (operacao.equals(EnumOperação.DIVISÃO)) {
            total /= valor;
        } else if (operacao.equals(EnumOperação.SUBTRAÇÃO)) {
            total -= valor;
        } else if (operacao.equals(EnumOperação.MULTIPLICAÇÃO)) {
            total *= valor;
        }
        return total;
    }

    public Double getTotal() {
        return this.total;
    }

    public void zerar() {
        total = 0.0;
    }
}
