public class IntEqualityPrinter {
    public static void printEqual(int arg1, int arg2, int arg3) {
        if(arg1 < 0 || arg2 < 0 || arg3 < 0) {
            System.out.println("Invalid Value");
        }
        else {
            if (arg1 != arg2 && arg1 !=arg3 && arg2 != arg3) {
                System.out.println("All numbers are different");
            }
            else if (arg1 == arg2 && arg1 == arg3) {
                System.out.println("All numbers are equal");
            }
            else {
                System.out.println("Neither all are equal or different")
            }
        }
    }
}