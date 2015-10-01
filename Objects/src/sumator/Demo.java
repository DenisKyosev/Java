package sumator;

import java.math.BigDecimal;
import java.math.BigInteger;

public class Demo {
    public static void main(String[] args){
        Sumator input = new Sumator();

        int sum = input.sum(3,13);
        System.out.printf("The sum of Integer is:%d\n", sum);

        double sumNumbers = input.sum(2.3 , 4.3);
        System.out.println("The sum of the numbers is:" + sumNumbers);

        int concatenation = input.sum("3", "4");
        System.out.println("The concatenation of string:" + concatenation);

        BigDecimal sumOfNumbers = input.sum(new BigDecimal("32421.34"), new BigDecimal("34231.23"));
        System.out.println("The sum two decimal number is:" + sumOfNumbers);

        BigInteger additionOfnumbers = input.sum(new BigInteger("53212"),new BigInteger("65432"));
        System.out.println("Sum of the numbers is:" + additionOfnumbers);

    }
}
