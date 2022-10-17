package quiz;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

/**
 * To create a quiz and give the final score
 * <p>
 * Quiz should be minimum of 5 questions
 * For each right answer = 1 point
 * For each negative answer = 0 points
 * Finally, you have to display the correct answers for each question and the total score.
 * Display the Result. PASS OR FAIL?
 * <p>
 * <p>
 * Quiz example:
 * Display question to user like this
 * a. What is the capital city of Estonia?
 * 1. Tallinn
 * 2. Tartu
 * 3. Parnu
 * 4. Viljandi
 * Enter your answer: 2
 * Invalid answer, please enter the given option only.
 * <p>
 * <p>
 * b. Wat...?
 * <p>
 * <p>
 * <p>
 * Total score: 4
 * The correct answers:
 * a. Tallinn
 * b.
 * <p>
 * <p>
 * <p>
 * <p>
 * HW:
 * 1. Display the correct answers for each question
 * 2. Calculate total score.
 */
public class Quiz {
    public static void main(String[] args) {
        System.out.println("This is QUIZ");
        System.out.println("-----------------------------------");
        System.out.println("Correct answer gives 1 point, False answer gives 0 points. You need atleast 3 points to pass");
        int totalScore = 0;
        int rightAnswer = 1;
        int wrongAnswer = 0;
        boolean hasPassed;
        Question[] questions = getRandomQuestion();
        Answer[] userAnswers = new Answer[getAnswers().length];  // was Questions.length before


        for (int j = 0; j < getAnswers().length; j++) {  // was questions().length before
            Question question = questions[j];
            System.out.println(question.getDescription());

            for (int i = 0; i < question.getOptions().length; i++) {
                System.out.println(i + ", " + question.getOptions()[i]);

            }
            System.out.println("Choose an option from above");


            //Creating a user answer object and assign it to the userAnswer array
            Answer answer = new Answer();
            answer.setQuestionId(question.getId());
            answer.setCorrectOption(getAnswerOption(question.getOptions().length));
            userAnswers[j] = answer;





        }

        Answer[] correctAnswers = getAnswers();

        //Total Score Calculation: Compare answerOptions of CorrectAnswer and the userAnswer
        for (Answer userAnswer : userAnswers) {
            for (Answer correctAnswer : correctAnswers) {
                if (correctAnswer.getQuestionId() == userAnswer.getQuestionId() && correctAnswer.getCorrectOption() == userAnswer.getCorrectOption()) {
                    totalScore += rightAnswer;
                }
            }

        }
        System.out.println("total score is " + totalScore);
        //Pass score is 50%
        hasPassed = totalScore >= (double) questions.length / 2;
        System.out.println(hasPassed ? "PASSED!" : "FAILED");
    }


    private static Question[] getRandomQuestion() {
        Question question1 = new Question();
        question1.setId(1L);
        question1.setDescription("What is the capital of Estonia?");
        question1.setOptions(new String[]{"Tartu", "Narva", "Tallinn", "Viljandi"});

        Question question2 = new Question();
        question2.setId(2L);
        question2.setDescription("What is Estonia's native language?");
        question2.setOptions(new String[]{"English", "Finnish", "Russian", "Estonian"});

        Question question3 = new Question();
        question3.setId(3L);
        question3.setDescription("Who is The president of Estonia");
        question3.setOptions(new String[]{"Kaja Kallas", "Alari Karis", "Jüri Ratas", "Eminem"});

        Question question4 = new Question();
        question4.setId(4L);
        question4.setDescription("What is the favourite car in Estonia");
        question4.setOptions(new String[]{"SKODA", "AUDI", "BMW", "BIKE"});

        Question question5 = new Question();
        question5.setId(5L);
        question5.setDescription("Who is national bird of Estonia");
        question5.setOptions(new String[]{"Kuldnokk", "Tihane", "Tuvi", "Pääsuke"});


        return new Question[]{question1, question2, question3, question4, question5};

    }


    private static Answer[] getAnswers() {
        Answer answer1 = new Answer();
        answer1.setId(30L);
        answer1.setQuestionId(1L);
        answer1.setCorrectOption(2);

        Answer answer2 = new Answer();
        answer2.setId(31L);
        answer2.setQuestionId(2L);
        answer2.setCorrectOption(3);

        Answer answer3 = new Answer();
        answer3.setId(32L);
        answer3.setQuestionId(3L);
        answer3.setCorrectOption(1);

        Answer answer4 = new Answer();
        answer4.setId(33L);
        answer4.setQuestionId(4L);
        answer4.setCorrectOption(1);

        Answer answer5 = new Answer();
        answer5.setId(34L);
        answer5.setQuestionId(5L);
        answer5.setCorrectOption(3);

        return new Answer[]{answer1, answer2, answer3, answer4, answer5};
    }


    private static int getAnswerOption(int limit) {
        Scanner scanner = new Scanner(System.in);
        String errorMessage = "Incorrect option. Please enter again:";

        int option = limit + 1;



        do {
            if (!scanner.hasNextInt()) {
                System.out.println(errorMessage);
                scanner.next();

            } else {
                option = scanner.nextInt(); // correct input

                if (option > limit) {
                    System.out.println(errorMessage);
                }

            }

        } while (option > limit);


        return option;
}
    }


