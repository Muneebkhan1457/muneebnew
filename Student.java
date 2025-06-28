class Bankaccount{
    int accountnumber;
    String accountholdersname;
    int balance;
    Bankaccount(){
        accountnumber=4268;
        accountholdersname="muneeb";
        balance=0;
    }
    void deposit(int amount){
        int sum1=balance+amount;
        System.out.println("Deposit" + sum1 );
    }
    void withdraw(int amount){
        int sum2=balance-amount;
        System.out.println("withdraw amount"+sum2);
    }
    void checkbalance(){
        System.out.println("balance"+ balance);
    }
}
class Savingaccount extends Bankaccount{
    int Interestrate;
    Savingaccount(){
        Interestrate=5;
    }
    void addinterest(){
        int add=balance*Interestrate/100;
        int sum3=add+balance;
        System.out.println("Interest"+ add);
    }

}
public class Student {
    
    public static void main(String[] args) {
        Savingaccount ne= new Savingaccount();
        ne.deposit(550);
        ne.withdraw(700);
        ne.checkbalance();
        ne.addinterest();




    }
        



       
    }
