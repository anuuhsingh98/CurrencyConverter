import java.util.Scanner;
public static void main(String[] args){
    CurrencyConverter.interfce();// static method called from just class reference


    CurrencyConverter c=new CurrencyConverter();//object creation
    Scanner sc=new Scanner(System.in);//input data
char s;
do{// for continue program again after one conversion we use do 
    c.conversion();// method for run program


   System.out.println("Press Y/y to convert more...");//press y/Y for execute again c.conversion whic run program again
   s=sc.next().charAt(0);//scanner input for take input 
}while(s=='Y'|| s=='y');
	System.out.println("!!====thank You! Ends====!!");
		

}