package model;

import interfaces.ICamareira;
import interfaces.IRecepcionista;
import model.utils.Pessoa;

public class Gerente extends Pessoa implements ICamareira, IRecepcionista {

    public Gerente(String nome, String telefone, String cpf) {
        super(nome, telefone, cpf);
    }

    @Override
    public void atenderOTelefone() {
        System.out.println("Sei atender o telefone mais ou menos");
        System.out.println();
        
        
    }

    
    @Override
    public void falarIngles() {
        System.out.println("Sei falar muito bem o ingles");
        System.out.println();
        
        
    }

    @Override
    public void arrumarACama() {
        System.out.println("Sei muito bem arrumar a cama");
        System.out.println();

        
    }

    @Override
    public void LimparQuarto() {
        System.out.println("Sei limpar o quarto mais ou menos");
        System.out.println();
      
        
    }

     
    
}
