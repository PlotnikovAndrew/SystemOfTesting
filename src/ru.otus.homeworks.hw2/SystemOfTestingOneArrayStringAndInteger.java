package ru.otus.homeworks.hw2;

import java.util.Scanner;

public class SystemOfTestingOneArrayStringAndInteger {
    private static final String PREFACE_QUESTION = "Из какого фильма эта цитата?: ";
    private static final int QUESTION_ARRAY = 0;
    private static final int ANSWER_ARRAY = 1;
    private static final int CORRECT_ANSWER_ARRAY = 2;

    public static void main(String[] args) {

        int correctCount = 0, wrongCount = 0;
        Object[][][] quiz =
                {{{"Идите, идите. Мы Вас вылечим. Алкоголики - это наш профиль."},
                        {"Ну, юноша, самовыражайтесь быстрее"},
                        {"Да я же говорю - я за кефиром пошёл, а тут пираты"}},
                        {{"Кавказкая пленница, или Новые приключения Шурика", "Человек с бульвара Капуцинов", "Бриллиантовая рука"},
                                {"Доживем до понедельника", "Королева бензоколонки", "Покровские ворота"},
                                {"Кин-дза-дза!", "Невероятные приключения итальянцев в России", "Гостья из будущего"}},
                        {{1}, {3}, {3}}
                };
        Scanner scanner = new Scanner(System.in);

        for (int numberQuestion = 0; numberQuestion < quiz.length; numberQuestion++) {
            System.out.println(PREFACE_QUESTION + quiz[QUESTION_ARRAY][numberQuestion][0]);

            for(int numberAnswer = 0; numberAnswer < quiz.length; numberAnswer++) {
                System.out.println(numberAnswer + 1 + ". " + quiz[ANSWER_ARRAY][numberQuestion][numberAnswer]);
            }

            int responseFromTheConsole = scanner.nextInt();

            if (responseFromTheConsole > quiz[ANSWER_ARRAY][numberQuestion].length) {
                System.out.println("Неверно! Правильный ответ: " + quiz[ANSWER_ARRAY][numberQuestion][0]);
                wrongCount++;
                continue;
            }

            System.out.println("Ваш ответ: " + quiz[ANSWER_ARRAY][numberQuestion][responseFromTheConsole-1]);
            //Object correctAnswer = quiz[CORRECT_ANSWER_ARRAY][numberQuestion][0];
            Object responseFromTheConsoleObject = (int) responseFromTheConsole;
            if (responseFromTheConsoleObject == quiz[CORRECT_ANSWER_ARRAY][numberQuestion][0]){
                System.out.println("Верно!");
                correctCount++;
            } else {
                System.out.println("Неверно! Правильный ответ: " + quiz[CORRECT_ANSWER_ARRAY][numberQuestion][0]);
                wrongCount++;
            }
        }
        System.out.println("Результат: правильно " + correctCount + ", неправильно " + wrongCount);
    }
}
