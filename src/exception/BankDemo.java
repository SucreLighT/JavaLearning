package exception;

public class BankDemo {
    public static void main(String[] args) {
        CheckingAccount c = new CheckingAccount(101);
        System.out.println("Depositing $500...");
        c.deposit(500.00);

        try
        {
            System.out.println("\nWithdrawing $100...");
            c.withdraw(100.00);
            System.out.println("\nWithdrawing $600...");
            c.withdraw(600.00);
        }catch (InsufficientFundsException e)
        {
            System.out.println("Sorry,but you are short $" + e.getAmount());
            e.printStackTrace();    //在命令行打印异常信息在程序中出错的位置及原因
        }finally {
            System.out.println("\n无论是否发生异常，finally代码块中的代码总会被执行。");
        }
    }
}
