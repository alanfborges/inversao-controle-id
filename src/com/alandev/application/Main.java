package com.alandev.application;

import com.alandev.entities.Employee;
import com.alandev.services.BrazilTaxService;
import com.alandev.services.PensionService;
import com.alandev.services.SalaryService;
import com.alandev.services.TaxServices;

import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Nome: ");
        String nome = sc.nextLine();
        System.out.print("Salário bruto: ");
        Double grossSalary = sc.nextDouble();

        TaxServices taxServices = new BrazilTaxService();
        PensionService pensionService = new PensionService();
        Employee employee = new Employee(nome, grossSalary);
        SalaryService salaryService = new SalaryService(taxServices, pensionService);

        double netSalary = salaryService.netSalary(employee);

        System.out.printf("Salário liquído = %.2f%n", netSalary);
    }
}