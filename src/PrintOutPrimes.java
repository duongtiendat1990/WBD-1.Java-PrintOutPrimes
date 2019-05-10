import java.util.Date;
import java.util.Scanner;

public class PrintOutPrimes {
  public static void main(String[] args) {
    long startTime = new Date().getTime();
    Scanner scanner = new Scanner(System.in);
    System.out.println("Primes Printer!");
    System.out.println("Please Enter number that max printed out prime must be smaller than");
    System.out.print("Number : ");
    long n = scanner.nextLong();
    long i;
    long count = 2;
    if (n < 2) System.out.println("None");
    else if (n < 4)
      for (i = 2; i <= n; i++)
        System.out.printf("%d\n", i);
    else {
      System.out.println("2");
      System.out.println("3");
      for (i = 5; count < n; i += 2)
        if ((i % 6 == 1 || i % 6 == 5) && primalityTest(i)){
          System.out.printf("%d\n", i);
          count++;
        }
    }
    long endTime = new  Date().getTime();
    System.out.println(endTime-startTime);
  }

  private static boolean primalityTest(long n) {
    long i;
    if (n % 2 == 0 || n % 3 == 0) return false;
    for (i = 5; i <= Math.sqrt(n); i+=6)
      if (n % i== 0 || n % (i+2) == 0) return false;
    return true;
  }
}
