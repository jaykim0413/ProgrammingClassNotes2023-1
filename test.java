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
  }
}
