package ru.avalon.java.dev.j10.labs;

import ru.avalon.java.dev.j10.labs.initialization.FibonacciInitializer;
import ru.avalon.java.dev.j10.labs.initialization.RandomInitializer;
import ru.avalon.java.dev.j10.labs.sort.BubbleSort;
import ru.avalon.java.dev.j10.labs.sort.SelectionSort;
import ru.avalon.java.dev.j10.labs.sort.ShellSort;

import java.util.Random;

public class Application {

	public static void main(String[] args) {


		Initializer fibonacciInitializer = new FibonacciInitializer();
		Initializer randomInitializer = new RandomInitializer();
		Sort bubbleSort = new BubbleSort();
		Sort selectionSort = new SelectionSort();
		Sort shellSort = new ShellSort();
		Random random = new Random();

		int[] array = new int[20];


		for (int i = 0; i < array.length; i++) {            // последовательность целых чисел от 0 до 100

			array[i] = (random.nextInt(100));
		}


		System.out.println("Инициализация массива последовательностью чисел Фибоначчи ");

		toInit(array, fibonacciInitializer);

		sumArr(array);

		System.out.println("Инициализация массива последовательностью целых чисел от -50 до 50");

		toInit(array, randomInitializer);

		System.out.println("Сортировка массива методом пузырька");

		toSort(array, bubbleSort);

		System.out.println("Инициализация массива последовательностью целых чисел от -50 до 50");

		toInit(array, randomInitializer);

		System.out.println("Сортировка массива методом selection");

		toSort(array, selectionSort);

		System.out.println("Инициализация массива последовательностью целых чисел от -50 до 50");

		toInit(array, randomInitializer);

		System.out.println("Сортировка массива методом Шелла");

		toSort(array, shellSort);


			/*
			 * TODO(Студент): Выполнить действия над массивом чисел
			 *
			 * 0. Инициализировать переменную array массивом из 20 целых чисел.
			 *
			 * 1. Проинициализировать массив значениями
			 *    последовательности чисел Фибоначчи.
			 *
			 * 2. Найти сумму элементов массива.
			 *
			 * 3. Проинициализировать массив последовательностью
			 *    случайных чисел в диапазоне от -50 до 50.
			 *
			 * 4. Отсортировать массив с использованием
			 *    пузырьковой сортировки.
			 *
			 * 5. Проинициализировать массив последовательностью
			 *    случайных чисел в диапазоне от -50 до 50.
			 *
			 * 6. Отсортировать массив с использованием
			 *    сортировки выбором.
			 *
			 * 7. Проинициализировать массив последовательностью
			 *    случайных чисел в диапазоне от -50 до 50.
			 *
			 * 8. Отсортировать массив с использованием
			 *    сортировки Шелла.
			 */

		}

	public static void toInit(int[] array, Initializer initializer) {

		initializer.initialize(array);

		for (int i = 0; i < array.length; i++) {
			System.out.println(" Value of element № " + i + " = " + array[i]);

		}

	}

	public static void toSort(int[] array, Sort sort) {

		sort.sort(array);

		for (int i = 0; i < array.length; i++) {
			System.out.println(" Value of element № " + i + " = " + array[i]);
		}

	}

	public static void sumArr (int[] array) {

		int sumValues = 0;

		for (int i = 0; i < array.length; i++) {
			sumValues = sumValues + array[i];
		}

		System.out.println("Сумма " + array.length + " чисел массива = " + sumValues);

	}


	}
