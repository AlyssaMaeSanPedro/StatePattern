class Account {
private String accountNumber;
private double balance;
private AccountState state;

public Account(String accountNumber, double balance) {
    this.accountNumber = accountNumber;
    this.balance = balance;
    this.state = new ActiveState();
}

public double getBalance() {
    return balance;
}

public void setBalance(double balance) {
    this.balance = balance;
}

public String getAccountNumber() {
    return accountNumber;
}

public void setState(AccountState state) {
    this.state = state;
}

public void deposit(double amount) {
    state.deposit(this, amount);
}

public void withdraw(double amount) {
    state.withdraw(this, amount);
}

public void activate() {
    state.activate(this);
}

public void suspend() {
    state.suspend(this);
}

public void close() {
    state.close(this);
}

public String toString() {
    return "Account Number: " + accountNumber + "\nCurrent Balance: " + balance + "\n";
}
}