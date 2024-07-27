package application;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import entities.Employee;

public class PrincipalAula100 {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<Employee> employees = new ArrayList<>();

        System.out.println("How many employees do you have: ");
        int quntityEmployee = sc.nextInt();
        
        int i = 0;
        while(i < quntityEmployee){
            System.out.println("Employee ID: ");
            int id = sc.nextInt();
            // Função lambda, x representa a classe da lista, nesse caso Employee, para todo x tal que x seja id igual id recebido
            if (employees.stream().filter(x -> x.getId() == id).findFirst().orElse(null) != null){
                System.out.println("ID already used, please, type other.");
                continue;
            }
            System.out.println("Name: ");
            String name = sc.next();
            System.out.println("Salary: ");
            float salary = sc.nextFloat();
            Employee employee = new Employee(id, name, salary);
            employees.add(employee);
            i++;
        }
        System.out.println("Employee ID to salary increase: ");
        int idIncrease = sc.nextInt();
        System.out.println("Percent to increase: ");
        float salaryIncrease = sc.nextFloat();
        
        Employee employeeIncrease = employees.stream().filter(x -> x.getId() == idIncrease).findFirst().orElse(null);
        if(employeeIncrease == null){
            System.out.println("Theres have no employee whit this ID");
        }else{
            employeeIncrease.increaseSalary(salaryIncrease);
        }

        employees.stream().forEach(x -> System.out.println(x));

        sc.close();
    }


    

}
