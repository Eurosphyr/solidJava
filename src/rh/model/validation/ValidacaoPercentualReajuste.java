package rh.model.validation;

import java.math.BigDecimal;

import rh.model.entities.Funcionario;
import rh.model.errors.ValidacaoException;

public class ValidacaoPercentualReajuste implements ValidacaoReajuste{
    

    public void validar(Funcionario funcionario, BigDecimal aumento) {
        BigDecimal salarioAtual = funcionario.getSalario();
        BigDecimal percentualReajuste = aumento.divide(salarioAtual);
        if (percentualReajuste.compareTo(new BigDecimal("0.4")) > 0) {
            throw new ValidacaoException("Reajuste não pode ser superior a 40% do salário!");
        }
    }
}
