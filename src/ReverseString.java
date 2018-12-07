public class ReverseString {
    public String ReverseString(String s) {

        if (s == null) {
            return s;
        }
        char[] arr = s.toCharArray();
        for (int i=0; i < arr.length/2; ++) {
            char temp = arr[i];
            arr[i] = arr[arr.length-1];
            arr[arr.length-1] = temp;

        }
        return new String(arr);
    }
}
