import sun.rmi.server.LoaderHandler;

import java.io.*;
import java.util.ArrayList;
import java.util.Date;

public class Ch17Q6 {
    public static void main(String[] args) throws Exception {
//        Serializable  600
        ArrayList<Loan> listOfLoan = new ArrayList<>();
        listOfLoan.add(new Loan(0.05,5,200));
        listOfLoan.add(new Loan(0.04,4,200));
        listOfLoan.add(new Loan(0.03,3,200));
        listOfLoan.add(new Loan(0.02,2,200));
        listOfLoan.add(new Loan(0.01,1,200));

        try(ObjectOutputStream outputStream = new ObjectOutputStream(new FileOutputStream("Ch17Q6.dat"))){
            for (int i=0;i<listOfLoan.size();i++)
               outputStream.writeObject(listOfLoan.get(i));
        }
        try(ObjectInputStream inputStream = new ObjectInputStream(new FileInputStream("Ch17Q6.dat"))){
            ArrayList<Loan> listReturn = new ArrayList<>();
            for (int i=0;i<listOfLoan.size();i++)
                listReturn.add((Loan)(inputStream.readObject()));
            for (int i=0;i<listOfLoan.size();i++) {
                System.out.println(listReturn.get(i).getAnnualInterestRate() + "\t" + listReturn.get(i).getNumberOfYears() + "\t" + listReturn.get(i).getLoanAmount() + "\t" + listReturn.get(i).getLoanDate() + "\t");
            }

        }
    }
}

class Loan implements Serializable{
    private double annualInterestRate;
    private int numberOfYears;
    private double loanAmount;
    private java.util.Date loanDate;

    public Loan(){
        annualInterestRate = 0;
        numberOfYears = 1 ;
        loanAmount = 100;
        loanDate = new java.util.Date();
    }
    public Loan(double annualInterestRate,int numberOfYears,double loanAmount){
        this.annualInterestRate = annualInterestRate;
        this.numberOfYears = numberOfYears ;
        this.loanAmount = loanAmount;
        loanDate = new java.util.Date();
    }

    public double getAnnualInterestRate() {
        return annualInterestRate;
    }

    public int getNumberOfYears() {
        return numberOfYears;
    }

    public double getLoanAmount() {
        return loanAmount;
    }

    public Date getLoanDate() {
        return loanDate;
    }
}