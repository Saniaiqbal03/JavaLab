abstract class Bank {
    abstract double getBalance();
}

class BankA extends Bank {
    private double balance = 100;

    @Override
    double getBalance() {
        return balance;
    }
}

class BankB extends Bank {
    private double balance = 150;

    @Override
    double getBalance() {
        return balance;
    }
}

class BankC extends Bank {
    private double balance = 200;

    @Override
    double getBalance() {
        return balance;
    }
}

public class BankTester {
    public static void main(String[] args) {
        Bank bankA = new BankA();
        Bank bankB = new BankB();
        Bank bankC = new BankC();

        System.out.println("Balance in Bank A: " + bankA.getBalance());
        System.out.println("Balance in Bank B: " + bankB.getBalance());
        System.out.println("Balance in Bank C: " + bankC.getBalance());
    }
}
