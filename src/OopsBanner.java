public class OopsBanner{
    public static void main(String []args){
        //UC5:
         String[] banner = {
            String.join(" ", "   ***   ","   ***   "," *****  ","   ***** "),
            String.join(" ", " **   ** "," **   ** "," **   **"," **      "),
            String.join(" ", "**     **","**     **"," **   **","**       "),
            String.join(" ", "**     **","**     **"," *****  ","  *****  "),
            String.join(" ", "**     **","**     **"," **     ","      ** "),
            String.join(" ", " **   ** "," **   ** "," **     ","**    ** "),
            String.join(" ", "   ***   ","   ***   "," **     "," *****   ")
        };

        for (String line : banner) {
            System.out.println(line);
        }
    }
}