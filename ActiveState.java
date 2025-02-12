class ActiveState implements AccountState {
    public void deposit(Account account, double amount) {
        account.setBalance(account.getBalance() + amount);
        System.out.println("\n" + amount + " is successfully deposited to your account.");
        System.out.println(account.toString());
    }

    public void withdraw(Account account, double amount) {
            account.setBalance(account.getBalance() - amount);
            System.out.println("You have withdrawn " + amount + " from your account.");
            System.out.println(account.toString());
        }

    public void activate(Account account) {
        System.out.println("Account is already activated!");
    }

    public void suspend(Account account) {
        account.setState(new SuspendedState());
        System.out.println("Account is suspended!");
    }

    public void close(Account account) {
        account.setState(new ClosedState());
        System.out.println("Account is closed!");
    }
}