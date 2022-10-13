package quiz;

import java.util.Scanner;

public class Quiz {
    public static void main(String[] args) {
        System.out.println("This is QUIZ");
        System.out.println("-----------------------------------");
        System.out.println("Correct answer gives 1 point, False answer gives 0 points. You need atleast 3 points to pass");
        int totalScore = 0;
        int rightAnswer = 1;
        int wrongAnswer = 0;
        boolean hasPassed = false;
        Question[] questions = getRandomQuestion();
        Answer[] userAnswers = new Answer[questions.length];


        Question question = null;
        for (int j = 0; j < questions.length; j++) {
            question = questions[j];


            System.out.println(question.getDescription());

            for (int i = 0; i < question.getOptions().length; i++) {
                System.out.println(i + ", " + question.getOptions()[i]);

                System.out.println("Choose an option from above");
                Answer answer = new Answer();
                answer.setQuestionId(question.getId());
                answer.setCorrectOption(getAnswerOption(question.getOptions().length));
                userAnswers[j] = answer;

            }
        }
        Answer[] correctAnswers = getAnswers();

        //Compare answerOptions of CorrectAnswer and the userAnswer
        for (int i = 0; i < correctAnswers.length; i++) {
            for (int j = 0; j < userAnswers.length; j++)
                if (correctAnswers[i].getQuestionId() == userAnswers[j].getQuestionId() && correctAnswers[i].getCorrectOption() == userAnswers[j].getCorrectOption()) {
                    totalScore += rightAnswer;
                }

        }
        System.out.println("total score is " + totalScore);
        hasPassed = totalScore >= questions.length / 2;
        System.out.println(hasPassed ? "PASSED!" : "FAILED");
    }


    private static Question[] getRandomQuestion() {
        Question question1 = new Question();
        question1.setId(1L);
        question1.setDescription("What is the capital of Estonia?");
        question1.setOptions(new String[]{"1. Tartu \n2. Narva \n3. Tallinn \n4. Viljandi"});

        Question question2 = new Question();
        question2.setId(2L);
        question2.setDescription("What is Estonia's native language?");
        question2.setOptions(new String[]{"1. English \n2. Finnish \n3. Russian \n4. Estonian"});

        Question question3 = new Question();
        question3.setId(3L);
        question3.setDescription("Who is The president of Estonia");
        question2.setOptions(new String[]{"1. Kaja Kallas \n2. Alari Karis\n3. Jüri Ratas \n4. Eminem"});

        Question question4 = new Question();
        question3.setId(3L);
        question3.setDescription("What is the favourite car in Estonia");
        question2.setOptions(new String[]{"1. Skoda \n2. AUDI\n3. BMW \n4. BIKE"});

        Question question5 = new Question();
        question3.setId(3L);
        question3.setDescription("Who is national bird of Estonia");
        question2.setOptions(new String[]{"1. Kuldnokk \n2. Tihane\n3. Tuvi \n4. Pääsuke"});

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

