package com.soliva.loans.domain;

public class Customer {

    private Integer age;

    private String cpf;

    private String name;

    private Double income;

    private String location;

    public Customer(Integer age, String cpf, String name, Double income, String location) {
        this.age = age;
        this.cpf = cpf;
        this.name = name;
        this.income = income;
        this.location = location;
    }


    // Método para verificar se a renda do cliente é igual ou menor que um valor
    public boolean isIcomeEqualOrLowerThan(double value) {
        return income <= value;
    }

    // Método para verificar se a renda do cliente é igual ou maior que um valor
    public boolean isIncomeEqualOrGreaterThan(double value) {
        return income >= value;
    }

    // Conceder o empréstimo pessoal se o salário do cliente estiver entre R$ 3000 e R$ 5000
    public boolean isIncomeBetween(double minValue, double maxValue) {
        return income >= minValue && income <= maxValue;
    }

    // Método para verificar se a idade do cliente é menor que um valor
    public boolean isAgeLowerThan(int value) {
        return age < value;
    }

    public boolean isFromLocation(String location) {
        return this.location.equalsIgnoreCase(location);
    }
}
