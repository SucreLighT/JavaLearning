package pokerGameDemo;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;

/**
 * @author sucre
 * @date 2019-08-13
 * @time 11:04
 * @description
 */

/*
    模拟斗地主
    1.准备一副牌（54张）
    2.洗牌（打乱牌的顺序）
    3.发牌（三个人）
    4.留三张底牌
    5.每个人拿到牌后对牌排序
    6.出牌...
 */

public class Demo01 {
    public static void main(String[] args) {
        //1.准备一副牌
        List<String> cards = new ArrayList<String>();       //牌集合
        String[] colors = {"黑桃","红心","梅花","方块"};    //牌的花色
        String[] nums = {"2","3","4","5","6","7","8","9","10","J","Q","K","A"};

        //生成一副牌
        for (String color:colors
             ) {
            for (String num:nums
                 ) {
                String card = color + num;  //一张牌
                cards.add(card);
            }
        }
        cards.add("大王");
        cards.add("小王");

        //2.洗牌
        Collections.shuffle(cards);

        System.out.println("扑克牌："+cards);

        //3.随机留三张底牌
        List<String> underCards = new ArrayList<String>();  //底牌
        Random random = new Random();
        for (int i=0; i<3;i++){
            int index = random.nextInt(cards.size());   //确定抽取的随机数
            String undercard = cards.remove(index);     //抽取一张底牌
            underCards.add(undercard);
        }
        System.out.println("底牌：" + underCards);

        //4.发牌,除去三张底牌，还有51张
        List<String> player1 = new ArrayList<String>();
        List<String> player2 = new ArrayList<String>();
        List<String> player3 = new ArrayList<String>();

        for (int i=0; i<cards.size(); i++){
            if(i%3 == 0){
                player1.add(cards.get(i));
            }else if(i%3 == 1){
                player2.add(cards.get(i));
            }else if(i%3 == 2){
                player3.add(cards.get(i));
            }
        }

        //5.打印每个玩家的牌
        System.out.println("玩家1：" + player1);
        System.out.println("玩家2：" + player2);
        System.out.println("玩家3：" + player3);


    }
}
