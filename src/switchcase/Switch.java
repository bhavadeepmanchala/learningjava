package switchcase;

import java.util.Scanner;

public class Switch {
    public static void main(String[] args) {
        System.out.println("enter any anime character");
        Scanner in = new Scanner(System.in);
        String animechar = in.next();
        switch (animechar) {
                case "Tanjiro" :
                    System.out.println("Demon Slayer");
                    break;
                case "Eren" :
                    System.out.println("Attack on titan");
                    break;
                case "Taki" :
                    System.out.println("Kimi no namwa");
                    break;
                default :
                    System.out.println("Invalid");
        }
    }
}
// select switch text from code and click alt+enter and select enhanced switch statement
// for neat syntax
// where it will be like
 //         case "Tanjiro" -> System.out.println("Demon Slayer");
//          case "Eren" -> System.out.println("Attack on titan");
//          case "Taki" -> System.out.println("Kimi no namwa");
//          default -> System.out.println("Invalid");
// you can also try too converting into if else statement with same alt+enter