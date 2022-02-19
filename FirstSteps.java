package net.thumbtack.school.online.introduction;

public class FirstSteps {

    //Возвращает сумму чисел x и y.
    public int sum(int x, int y) {
        return x + y;
    }

    //Возвращает произведение чисел x и y.
    public int mul(int x, int y) {
        return x * y;
    }

    //Возвращает частное от деления чисел x и y. Гарантируется, что y != 0.
    public int div(int x, int y) {
        return (y != 0) ? x / y : 0; // в случае попытки деления на ноль, будет кидаться 0
    }

    //Возвращает остаток от деления чисел x и y. Гарантируется, что y != 0.
    public int mod(int x, int y) {
        return (y != 0) ? x % y : 0;
    }

    //Возвращает true, если  x равен y, иначе false.
    public boolean isEqual(int x, int y) {
        return x == y;
    }

    //Возвращает true, если  x больше y, иначе false.
    public boolean isGreater(int x, int y) {
        return x > y;
    }

    /*
       Прямоугольник с горизонтальными и вертикальными сторонами, задан двумя точками - левой верхней (xLeft, yTop) и
       правой нижней (xRight, yBottom). На плоскости OXY ось X направлена вправо, ось Y - вниз. Дана еще одна точка с
       координатами (x, y). Гарантируется, что xLeft < xRight и yTop < yBottom. Метод должен возвращать true, если точка
       лежит внутри прямоугольника , иначе false. Если точка лежит на границе прямоугольника, то считается, что она лежит
       внутри него.
   */
    public boolean isInsideRect(int xLeft, int yTop, int xRight, int yBottom, int x, int y) {
        /* для того чтобы точка лежала в пределах прямоигольника она должна попадать в данный диапазон*/
        return (xLeft < xRight && yTop < yBottom) &&
                (x >= xLeft && x <= xRight && y >= yTop && y <= yBottom);
    }

    // Возвращает сумму чисел, заданных одномерным массивом array. Для пустого одномерного массива возвращает 0.
    public int sum(int[] array) {
        int sum = 0;
        if (array.length != 0) {
            for (int i = 0; i < array.length; i++) {
                sum += array[i];
            }
        }
        return sum;
    }

    //Возвращает произведение чисел, заданных одномерным массивом array. Для пустого одномерного массива возвращает 0.
    public int mul(int[] array) {
        int sum = 0;
        if (array.length != 0) {
            sum++;
            for (int i = 0; i < array.length; i++) {
                sum *= array[i];
            }
        }
        return sum;
    }

    /*
      Возвращает минимальное из чисел, заданных одномерным массивом array. Для пустого одномерного массива возвращает
      Integer.MAX_VALUE.
    */
    public int min(int[] array) {
        int minValue = Integer.MAX_VALUE;
        if (array.length != 0) {
            minValue = array[0];
            for (int i = 1; i < array.length; i++) {
                if (array[i] < minValue) {
                    minValue = array[i];
                }
            }
        }
        return minValue;
    }

    /*
      Возвращает максимальное из чисел, заданных одномерным массивом array. Для пустого одномерного массива возвращает
      Integer.MIN_VALUE.
    */
    public int max(int[] array) {
        int maxValue = Integer.MIN_VALUE;
        if (array.length != 0) {
            maxValue = array[0];
            for (int i = 1; i < array.length; i++) {
                if (array[i] > maxValue) {
                    maxValue = array[i];
                }
            }
        }
        return maxValue;
    }

    /*
       Возвращает среднее значение для чисел, заданных одномерным массивом array. Для пустого одномерного массива
       возвращает 0.
    */
    public double average(int[] array) {
        double mediumValue = 0;
        if (array.length != 0) {
            mediumValue = array[0];
            for (int i = 1; i < array.length; i++) {
                mediumValue += array[i];
            }
            mediumValue = mediumValue / array.length;
        }
        return mediumValue;
    }

