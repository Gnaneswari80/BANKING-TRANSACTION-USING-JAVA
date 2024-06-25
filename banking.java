import java.util.Scanner;
class banking
{
    int amount=0;
   int a[]=new int[10];
   char c[]=new char[10];

     void deposite()
       { 
Scanner sc=new Scanner(System.in);
             int am=0;
            System.out.println("Enter amount to deposite:");
             am=sc.nextInt();
              if(am%100==0)
              {
                 amount=amount+am;
                 a[2]=a[1];
                 a[1]=a[0];
                 a[0]=am;
                  c[2]=c[1];
                  c[1]=c[0];
                  c[0]='d';
System.out.println("your deposited amount is....RS "+am);
System.out.println("Your Account balance is:RS "+amount);

             }
            else
             {
                 System.out.println("Improper amount....");
                 System.out.println("Your Account balance is:RS "+amount);

             }
         }
 void withdraw()
{
Scanner sc=new Scanner(System.in);
      int am=0;
        System.out.println("Enter amount to withdraw...");
         am=sc.nextInt();
      if(amount>0)
      {
         if(am<=amount)
          {   
              if(am%100==0)
              {
                amount=amount-am;
System.out.println("Your cash is dispensing..");
               System.out.println("your Account Balance RS "+amount);
                 a[2]=a[1];
                 a[1]=a[0];
                 a[0]=am;
                  c[2]=c[1];
                  c[1]=c[0];
                  c[0]='c';
               }
             else
             {
               System.out.println("Improper amount...");
              System.out.println("your total amount is...RS "+amount);
             }
         }
         else
         {
             System.out.println("your balance is less then credit");
          }
    
       }
      else
      {
          System.out.println("your balance is null");
      }
}
 void ministatement()
{
Scanner sc=new Scanner(System.in);
   int i=0;
   System.out.println("Your Last  three transactions are...");
   for(i=0;i<3;i++)
   System.out.println(c[i]+"-->"+a[i]);
   System.out.println("NOTE:");
   System.out.println("C for debit(withdraw)");
   System.out.println("D for credit(deposite)");
   System.out.println("Your Account balance is RS:"+amount);
}
public static void main(String args[])
{

 banking bg=new banking();   
Scanner sc=new Scanner(System.in); 
 int op=0;
int pin,i;
   System.out.println("                                      welcome to maariyamma ATM Banking");
System.out.println("                                        *************** ***********");
System.out.println("Enter pin");


for(i=0;i<5;i++)
{//+++++++++++
pin=sc.nextInt();
if(pin==1972)
{//********************************
 i=6;
    do
  {
System.out.println("Select your Transaction option....");
   System.out.println("1.deposite       2.withdraw");
    System.out.println("3.ministatement 4.exit");
  System.out.println("Enter option");
  op=sc.nextInt();
    switch(op)
    {
      case 1:bg.deposite();break;
      case 2:bg.withdraw();break;
      case 3:bg.ministatement();break;
      case 4:System.out.println("Last");break;
     default:System.out.println("Invalid option");
     }
    System.out.println("DO you want to continue these Transaction press 1/2");
     op=sc.nextInt();

}while(op==1);
}//**********************
else
{
  
   System.out.println("!Invalid pin...please try again");
 if(i==3)
    System.out.println("You have only one chance..");
}
}
if(i==5)
System.out.println("Your Account is blocked");
}   
}  