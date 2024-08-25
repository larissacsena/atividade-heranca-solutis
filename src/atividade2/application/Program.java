package atividade2.application;

import atividade2.entities.Fornecedor;

public class Program {
    public static void main(String[] args) {
        Fornecedor supplier = new Fornecedor("Empresa X", "Rua A, 123", "1234-5678", 50000.0, 15000.0);

        System.out.println("\n--- Dados Iniciais ---\n");
        System.out.println(supplier);

        supplier.setDebtAmount(20000.0);
        supplier.setCreditAmount(60000.0);

        System.out.println("\n--- Dados Atualizados ---\n");
        System.out.println(supplier);
    }
}
