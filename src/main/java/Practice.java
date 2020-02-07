public class Practice {

    public static void main(String[] args) {

        System.out.println(sleepIn(true,true));

    }

    private static boolean sleepIn(boolean weekday, boolean vacation) {
        if (!weekday | vacation) {
            return true;
        } else return false;

    }
}
