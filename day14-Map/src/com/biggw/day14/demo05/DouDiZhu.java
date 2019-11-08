package com.biggw.day14.demo05;

import java.util.*;

/**
 * @author gw
 * @date 2019/11/6 0006 下午 17:20
 */

/*
 * 斗地主
 * */
public class DouDiZhu {
    public static void main(String[] args) {
        List<String> color = List.of("♦", "♣", "♠", "♥");
        List<String> numbers = List.of("3", "4", "5", "6", "7", "8", "9", "10", "J", "Q", "K", "A", "2");

        // 存储牌的索引
        ArrayList<Integer> pokerIndex = new ArrayList<>();
        // 存储牌的索引和组装好的牌
        HashMap<Integer, String> hashMap = new HashMap<>();
        int count = 0;
        hashMap.put(53, "小王");
        hashMap.put(54, "大王");
        for (int j = 0; j < numbers.size(); j++) {
            for (int i = 0; i < color.size(); i++) {
                ++count;
                pokerIndex.add(count);
                hashMap.put(count, color.get(i) + numbers.get(j));
            }
        }
        Collections.addAll(pokerIndex, 53, 54);
        System.out.println("pokerIndex = " + pokerIndex);
        System.out.println("hashMap = " + hashMap);

        // 洗牌
        Collections.shuffle(pokerIndex);

        ArrayList<Integer> player1 = new ArrayList<>();
        ArrayList<Integer> player2 = new ArrayList<>();
        ArrayList<Integer> player3 = new ArrayList<>();
        ArrayList<Integer> diPai = new ArrayList<>();

        ArrayList<String> player1Poker = new ArrayList<>();
        ArrayList<String> player2Poker = new ArrayList<>();
        ArrayList<String> player3Poker = new ArrayList<>();
        ArrayList<String> diPaiPoker = new ArrayList<>();

        // 发牌
        for (int i = 0; i < pokerIndex.size(); i++) {
            Integer index = pokerIndex.get(i);
            if (i >= 51) {
                diPai.add(index);
            } else if (i % 3 == 0) {
                player1.add(index);
            } else if (i % 3 == 1) {
                player2.add(index);
            } else if (i % 3 == 2) {
                player3.add(index);
            }
        }
        Collections.sort(player1);
        Collections.sort(player2);
        Collections.sort(player3);
        Collections.sort(diPai);


        Set<Integer> integers = hashMap.keySet();
        Iterator<Integer> iterator = integers.iterator();
        for (int i = 0; i < player1.size(); i++) {
            player1Poker.add(hashMap.get(player1.get(i)));
        }
        for (int i = 0; i < player2.size(); i++) {
            player2Poker.add(hashMap.get(player2.get(i)));
        }
        for (int i = 0; i < player3.size(); i++) {
            player3Poker.add(hashMap.get(player3.get(i)));
        }
        for (int i = 0; i < diPai.size(); i++) {
            diPaiPoker.add(hashMap.get(diPai.get(i)));
        }


        System.out.println("player1Poker = " + player1Poker);
        System.out.println("player2Poker = " + player2Poker);
        System.out.println("player3Poker = " + player3Poker);
        System.out.println("diPaiPoker = " + diPaiPoker);
    }

}
