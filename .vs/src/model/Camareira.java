package model;

import interfaces.ICamareira;
import model.utils.Pessoa;

public class Camareira extends Pessoa implements ICamareira {

    public Camareira(String nome, String telefone, String cpf) {
        super(nome, telefone, cpf);
      
    }

    @Override
    public void arrumarACama() {
        System.out.println("Sei muito bem arrumar a cama");
        System.out.println();

        
    }

    @Override
    public void LimparQuarto() {
        System.out.println("Sei muito bem limpar o quarto");
        System.out.println();
      
        
    }
    
}
