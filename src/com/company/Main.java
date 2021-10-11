package com.company;


import java.util.Random;
import java.util.Scanner;

public class Main
{
    public int randomDice()
    {
        Random random = new Random();
        return random.nextInt(6)+1;
    }

    public static void main(String[] args)
    {
        Main main = new Main();

        int prize = 0;
        boolean contuniue  = true;

      while(contuniue && prize<50)
      {
          System.out.println("Price : " + prize );
          int diceroll = main.randomDice();
          System.out.println("Dice : "+ diceroll );

          if(diceroll == 1 || diceroll ==2 )
          {
              System.out.println("Game Over");
              contuniue = false;
          }
          else if (diceroll == 3)
          {
              System.out.println("Try Again");
          }
          else
              prize = prize + diceroll;
          System.out.println("Your Prize : " + prize );
      }

    }
}
