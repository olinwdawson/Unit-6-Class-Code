package lesson1;

public class Main {
    public static void main(String[] args) {
        //create with initial values
        int[] scores = {47,82,36,95,74,64,53,92};

        //create with default values
        String[] defaultScores = new String[8];
        Henry[] listOHenrys = new Henry[10];
        Henry latestHenry = new Henry(15,"Henry 2.0","Windows ME");

        //change a value
        listOHenrys[0] = latestHenry;

        //print scores
        for(int i = 0; i<scores.length; i++){
            System.out.print(scores[i] + " ");
        }

    }
}
