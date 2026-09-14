import java.util.Scanner;

public class Decision {
    public static void main(String Args[]) {
        // types of the decision making statements are
        // if ,only if statements
        // if else
        // nested if
        /*
         * if (i%2==0){
         * System.out.println("The number is even ");
         * }
         * else {
         * System.out.println("the number is odd");
         * }
         * outer if statement
         * if (i < 100) {
         * inner if statement
         * if (i % 2 == 0) {
         * System.out.println("the number is less than hundered and is even ");
         * }
         * }
         * condition are evaluated form top to bottom
         * int i = 0;
         * if(i%2==0){
         * System.out.println("the number if even ");
         * }
         * else if(i%2!=0){
         * System.out.println("th number is odd");
         * }
         * else{
         * System.out.println("the number is zero ");
         * }
         */
        // java Switch case to make a calculator
        /*
         * Scanner S = new Scanner(System.in);
         * System.out.println("Enter the first number a = ");
         * int a = S.nextInt();
         * System.out.println("enter an operator +,-,*,/ =");
         * char operator = S.next().charAt(0);
         * System.out.println("Enter the first number b = ");
         * int b = S.nextInt();
         * int result = 0;
         * boolean validOperation = true;
         * switch (operator) {
         * case '+':
         * result = a + b;
         * break;
         * case '-':
         * result = a - b;
         * break;
         * case '*':
         * result = a * b;
         * break;
         * case '/':
         * if (b != 0) {
         * result = a / b;
         * } else {
         * System.out.println("Invalid input for b ");
         * validOperation = false;
         * }
         * break;
         * default:
         * System.out.println("Invalid opreator choose");
         * break;
         * }
         * if (validOperation) {
         * System.out.println("Result " + a + "" + operator + "" + b + "=" + result);
         * }
         * S.close();
         */
        //ternary operator 
        int a=10;int b=20;
        int max=(a>b)?a:b;
        System.out.println("The maximum number is this "+ max);

    }

}
