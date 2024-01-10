public class grade_using_twoD_array {
    public static void main(String[] args) {
        char[][] answers={{'A', 'B', 'A', 'C', 'C', 'D', 'E', 'E', 'A', 'D'},            // creating 2d array
         {'D', 'B', 'A', 'B', 'C', 'A', 'E', 'E', 'A', 'D'},
         {'E', 'D', 'D', 'A', 'C', 'B', 'E', 'E', 'A', 'D'},
         {'C', 'B', 'A', 'E', 'D', 'C', 'E', 'E', 'A', 'D'},
         {'A', 'B', 'D', 'C', 'C', 'D', 'E', 'E', 'A', 'D'},
         {'B', 'B', 'E', 'C', 'C', 'D', 'E', 'E', 'A', 'D'},
         {'B', 'B', 'A', 'C', 'C', 'D', 'E', 'E', 'A', 'D'},
         {'E', 'B', 'E', 'C', 'C', 'D', 'E', 'E', 'A', 'D'}};


         char[] key={'D', 'B', 'D', 'C', 'C', 'D', 'A', 'E', 'A', 'D'};                  // initialising answer key of the questions 
         
        

        
        for (int students=0;students<answers.length; students++ ){                         //calculating the scores of each student
            int total=0;
            for (int question=0;question<answers[students].length; question++){
                if(answers[students][question]==key[question]){
                    total++;
                }
                

            }
            System.out.println("student "+students+" score is = "+ total);                 // printing scores of each student
        }
    }
    
}
