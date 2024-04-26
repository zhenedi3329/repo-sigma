public class sigma2 {

    public static <T> int findIndex(T[] array, T targetElement) {
        if (array == null || array.length == 0) {
            return -1;
        }

        for (int i = 0; i < array.length; i++) {
            if (array[i].equals(targetElement)) {
                return i;
            }
        }

        return -1;
    }

    public static void main(String[] args) {
        Integer[] intArray = {1, 2, 3, 4, 5};
        Integer targetInt = 3;
        int index = findIndex(intArray, targetInt);
        System.out.println("Index of " + targetInt + ": " + index); // Виведе: Index of 3: 2

        String[] stringArray = {"apple", "banana", "orange", "grape"};
        String targetString = "orange";
        index = findIndex(stringArray, targetString);
        System.out.println("Index of " + targetString + ": " + index); // Виведе: Index of orange: 2

        // Приклад з об'єктами власного класу
        MyClass[] objectArray = {new MyClass(1), new MyClass(2), new MyClass(3)};
        MyClass targetObject = new MyClass(2);
        index = findIndex(objectArray, targetObject);
        System.out.println("Index of " + targetObject + ": " + index); // Виведе: Index of MyClass{id=2}: 1
    }

    static class MyClass {
        private int id;

        public MyClass(int id) {
            this.id = id;
        }

        @Override
        public String toString() {
            return "MyClass{id=" + id + '}';
        }
    }
}
