import java.util.Scanner;

public class mayhem {
  public static void main(String[] args) {
    class1(args);
    class2();
    class3();
    class4();
    class5();
    class6();
    class7();
    class8();
    class9();
    System.out.println();
  }

  public static void class1(String[] args) {
    // Class 1 : User Input

    // Scanner Class
    Scanner sc = new Scanner(System.in);

    int ScannerInput = sc.nextInt();
    System.out.println("\nScanner Input Value: " + ScannerInput);

    // Command Line Input
    int CLInput = Integer.parseInt(args[0]);
    System.out.println("Command Line Input Value: " + CLInput);

    sc.close();
  }

  public static void class2() {
    // Class 2 : Operators
    System.out.println("\n");
    /*
     * Operators ...
     * by function : 산술, 논리, 비교, 부호, 괄호, 비트논리, 비트조작, 조건(삼항), 형변환, 증감, 대입(확장된 대입 연산자)
     * by # of Operands : 단항, 이항, 삼항
     * by relative location to Operands : 전위형, 중위형, 후위형
     * 
     * 연산자의 우선 순위: 연산자를 계산하는 순서
     * 연산자의 결합 방향: 연산자를 계산할 때 피연산자를 읽는 방향
     */

    // 연산자에 따른 연산 결과 예시 :
    int int1 = 40, int2 = 50;
    double double1 = 3.54, double2 = 2.78;

    System.out.println("산술 연산자 연습 : +, -, *, /, %");
    System.out.println("(int1 + int2) : " + int1 + " + " + int2 + " => " + (int1 + int2));
    System.out.println("(int1 - int2) : " + int1 + " - " + int2 + " => " + (int1 - int2));
    System.out.println("(int1 * int2) : " + int1 + " * " + int2 + " => " + (int1 * int2));
    System.out.println("(int1 / int2) : " + int1 + " / " + int2 + " => " + (int1 / int2));
    System.out.println("(int1 % int2) : " + int1 + " % " + int2 + " => " + (int1 % int2));
    System.out.println();
    System.out.println("(double1 + double2) : " + double1 + " + " + double2 + " => " + (double1 + double2));
    System.out.println("(double1 - double2) : " + double1 + " - " + double2 + " => " + (double1 - double2));
    System.out.println("(double1 * double2) : " + double1 + " * " + double2 + " => " + (double1 * double2));
    System.out.println("(double1 / double2) : " + double1 + " / " + double2 + " => " + (double1 / double2));
    System.out.println("(double1 % double2) : " + double1 + " % " + double2 + " => " + (double1 % double2));

    System.out.println("\n관계 연산자 연습 : >, >=, <, <=, ==, !=");
    System.out.println("(int1 > int2) : " + int1 + " > " + int2 + " => " + (int1 > int2));
    System.out.println("(int1 >= int2) : " + int1 + " >= " + int2 + " => " + (int1 >= int2));
    System.out.println("(int1 < int2) : " + int1 + " < " + int2 + " => " + (int1 < int2));
    System.out.println("(int1 <= int2) : " + int1 + " <= " + int2 + " => " + (int1 <= int2));
    System.out.println("(int1 == int2) : " + int1 + " == " + int2 + " => " + (int1 == int2));
    System.out.println("(int1 != int2) : " + int1 + " != " + int2 + " => " + (int1 != int2));
    System.out.println();
    System.out.println("(double1 > double2) : " + double1 + " > " + double2 + " => " + (double1 > double2));
    System.out.println("(double1 >= double2) : " + double1 + " >= " + double2 + " => " + (double1 >= double2));
    System.out.println("(double1 < double2) : " + double1 + " < " + double2 + " => " + (double1 < double2));
    System.out.println("(double1 <= double2) : " + double1 + " <= " + double2 + " => " + (double1 <= double2));
    System.out.println("(double1 == double2) : " + double1 + " == " + double2 + " => " + (double1 == double2));
    System.out.println("(double1 != double2) : " + double1 + " != " + double2 + " => " + (double1 != double2));

    double1 = 1.0 / 3.0;
    double2 = 0.33333333333333334;
    System.out.println("\n(double1 == double2) : " + double1 + " == " + double2 + " => " + (double1 == double2));
    System.out.println("(double1 != double2) : " + double1 + " != " + double2 + " => " + (double1 != double2));

    double2 = 0.12345678901234567890;
    System.out.println(double2);

    System.out.println("\n논리 연산자 연습 : &&, ||, !");
    boolean boolean1 = true, boolean2 = false;
    System.out.println("(boolean1 && boolean2) : " + boolean1 + " && " + boolean2 + " => " + (boolean1 && boolean2));
    System.out.println("(boolean1 || boolean2) : " + boolean1 + " || " + boolean2 + " => " + (boolean1 || boolean2));
    System.out.println("(! boolean1) : !" + boolean1 + " => " + (!boolean1));

    int1 = -25;
    int nShift = 33;
    System.out.println("\n쉬프트 연산자 연습 : >>, >>>, <<");
    System.out.println("(int1 >> nShift ) : " + int1 + " >> " + nShift + " => " + (int1 >> nShift));
    System.out.println("(int1 >>> nShift) : " + int1 + " >>> " + nShift + " => " + (int1 >>> nShift));
    System.out.println("(int1 << nShift) : " + int1 + " << " + nShift + " => " + (int1 << nShift));

    System.out.println("\n비트논리 연산자 연습 : &, |, ^, ~");
    int1 = 7;
    int2 = 13;
    System.out.println("(int1 & int2 ) : " + int1 + " & " + int2 + " => " + (int1 & int2));
    System.out.println("(int1 | int2 ) : " + int1 + " | " + int2 + " => " + (int1 | int2));
    System.out.println("(int1 ^ int2 ) : " + int1 + " ^ " + int2 + " => " + (int1 ^ int2));
    System.out.println("(~int1) : ~" + int1 + " => " + (~int1));

    System.out.println("\n증가,감소 연산자 연습 : ++, --");
    int1 = 1;
    System.out.println("연산 전 i의 값은 : " + int1);
    int1 = int1 + 1;
    System.out.println("연산 후 i의 값은 : " + int1);
    int1++;
    System.out.println("증가연산자 후위 사용 후 i의 값은 : " + int1);
    ++int1;
    System.out.println("증가연산자 전위 사용 후 i의 값은 : " + int1);

    int1 = 100;
    System.out.println("int1++ => " + (int1++));

    int1 = 100;
    System.out.println("++int1 => " + (++int1));

    System.out.println("\n부호 연산자 연습 : +, -");
    int1 = 10;
    int2 = -10;
    System.out.println("+int1 => " + (+int1));
    System.out.println("-int2 => " + (-int2));

    System.out.println("\n캐스트 연산자 연습 : (type)");
    double t1 = 3.4 + 5.7;
    double t2 = 3.4 + (int) 5.7;
    double t3 = (int) 3.4 + (int) 5.7;

    System.out.println(t1);
    System.out.println(t2);
    System.out.println(t3);

    System.out.println("\n삼항 연산자 연습 : \"(조건)?(식1):(식2)\"");

    int score = 97;
    final int CRITERIA = 60;
    System.out.println("\nYou " + (score >= CRITERIA ? "PASS" : "FAIL") + "ed the Exam!!!");

    char grade = score >= 90 ? 'A' : score >= 80 ? 'B' : score >= 70 ? 'C' : score >= 60 ? 'D' : 'F';
    System.out.println("Your score is " + score + ", grade is " + grade);

    int1 = 10;
    System.out.println("\n확장된 대입연산자 연습 : 산술연산자=");
    System.out.println("현재 변수값 : int1 => " + int1);
    System.out.println("(int1 += 3) => " + (int1 += 3));
    System.out.println("현재 변수값 : int1 => " + int1);
    System.out.println("(int1 *= 2) => " + (int1 *= 2));

    System.out.println("\n확장된 대입연산자 연습 : 시프트연산자=");
    System.out.println("현재 변수값 : int1 => " + int1);
    System.out.println("(int1 <<= 2) => " + (int1 <<= 2));
    System.out.println("현재 변수값 : int1 => " + int1);
    System.out.println("(int1 >>= 2) => " + (int1 >>= 2));

    System.out.println("\n확장된 대입연산자 연습 : 비트논리연산자=");
    System.out.println("현재 변수값 : int1 => " + int1);
    System.out.println("(int1 &= 10) => " + (int1 &= 10));
    System.out.println("현재 변수값 : int1 => " + int1);
    System.out.println("(int1 ^= 0xffff) => " + (int1 ^= 0xffff));

    System.out.println("\n괄호연산자 연습");
    System.out.println(" 3+4*10 => " + (3 + 4 * 10));
    System.out.println("(3+4)*10 => " + ((3 + 4) * 10));
  }

