import java.util.Scanner;

public class Ifelse {
    public static void main(String[] args){

        System.out.print("enter the age of the person - ");
        Scanner s = new Scanner(System.in);
        int age = s.nextInt();
        double fare = 100;

        if (age<7) fare = fare * 0.9;
         else if  (age >=7 && age <20) fare = fare*0.85;
         else if  (age >=20 && age <40) fare = fare*0.8;
         else if (age >= 40) fare = fare*0.75;

        System.out.println("The fare is  - " + fare);

    }


}
