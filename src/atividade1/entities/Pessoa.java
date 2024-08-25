package atividade1.entities;

public class Pessoa {
    private String name;
    private String address;
    private String phone;

    public Pessoa(String name, String phone) {
        this.name = name;
        this.phone = phone;
    }

    public Pessoa(String name, String address, String phone) {
        this.name = name;
        this.address = address;
        this.phone = phone;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    @Override
    public String toString() {
        return "Nome: " + name + "\n" +
                "Endereço: " + address + "\n" +
                "Telefone: " + phone;
    }
}
