/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package exercice1;

/**
 *
 * @author GHADA
 */
import java.util.ArrayList;

/**
 *
 * @author chams
 */
public class Costumer {
    private String firstName;
    private String lastName;
    private ArrayList<BankAccount> accounts;

    public Costumer(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.accounts = new ArrayList();
    }
    
    public void addAccount(BankAccount compte){
        accounts.add(compte);
    }
    
        public void removeAccount(BankAccount compte){
       int i= accounts.indexOf(compte);
       accounts.remove(i);
       
    }
        public Double getTotalAccountBalance(){
            Double r=0.0;
            for(BankAccount a:accounts){
                r+=a.getBalance();
            }
            return r;
        }
        
        public void transferFunds(BankAccount sourceAccount, BankAccount destinationAccount, Double amount){
            sourceAccount.withdraw(amount);
            destinationAccount.deposit(amount);
        }
}