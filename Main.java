package ru.kpfu.itis.group905.safarova.inf.points.project_905;

import static ru.kpfu.itis.group905.safarova.inf.points.project_905.Game.*;

public class Main {
    public static void main(String[] args) {
        mas();
        print();
        while (true)
        {
            human();
            print();
            if (win(h))
            {
                System.out.println("You win!");
                break;
            }
            comp();
            print();
            if (win(c))
            {
                System.out.println("Comp wins");
                break;
            }
        }
    }


}
