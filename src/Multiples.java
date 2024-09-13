public class Multiples {
    public static void main(String[] args) {
        int toReturn = 0;
        for (int i = 1; i < 1000; i++) {
            if (i % 3 == 0 || i % 5 == 0) {
                toReturn++;
            }
        }
        System.out.println(toReturn);
    }
}
