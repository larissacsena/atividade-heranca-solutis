package atividade5.application;

import atividade5.entities.Operario;

public class Program {
    public static void main(String[] args) {

        Operario operario = new Operario("Carlos Silva", "Rua das Palmeiras, 456", "9876-5432", 303, 4000.0, 8.0, 15000.0, 5.0);

        System.out.println("\n--- Dados Iniciais ---\n");
        System.out.println(operario);

        operario.setBaseSalary(4200.0);
        operario.setTax(7.0);
        operario.setProductionValue(16000.0);
        operario.setCommission(6.0);

        System.out.println("\n--- Após atualizações ---\n");
        System.out.println(operario);
    }
}
