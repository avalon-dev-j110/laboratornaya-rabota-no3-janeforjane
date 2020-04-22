package ru.avalon.java.dev.j10.labs.initialization;

import ru.avalon.java.dev.j10.labs.Initializer;

import java.util.Random;

/**
 * Инициализатор, выполняющий инициализацию массива
 * значениями последовательности случайных чисел.
 *
 * <p>Экземпляры класса можно использовать многократно для
 * инициализации любого числа массивов.
 *
 * <p>Диапазон, в пределах которого будут получены случайные
 * значения, передаётся в конструктор класса при
 * инициализации.
 */
public class RandomInitializer implements Initializer {

    /**
     * Выполняет инициализацию массива, значениями
     * последовательности случайных чисел.
     *
     * @param array массив, подлежащий инициализации
     */

    private int minNum;
    private int maxNum;

    public RandomInitializer (int minNum, int maxNum) {
        this.minNum = minNum;
        this.maxNum = maxNum;

    }

    public void initialize(int[] array) {
        /*
         * TODO(Студент): Реализовать метод initialize класса RandomInitializer
         */


        Random random = new Random();


        for (int i = 0; i < array.length; i++) {

            array[i] = (random.nextInt(maxNum - minNum) + minNum);
        }
    }
}
