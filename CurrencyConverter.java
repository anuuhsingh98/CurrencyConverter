import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class CurrencyConverter {
Scanner sc=new Scanner(System.in);


public static void interfce(){      

 System.out.println("Welcome to currency Converter");
 System.out.println("Simple Java based hardware encodded currency rates");
 System.out.println("Created by Anurag kumar");
 System.out.println("                                                           ");
 System.out.println("                                                           ");

}

 public void conversion(){
 Map<String, Double> currencyRates = new HashMap<>(); 
       


        currencyRates.put("INR", 85.50); 
        currencyRates.put("USD", 1.00);      
        currencyRates.put("YUAN", 7.17);          
        currencyRates.put("EURO", 0.85);
        currencyRates.put("PKR", 283.78);                
        currencyRates.put("NZD", 1.65);                        
        currencyRates.put("AUD", 1.53);                         
        currencyRates.put("BDT", 122.63);                         
        currencyRates.put("MXN", 18.63);
        currencyRates.put("THB", 32.39);                 
        currencyRates.put("AED", 3.67);
        currencyRates.put("NPR", 136.49);         
        currencyRates.put("RUB", 78.61);             


    System.out.println("Choose your currency");
    System.out.println(String.join("    ", currencyRates.keySet()));                                                               
                                                                                
   String C1= sc.nextLine().toUpperCase();
   
    System.out.println("Enter your total amount in "+C1);
    double num1=sc.nextDouble();
    sc.nextLine();

    System.out.println("Choose Currency you want to convert");
    System.out.println("INR    USD    YUAN    EURO    PKR    NZD    AUD    BDT     MXN     THB     AED   NPR   RUB");
    String C2 = sc.nextLine().toUpperCase();


    double c1Rate = currencyRates.get(C1);
    double c2Rate = currencyRates.get(C2);

 if(C2.equals("USD")){
        double spcase = num1/c1Rate;
        System.out.println(C1+"--->"+C2+"=="+spcase);    


 }else{
     double converted = num1 * c2Rate;
     System.out.println(C1+"---->"+C2+"=="+converted);   

 }
}      
}
