package problem;

import java.util.HashMap;

public class Zolando {

    public static void main(String[] args) {

        System.out.println(solution(268));


    }

    public static String solution(int N) {
        StringBuilder str = new StringBuilder();
        for (int i = 1; i <= N; i++) {
            if (i >= 2 && i % 2 == 0) {
                str.append("-");
            } else {
                str.append("+");
            }
        }
        return String.valueOf(str);
    }

    public static int solution2(int N) {
        int digit = 5;
        if (N == 0) {
            return digit * 10;
        }
        int negative = N / Math.abs(N);
        N = Math.abs(N);
        int number = N;
        int maxValue = Integer.MIN_VALUE;
        int count = 0;
        int position = 1;
        while (number > 0) {
            count++;
            number = number / 10;
        }
        for (int i = 0; i <= count; i++) {
            int newValue = ((N / position) * (position * 10) + (digit * position) + (N % position));
            if (newValue * negative > maxValue) {
                maxValue = newValue * negative;
            }
            position = position * 10;
        }
        return maxValue;
    }


    public static int solution(int[] A) {
        // write your code in Java SE 8
        int count = 0;
        HashMap<Integer, Integer> map = new HashMap<>();

        int i = -1;
        int sum = 0;
        map.put(0, 1);
        while (i < A.length - 1) {
            i++;
            sum += A[i];
            if (map.containsKey(sum)) {
                count += map.get(sum);
                map.put(sum, map.get(sum) + 1);
            } else {
                map.put(sum, 1);
            }
        }
        return count;
    }


}
