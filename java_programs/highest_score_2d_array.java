package java_programs;

public class highest_score_2d_array {
    public static void main(String[] args) {
        char[][] array={{'A', 'B', 'A', 'C', 'C', 'D', 'E', 'E', 'A', 'D'},              // creating a 2D array for question sheet
         {'D', 'B', 'A', 'B', 'C', 'A', 'E', 'E', 'A', 'D'},
         {'E', 'D', 'D', 'A', 'C', 'B', 'E', 'E', 'A', 'D'},
         {'C', 'B', 'A', 'E', 'D', 'C', 'E', 'E', 'A', 'D'},
         {'A', 'B', 'D', 'C', 'C', 'D', 'E', 'E', 'A', 'D'},
         {'B', 'B', 'E', 'C', 'C', 'D', 'E', 'E', 'A', 'D'},
         {'B', 'B', 'A', 'C', 'C', 'D', 'E', 'E', 'A', 'D'},
         {'E', 'B', 'E', 'C', 'C', 'D', 'E', 'E', 'A', 'D'}};


         char[] key={'D', 'B', 'D', 'C', 'C', 'D', 'A', 'E', 'A', 'D'};                  // creating array of answer key
         int[]  score=new int[array.length];                                           // initialising the array of scores
         int countHigh=0;
         int highScorer=0;

         

        
        for (int students=0;students<array.length; students++ ){                       // calculating the score of each student
            int total=0;
            for (int question=0;question<array[students].length; question++){
                if(array[students][question]==key[question]){
                    total++;
                }
                

            }
            System.out.println("student "+students+" score is = "+ total);                 // printing the scores of each student
            score[students]=total;

            for (int highScore=0;highScore<array.length;highScore++){                    // calculating the highest score 
                if(score[highScore]>countHigh){
                    countHigh=score[highScore];
                    highScorer=highScore;

    
    
                }
    
            }

        }
        System.out.println("student "+highScorer+" scores highest with score "+countHigh);      // printing the highest score



    }
    
}
