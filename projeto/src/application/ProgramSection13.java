package application;

import entities.Account;
import entities.BusinessAccount;
import entities.SavingAccount;

public class ProgramSection13 {

    
    
    public static void main(String[] args) {
        Account acc = new Account(2020, "Alice", 0.0);
        BusinessAccount bacc = new BusinessAccount(2025, "Rodrigo", 2000.00, 1500.00);
    
        //Upcasting
        Account acc1 = bacc;
        Account acc2 = new BusinessAccount(3000, "Raul Seixas", 3333333, 50000);
        Account acc3 = new SavingAccount(3665, "Tim maia", 30000, 3.0);

        //Downcasting

        BusinessAccount acc4 = (BusinessAccount)acc2;
        acc4.setLoanLimit(300);
        acc4.loan(200);
        
        // Errado: BusinessAccount acc5 = (BusinessAccount)acc3;
        // Pois acc3 é do tipo Saving account, para evitar esse erro fazer do jeito a seguir
        if (acc3 instanceof BusinessAccount){
            BusinessAccount acc5 = (BusinessAccount)acc3;
            acc5.setLoanLimit(2000);
            acc5.loan(2000);
            System.out.println("Valor final: " + acc5.getBalance());
        }
        if (acc3 instanceof SavingAccount){
            SavingAccount acc5 = (SavingAccount)acc3;
            acc5.updateBalance();
            System.out.println("Valor final: " + acc5.getBalance());
        }
        
    }
}
