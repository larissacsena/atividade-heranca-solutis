package atividade4.application;

import atividade4.entities.Administrador;

public class Program {
    public static void main(String[] args) {
        Administrador administrador = new Administrador("Ana Costa", "Avenida das Nações, 789", "1234-5678", 101, 6000.0, 10.0, 800.0);

        System.out.println("\n--- Dados Iniciais ---\n");
        System.out.println(administrador);

        administrador.setBaseSalary(6200.0);
        administrador.setTax(9.0);
        administrador.setCostAllowance(1000.0);

        System.out.println("\n--- Após atualizações ---\n");
        System.out.println(administrador);
    }
}
