package com.biggw.day12.demo04;

import com.sun.source.tree.NewArrayTree;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;

/**
 * @author gw
 * @date 2019/11/5 0005 下午 16:45
 */
public class DouDiZhu {
    public static void main(String[] args) {
        ArrayList<String> player1 = new ArrayList<>();
        ArrayList<String> player2 = new ArrayList<>();
        ArrayList<String> player3 = new ArrayList<>();
        ArrayList<String> diPai = new ArrayList<>();

        String[] color = {"♦", "♣", "♠", "♥"};
        String[] numbers = {"3", "4", "5", "6", "7", "8", "9", "10", "J", "Q", "K", "A", "2"};

        ArrayList<String> poker = new ArrayList<>();
        poker.add("大王");
        poker.add("小王");

        for (String string : color) {
            for (String number : numbers) {
                poker.add(string + number);
            }
        }

        Collections.shuffle(poker);

        for (int i = 0; i < poker.size(); i++) {
            if (i >= 51) {
                diPai.add(poker.get(i));
            } else if (i % 3 == 0) {
                player1.add(poker.get(i));
            } else if (i % 3 == 1) {
                player2.add(poker.get(i));
            } else {
                player3.add(poker.get(i));
            }
        }
        System.out.println("player1 = " + player1);
        System.out.println("player2 = " + player2);
        System.out.println("player3 = " + player3);
        System.out.println("diPai = " + diPai);

    }
}