  public static void class3() {
    // Class 3 : Operators cont'd
    System.out.println("\n");

    /*
     * 연산자의 종류 연산 방향 연산자 우선순위
     * -------------------------------------------------------------------
     * 단항 연산자 <- {++,--,+,-,~,!} 높음
     * 산술 연산자 -> {*,/,%}
     * -> {+,-}
     * -> {<<,>>,>>>}
     * 비교 연산자 -> {<,>,<=,>=,instanceof}
     * -> {==,!=}
     * 논리 연산자 -> {&}
     * -> {^}
     * -> {|}
     * -> {&&}
     * -> {||}
     * 삼항 연산자 -> {? :}
     * 대입 연산자 <- {=,*=,/=,+=,-=,<<=,>>=,>>>=,&=,^=,|=} 낮음
     * -------------------------------------------------------------------
     * 
     * 주의 사항
     * 1. <<, >>, >>>은 덧셈연산자보다 우선순위가 낮다
     * 2. ||, |는 &&, &보다 우선순위가 낮다
     */

    System.out.println("연산자의 종류" + "\t\t" + "연산 방향" + "\t\t\t\t\t\t\t" + "연산자 우선순위");
    System.out.println(
        "--------------------------------------------------------------------------------------------------------------");
    System.out.println("단항 연산자" + "\t\t" + "<-" + "\t\t" + "{++,--,+,-,~,!}" + "\t\t\t\t\t" + "높음");
    System.out.println("산술 연산자" + "\t\t" + "->" + "\t\t" + "{*,/,%}");
    System.out.println("\t\t\t" + "->" + "\t\t" + "{+,-}");
    System.out.println("\t\t\t" + "->" + "\t\t" + "{<<,>>,>>>}");
    System.out.println("비교 연산자" + "\t\t" + "->" + "\t\t" + "{<,>,<=,>=,instanceof}");
    System.out.println("\t\t\t" + "->" + "\t\t" + "{==,!=}");
    System.out.println("논리 연산자" + "\t\t" + "->" + "\t\t" + "{&}\n" + "\t\t\t" + "->" + "\t\t" + "{^}\n"
        + "\t\t\t" + "->" + "\t\t" + "{|}\n" + "\t\t\t" + "->" + "\t\t" + "{||}");
    System.out.println("삼항 연산자" + "\t\t" + "->" + "\t\t" + "{? :}");
    System.out.println("대입 연산자" + "\t\t" + "<-" + "\t\t" + "{=,*=,/=,+=,-=,<<=,>>=,>>>=,&=,^=,|=}" + "\t\t" + "낮음");
    System.out.println(
        "--------------------------------------------------------------------------------------------------------------");
  }

