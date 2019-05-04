import java.util.Scanner;

public class PrintOutPrimes {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    System.out.println("Primes Printer!");
    System.out.println("Please Enter number that max printed out prime must be smaller than");
    System.out.print("Number : ");
    long n = scanner.nextLong();
    int i;
      if (n<2) System.out.println("None");
      else if (n<4)
        for(i=2;i<=n;i++)
          System.out.printf("%4d\n",i);
      else
      {
        System.out.println("   2");
        System.out.println("   3");
        for (i=5;i<=n;i+=2)
          if ((i % 6 == 1 || i % 6 == 5) && primalityTest(i))
            System.out.printf("%4d\n",i);
      }
    }

    public static boolean primalityTest(int n) {
      int i;
      for (i=3;i<=Math.sqrt(n);i++)
        if (n%i==0) return false;
      return true;
  }
}
