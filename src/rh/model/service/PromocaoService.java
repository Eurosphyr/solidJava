package rh.model.service;

import rh.model.entities.Cargo;
import rh.model.entities.Funcionario;

public class PromocaoService {
        
        public void promover(Funcionario funcionario, boolean metaBatida) {
            Cargo cargoAtual = funcionario.getCargo();
            if (Cargo.GERENTE == cargoAtual) {
                throw new IllegalArgumentException("Gerentes não podem ser promovidos!");
            }
            
            if (metaBatida) {
                Cargo novoCargo = cargoAtual.getProximoCargo();
                funcionario.promover(novoCargo);
            } else {
                throw new IllegalArgumentException("Funcionário não bateu a meta!");
            }
        }
}
