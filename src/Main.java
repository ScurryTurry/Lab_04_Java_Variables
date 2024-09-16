public class Main
{
    public static void main(String[] args)
    {
        int intOperandA = 1;
        int intOperandB = 2;
        int intSum = 345;
        int intProduct = 32;
        int intDifference = 432;
        int intQuotient = 403;
        int intModulo = 401;

        double doubleOperandA = 3.50;
        double doubleOperandB = 5.40;
        double doubleSum = 5.50;
        double doubleProduct = 4.60;
        double doubleDifference = 3.40;
        double doubleQuotient = 3.20;

        //Ints
        intSum = intOperandA + intOperandB;
        System.out.println("The sum using ints of " + + intOperandA + " and " + intOperandB + " is " + intSum);

        intProduct = intOperandA * intOperandB;
        System.out.println("The product using ints of " + + intOperandA + " and " + intOperandB + " is " + intProduct);

        intDifference = intOperandA - intOperandB;
        System.out.println("The difference using ints of " + + intOperandA + " and " + intOperandB + " is " + intDifference);

        intQuotient = intOperandA / intOperandB;
        System.out.println("The quotient using ints of " + + intOperandA + " and " + intOperandB + " is " + intQuotient);

        intModulo = intOperandA % intOperandB;
        System.out.println("The modulo using ints of " + intOperandA + " and " + intOperandB + " is " + intModulo);

        //Doubles
        doubleSum = doubleOperandA + doubleOperandB;
        System.out.println("The sum using doubles of "  + doubleOperandA + " and " + doubleOperandB + " is " + doubleSum);

        doubleProduct = doubleOperandA * doubleOperandB;
        System.out.println("The product using doubles of " + doubleOperandA + " and " + doubleOperandB + " is " + doubleProduct);

        doubleDifference = doubleOperandA - doubleOperandB;
        System.out.println("The difference using doubles of " + doubleOperandA + " and " + doubleOperandB + " is " + doubleDifference);

        doubleQuotient = doubleOperandA / doubleOperandB;
        System.out.println("The quotient using doubles of " + doubleOperandA + " and " + doubleOperandB + " is " + doubleQuotient);

        double myLunchCost = 12.50;
        System.out.println("The cost of lunch is " + myLunchCost + "dollars.");

        int kids = 2;
        System.out.println("The number of kids in the family is " + kids);

        boolean isRaining = false;
        System.out.println("Is it raining? " + isRaining);

        double gasPrice = 2.95;
        System.out.println("The gas price is " + gasPrice + "dollars.");

        int favNumber = 10;
        System.out.println("The favorite number is " + favNumber);

        double shoeSize = 11;
        System.out.println("The shoe size is " + shoeSize);

        int birthMonth = 3;
        System.out.println("The birth month is " + birthMonth);

        String firstName = "Peyton";
        String lastName = "Terry";
        String fullName = firstName + " " + lastName;
        System.out.println("The full name is " + fullName);

        //Example
        int myFavNumber = 13;
        int doubleNum = 0;

        doubleNum = myFavNumber * 2;

        System.out.println("The number " + myFavNumber + " doubled is " + doubleNum);
    }
}