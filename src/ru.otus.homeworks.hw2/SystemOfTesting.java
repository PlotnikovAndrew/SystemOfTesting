package ru.otus.homeworks.hw2;

import java.util.Scanner;

public class SystemOfTesting {
    public static void main(String[] args) {


        int correctCount = 0, wrongCount = 0;
        String prefaceQuestion = "Из какого фильма эта цитата?: ";
        String[] questions = {"Идите, идите. Мы Вас вылечим. Алкоголики - это наш профиль.","Ну, юноша, самовыражайтесь быстрее","Да я же говорю - я за кефиром пошёл, а тут пираты"};
        String[][] answerOptions = {
                {"Кавказкая пленница, или Новые приключения Шурика", "Человек с бульвара Капуцинов", "Бриллиантовая рука"},
                {"Доживем до понедельника","Королева бензоколонки","Покровские ворота"},
                {"Кин-дза-дза!","Невероятные приключения итальянцев в России","Гостья из будущего"}
        };
        int[] correctAnswers = {1,3,3};
        Scanner scanner = new Scanner(System.in);

        for(int i = 0; i < questions.length; i++) {
            System.out.println(prefaceQuestion + questions[i]);
            for(int j = 0; j < answerOptions.length; j++) {
                System.out.println(j+1 + ". " + answerOptions[i][j]);
            }
            int answer = scanner.nextInt();
            System.out.println("Ваш ответ: " + answerOptions[i][answer-1]);
            if (answer == correctAnswers[i]){
                System.out.println("Верно!");
                correctCount++;
            } else {
                System.out.println("Неверно! Правильный ответ: " + correctAnswers[i]);
                wrongCount++;
            }
        }
        System.out.println("Результат: правильно " + correctCount + ", неправильно " + wrongCount);
    }
}


