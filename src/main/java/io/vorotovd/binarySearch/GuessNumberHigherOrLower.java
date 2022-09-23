package io.vorotovd.binarySearch;

/**
 * We are playing the Guess Game. The game is as follows:
 * I pick a number from 1 to n. You have to guess which number I picked.
 * Every time you guess wrong, I will tell you whether the number I picked is higher or lower than your guess.
 * You call a pre-defined API int guess(int num), which returns three possible results:
 * -1: Your guess is higher than the number I picked (i.e. num > pick).
 * 1: Your guess is lower than the number I picked (i.e. num < pick).
 * 0: your guess is equal to the number I picked (i.e. num == pick).
 * Return the number that I picked.
 * Constraints:
 * 1 <= n <= 231 - 1
 * 1 <= pick <= n
 */
public class GuessNumberHigherOrLower {
    public static void main(String[] args) {

        SolutionGuessNumberHigherOrLower search = new SolutionGuessNumberHigherOrLower(8);
        System.out.println("Number that picked: " + search.guessNumber(10));
    }
}


class SolutionGuessNumberHigherOrLower extends GuessGame {

    SolutionGuessNumberHigherOrLower(int guess) {
        super(guess);
    }

    /**
     * Метод поиска загаданного числа
     *
     * @param n Максимальное загаданное число
     * @return Загаданное число или -1 если нельзя угадать
     */
    public int guessNumber(int n) {
        int left = 1;
        int right = n;
        int medium = left + (right - left) / 2;
        int guessResult;

        while (left <= right) {
            guessResult = guess(medium);
            if (guessResult == 0) {
                return medium;
            }
            if (guessResult == 1) {
                left = medium + 1;
            } else {
                right = medium - 1;
            }
            medium = left + (right - left) / 2;
        }
        return -1;
    }
}

/**
 * Класс для определения результата угадывания
 * Класс GuessGame определен за рамками решения задачи. Для корректной работы класса SolutionGuessNumberHigherOrLower
 * была реализована простейшая предполагаемая версия класса GuessGame
 */
class GuessGame {
    final int guess;

    GuessGame(int guess) {
        this.guess = guess;
    }

    /**
     * Forward declaration of guess API.
     *
     * @param num your guess
     * @return -1 if num is higher than the picked number
     * 1 if num is lower than the picked number
     * otherwise return 0
     * int guess(int num);
     */
    public int guess(int num) {
        if (num > guess) {
            return -1;
        } else if (num < guess) {
            return 1;
        }
        return 0;
    }
}
