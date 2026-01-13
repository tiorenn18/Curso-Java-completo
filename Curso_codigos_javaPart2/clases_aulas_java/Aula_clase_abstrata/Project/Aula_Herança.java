package Project;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

import classes.Acount;
import classes.BuinessAcount;
import classes.SavingAcount;

public class Aula_Herança {
    // Neste arquivos temos conteudos da aula de heranças e da aula de UpCasting e DownCasting
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        List <Acount> list = new ArrayList<>();

        list.add(new SavingAcount(1001, "alex", 500, 0.01));
        list.add(new BuinessAcount(1002, "bob", 1000, 400));
        list.add(new SavingAcount(1003, "maria", 300, 0.01));
        list.add(new BuinessAcount(1004, "cleber", 100, 500));
    
        double sum = 0.0;
        for(Acount acc : list){
            sum += acc.getBalance();
        }

        System.out.printf("Total balance: %.2f \n", sum);
        
        for(Acount acc : list){
            acc.deposit(10);
        }

        for(Acount acc : list){
            System.out.printf("Updated balance for acount %d: %.2f  \n",acc.getNumber(), acc.getBalance());
        }
    }
}
