public class Multiples {
    public static void main(String[] args) {
        int count = 0;

        int i = 1;
        while (i < 1000) {
            boolean mulOf3 = i % 3 == 0;
            boolean mulof5 = i % 5 == 0;

            if (mulOf3 || mulof5) {
                count++;
            }

            i++;
        }
        System.out.println(count);
    }
}
