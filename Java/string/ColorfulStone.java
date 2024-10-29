package string;
import java.util.Scanner;
public class ColorfulStone {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);


        String s = sc.nextLine();
        String t = sc.nextLine();


        int position = 0;

        // Iterate over each instruction
        for (int i = 0; i < t.length(); i++) {
            // If the current stone's color matches the instruction, move forward
            if (s.charAt(position) == t.charAt(i)) {
                position++;
            }

            // Stop if we reach the last stone
            if (position == s.length()) {
                break;
            }
        }


        System.out.println(position + 1);

        sc.close();
    }
}
