package rh.model.validation;

import java.math.BigDecimal;

import rh.model.entities.Funcionario;

public interface ValidacaoReajuste {
    void validar(Funcionario funcionario, BigDecimal aumento);
}
