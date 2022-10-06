public class Test {
    public static void main (String[] args) {

        int[] array = {9, 2, 6, 4, 5, 12, 7, 8, 6};
        int s = array[0];
        for (int i = 1; i < array.length; i++) {
            s = s + array[i];
        }
        System.out.println(String.format("summa is %d", +s));
    }
}
