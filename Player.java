import java.util.*;
import java.io.*;
import java.math.*;
import java.awt.Point;
/**
 * Don't let the machines win. You are humanity's last hope...
 **/
class Player {

    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
        int width = in.nextInt(); // the number of cells on the X axis
        int height = in.nextInt(); // the number of cells on the Y axis
        if (in.hasNextLine()) {
            in.nextLine();
        }
        
        String[] line = new String[height];
        
        for (int i = 0; i < height; i++) {
            line[i] = in.nextLine(); // width characters, each either 0 or .
        }
        
        
        for(int i = 0; i < height; i++){
            for(int j = 0; j < width; j++){
                

                if(line[i].charAt(j) == '0'){
                    Point node = new Point(j,i);
                    Point neighborRight = new Point(-1,-1);
                    Point neighborDown = new Point(-1,-1);

                    
                    for(int k = i + 1; k < height; k++){
                        if(line[k].charAt(j) == '0'){
                            neighborDown.x = j;
                            neighborDown.y = k;
                            break;
                        }
                    }
                    
                    for(int k = j + 1; k < width; k++){
                        if(line[i].charAt(k) == '0'){
                            neighborRight.x = k;
                            neighborRight.y = i;
                            break;
                        }                        
                    }
                    System.out.println(node.x + " " + 
                                        node.y + " " + 
                                        neighborRight.x + " " + 
                                        neighborRight.y + " " + 
                                        neighborDown.x + " " + 
                                        neighborDown.y);
                }
            }
        }
    }
}
