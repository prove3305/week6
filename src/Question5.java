public class Question5 {
    public static void main(String[] args) {
        int[] numbers = {12, 3, 19, 7, 5};
        int s = numbers[0];

        for (int i = 1; i < numbers.length; i++) {
            if (numbers[i] < s) {
                s = numbers[i];
            }
        }

        System.out.println("최소값: " + s);  // 50 출력
    }
}
