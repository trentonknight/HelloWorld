
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
       System.out.println("Please enter your name: ");
       BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
       String text = in.readLine();
       if(!"exit".equals(text) && !"quit".equals(text)){
       System.out.println("Hello " + text + "!");
       }
       System.out.println("Please enter your name or type exit or quit to finish: ");
       while(!"exit".equals(text) && !"quit".equals(text)){
       in = new BufferedReader(new InputStreamReader(System.in));
       text = in.readLine();
       if(!"exit".equals(text) && !"quit".equals(text)){
       System.out.println("Hello " + text + "!");
       }
       }
       
    }
}
