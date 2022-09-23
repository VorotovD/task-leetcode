package io.vorotovd.binarySearch;

/**
 * You are a product manager and currently leading a team to develop a new product.
 * Unfortunately, the latest version of your product fails the quality check.
 * Since each version is developed based on the previous version, all the versions after a bad version are also bad.
 * Suppose you have n versions [1, 2, ..., n] and you want to find out the first bad one, which causes all the following ones to be bad.
 * You are given an API bool isBadVersion(version) which returns whether version is bad.
 * Implement a function to find the first bad version. You should minimize the number of calls to the API.
 * Constraints:
 * 1 <= bad <= n <= 231 - 1
 */
public class FirstBadVersion {
    public static void main(String[] args) {
        SolutionFirstBadVersion solution = new SolutionFirstBadVersion(10);
        System.out.println("First bad version" + solution.firstBadVersion(25));

    }
}


/**
 * Класс для нахождения первой сломанной версии.
 */
class SolutionFirstBadVersion extends VersionControl {
    public SolutionFirstBadVersion(int firstBedVersion) {
        super(firstBedVersion);
    }

    /**
     * Метод возвращает первую сломанную версию из N версий
     *
     * @param n Количество и номера версий
     * @return Первая сломанная версия
     */
    public int firstBadVersion(int n) {
        int left = 1;
        int right = n;
        int medium = left + (right - left) / 2;

        while (left < right) {
            if (!isBadVersion(medium)) {
                left = medium + 1;
            } else {
                right = medium;
            }
            medium = left + (right - left) / 2;
        }
        return medium;
    }
}

/**
 * Класс для определения годности версии (возможная рализация)
 * Класс VersionControl определен за рамками решения задачи. Для корректной работы класса SolutionFirstBadVersion
 * была реализована простейшая предполагаемая версия класса VersionControl
 */
class VersionControl {
    int firstBedVersion;

    public VersionControl(int firstBedVersion) {
        this.firstBedVersion = firstBedVersion;
    }

    /**
     * Метод для определения годности версии
     *
     * @param version Версия для проверки
     * @return Булево значения годности версии
     */
    public boolean isBadVersion(int version) {
        return version >= firstBedVersion;
    }
}