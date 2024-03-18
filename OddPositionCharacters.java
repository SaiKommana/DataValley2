public class OddPositionCharacters {
    public static void main(String[] args) {
        String input= "type here to search";
        for (int i = 0; i < input.length(); i++) {
            if (i % 2!= 0 && input.charAt(i) != ' ') {
                System.out.print(text.charAt(i));
            }
        }
    }
}