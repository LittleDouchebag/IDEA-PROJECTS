import java.util.ArrayList;
import java.util.Date;

public class Ch11Q8_V2 {
    public static void main(String[] args) {

        Account account = new Account("George", 1122, 1000, 0.015);

        account.deposit(30);
        account.deposit(40);
        account.deposit(50);
        account.withDraw(5);
        account.withDraw(4);
        account.withDraw(2);
        System.out.println("Name:"+account.getName()+"\tID:"+account.getID()+"\tAnnual Interest:"+account.getAnnualInterestRate()+"\tBalance:"+account.getBalance());
        account.printTransactions();
    }
}

class Account{
    private ArrayList<Transaction> transactions = new ArrayList<Transaction>();
    private int TransactionsCount=0;
    private String name="Unnamed";
    private int ID=0;
    private double balance=0;
    private double annualInterestRate=0;
    private Date dateCreated = new Date();
    public Account(){}
    public Account(String name,int ID,double balance,double annualInterestRate){
        this.name=name;
        this.ID=ID;
        this.balance=balance;
        this.annualInterestRate=annualInterestRate;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public double getAnnualInterestRate() {
        return annualInterestRate;
    }

    public void setAnnualInterestRate(double annualInterestRate) {
        this.annualInterestRate = annualInterestRate;
    }

    public Date getDateCreated() {
        return dateCreated;
    }

    public void withDraw(double withdrawAmount){
        balance-=withdrawAmount;
        Transaction withdraw = new Transaction('W',withdrawAmount,balance,"Withdraw");
        transactions.add(withdraw);
        TransactionsCount++;
    }

    public void deposit(double depositAmount){
        balance+=depositAmount;
        Transaction deposit = new Transaction('D',depositAmount,balance,"Deposit");
        transactions.add(deposit);
        TransactionsCount++;
    }
    public void printTransactions(){
        for (int i=0;i<TransactionsCount;i++){
            transactions.get(i).printTransaction();
        }
    }
}


class Transaction{
    Date date=new Date();
    char type;
    double amount;
    double balance;
    String description;
    public Transaction(){}
    public Transaction(char type,double amount,double balance,String description){
        this.type=type;
        this.amount = amount;
        this.balance=balance;
        this.description=description;
    }
    public void printTransaction(){
        System.out.println(date+" Type:"+type+"\tAmount:"+amount+
                "\tBalance:"+balance+"\t"+description);
    }

}