/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author CARDZ
 */
class BankAccount {
    private String name;
    private int age;
    private long accountNumber;
    private double balance;
    
public BankAccount(String name, int age, long accountNumber, double balance){
    
this.name=name;
this.age=age;
this.accountNumber=accountNumber;
this.balance=balance;


}

    public void getName(String name){
        this.name=name;}
    public int getAge(){
        return age;}
    public void deposit(double amount){
        balance += amount;}
    public double getBalance(){
        return balance;}
    public String getSummary(){
        return "\n Name: "+ name +"\n Age: "+ age+ "\n Account Number: "+ accountNumber+ "\n Balance: "+ balance;}
    }

        class Main {
    public static void main(String[]args){
        BankAccount account= new BankAccount("Mark Anthony", 21, 20191772, 160.0);
        
        account.deposit(200.0);
       account.deposit(310.0);

        
        System.out.println(account.getSummary());
    }
}