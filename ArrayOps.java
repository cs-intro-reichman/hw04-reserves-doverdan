public class ArrayOps {
    public static void main(String[] args) {
        int[] arr1 = { 1, 2, 3, -2, 5 };
        int[] arr2 = { -4, 2, 2, 2, 2, 2, 3, 4, 4, 5 };
        int[] arr3 = { 5, 4, 3, 2, 1 };
        System.out.println(isSorted(arr1));
        System.out.println(isSorted(arr2));
        System.out.println(isSorted(arr3));
    }

    public static String toString(int[] array) {
        String result = "[";
        for (int i = 0; i < array.length; i++) {
            result += array[i];
            if (i != array.length - 1) {
                result += ", ";
            }
        }
        result += "]";
        return result;
    }

    public static boolean contains(int[] array, int value) {
        for (int i = 0; i < array.length; i++) {
            if (array[i] == value) {
                return true;
            }
        }
        return false;
    }

    public static int findMissingInt(int[] array) {
        for (int i = 1; i <= array.length; i++) {
            if (!contains(array, i)) {
                return i;
            }
        }
        return -1;
    }

    public static int maxValue(int[] array) {
        int max = array[0];
        for (int i = 1; i < array.length; i++) {
            if (array[i] > max) {
                max = array[i];
            }
        }
        return max;
    }

    public static int minValue(int[] array) {
        int min = array[0];
        for (int i = 1; i < array.length; i++) {
            if (array[i] < min) {
                min = array[i];
            }
        }
        return min;
    }

    public static int secondMaxValue(int[] array) {
        int max = maxValue(array);
        int min = minValue(array);
        for (int i = 0; i < array.length; i++) {
            if (array[i] == max)
                array[i] = min;
        }
        return maxValue(array);
    }

    public static int[] NoDuplicates(int[] array) {
        int[] newArray = new int[array.length];
        int index = 0;
        for (int i = 0; i < array.length; i++) {
            if (!contains(newArray, array[i])) {
                newArray[index] = array[i];
                index++;
            }
        }
        int[] result = new int[index];
        for (int i = 0; i < index; i++) {
            result[i] = newArray[i];
        }
        return result;
    }

    public static int[] Sort(int[] array) {
        int[] newArray = new int[array.length];
        for (int i = 0; i < array.length; i++) {
            newArray[i] = array[i];
        }
        for (int i = 0; i < newArray.length; i++) {
            for (int j = i + 1; j < newArray.length; j++) {
                if (newArray[i] > newArray[j]) {
                    int temp = newArray[i];
                    newArray[i] = newArray[j];
                    newArray[j] = temp;
                }
            }
        }
        return newArray;
    }

    public static boolean containsTheSameElements(int[] array1, int[] array2) {
        // Write your code here:
        int[] NewArr1 = Sort(NoDuplicates(array1));
        int[] NewArr2 = Sort(NoDuplicates(array2));
        if (NewArr1.length != NewArr2.length) {
            for (int i = 0; i < NewArr1.length; i++) {
                if (array1[i] != array2[i]) {
                    return false;
                }
            }
        }
        return true;

    }

    public static boolean isSorted(int[] array) {
        // Write your code here:
        Boolean up = true;
        Boolean down = true;
        for (int i = 0; i < array.length - 1; i++) {
            if (array[i] > array[i + 1]) {
                up = false;
            }
            if (array[i] < array[i + 1]) {
                down = false;
            }
        }
        return up || down;
    }

}
