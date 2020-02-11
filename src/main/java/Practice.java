public class Practice {

    public static void main(String[] args) {

        System.out.println(sleepIn(true,true));
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
        if (!weekday || vacation) {
            return true;
        } else return false;

    }

    public static boolean monkeyTrouble(boolean aSmile, boolean bSmile) {
        if (aSmile&&bSmile || !aSmile&&!bSmile) {
            return true;
        }
        return false;
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
        if (talking && (hour < 7 || hour > 20)) {
            return talking = true;
        }
        return false;
    }

    public static boolean makes10(int a, int b) {
        if (a==10 || b==10 || a+b==10){
            return true;}
        return false;
    }
}