  public static void class4() {
    // Class 4 : Conditional Control
    System.out.println("\n");

    // Uses keywords if-else or switch-case
    System.out.println("if-else if-else :\n");
    System.out.println(
        "if ( conditional #1 ) {\n\texpression #1;\n}\nelse if ( conditional #2 ) {\n\texpression #2;\n}\n\n...\n\nelse if ( conditional #n ) {\n\texpression #n;\n}\nelse {\n\texpression Terminal;\n}");
    System.out.println("\nswitch-case :\n");
    System.out.println(
        "switch ( Numerical Operation / Variable ) {\n\tcase ( value #1 ) :\n\t\texpression #1-1;\n\t\texpression #1-2;\n\t\t...\n\t\tbreak; // Optional!\n\tcase ( value #2 ) :\n\t\texpression #2-1;\n\t\texpression #2-2;\n\t\t...\n\t\tbreak; // Optional!\n\tcase ( value #3 ) :\n\t\texpression #3-1;\n\t\texpression #3-2;\n\t\t...\n\t\tbreak; // Optional!\n\n\t...\n\n\tcase ( value #n ) :\n\t\texpression #n-1;\n\t\texpression #n-2;\n\t\t...\n\t\tbreak; // Optional!\n\tdefault :\n\t\texpression Terminal-1;\n\t\texpression Terminal-2;\n\t\t...\n\t\tbreak; // Optional!\n}");
  }

  public static void class5() {
    // Class 5 : Repetition Control (while & for)
    System.out.println("\n");

    // Comparison of while & for
    System.out.println(
        "for loop :\n\nfor ( initial value ; conditional exp. ; increase/decrease ) {\n\tExpression #1;\n\tExpression #2;\n\n\t...\n\n\tExpression #n;\n}");
    System.out.println(
        "\n\nwhile loop :\n\nwhile ( conditionla exp. ) {\n\tExpression #1;\n\tExpression #2;\n\n\t...\n\n\tExpression #n;\n}");
    System.out.println("\n\nfor ( #1 ; #2 ; #3 ) {\t\t=>\t\twhile ( #2 ) {\t// #1 is written outside the loop");
    System.out.println("\t\t\t\t=>");
    System.out.println("\t#4;\t\t\t=>\t\t\t#4;");
    System.out.println("\t\t\t\t=>\t\t\t#3;\t// \"Increase / Decrease\" is included in the loop");
    System.out.println("}\t\t\t\t=>\t\t}");
  }

