package com.company;
import javax.swing.*;

public class Main {

    static int e = 100;
    static int m = 100;

    public static void main(String[] args) {

        System.out.println("Energy = " + e);
        System.out.println("Money = " + m);

        Day(m, e);
        System.out.println("==THE=END==");
    }


    public static void Day(int m, int e){

        int i = 0;
        String Y = "Y";
        System.out.println("Пробуждение");
        System.out.println("Завтрак");
        System.out.println("=======");
        while (i < 1) {
            String time = JOptionPane.showInputDialog("Время идти в универ? Y/N");
            if (time.equals(Y)) {
                System.out.println("Идем в универ");
                m -= 15;
                System.out.printf("==Деньги=%s== \n", m);
                System.out.println("=======");
                String para = JOptionPane.showInputDialog("Пара интересная?");
                if (para.equals(Y)) {
                    System.out.println("Да, конечно");
                    System.out.println("Идем на пару");
                    System.out.println("=======");
                    e -= 20;
                    System.out.printf("==Энергия=%s== \n", e);
                    System.out.println("=======");

                } else {
                    System.out.println("=======");
                    System.out.println("Прогуливаем пару");
                    System.out.println("=======");
                    e -= 10;
                    System.out.printf("==Энергия=%s== \n", e);
                    System.out.println("=======");
                }
                System.out.println("Идем на перемену");
                System.out.println("=======");
                if (e <= 60 && m >= 30)
                {
                    System.out.println("Идем в столовку");
                    m -= 30;
                    e += 25;
                    System.out.printf("==Энергия=%s==Деньги=%d=== \n", e, m);
                    System.out.println("=======");
                }
                else
                {
                    System.out.println("=======");
                    System.out.println("Отдыхаем, не голодны");
                    System.out.println("=======");
                }
            }
            else {
                String vecher = JOptionPane.showInputDialog("После пар? Y/N");
                if (vecher.equals(Y)) {
                    System.out.println("Идем домой");
                    System.out.println("=======");
                    if(e <= 40) {
                        System.out.println("=======");
                        System.out.println("Отдыхаем и ужинаем");
                        e += 30;
                        System.out.printf("==Энергия=%s== \n", e);
                        System.out.println("=======");
                        if (e > 60) {
                            System.out.println("Делаем ДЗ");
                        }
                    }
                } else {
                    String sk = JOptionPane.showInputDialog("Скучно? Y/N");
                    if (sk.equals(Y)) {
                        System.out.println("=======");
                        System.out.println("Играем");
                    } else {
                        System.out.println("=======");
                        System.out.println("Делаем ДЗ");
                    }
                }
                System.out.println("=======");
                System.out.println("Ужин");
                System.out.println("Сон");
                i = 1;
            }

        }
        System.out.println("=======");

    }



}




