
import java.io.*;
import java.util.Scanner;
public class currencyconvertor
{
    public static void main(String[]args)
    {
        double Rs;
        Scanner in= new Scanner(System.in);
        System.out.println("Choose the type of currency conversition");
        System.out.println("1.USDollar to INDRupees, 2.Euro to INDRupees, 3.JapaneseYen to INDRupees");
        int ch=in.nextInt();
        switch (ch)
        {
        case 1:
            System.out.println("Dollar to Rupees Conversation");
            System.out.println("Enter the number of Dollars");
            double dollar=in.nextInt();
            Rs=dollar*67.02;
            System.out.println("USD="+dollar+"is INR"+Rs);
            break;
        case 2:
            System.out.println("EURO to Rupees Conversation");
            System.out.println("Enter the number of EURO");
            double Euro=in.nextInt();
            Rs=Euro*78.29;
            System.out.println("Euro="+Euro+"is INR="+Rs);
            break;
        case 3:
            System.out.println("Japanese Yen to Rupees conversation");
            System.out.println("Enter the number of Yen");
            double Yen=in.nextInt();
            Rs=Yen*0.61;
            System.out.println("Yen="+Yen+"is INR="+Rs);
            break;
        }
    }
}