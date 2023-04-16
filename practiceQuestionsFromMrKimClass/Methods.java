package practiceQuestionsFromMrKimClass;

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
}
