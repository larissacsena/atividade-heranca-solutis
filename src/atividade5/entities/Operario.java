package atividade5.entities;

import atividade3.entities.Empregado;

public class Operario extends Empregado {
    private double productionValue;
    private double commission;

    public Operario(String name, String address, String phone, int departmentCode, double baseSalary, double tax, double productionValue, double commission) {
        super(name, address, phone, departmentCode, baseSalary, tax);
        this.productionValue = productionValue;
        this.commission = commission;
    }

    public double getProductionValue() {
        return productionValue;
    }

    public void setProductionValue(double productionValue) {
        this.productionValue = productionValue;
    }

    public double getCommission() {
        return commission;
    }

    public void setCommission(double commission) {
        this.commission = commission;
    }

    @Override
    public double calculateSalary() {
        return super.calculateSalary() + (productionValue * commission / 100);
    }

    @Override
    public String toString() {
        return super.toString() + "\n" +
                "Valor da Produção: R$ " + productionValue + "\n" +
                "Comissão: " + commission + "%\n" +
                "Salário Total (incluindo comissão): R$ " + calculateSalary();
    }
}
