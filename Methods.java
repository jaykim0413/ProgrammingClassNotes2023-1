
import java.util.Scanner;

public class Methods {
  public static void main(String[] args) {
    double a = sqrt(2);
    double b = Math.sqrt(2);

    System.out.println(a + "\n" + b);
  }

  public static void pg2() {
    Scanner sc = new Scanner(System.in);

    int n = sc.nextInt();
    int c = sc.nextInt();
    int result = 0;
    boolean res = false;

    switch (c) {
      case 1:
        result = numOfFactors(n);
        System.out.println(result);
        break;
      case 2:
        res = isPrimeNumber(n);
        System.out.println(res);
        break;
      case 3:
        allPrimeNumbersUnderN(n);
        break;
      default:
        result = sumOfAllPrimeNumbersUnderA(n);
        System.out.println(result);
    }

    sc.close();
  }

  // Methods
  public static int numOfFactors(int n) {
    int cnt = 0;

    for (int i = 1; i <= n; i++) {
      if (n % i == 0) {
        cnt++;
      }
    }

    return cnt;
  }

  public static boolean isPrimeNumber(int n) {
    int cnt = 0;

    for (int i = 1; i <= n; i++) {
      if (cnt > 2) {
        break;
      } else {
        if (n % 2 == 0) {
          cnt++;
        }
      }
    }

    if (cnt == 2) {
      return true;
    } else {
      return false;
    }
  }

  public static void allPrimeNumbersUnderN(int n) {
    int cnt = 0;

    for (int i = 1; i <= n; i++) {
      for (int j = 1; j <= i; j++) {
        if (cnt > 2) {
          break;
        } else {
          if (i % j == 0) {
            cnt++;
          }
        }
      }

      if (cnt == 2) {
        System.out.println(i + " ");
      }
    }
  }

  public static int sumOfAllPrimeNumbersUnderA(int n) {
    int cnt = 0;
    int sum = 0;

    for (int i = 1; i <= n; i++) {
      for (int j = 1; j <= i; j++) {
        if (cnt > 2) {
          break;
        } else {
          if (i % j == 0) {
            cnt++;
          }
        }
      }

      if (cnt == 2) {
        sum += i;
      }
    }

    return sum;
  }

  public static void printNameNtimes(int n) {
    for (int i = 0; i < n; i++) {
      System.out.println("J.W.Kim");
    }
  }

  public static void factors(int n) {
    for (int i = 1; i <= n; i++) {
      if (n % i == 0) {
        System.out.print(i + " ");
      }
    }
  }

  public static void sum(int n) {
    int sum = 0;
    for (int i = 1; i <= n; i++) {
      sum += i;
    }

    System.out.println(sum);
  }

  public static void numFactors(int n) {
    int cnt = 0;
    for (int i = 2; i <= n; i++) {
      if (n % i == 0) {
        cnt++;
      }
    }

    System.out.println(cnt);
  }

  public static void gcd(int m, int n) {
    while (n != 0) {
      if (m > n) {
        m %= n;
      } else {
        int temp = m;
        m = n;
        n = temp;
      }
    }
  }

  public static double sqrt(double num) {
    double est = 0;
    while (est * est < num) {
      est += 0.001;
    }

    int a = 0;
    while (a++ < 1000000) {
      est = (est + num / est) / 2.0;
    }

    return est;
  }

  public static void oneLevelOfMultiplicationTable(int n) {
    for (int i = 1; i <= 9; i++) {
      System.out.print(n + " * " + i + " = " + i * n + "  ");
    }
    System.out.println();
  }

  public static double arithSeq(double a, double d, int n) {
    return (a + (n - 1.0) * d);
  }

  public static void allCommonDivisorsOfANB(int a, int b) {
    for (int i = 1; i <= ((a > b) ? b : a); i++) {
      if (a % i == 0 && b % i == 0) {
        System.out.print(i + " ");
      }
    }
  }

  public static void lcm(int a, int b) {
    for (int i = 1; i <= a * b; i++) {
      if (i % a == 0 && i % b == 0) {
        System.out.print(i + " ");
      }
    }
  }

  // RECURSION
  public static int recurSum(int n) {
    if (n == 1) {
      return 1;
    } else {
      return n + recurSum(n - 1);
    }
  }

  public static int factorial(int n) {
    if (n == 1) {
      return 1;
    } else {
      return n * factorial(n - 1);
    }
  }

  public static int fibonacci(int n) {
    if (n == 1 || n == 2) {
      return 1;
    } else {
      return fibonacci(n - 1) + fibonacci(n - 2);
    }
  }

  public static int recurGCD(int n, int m) {
    if (m == 0) {
      return n;
    } else {
      return recurGCD(m, n % m);
    }
  }

  public static int hanoiNum(int n) {
    if (n == 1) {
      return 1;
    } else {
      return 2 * hanoiNum(n - 1) + 1;
    }
  }

  public static int biCoeff(int n, int k) {
    if (k == 0 || n == k) {
      return 1;
    } else {
      return biCoeff(n - 1, k - 1) + biCoeff(n - 1, k);
    }
  }
}
