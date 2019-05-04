import java.util.Scanner;

public class PrintOutPrimes {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    System.out.println("Primes Printer!");
    System.out.println("Please Enter number that max printed out prime must be smaller than");
    System.out.print("Number : ");
    long n = scanner.nextLong();
    int i;
    if (n < 2) System.out.println("None");
    else if (n < 4)
      for (i = 2; i <= n; i++)
        System.out.printf("%d\n", i);
    else {
      System.out.println("2");
      System.out.println("3");
      for (i = 5; i <= n; i += 2)
        if ((i % 6 == 1 || i % 6 == 5) && primalityTest(i))
          System.out.printf("%d\n", i);
    }
  }

  private static boolean primalityTest(int n) {
    int i;
    if (n % 2 == 0 || n % 3 == 0) return false;
    for (i = 1; 6 * i + 1 <= Math.sqrt(n) || 6 * i - 1 <= Math.sqrt(n); i++)
      if (n % (6 * i + 1) == 0 || n % (6 * i - 1) == 0) return false;
    return true;
  }
}