  public static void class6() {
    // Class 6 : Repetition Control Cont'd (while & do ... while)
    System.out.println("\n");

    // Comparison of while & do ... while
    System.out.println("while loop :\n\nwhile( #2 ) {\n\t#4-1;\n\t#4-2;\n\n\t...\n\n\t#4-n;\n}");
    System.out.println("\nIteration Order : ( Check #2 ) --> #4 .iterate until #2 returns false\n\n");
    System.out.println("do ... while loop :\n\ndo {\n\t#4-1;\n\t#4-2;\n\n\t...\n\n\t#4-n;\n} while ( #2 );");
    System.out.println("\nIteration Order : #4 --> ( Check #2 ) --> #4 .iterate until #2 returns false");
  }

  public static void class7() {
    // Class 7 : Repetition Control Cont'd
    System.out.println("\n");

    // Comparison of all three keyword sets
    System.out.println("for & while : 서로 제한 없이 호환될 수 있다.");
    System.out.println("while & do ... while : do ... while은 조건에 무관하게 무조건 한번 실행을 하기에 무조건적인 호환은 불가능하다.");
  }

  public static void class8() {
    // Class 8 : Methods
    System.out.println("\n");

    // Format of a Method
    System.out.println("header / 헤더 {\t\t>>\t접근제어자 기타제어자 리턴타입 메소드이름( Argument(s) ) {");
    System.out.println("\t\t\t>>\n\tbody\t\t>>\t// 메소드 본체를 이루는 문장\n\t바디\t\t>>\t// return Value;\n}\t\t\t>>\t}\n");

    System.out.println("메소드 이름\n: 변수 이름 작성 규칙과 동일\n: 소문자로 시작\n: 띄어쓰기 X\n");
    System.out.println(
        "Arguments\n\n: 메소드에 사용할 외부 값\n: Arguments는 0개 이상\n: 타입과 변수 이름을 작성해서 메소드로 받는다.\n: 같은 타입을 입력할 때도 각각 매번 데이터 타입을 작성 해주어야 한다.\n");
    System.out.println("return\n: 헤더에 있는 리턴 타입과 동일한 타입을 가진 값을 return 해주어야 한다.\n");
    // Uses of Methods
    System.out.println("재귀 메소드가 아닌 경우,\nmain을 제외하고 단 하나의 메소드만 존재한다면 main 메소드만이 다른 메소드를 호출할 수 있다.\n");
    System.out.println("메소드는 자신의 리턴 타입으로 쓰인다.\n");
    // Why do we use Methods?
    System.out.println(
        "반복되는 코드를 다시 작성하지 않아도 된다.\n: 프로그램이 논리적으로 간결해진다.\n: 우선 선언된 메소드는 이후 다시 사용할 수 있다.(재사용성)\n\n\"모듈화 Modularity\"");
  }

  public static void class9() {
    // Class 9 : Method Overloading & API
    System.out.println("\n");

    // Overloading
    System.out.println(
        "메소드 오버로딩: 같은 이름의 메소드를 다른 Signiture(시그니처)를 가지고 선언하는 것\n\n>> 시크니처 란? Method 고유의 정체성(?)과 같은 것(Ex. methodName, # of Arguments, Arguments의 타입)\n\n>> 메소드 오버로딩에서는 이름이 같은 메소드를 두 개 이상 만드는 것이니,\n- 메소드가 받는 Arguments(parameters)의 개수를 다르게 해주거나\n- 메소드가 받는 Arguments(parameters) 중 하나의 타입이라도 다르게 바꿔주거나\n- Arguments의 개수와 타입 모두를 바꿔주면 Method Overloading이 이루어진다.");
    // API
    System.out.println(
        "API는 Application Programming Interface의 약자로 Programmer들이 많이 사용하는 Method를 모아둔 일종의 메소드 모음집이다.\n\nJAVA에서도 이런 API가 있는데, 이를 JAVA API Class라고 한다.\n- String과 같은 데이터 타입을 나타내는 Class(클래스)가 포함되어 있기도 하다.\n- 이외에도 입력을 받을 때 사용하는 Scanner 클래스 또한 java.util이라고 하는 Package 안에 있는 Scanner라는 클래스를 import 키워드를 통해서 불러오는 것으로 JAVA API Class에 속한다.\n\n이런 JAVA API에 있는 Class 혹은 Method는 import 키워드를 class 선언문 이전에 입력해서 사용할 수 있다.");
  }

  public static void class10() {
    // Class 10 : Recusive Methods
    System.out.println("\n");

    // Definition of Recursion

    // Two types of Recursion & Recursion with Memoization
  }
}