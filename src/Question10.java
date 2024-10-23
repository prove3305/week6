public class Question10 {
    public static void main(String[] args) {
        int[] num = {20, 30, 50, 70, 90};
        int sum = 0;

        for(int i = 0; i < num.length; i++)
        {
            sum += num[i];
        }
        double result = (double) sum / num.length;
        System.out.println("요소들의 평균: " + result);
    }
}
