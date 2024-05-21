public class TernaryOperator{
    public static void main(String[] args) {
        // System.out.println(23 + 49);
        // Ternary Operator
        int a = 45;
        int b = 69;
        int res = (a > b) ? a : b; // this simply means if a > b then return a else return b
        // System.out.println(res);

        String ans = (b > a) ? "b is greater" : "a is greater";
        // System.out.println(ans);

        int c = 58;

        int newAns = (a > b) ? ((a > c) ? a : b) : ((b > c) ? b : c); // this means if a > b then check if a > c and if this is also true return a else return b but if a > b is false then check if b > c and if this is true return b else return c
        // System.out.println(newAns);

        // the above condition can be written with if else as shown below

        if (a > b){
            if (a > c){
                System.out.println(a);
            }
            else{
                System.out.println(b);
            }
        }
        else{
            if (b > c){
                System.out.println(b);
            }
            else{
                System.out.println(c);
            }
        }
    }
}