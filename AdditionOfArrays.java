public class AdditionOfArrays {
    public static void main(String[] args) {
        int[] array1 = { 4, 5, 1, 6, 4, 15 };
        int[] array2 = { 3, 5, 6, 1, 9, 6 };
        int[] array3 = new int[array1.length];
        for (int i = 0; i < array1.length; i++) {
            array3[i] = array1[i] + array2[i];
            System.out.println(array3[i]);
        }
    }
}
