package atividade3.entities;

import atividade1.entities.Pessoa;

public class Empregado extends Pessoa {
    private int departmentCode;
    private double baseSalary;
    private double tax;

    public Empregado(String name, String address, String phone, int departmentCode, double baseSalary, double tax) {
        super(name, address, phone);
        this.departmentCode = departmentCode;
        this.baseSalary = baseSalary;
        this.tax = tax;
    }

    public int getDepartmentCode() {
        return departmentCode;
    }

    public void setDepartmentCode(int departmentCode) {
        this.departmentCode = departmentCode;
    }

    public double getBaseSalary() {
        return baseSalary;
    }

    public void setBaseSalary(double baseSalary) {
        this.baseSalary = baseSalary;
    }

    public double getTax() {
        return tax;
    }

    public void setTax(double tax) {
        this.tax = tax;
    }

    public double calculateSalary() {
        return baseSalary - (baseSalary * tax / 100);
    }

    @Override
    public String toString() {
        return super.toString() + "\n" + "Código do Setor: " + departmentCode + "\n" + "Salário Base: R$ " + baseSalary + "\n" + "Imposto: " + tax + "%\n" + "Salário Líquido: R$ " + calculateSalary();
    }
}
