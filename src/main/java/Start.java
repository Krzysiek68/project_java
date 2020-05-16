public class Start {
    public static String halfString(String s) {
        int mid = s.length() / 2;
        String half = s.substring(0, mid);
        return half;
    }

    public static void main(String[] args) {

        String word = "Tester";

        System.out.println("Caly wyraz: ");
        System.out.println(word);

        System.out.println("Polowa wyrazu: ");
        System.out.println(halfString(word));
    }
}
