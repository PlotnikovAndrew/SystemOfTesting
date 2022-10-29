package ru.otus.homeworks.hw2;

import java.util.Scanner;

public class SystemOfTestingOneArrayString {
    private static final String PREFACE_QUESTION = "Из какого фильма эта цитата?: ";

    public static void main(String[] args) {

        int correctCount = 0, wrongCount = 0;
        String[][][] quiz =
                {{{"Идите, идите. Мы Вас вылечим. Алкоголики - это наш профиль."},
                        {"Ну, юноша, самовыражайтесь быстрее"},
                        {"Да я же говорю - я за кефиром пошёл, а тут пираты"}},
                        {{"Кавказкая пленница, или Новые приключения Шурика", "Человек с бульвара Капуцинов", "Бриллиантовая рука"},
                                {"Доживем до понедельника", "Королева бензоколонки", "Покровские ворота"},
                                {"Кин-дза-дза!", "Невероятные приключения итальянцев в России", "Гостья из будущего"}},
                        {{"1"}, {"3"}, {"3"}}
                };
        Scanner scanner = new Scanner(System.in);

        for (int numberQuestion = 0; numberQuestion < quiz.length; numberQuestion++) {
            System.out.println(PREFACE_QUESTION + quiz[0][numberQuestion][0]);

            for(int numberAnswer = 0; numberAnswer < quiz.length; numberAnswer++) {
                System.out.println(numberAnswer + 1 + ". " + quiz[1][numberQuestion][numberAnswer]);
            }

            int responseFromTheConsole = scanner.nextInt();

            if (responseFromTheConsole > quiz[1][numberQuestion].length) {
                System.out.println("Неверно! Правильный ответ: " + quiz[1][numberQuestion][0]);
                wrongCount++;
                continue;
            }

            String responseFromTheConsoleString = String.valueOf(responseFromTheConsole);
            System.out.println("Ваш ответ: " + quiz[1][numberQuestion][responseFromTheConsole-1]);

            if (responseFromTheConsoleString.equals(quiz[2][numberQuestion][0])){
                System.out.println("Верно!");
                correctCount++;
            } else {
                System.out.println("Неверно! Правильный ответ: " + quiz[2][numberQuestion][0]);
                wrongCount++;
            }
        }
        System.out.println("Результат: правильно " + correctCount + ", неправильно " + wrongCount);
        }
    }

