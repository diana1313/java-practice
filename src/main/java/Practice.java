public class Practice {

    public static void main(String[] args) {

        System.out.println(sleepIn(false,true));
        System.out.println(monkeyTrouble(true,true));
        System.out.println(sumDouble(1,2));
        System.out.println(sumDouble(2,2));
        System.out.println(diff21(2));
        System.out.println(diff21(22));
        System.out.println(diff21(21));
        System.out.println(parrotTrouble(true,7));
        System.out.println(makes10(9,10));
        System.out.println(makes10(9,9));
        System.out.println(makes10(1,9));
    }

    private static boolean sleepIn(boolean weekday, boolean vacation) {
        return !weekday || vacation;
    }

    public static boolean monkeyTrouble(boolean aSmile, boolean bSmile) {
        return aSmile && bSmile || !aSmile && !bSmile;
    }

    public static int sumDouble(int a, int b) {
        if (a!=b){
            return a+b;
        }
        else return 2*(a+b);
    }

    public static int diff21(int n) {
        if (n<=21)
        {
            return 21-n;

        }
        else {
            return 2*(n-21);
        }
    }

    public static boolean parrotTrouble(boolean talking, int hour) {
        return talking && (hour < 7 || hour > 20);
    }

    public static boolean makes10(int a, int b) {
        return a == 10 || b == 10 || a + b == 10;
    }
}
