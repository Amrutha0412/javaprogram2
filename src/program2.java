import java.util.Scanner;

        public class program2 {
            public static void main(String[] args) {
                int a,b,sum,sub,mul,opt;
                double div;
                Scanner sc = new Scanner(System.in);
                System.out.println("Enter two numbers");
                a=sc.nextInt();
                b= sc.nextInt();
                System.out.println("Enter the number from 1 to 4");
                opt = sc.nextInt();
                switch(opt) {
                    case 1:
                        sum = a + b;
                        System.out.println("Result" + sum);
                        break;
                        case 2:
                            sub = a - b;
                           System.out.println("Result" + sub);
                             break;
                        case 3:
                             mul = a * b;
                            System.out.println("Result" + mul);
                             break;
                         case 4:
                             div = (double) a / b;
                             System.out.println("Result" + div);
                                break;
                               default:
                              System.out.println("Invalid number");
    }
        }
    }

