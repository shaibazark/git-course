package Other.QuizProject;

class Main{
    public static void main(String[] args) {
        QuestionService questionService = new QuestionService();

        questionService.displayQuestions();
        questionService.calculateScore();
    }
}