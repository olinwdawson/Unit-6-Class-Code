package lesson2;

import lesson1.Henry;

public class Main {
    public static void main(String[] args) {
        //create with initial values
        int[] scores = {47,82,36,95,74,64,53,92};


        //print scores
        for(int i = 0; i<scores.length; i++){
            System.out.print(scores[i] + " ");
        }

        //using an enhanced for loop
        for(int score:scores){
            System.out.println(score);
        }
    }
}
