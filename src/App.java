import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.URL;

import java.io.*;


public class App {
  
  public static void main(String[] args) throws Exception {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));  
    String email = br.readLine();
    String webPage = "https://www.ecs.soton.ac.uk/people/" + email;
    System.out.println(webPage); 
    URL link = new URL(webPage);
    BufferedReader br1 =  new BufferedReader(new InputStreamReader(link.openStream()));
    for (int i = 1;i<73;i++) {
      br1.readLine();
    }
    String myLine = br1.readLine();
    System.out.println(myLine.substring( myLine.indexOf("property=\"name\"")+16).split("<")[0]);  //this is hideous
  }
}
