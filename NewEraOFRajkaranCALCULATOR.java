import java.util.*;

public class NewEraOFRajkaranCALCULATOR {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Taking Input From user.

        System.out.println("Enter The Number For A : ");
        int a = sc.nextInt();
        System.out.println("Enter The Number For B : ");
        int b = sc.nextInt();

        // Taking Operator From User.
        System.out.println("Enter a Operator form 1 to 5 : ");
        System.out.println("1 : + Addition : ");
        System.out.println("2 : - Subtraction : ");
        System.out.println("3 : * Multiplication : ");
        System.out.println("4 : / Division : ");
        System.out.println("5 : % Addition : ");

        System.out.println("Choose a Operator form 1 to 5 : ");
        int Operator = sc.nextInt();

        int Result;
        switch (Operator) {
            case 1 :
                Result = a+b;
                System.out.println("The Sum "+ "="+Result);
                break;
            case 2 :
                Result = a-b;
                System.out.println("the Subtraction"+"="+Result);
                break;
            case 3 :
                Result = a*b;
                System.out.println("The Multiplication"+"="+Result);
            case 4 :
                if(b != 0){
                    Result = a / b;
                    System.out.println("The Division"+"="+Result);
                } else {
                    System.out.println("The Division WIth 0 is not possible : ");

                } break;
            case 5 :
                if (b != 0) {
                    Result = a % b;
                    System.out.println("The Modulo"+"="+Result);
                } else {
                    System.out.println("The Division With 0 not Possible : ");

                }break;
            default:
            {
                System.out.println("You Enter a Invalid Number. : Please Enter a between 1 to 5 : ");
            }
        }

    }
}