package atividade3.application;

import atividade3.entities.Empregado;

public class Program {
    public static void main(String[] args) {
        Empregado empregado = new Empregado("João Silva", "Av. Central, 500", "9876-5432", 101, 3000.0, 15.0);

        System.out.println("\n--- Dados Iniciais ---\n");
        System.out.println(empregado);

        empregado.setBaseSalary(3500.0);
        empregado.setTax(18.0);

        System.out.println("\n--- Após atualizações ---\n");
        System.out.println(empregado);
    }
}
