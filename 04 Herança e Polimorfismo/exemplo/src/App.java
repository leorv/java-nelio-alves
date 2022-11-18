import entities.Account;
import entities.BusinessAccount;
import entities.SavingsAccount;

public class App {
    public static void main(String[] args) throws Exception {
        Account acc = new Account(1001, "ALex", 0.0);
        BusinessAccount bacc = new BusinessAccount(1002, "Bia", 0.0, 500.0);

        // UpCasting
        Account acc1 = bacc;
        System.out.println(acc1.getBalance());
        Account acc2 = new BusinessAccount(1003, "Bob", 0.0, 200.0);
        Account acc3 = new SavingsAccount(1004, "Ana", 0.0, 0.01);

        // Downcasting
        // BusinessAccount acc4 = acc2;  // Erro
        BusinessAccount acc4 = (BusinessAccount) acc2;
        acc4.loan(100.0);

        // O compilador deixa o abaixo, mas essa operação vai dar problema na hora de executar.
        // Na hora de fazer um downcasting, pode ser que não dê certo.
        // BusinessAccount acc5 = (BusinessAccount) acc3;

        // Para resolver o problema acima:
        if (acc3 instanceof BusinessAccount) {
            BusinessAccount acc5 = (BusinessAccount) acc3;
            System.out.println("Empréstimo realizado.");
        }

        if (acc3 instanceof SavingsAccount) {
            SavingsAccount acc5 = (SavingsAccount) acc3;
            acc5.updateBalance();
            System.out.println("Foi feito um update.");
        }


    }
}
