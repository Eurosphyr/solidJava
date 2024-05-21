/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package solidjava;

import java.math.BigDecimal;

import rh.model.Cargo;
import rh.model.Funcionario;



/**
 *
 * @author ra2257078
 */
public class SolidJava {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

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


    }
    
}
