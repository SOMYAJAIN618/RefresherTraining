package FacadeImplementation;

class BankService {
    private final AccountService accountService;
    private final LoanService loanService;

    public BankService() {
        this.accountService = new AccountService();
        this.loanService = new LoanService();
    }

    public void transferMoney(long fromAccount, long toAccount, double amount) {
        accountService.debit(fromAccount, amount);
        accountService.credit(toAccount, amount);
    }

    public boolean checkEligibility(long accountId) {
        return loanService.checkLoanEligibility(accountId);
    }
}

// The subsystem classes
class AccountService {
    public void debit(long accountId, double amount) {
        System.out.println("Debiting " + amount + " from account " + accountId);
        // logic for debiting amount from account
    }

    public void credit(long accountId, double amount) {
        System.out.println("Crediting " + amount + " to account " + accountId);
        // logic for crediting amount to account
    }
}

class LoanService {
    public boolean checkLoanEligibility(long accountId) {
        // logic for checking loan eligibility based on account balance and other factors
        return true;
    }
}

// The client code
public class Main {
    public static void main(String[] args) {
        BankService bankService = new BankService();

        // Transfer money between accounts
        bankService.transferMoney(123456789, 987654321, 1000);

        // Check loan eligibility
        boolean isEligible = bankService.checkEligibility(123456789);
        System.out.println("Is account eligible for loan? " + isEligible);
    }
}
