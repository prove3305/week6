import java.util.Scanner;

public class Question8 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[] numbers = {2, 4, 6, 8, 10};

        System.out.println("값을 입력해 주세요: ");
        int num = input.nextInt();

        boolean flag = false;

        for(int i = 0; i < numbers.length; i++) {
            if (num == numbers[i])
            {
                flag = true;
                break;
            }
        }
        if(flag)
        {
            System.out.println("존재 합니다.");
        }
        else
        {
            System.out.println("존재하지 않습니다.");
        }
    }
}

