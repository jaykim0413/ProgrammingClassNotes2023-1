public class test {
  public static void main(String[] args) {
    int a = 10000;
    String stringA = Integer.toBinaryString(a);

    while (stringA.length() < 32) {
      stringA = "0" + stringA;
    }

    System.out.println(stringA);

    a = ~a;
    stringA = Integer.toBinaryString(a);

    while (stringA.length() < 32) {
      stringA = "0" + stringA;
    }

    System.out.println(stringA);

    double b = 23.345345453456;
    System.out.println("\n" + b);
    System.out.println(Math.round(b));
    long c = Math.round(b);
    Long longB = Double.doubleToLongBits(b);
    String stringB = Long.toBinaryString(longB);
    String stringC = Long.toBinaryString(c);
    while (stringC.length() < 64) {
      stringC = "0" + stringC;
    }
    while (stringB.length() < 64) {
      stringB = "0" + stringB;
    }
    System.out.println(stringB);
    System.out.println(stringC);
  }
}
