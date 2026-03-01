public class Method_Overloading {
    public static int sum(int a, int b) {
        return a + b;
    }

    public static double sum(double a, int b) {
        return a + b;
    }

    public static double sum(double a, double b) {
        return a + b;
    }

    public static String sum(String a, String b) {
        return a + b;

    }

    public static void main(String[] args) {
int result1=sum(100, 200);
double result2=sum(10.9, 200);
double result3=sum(100.7, 200.89);
String result4=sum("paras", "ram");

String result5=("paras"+ 1);

System.out.println(result1);
System.out.println(result2);
System.out.println(result3);
System.out.println(result4);
System.out.println(result5);
    }
}
