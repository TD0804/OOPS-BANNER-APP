import java.util.HashMap;
import java.util.Map;

public class OopsBanner {

    public static Map<Character, String[]> createPatternMap() {

        //UC8:
        Map<Character, String[]> map = new HashMap<>();

        map.put('O', new String[]{
                "   ***   ",
                " **   ** ",
                "**     **",
                "**     **",
                "**     **",
                " **   ** ",
                "   ***   "
        });

        map.put('P', new String[]{
                " *****  ",
                " **   **",
                " **   **",
                " *****  ",
                " **     ",
                " **     ",
                " **     "
        });

        map.put('S', new String[]{
                "   ***** ",
                " **      ",
                "**       ",
                "  *****  ",
                "      ** ",
                "**    ** ",
                " *****   "
        });

        return map;
    }

    public static void renderBanner(String text, Map<Character, String[]> patterns) {

        for (int i = 0; i < 7; i++) {

            StringBuilder line = new StringBuilder();

            for (char c : text.toCharArray()) {

                String[] pattern = patterns.get(c);

                if (pattern != null) {
                    line.append(pattern[i]).append(" ");
                }
            }

            System.out.println(line);
        }
    }

    public static void main(String[] args) {

        Map<Character, String[]> patternMap = createPatternMap();

        String message = "OOPS";

        renderBanner(message, patternMap);
    }
}