    /*
       Возвращает true, если одномерный массив array строго упорядочен по убыванию, иначе false. Пустой одномерный массив
       считается упорядоченным.
    */
    public boolean isSortedDescendant(int[] array) {
        boolean rez = true;
        if (array.length != 0) {
            int value = array[0];
            for (int i = 1; i < array.length; i++) {
                if (array[i] >= value) {
                    rez = false;
                    break;
                }
                value = array[i];
            }
        }
        return rez;
    }

    //Возводит все элементы одномерного массива array в куб.
    public void cube(int[] array) {
        for (int i = 0; i < array.length; i++) {
            array[i] = (int) Math.pow(array[i], 3); /* так как в задании не указаны пожелания по решению, для
                                                     простоты, воспользуемся классам Math пакета java.lang*/
        }
    }

    //Возвращает true, если в одномерном массиве array имеется элемент, равный value, иначе false.
    public boolean find(int[] array, int value) {
        boolean rez = false;
        for (int i = 0; i < array.length; i++) {
            if (array[i] == value) {
                rez = true;
                break;
            }
        }
        return rez;
    }

    //Переворачивает одномерный массив array, то есть меняет местами 0-й и последний, 1-й и предпоследний и т.д. элементы.
    public void reverse(int[] array) {
        int var; // создадим переменную для хранения элементов массива
        for (int i = 0; i < array.length / 2; i++) {
            var = array[i];
            array[i] = array[array.length - 1 - i];
            array[array.length - 1 - i] = var;
        }
    }

    //Возвращает true, если одномерный массив является палиндромом, иначе false. Пустой массив считается палиндромом.
    public boolean isPalindrome(int[] array) {
        boolean rez = true;
        if (array.length != 0) {
            for (int i = 0; i <= ((array.length - 1) - i); i++) {
                if (array[i] != array[(array.length - 1) - i]) {
                    rez = false;
                    break;
                }
            }
        }
        return rez;
    }

    //Возвращает сумму чисел, заданных двумерным массивом matrix.
    public int sum(int[][] matrix) {
        int sum = 0;
        for (int i = 0; i < matrix.length; i++) {
            sum += sum(matrix[i]);
        }
        return sum;
    }

    /*
      Возвращает максимальное из чисел, заданных двумерным массивом matrix. Для пустого двумерного массива возвращает
      Integer.MIN_VALUE.
    */
    public int max(int[][] matrix) {
        int maxValue = Integer.MIN_VALUE;
        if (matrix.length != 0) {
            for (int i = 0; i < matrix.length; i++) {
                if (maxValue < max(matrix[i])) {
                    maxValue = max(matrix[i]);
                }
            }
        }
        return maxValue;
    }

    /*
       Возвращает максимальное из чисел, находящихся на главной диагонали квадратного двумерного массива matrix. Для
       пустого двумерного массива возвращает Integer.MIN_VALUE.
    */
    public int diagonalMax(int[][] matrix) {
        int maxValue = Integer.MIN_VALUE;
        if (matrix.length != 0) {
            maxValue = matrix[0][0];
            for (int i = 0; i < matrix.length; i++) {
                if (maxValue < matrix[i][i]) {
                    maxValue = matrix[i][i];
                }
            }
        }
        return maxValue;
    }

    /*
       Возвращает true, если все строки двумерного массива matrix строго упорядочены по убыванию, иначе false. Пустая
       строка считается упорядоченной. Разные строки массива matrix могут иметь разное количество элементов. При написании
       метода рекомендуется внутри него вызвать метод из п. 13.
    */
    public boolean isSortedDescendant(int[][] matrix) {
        boolean rez = true;
        for (int i = 0; i < matrix.length; i++) {
            int[] array = new int[matrix[i].length]; // создадим массив для записи в него строк.
            for (int j = 0; j < matrix[i].length; j++) {
                array[j] = matrix[i][j];
            }
            if (!isSortedDescendant(array)) { // вызовем созданный ранее метод и проверим его результат.
                return false;
            }
        }
        return rez;
    }
}
