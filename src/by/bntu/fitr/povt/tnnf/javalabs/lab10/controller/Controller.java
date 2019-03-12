package by.bntu.fitr.povt.tnnf.javalabs.lab10.controller;

import by.bntu.fitr.povt.tnnf.javalabs.lab10.entity.Company;
import by.bntu.fitr.povt.tnnf.javalabs.lab10.entity.Customer;
import by.bntu.fitr.povt.tnnf.javalabs.lab10.entity.Employer;
import by.bntu.fitr.povt.tnnf.javalabs.lab10.logic.Manager;
import by.bntu.fitr.povt.tnnf.javalabs.lab10.view.View;

public class Controller {
    public static void main(String[] args) {
        Company company = new Company("OurCompany");
        Customer customer = new Customer();
        company.addEmployer( new Employer("Loshic", 150, "Cleaner", 20, 3));
        company.addEmployer( new Employer("Tereshko", 300, "Manager", 30, 5));
        company.addEmployer(new Employer("Ivanov", 250, "Employer", 40, 5));
        company.addEmployer(new Employer("Sidorov", 0, "designer", 38, 10));
        company.addEmployer( new Employer("Polochenko", 130, "Economist", 25, 2));

        double allSalary = Manager.calculateCommonSalary(company);
        double middleSalary = Manager.calculateMiddleSalary(company);
        System.out.println(company.statAboutEmpSalary.getLine(2));
        View.print(company.masOfEmployers[2].stayFriend() + "\n");
        View.print("");
        int task = customer.giveCustoms();
        View.print("You need to do this task: " + task + "\n");
        company.masOfEmployers[0].makeFail();
        View.print("Our customer do review to our job: " + customer.doReview(middleSalary) + "\n");
        View.print("Employer 5 give a bonus " + company.doBonus(company.masOfEmployers[4]) + "\n");

        View.print("\nAll salary of employers = " + allSalary);
    }
}
