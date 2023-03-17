public class DataStructureAlgo {
    public static void main(String[] args) {
        String word = "abc";
        DataStructureAlgo object = new DataStructureAlgo();


//        object.permutation(word);
//        object.solve(word.toCharArray(), 0);
//        object.binarySearch();
        object.insertionSort();
    }

    public void permutation(String word) {
        for (int i = 0; i < word.length(); i++) {
            for (int j = 0; j < word.length(); j++) {
                for (int k = 0; k < word.length(); k++) {
                    if (word.charAt(i) != word.charAt(j) && word.charAt(j) != word.charAt(k)
                            && word.charAt(k) != word.charAt(i))

                        System.out.print((word.charAt(i) + "" + word.charAt(j) + "" + word.charAt(k)) + " ");
                }
            }
        }
    }

    //swap function to swap two characters from indices idx and idx2
    public static void swap(char[] arr, int idx, int idx2) {
        char temp = arr[idx];
        arr[idx] = arr[idx2];
        arr[idx2] = temp;
    }

    public void solve(char[] arr, int idx) {
        if (idx == arr.length - 1) { //Base condition of recursion
            System.out.print(String.valueOf(arr) + " ");
        }

        for (int i = idx; i < arr.length; i++) {
            swap(arr, idx, i);
            solve(arr, idx + 1);
            swap(arr, idx, i);
            //Backtracking: reverting all the elements to their original places
        }
    }

    public void binarySearch() {
        String[] array = {"we", "the", "people", "of", "India"};
        stringBinary(array, "people");
    }

    public static void stringBinary(String[] array, String search) {
        int mid;
        int min = 0, max = array.length - 1;
        while (min <= max) {
            mid = (min + max) / 2;
            if (array[mid].compareTo(search) < 0) {
                min = mid + 1;
            } else if (array[mid].compareTo(search) > 0) {
                max = mid - 1;
            } else if (array[mid].compareTo(search) == 0) {
                System.out.println("Key found");
                return;
            }
        }
        System.out.println("key not found ");
    }

    public void insertionSort() {
        String[] array = {"shrey", "bhatt", "is", "working", "on", "it"};
        String max = "null";
        for (int i = 0; i < array.length - 1; i++) {
            for (int j = i + 1; j < array.length; j++) {
                if (array[i].compareToIgnoreCase(array[j]) > 0) {
                    max = array[i];
                    array[i] = array[j];
                    array[j] = max;
                }
            }
        }
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }
    }
}