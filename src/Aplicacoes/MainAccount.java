/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


/**
 *
 * @author arils
 */
import java.util.ArrayList;
import java.util.List;
import Entidades.Account;
import Entidades.BusinessAccount;
import Entidades.SavingsAccount;
import java.util.Locale;

public class MainAccount {

    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        List<Account> list = new ArrayList<>();

        list.add(new SavingsAccount(0.01, 1001, "Alex", 1000.0));
        list.add(new BusinessAccount(400.0, 1002, "Bob", 1000.0));

        double soma = 0.0;

        for (Account ac : list) {
            soma += ac.getBalance();
        }

        System.out.printf("%.2f%n", soma);

        for (Account ac : list) {
            ac.deposit(10.0);
        }
        
        for (Account ac : list) {
            System.out.printf("Updated balance for account %d: %.2f%n", ac.getNumber(), ac.getBalance());
        }
    }
}
