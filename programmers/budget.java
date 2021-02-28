import java.util.Arrays;

/**
 * codingTest
 * Class: budget
 * Created by leesohyun on 2021/02/24.
 * <p>
 * Description: 프로그래머스, 예산
 */

class budget {
    public int solution(int[] d, int budget) {
        int answer = 0;

        Arrays.sort(d);

        for (Integer integer : d) {
            budget -= integer;

            if (budget < 0) break;

            ++ answer;
        }

        return answer;
    }
}
