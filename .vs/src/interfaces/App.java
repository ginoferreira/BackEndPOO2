package interfaces;

import java.util.ArrayList;

import model.Agendamento;
import model.Camareira;
import model.Cliente;
import model.EnumTipo;
import model.Gerente;
import model.Quarto;
import model.Recepcionista;

public class App {

    public static void main(String[] args) {
        System.out.println("Hotel Java");
        System.out.println();
        
        Cliente cliente1 = new Cliente("Manoel da Silva", "219999998888", "122345678901");
        
        Recepcionista recepcionista1 = new Recepcionista("Valeria", "21977778877", "98765432101");

        recepcionista1.atenderOTelefone();
        recepcionista1.falarIngles();

        Camareira camareira1 = new Camareira("Joana", "21977883322", "12345678902");

        camareira1.arrumarACama();
        camareira1.LimparQuarto();

        // Deu uma dor de barriga na Valéria
        Gerente gerente1 = new Gerente("Fabrício", "21988775522", "98765432102");

        gerente1.atenderOTelefone();
        gerente1.falarIngles();
        gerente1.arrumarACama();
        gerente1.LimparQuarto();

        Quarto quarto1 = new Quarto();
        quarto1.setNumero("206A");
        quarto1.setValor(100.0);
        quarto1.setTipo(EnumTipo.BASICO);

        Quarto quarto2 = new Quarto();
        quarto2.setNumero("206A");
        quarto2.setValor(100.0);
        quarto2.setTipo(EnumTipo.PRESEDENCIAL);
        
        System.out.println(quarto2.getValor());
        System.out.println(quarto2.getTipo().getValor());

    }
    
}



Cliente cliente1 = new Cliente("Manoel da Silva", "219999998888", "122345678901", 42);
Cliente cliente2 = new Cliente("Fulano de Tal", "219999998887", "122345678902", 21);
Cliente cliente3 = new Cliente("Ciclano Rodrigues", "219999998885", "122345678903", 36);
Cliente cliente4 = new Cliente("Beltrano Rodrigues", "219999998888", "122345678901", 56);

ArrayList<Cliente> clientes = new ArrayList<Cliente>();

clientes.add(cliente1); // 0
clientes.add(cliente2); // 1
clientes.add(cliente3); // 2
clientes.add(cliente4); // 3

// Retorna a qauntidade de elementos presentes em um stream.
clientes.stream().count();
clientes.size();

clientes.stream()
.limit(2)
.forEach(c -> System.out.println(c.getNome())); 

clientes.stream()
.skip(2)
.forEach(c -> System.out.println(c.getNome()));



    


// var rsultado3 = clientes.stream().sorted();

// clientes.stream().sorted(comparing(Cliente::getIdade));

clientes.stream()
.filter(c -> c.getIdade() > 25)
.forEach(c -> System.out.println(c.getNome()));

System.out.println();
System.out.println();

clientes.stream()
.filter(c -> c.getNome().contains("Rodrigues"))
.forEach(c -> System.out.println(c.getNome()));

clientes.stream()
.filter(c -> c.getNome().startsWith("B"))
.forEach(c -> System.out.println(c.getNome()));

    clientes.stream().map(c -> c.getNome());

    clientes.stream().map(Cliente::getNome);

    Agendamento agendamento1 = new Agendamento(camareira1);
    Agendamento agendamento2 = new Agendamento(gerente1);
    


    }


}