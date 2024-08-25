package atividade2.entities;

import atividade1.entities.Pessoa;

public class Fornecedor extends Pessoa {
    private double creditAmount;
    private double debtAmount;

    public Fornecedor(String name, String phone, double creditAmount, double debtAmount) {
        super(name, phone);
        this.creditAmount = creditAmount;
        this.debtAmount = debtAmount;
    }

    public Fornecedor(String name, String address, String phone, double creditAmount, double debtAmount) {
        super(name, address, phone);
        this.creditAmount = creditAmount;
        this.debtAmount = debtAmount;
    }

    public double getCreditAmount() {
        return creditAmount;
    }

    public void setCreditAmount(double creditAmount) {
        this.creditAmount = creditAmount;
    }

    public double getDebtAmount() {
        return debtAmount;
    }

    public void setDebtAmount(double debtAmount) {
        this.debtAmount = debtAmount;
    }

    public double getBalance() {
        return creditAmount - debtAmount;
    }

    @Override
    public String toString() {
        return super.toString() + "\n" +
                "Valor de Crédito: R$ " + creditAmount + "\n" +
                "Valor de Dívida: R$ " + debtAmount + "\n" +
                "Saldo: R$ " + getBalance();
    }
}
