package collectionDemo;

import java.util.HashMap;
import java.util.Map;

/**
 * @author sucre
 * @date 2019-08-12
 * @time 10:09
 * @description 案例：统计字符串中每个字符出现的次数
 */

public class Demo09 {
    public static void main(String[] args) {
        String str = "aabbbbcccccddddeffff";
        Map<Character,Integer> map = new HashMap<Character, Integer>();

        for(int i=0; i<str.length(); i++){
            char ch = str.charAt(i);
            if(map.containsKey(ch)){
                map.put(ch,map.get(ch)+1);
            }else {
                map.put(ch,1);
            }
        }
        System.out.println(map);
    }
}
