
package helloworld;
import java.io.* ;

/**
 *
 * @author Jason N Mansfield
 * student: mansf843@regis.edu
 */
public class HelloWorld {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException {
       BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
       String text = in.readLine();
       System.out.println("Hello " + text + "!");
       
       while(!"exit".equals(text) && !"quit".equals(text)){
       in = new BufferedReader(new InputStreamReader(System.in));
       text = in.readLine();
       System.out.println("Hello " + text + "!");
       }
    }
}
