package Assignment3;

public class BankingSystem {
	
	
		

			public static void main(String[] args) {
				// TODO Auto-generated method stub
				SavingsAccount sa = new SavingsAccount("SA1001","Alice",5000);
				CheckingAccount ca = new CheckingAccount("CA1001","Bob",3000);
				
				Transaction tx = new Transaction();
				
				tx.performTransaction(sa,"deposit",2000);
				tx.performTransaction(sa,"withdraw",1500);
				
				tx.performTransaction(ca,"deposit",1000);
				tx.performTransaction(ca,"withdraw",4500);
				
				sa.printAccountDetails();
				ca.printAccountDetails();
				
				System.out.println("\nTotal Bank Accounts Created: "+Bank.getTotalAccounts());
				System.out.println("Transaction Fee (Fixed): ₹"+tx.getTransactionFee());
			}
		}

