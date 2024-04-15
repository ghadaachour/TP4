/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package exercice1;

/**
 *
 * @author GHADA
 */
public class exercice1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
      // Exemple de conversions explicites des références
BankAccount account = new SaveAccount(201, 3.5,12.0);
SaveAccount saveAccount = (SaveAccount) account;
System.out.println("Conversion explicite réussie : " + (saveAccount != null));
BankAccount anotherAccount = new CheckAccount(202, 1000.0,15.2);
CheckAccount checkAccount = (CheckAccount) anotherAccount;
System.out.println("Conversion explicite réussie : " + (checkAccount != null));
// Test de fonctionnalité existante
SaveAccount savingsAccount1 = new SaveAccount(101, 5.0,2.3);
savingsAccount1.deposit(1000.0);
savingsAccount1.withdraw(200.0);
System.out.println("Solde du compte épargne : " + savingsAccount1.getBalance());
CheckAccount checkingAccount1 = new CheckAccount(102, 500.0,2.0);
checkingAccount1.deposit(1500.0);
checkingAccount1.withdraw(800.0);
System.out.println("Solde du compte chèque : " + checkingAccount1.getBalance());
Costumer costumer = new Costumer("John", "Doe");
costumer.addAccount(savingsAccount1);
costumer.addAccount(checkingAccount1);
System.out.println("Solde total du client : " + costumer.getTotalAccountBalance());
Banck banck = new Banck();
banck.addCostumer(costumer);
System.out.println("Solde total de la banque : " + banck.getTotalBalance());
    }
    
}