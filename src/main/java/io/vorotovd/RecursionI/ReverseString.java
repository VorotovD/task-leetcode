package io.vorotovd.RecursionI;

/**
 * Write a function that reverses a string. The input string is given as an array of characters s.
 * You must do this by modifying the input array in-place with O(1) extra memory.
 * Constraints:
 * 1 <= s.length <= 105
 * s[i] is a printable ascii character.
 */
public class ReverseString {
    public static void main(String[] args) {
        ReverseStringSolution solution = new ReverseStringSolution();
        char[] s = "12345".toCharArray();
        solution.reverseString(s);
        System.out.println(s);
    }
}

class ReverseStringSolution {
    /**
     * Метод переворачивает массив сначений
     * @param s Массив символов для разворота
     */
    public void reverseString(char[] s) {
        if (s.length == 0) {
            return;
        }
        reverseBordersString(s,0,s.length-1);
    }

    /**
     * Метод вызывается рекурсивно, меняя местами значения на границах массива начиная от граничных значений, и далее
     * сжимая границы массива на 1 слева и справа
     * @param s Массив для разворота
     * @param left Левая граница подмассива
     * @param right Правая граница подмассива
     */
    private void reverseBordersString(char[] s,int left,int right) {
        if (left == right) {
            return;
        }
        if (left + 1 == right) {
            char memory = s[left];
            s[left] = s[right];
            s[right] = memory;
            return;
        }
        char memory = s[left];
        s[left] = s[right];
        s[right] = memory;
        left++;
        right--;
        reverseBordersString(s,left,right);
    }
}
