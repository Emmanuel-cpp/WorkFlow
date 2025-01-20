import java.util.Scanner;

public class Hope{
    public static void main(String[] args) {
        String word = "THE SOUND OF THE HEAVENS THE SOUND OF CREATION";
        System.out.println(word.charAt(5));
        Scanner value = new Scanner(System.in); 
        System.out.println("Enter Some Text");
        String text = value.nextLine();
        System.out.print("How many times would you like to enter this text: ");
        int max = value.nextInt();
        System.out.println("THE TEXT YOU ENTERED IS WRITTEN BELOW");
        System.out.println(text);
        for(int x=1; x<max; x++){
            System.out.println(text);
        }
        String text2 = text.replace(" ", "");
        System.out.println("THE TEXT YOU ENTERED HAS "+text2.length()+" LETTERS");
        value.close();
        //THIS FILES HAS BEEN MODIFIED IN THE branchInfo BRANCH 
        int x = 1;
        while(x<4){
            System.out.println("BECAUSE GOD IS WITH ME");
            x++;
        }
    }
}