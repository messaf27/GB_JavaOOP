package Lesson_03;

import Lesson_02.Fruits;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
//        AbstractGame game = new NumberGame();
        AbstractGame game = new RuGame();
        System.out.println();// Todo:
        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите длину слова:");
        int wordLen = scanner.nextInt();

        System.out.println("Введите количество попыток:");
        int attemptsNum = scanner.nextInt();
        scanner.nextLine();

        // Run game
        game.start(wordLen, attemptsNum);

        boolean isFinish = false;
        boolean isWin = false;

        while(!(isFinish || isWin))
        {
            Answer answer = game.inputValue(scanner.nextLine());
            System.out.println(answer);

            isFinish = game.getGameStatus() == GameStatus.FINISH;
            isWin = game.getGameStatus() == GameStatus.WIN;
        }

        if(isWin) System.out.println("Ура , победа!!!");
        else System.out.println("Вы проиграли...");
    }
}
