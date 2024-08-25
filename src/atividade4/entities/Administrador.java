package atividade4.entities;

import atividade3.entities.Empregado;

public class Administrador extends Empregado {

    private double costAllowance;

    public Administrador(String name, String address, String phone, int departmentCode, double baseSalary, double tax, double costAllowance) {
        super(name, address, phone, departmentCode, baseSalary, tax);
        this.costAllowance = costAllowance;
    }

    public double getCostAllowance() {
        return costAllowance;
    }

    public void setCostAllowance(double costAllowance) {
        this.costAllowance = costAllowance;
    }

    @Override
    public double calculateSalary() {
        return super.calculateSalary() + costAllowance;
    }

    @Override
    public String toString() {
        return super.toString() + "\n" +  // Calls the toString method from the Employee class
                "Ajuda de Custo: R$ " + costAllowance + "\n" +
                "Salário Total (incluindo ajuda de custo): R$ " + calculateSalary();
    }
}
