import java.math.BigDecimal;

/**
 ** The first Homework on Operators
 *
 *  * @author Joosep Korela
 */

public class OperatorHomework {

    public static void main(String[] args) {

        int i = 9;
        int a = 18;
        int b = 7;
        int c = 64;
        int d = 4;
        int result = a - b + (c / d + a) + i % d; // your expression here

        /*
        1. First  i will calculate the brackets (c / d + a)
        2. Inside brackets the first move is c / d and then we add int a // (64 / 4) = 16 + 18 = 34
        3. Next we sum up i % d with bracket  (34)+ 9 % 4  // 34 + 1 = 35
        4. Next 7 + 35= 42
        5. Next  a - 42  //18- 42 = -24

         */

        float t = -1.54345677658484756658f;
        System.out.println(result);

    }


}
