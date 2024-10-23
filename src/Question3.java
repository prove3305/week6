public class Question3 {
    public static void main(String[] args) {
        int[] nubmers = {10, 20, 30, 40, 50};
        int sum = 0;

        for(int i = 0; i < nubmers.length; i++)
        {
            sum += nubmers[i];
        }
        System.out.println(sum);



        /*
        int result = nubmers[0] + nubmers[1] + nubmers[2] + nubmers[3] + nubmers[4];

        System.out.println("배열의 합 :" + result);

         */
    }
}
