public class OopsBanner{
   //UC7:
    static class CharacterPatternMap {

        private char character;
        private String[] pattern;

        public CharacterPatternMap(char character, String[] pattern) {
            this.character = character;
            this.pattern = pattern;
        }

        public char getCharacter() {
            return character;
        }

        public String[] getPattern() {
            return pattern;
        }
    }

    public static String[] getCharacterPattern(CharacterPatternMap[] maps, char c) {
        for (CharacterPatternMap map : maps) {
            if (map.getCharacter() == c) {
                return map.getPattern();
            }
        }
        return null;
    }

    public static void main(String[] args) {

        CharacterPatternMap[] patternMaps = {

            new CharacterPatternMap('O', new String[]{
                    "   ***   ",
                    " **   ** ",
                    "**     **",
                    "**     **",
                    "**     **",
                    " **   ** ",
                    "   ***   "
            }),

            new CharacterPatternMap('P', new String[]{
                    " *****  ",
                    " **   **",
                    " **   **",
                    " *****  ",
                    " **     ",
                    " **     ",
                    " **     "
            }),

            new CharacterPatternMap('S', new String[]{
                    "   ***** ",
                    " **      ",
                    "**       ",
                    "  *****  ",
                    "      ** ",
                    "**    ** ",
                    "  *****   "
            })
        };

        String text = "OOPS";

        for (int i = 0; i < 7; i++) {

            StringBuilder line = new StringBuilder();

            for (char c : text.toCharArray()) {

                String[] pattern = getCharacterPattern(patternMaps, c);
                line.append(pattern[i]).append(" ");
            }

            System.out.println(line);
        }
    }
}