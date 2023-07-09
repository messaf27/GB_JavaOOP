package Lesson_03;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        GameLog gameLog = new GameLog();

        AbstractGame game = new NumberGame();
//        AbstractGame game = new RuGame();
        System.out.println(); // Todo:
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите длину слова: ");
        int wordLen = scanner.nextInt();
        gameLog.addMessage(String.format(
                "Пользователь ввёл длину слова: %d", wordLen));

        System.out.print("Введите количество попыток: ");
        int attemptsNum = scanner.nextInt();
        gameLog.addMessage(String.format(
                "Пользователь ввёл колличество попыток: %d", attemptsNum));
        scanner.nextLine();

        // Run game
        game.start(wordLen, attemptsNum);

        boolean isFinish = false;
        boolean isWin = false;

        while(!(isFinish || isWin))
        {
            System.out.printf("Осталось попыток: %d\r\n", game.getCurrentAttempt());
            System.out.print("Введите слово: ");
            String word = scanner.nextLine();
            gameLog.addMessage(String.format("Пользователь ввёл слово: %s", word));

            Answer answer = game.inputValue(word);
            System.out.println(answer);

            isFinish = game.getGameStatus() == GameStatus.FINISH;
            isWin = game.getGameStatus() == GameStatus.WIN;
        }

        if(isWin) {
            System.out.println("Ура, победа!!!");
            gameLog.addMessage("Пользователь одержал победу в игре!");
        }
        else {
            System.out.println("Вы проиграли...");
            gameLog.addMessage("Пользователь проиграл");
        }

        System.out.print("Вывести лог игры? (да/нет): ");
        String userAnswer = scanner.nextLine();
        if(userAnswer.contains("да")){
            gameLog.printLog();
        }
    }
}
