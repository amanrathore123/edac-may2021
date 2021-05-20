import java.util.*;
class Account
{
    private String accNo;
    private String name;
    private String address;
    private String phno;
    private String dob;
    protected long balance;
    /*
    public Account(String acc,String n,String add,String phno,String dob)
    {
        accNo=acc;
        name=n;
        address=add;
        this.phno=phno;
        this.dob=dob;
        balance=0;
    } */
    Scanner sc=new Scanner(System.in);
    public String getAccNo(){return accNo;}
    public String getName(){return name;}
    public String getAddress(){return address;};
    public String getPhno(){return phno;}
    public String getDOB(){return dob;}
    public long getBalance(){return balance;}
    
    public void setAddress()
    {
        System.out.println("Enter Address :");
        address=sc.nextLine();
    }
    public void setPhno()
    {
        System.out.println("Enter PhoneNo :");
        phno=sc.nextLine();
    }
    public void setBalance()
    {
        System.out.println("Enter Balance :");
        address=sc.nextLine();
    }
    public void setDob()
    {
        System.out.println("Enter DOB :");
        address=sc.nextLine();
    }
    public void setName()
    {
        System.out.println("Enter Name :");
        address=sc.nextLine();
    }
    public void setAccNo()
    {
        System.out.println("Enter AccountNo :");
        address=sc.nextLine();
    }
    public void Deposit(long deposit)
    {
       balance+=deposit;
       System.out.println("Deposited successfully"+balance); 
    }
    public void Withdrawal(long withd)
    {
        if(balance>withd)
        {
        balance-=withd;
        System.out.println("withdrawal successfully"+balance); 
        }
        else
         System.out.println("insufficient balance");
    }
            
}

class DisplayMenu
    {
      public void Display()
      {
            System.out.println("1.Opening an account");
            System.out.println("2.Show account info");
            System.out.println("3.Deposit");
            System.out.println("4.Withdraw");
            System.out.println("5.Exit");
            System.out.println("Enter your choice (1-5)");
      }
}


      
        
    
    public class Solution 
    {
    	
    public static void main(String args[]) 
    {
        Scanner s= new Scanner(System.in);
        int choice;
        int counter,ch;
        char answer='Y';
        long deposit,withdrawal;
        Account Ac[]=new Account[5];
        DisplayMenu Menu=new DisplayMenu();
        while(answer=='Y')
        {
        Menu.Display();
        choice=s.nextInt();
        if(choice==1)
        {counter++;}
        
        switch(choice){
            case 1:  Account Ac[(counter-1)] = new Account();
                     Ac[counter-1].setName();
                     Ac[counter-1].setAccNo();
                     Ac[counter-1].setDob();
                     Ac[counter-1].setAddress();
                     Ac[counter-1].setBalance();
                     Ac[counter-1].setPhno();
                     break;
            case 2:
                     System.out.println("Enter ACCOUNT NO :");
                     ch=s.nextInt();
                     System.out.println(Ac[ch].getAccNo());
                     System.out.println(Ac[ch].getName());
                     System.out.println(Ac[ch].getDOB());
                     System.out.println(Ac[ch].getBalance());
                     System.out.println(Ac[ch].getPhno());
                     System.out.println(Ac[ch].getAddress());
                     break;
            case 3:
                     System.out.println("Enter ACCOUNT NO :");
                     ch=s.nextInt();
                     System.out.println("Enter Amount :");
                     deposit=s.nextLong();
                     Ac[ch].Deposit(deposit);
                     break;
            case 4:
                     System.out.println("Enter ACCOUNT NO :");
                     ch=s.nextInt();
                     System.out.println("Enter Amount :");
                     withdrawal=s.nextLong();
                     Ac[ch].Deposit( withdrawal);
                     break;
            case 5:
                     System.out.println("Exit Successfull");
                     break;     
        }
        System.out.println("Do you want to continue ? press Y or N");
        answer=s.next().charAt(0);
     }
    }
}





