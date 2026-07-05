/* this program is to count the no of given digits in a given whole number
now in this program lets see how many times 3 is repeated
 */
package conditionsandloops;

public class Countingnumbers {
    public static void main(String[] args) {
        int n = 34563538;
        int count = 0;
        while(n>0)
        {
            int rem = n%10;
            if(rem == 3) {

                count++;
            }
            n=n/10;
        }
        System.out.println(count);
    }
}
