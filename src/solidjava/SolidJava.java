package solidjava;

import java.math.BigDecimal;

import rh.model.entities.Cargo;
import rh.model.entities.Funcionario;

public class SolidJava {
    public static void main(String[] args) {

        Funcionario f = new Funcionario("João", "123456789", Cargo.ASSISTENTE, new BigDecimal("1000.0"));
        System.out.println(f.getNome());
        System.out.println(f.getCpf());
        System.out.println(f.getCargo());
        System.out.println(f.getSalario());
        System.out.println(f.getDataUltimoReajuste());
        System.out.println("Atualizando salário...");
        f.atualizarSalario(new BigDecimal("1500.0"));
        System.out.println(f.getSalario());
        System.out.println(f.getDataUltimoReajuste());
        System.out.println("Promovendo...");
        f.promover(Cargo.GERENTE);
        System.out.println(f.getCargo());
    }

}
