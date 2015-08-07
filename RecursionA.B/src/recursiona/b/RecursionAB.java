
package recursiona.b;

public class RecursionAB {
    public static void No (int n) {
if (n == 10) {
System.out.println ("Finish!");
} else {
System.out.println (n);
No (n+1);
}
}

    public static void main(String[] args) {
System.out.println("No.");
No(1);
    }
    
}
