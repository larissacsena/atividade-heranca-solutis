package atividade6.program;

import atividade6.entities.Vendedor;

public class Program {
    public static void main(String[] args) {
        Vendedor vendedor = new Vendedor("João Pereira", "Rua das Acácias, 123", "3210-9876", 202, 5000.0, 7.0, 20000.0, 5.0);

        System.out.println("\n--- Dados Iniciais ---\n");
        System.out.println(vendedor);

        vendedor.setBaseSalary(5200.0);
        vendedor.setTax(6.0);
        vendedor.setSalesValue(22000.0);
        vendedor.setCommission(6.0);

        System.out.println("\n--- Após atualizações ---\n");
        System.out.println(vendedor);
    }
}
