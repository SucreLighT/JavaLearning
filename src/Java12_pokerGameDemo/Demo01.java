package Java12_pokerGameDemo;


import java.util.*;

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
    3.留三张底牌
    4.发牌
    5.打印每个玩家的牌

    使用map集合存储牌，对每张牌增加索引
    洗牌时使用索引代替一张牌对象进行打乱
    对每个玩家手牌的排序也使用索引
 */

public class Demo01 {
    public static void main(String[] args) {
        //1.准备一副牌
        Map<Integer,String> cards = new HashMap<Integer, String>();     //牌集合
        String[] colors = {"♠","♥","♣","♦"};    //牌的花色
        String[] nums = {"2","3","4","5","6","7","8","9","10","J","Q","K","A"};

        //生成一副牌
        int index = 0;
        for (String num:nums
             ) {
            for (String color:colors
                 ) {
                String card = color + num;  //一张牌
                cards.put(index,card);
                index++;
            }
        }
        cards.put(index,"大王");
        index++;
        cards.put(index,"小王");

        System.out.println("==========扑克牌===========");
        for (Map.Entry<Integer,String> entry:cards.entrySet()
             ) {
            System.out.println(entry.getKey()+"---"+entry.getValue());
        }

        //2.洗牌

        List<Integer> cardsIndex = new ArrayList<Integer>();
        for (Integer i:cards.keySet()
             ) {
            cardsIndex.add(i);
        }
        Collections.shuffle(cardsIndex);
        System.out.println("=========洗牌之后的索引===========");
        System.out.println(cardsIndex);


        //3.留前三张作为底牌
        Set<Integer> underCardsIndex = new TreeSet<Integer>();  //底牌
        underCardsIndex.add(cardsIndex.remove(0));
        underCardsIndex.add(cardsIndex.remove(0));
        underCardsIndex.add(cardsIndex.remove(0));
        System.out.println("==========底牌===========");
        System.out.println("底牌：" + underCardsIndex);
        lookCards("底牌：",cards,underCardsIndex);


        //4.发牌,除去三张底牌，还有51张
        Set<Integer> player1 = new TreeSet<Integer>();
        Set<Integer> player2 = new TreeSet<Integer>();
        Set<Integer> player3 = new TreeSet<Integer>();

        for (int i=0; i<cardsIndex.size(); i++){
            if(i%3 == 0){
                player1.add(cardsIndex.get(i));
            }else if(i%3 == 1){
                player2.add(cardsIndex.get(i));
            }else if(i%3 == 2){
                player3.add(cardsIndex.get(i));
            }
        }

        //5.打印每个玩家的牌
        System.out.println("==========玩家牌===========");
        System.out.println("玩家1：" + player1);
        lookCards("玩家1",cards,player1);
        System.out.println("玩家2：" + player2);
        lookCards("玩家2",cards,player2);
        System.out.println("玩家3：" + player3);
        lookCards("玩家3",cards,player3);

    }

    public static void lookCards(String player,Map<Integer,String>cards,Set<Integer>playerCardsIndexs){
        System.out.print(player);

        List<String> cardsValues = new ArrayList<String>();
        for (Integer key:playerCardsIndexs
             ) {
            cardsValues.add(cards.get(key));
        }
        System.out.println(cardsValues);
    }
}
