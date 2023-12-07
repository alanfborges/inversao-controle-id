package com.alandev.services;

import com.alandev.entities.Employee;

public class SalaryService {

    private TaxServices taxServices;
    private PensionService pensionService;

    public SalaryService(TaxServices taxServices, PensionService pensionService) {
        this.taxServices = taxServices;
        this.pensionService = pensionService;
    }

    public double netSalary(Employee employee) {
        return employee.getGrossSalary() - taxServices.tax(employee.getGrossSalary())
                - pensionService.discount(employee.getGrossSalary());
    }
}
