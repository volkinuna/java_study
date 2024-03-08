package ch15.sec04.exam01;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class HashMapExample {
    public static void main(String[] args) {
        Map<String, Integer> map = new HashMap<>();

        // 객체 저장
        map.put("최볼키", 85);
        map.put("최코코", 90);
        map.put("유교빈", 80);
        map.put("유원빈", 95);
        map.put("반싹", 70);

        System.out.println("총 Entry 수 : " + map.size());

        // 키로 값 얻기
        int value = map.get("최코코");
        System.out.println("최코코의 점수 : " + value);

        value = map.get("반싹");
        System.out.println("반싹의 점수 : " + value);

        System.out.println();

        map.remove("최볼키");

        // HashMap 데이터를 모두 읽어오기
        // 첫번째 방법 : 모든 key를 가져와 Iterator 객체로 변경
        Set<String> keySet = map.keySet();
        Iterator<String> keyIterator = keySet.iterator();

        while (keyIterator.hasNext()) {
            String k = keyIterator.next();
            Integer v = map.get(k);
            System.out.println(k + " : " + v);
        }

        System.out.println();

        // 두번째 방법
        Set<Map.Entry<String, Integer>> entrySet = map.entrySet();
        Iterator<Map.Entry<String, Integer>> entryIterator = entrySet.iterator();

        while (entryIterator.hasNext()) {
            Map.Entry<String, Integer> entry = entryIterator.next();
            String k = entry.getKey();
            Integer v = entry.getValue();
            System.out.println(k + " : " + v);
        }
    }
}
