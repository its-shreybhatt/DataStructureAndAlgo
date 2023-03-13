public class Main {
    public static void main(String[] args) {
        String word = "abc";

        permutation(word);
        System.out.println("\nMethod 2");
        solve(word.toCharArray(), 0);
    }

    public static void permutation(String word) {
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

    public static void solve(char[] arr, int idx) {
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
}