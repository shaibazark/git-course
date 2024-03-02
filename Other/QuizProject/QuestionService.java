package Other.QuizProject;

import java.util.Scanner;

public class QuestionService {
    
    String selection[] = new String[5];
    Question[] questions = new Question[5];

    public QuestionService() {
        System.out.println("Inside Constructore");
        questions[0] = new Question(1, "Java", "J", "C", "P", "JS", "J");
        questions[1] = new Question(2, "C", "J", "C", "P", "JS", "C");
        questions[2] = new Question(3, "P", "J", "C", "P", "JS", "P");
        questions[3] = new Question(4, "JS", "J", "C", "P", "JS", "JS");
        questions[4] = new Question(5, "C#", "J", "C", "P", "C#", "C#");
    }

    public void displayQuestions()
    {
        int i=0;
       for(Question q : questions)
       {
        System.out.println("Question No.:"+q.getId());
        System.out.println(q.getQuestion());
        System.out.println(q.getOpt1());
        System.out.println(q.getOpt2());
        System.out.println(q.getOpt3());
        System.out.println(q.getOpt4());
        Scanner sc = new Scanner(System.in);
        selection[i]  = sc.nextLine();
        i++;
    }

    for(String s : selection){
        System.out.println(s);
    }
    }

    public void calculateScore(){
        int score =0;
       for(int i=0;i<questions.length;i++){
        Question q =questions[i];
        String actualAnswer = q.getAns();
        String userAnswer =selection[i];
        System.out.println(userAnswer);
        if(actualAnswer.equals(userAnswer)){
            score++;
        }

       }
       System.out.println(score);
    }
}
