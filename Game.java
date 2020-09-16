package ru.kpfu.itis.group905.safarova.inf.points.project_905;


import java.util.*;

public class Game {

    static final char[][] pole = new char[3][3];
    static final char h = '0';
    static final char c = 'x';

        static void mas() //заполняем поле точками
        {
            for (int i = 0; i < 3; i++) {
                for (int j = 0; j < 3; j++) {
                    pole[i][j] = '.';
                }
            }
        }


        static void print() //выводим на экран
            {

                for (int i = 0; i < 3; i++) {
                    for (int j = 0; j < 3; j++) {
                        System.out.println(pole[i][j]);
                    }
                    System.out.println();
                }
            }

    static void human() //ходит человек
    {
        Scanner sc = new Scanner(System.in);
        int i;
        int j;
        i = sc.nextInt();
        j = sc.nextInt();
        if ((i > 0 && i < 3) && (j > 0 && j < 3) && (pole[i][j] == '.')) ;
        {
            pole[i][j] = h;
        }

    }

    static void comp() {
        Random ran = new Random();
        int i;
        int j;
        i = ran.nextInt(3);
        j = ran.nextInt(3);
        if ((i > 0 && i < 3) && (j > 0 && j < 3) && (pole[i][j] == '.')) ;
        {
            pole[i][j] = c;
        }

    }

    static boolean win(char symbol)
    {
        int rez = 0;
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if (pole[i][j] == pole[i][j + 1] && pole[i][j] == pole[i][j + 2]
                        || pole[i][j] == pole[i + 1][j] && pole[i][j] == pole[i + 2][j]
                        || pole[i][j] == pole[i + 1][j + 1] && pole[i][j] == pole[i + 2][j + 2]
                        || pole[i][j + 2] == pole[i + 1][j + 1] && pole[i][j + 2] == pole[i + 1][j]) {

                    rez++;
                }
            }
        }
        if (rez == 3) {
            return true;
        }
        return false;
    }


}



