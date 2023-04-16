
import java.io.IOException;
import java.util.Scanner;

public class ConditionalNRepetitiveControl {
  public static void main(String[] args) throws IOException {
    // pg 5
    pg5(args);
    // pg 6-1
    pg6_1(args);
    // pg 6-2
    pg6_2(args);
    // pg 8-1
    pg8_1();
    // pg 8-2
    pg8_2();
    // pg 8-3
    pg8_3();
    // pg 8-4
    pg8_4();
    // pg 8-5
    pg8_5();
    // pg 8-6
    pg8_6();
    // pg 9
    pg9();
  }

  public static void pg5(String[] args) {
    char fruit = (char) (Integer.parseInt(args[0]) + 64);

    // if-else if-else
    if (fruit == 'A') {
      System.out.println("apple");
    } else if (fruit == 'B') {
      System.out.println("banana");
    } else if (fruit == 'C') {
      System.out.println("cherry");
    }

    // switch-case
    switch (fruit) {
      case 'A':
        System.out.println("apple");
        break;
      case 'B':
        System.out.println("banana");
        break;
      case 'C':
        System.out.println("cherry");
    }
  }

  public static void pg6_1(String[] args) {
    int n = Integer.parseInt(args[1]);

    // if-else if-else
    if (n == 1) {
      System.out.println("Heads");
    } else {
      System.out.println("Tails");
    }

    // Conditional Operator "? :"
    System.out.println(n == 1 ? "Heads" : "Tails");
  }

  public static void pg6_2(String[] args) {
    int n = Integer.parseInt(args[2]);

    // if-else if-else
    if (n == 1) {
      System.out.println("Scissors");
    } else if (n == 2) {
      System.out.println("Rock");
    } else if (n == 3) {
      System.out.println("Paper");
    } else {
      System.out.println("Input Error");
    }

    // switch-case
    switch (n) {
      case 1:
        System.out.println("Scissors");
        break;
      case 2:
        System.out.println("Rock");
        break;
      case 3:
        System.out.println("Paper");
        break;
      default:
        System.out.println("Input Error");
    }

    // Conditional Operator "? :"
    System.out.println(n == 1 ? "Scissors" : n == 2 ? "Rock" : n == 3 ? "Paper" : "Input Error");
  }

  public static void pg8_1() {
    // for
    System.out.print("for : ");
    for (int i = 1; i <= 10; i++) {
      System.out.print(i + " ");
    }

    // while
    System.out.println("\nwhile : ");
    int a = 0;
    while (a < 10) {
      System.out.print(++a + " ");
    }
  }

  public static void pg8_2() {
    int a = 107;
    int b = 403;

    int gcdFor = 0, gcdWhile = 0;

    // for
    for (int i = 1; i < ((a > b) ? b : a); i++) {
      if (a % i == 0 && b % i == 0) {
        gcdFor = i;
      }
    }
    System.out.println(gcdFor);

    // while
    int idx = 1;
    while (idx <= ((a > b) ? b : a)) {
      if (a % idx == 0 && b % idx == 0) {
        gcdWhile = idx;
      }
      idx++;
    }
    System.out.println(gcdWhile);
  }

  public static void pg8_3() {
    int a = 1002, b = 424;
    int gcdFor = 0, gcdWhile = 0;

    // for
    for (; b != 0;) {
      if (a > b) {
        a %= b;
      } else {
        int temp = a;
        a = b;
        b = temp;
      }
    }
    gcdFor = a;
    System.out.println(gcdFor);

    // while
    while (b != 0) {
      int temp = a;
      a = b;
      b = temp % b;
    }
    gcdWhile = a;
    System.out.println(gcdWhile);
  }

  public static void pg8_4() {
    int n = 34;
    int cnt = 0;

    // for
    for (int i = 1; i <= n; i++) {
      if (n % i == 0) {
        cnt++;
      }
    }

    if (cnt == 2) {
      System.out.println(n + " is a prime number.");
    } else {
      System.out.println(n + " is not a prime number");
    }

    // while
    int idx = 0;
    cnt = 0;
    while (idx < n) {
      if (n % ++idx == 0) {
        cnt++;
      }
    }

    if (cnt == 2) {
      System.out.println(n + " is a prime number.");
    } else {
      System.out.println(n + " is not a prime number");
    }
  }

  public static void pg8_5() {
    int n = 34;
    int cnt = 0;

    // for
    for (int i = 1; i <= n; i++) {
      if (cnt <= 2) {
        if (n % i == 0) {
          cnt++;
        }
      } else {
        break;
      }
    }

    if (cnt == 2) {
      System.out.println(n + " is a prime number.");
    } else {
      System.out.println(n + " is not a prime number");
    }

    // while
    int idx = 0;
    cnt = 0;
    while (idx < n) {
      if (n % ++idx == 0) {
        cnt++;
      }

      if (cnt > 2) {
        break;
      }
    }

    if (cnt == 2) {
      System.out.println(n + " is a prime number.");
    } else {
      System.out.println(n + " is not a prime number");
    }
  }

  public static void pg8_6() {
    Scanner sc = new Scanner(System.in);
    double average = 0;
    int input;

    for (int i = 0; i < 5; i++) {
      input = sc.nextInt();
      average += input;
    }

    System.out.println(average / 5.0);
    sc.close();
  }

  public static void pg9() throws IOException {
    int input = 0;
    int odd = 0;
    int even = 0;

    do {
      input = (int) System.in.read();
      if (input % 2 == 0) {
        odd++;
      } else {
        even++;
      }
    } while (input >= 0);

    System.out.println("even: " + even + ", odd: " + odd);
  }
}