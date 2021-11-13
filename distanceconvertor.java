
import java.io.*;
import java.util.Scanner;
public class distanceconvertor
{
    public static void main(String[]args)
    {
        double meters, kilometers, miles;
        Scanner in= new Scanner(System.in);
        System.out.println("Choose the type of Distance conversition");
        System.out.println("1.Meters to Kilometres, 2.Miles to KiloMeters:");
        int ch=in.nextInt();
        switch (ch)
        {
        case 1:
            System.out.println("Meters into KiloMeters");
            System.out.println("Enter the number of Meters");
            meters=in.nextDouble();
            kilometers=meters*0.001;
            System.out.println(meters+"Meters is"+kilometers+"in KiloMeters");
            break;
        case 2:
            System.out.println("Miles to Kilometers conversion");
            System.out.println("Enter the number of Miles");
            miles=in.nextDouble();
            kilometers=miles*1.60934;
            System.out.println(miles +"Miles is"+kilometers+"in kilometres");
            break;
        }
    }
}