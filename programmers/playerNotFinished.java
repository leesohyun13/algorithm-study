import android.os.Build;

import java.util.HashMap;

/**
 * codingTest
 * Class: playerNotFinished
 * Created by leesohyun on 2021/02/24.
 * <p>
 * Description: 프로그래머스, 해시, 완주하지 못한 선수
 */

class playerNotFinished {
    public String solution(String[] participant, String[] completion) {
        String answer = "";

        HashMap<String, Integer> hashMap = new HashMap<>();
        for (String player: participant) {
            hashMap.put(player, hashMap.getOrDefault(player, 0) + 1);
        }
        for (String player: completion) {
            hashMap.put(player, hashMap.get(player) - 1);
        }
        for (String key: hashMap.keySet()) {
            if (hashMap.get(key) != 0) {
                answer = key;
                break;
            }
        }

        return answer;
    }
}
