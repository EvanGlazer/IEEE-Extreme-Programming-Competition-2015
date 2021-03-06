import java.math.*;
import java.util.regex.*;

public class Solution {
    
    public static int findIndex(char let[], char letter)
    {
        for(int i = 0; i < let.length; i++)
        {
            if(let[i] == letter)
            {
                return i;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
        
       int n = sc.nextInt();
       int m = sc.nextInt();
       int k = sc.nextInt();
        
       sc.nextLine();
       
       char letters[] = new char[k];
       String zoom[][] = new String[k][m];
        
       for(int i = 0; i < k; i++)
       {
           letters[i] = sc.nextLine().charAt(0);
           
           for(int j = 0; j < m; j++)
           {
               zoom[i][j] = sc.nextLine();
           }
       }
        
       int numTimesPrint = sc.nextInt();
        
       sc.nextLine();
        
       String stringToTranslate = sc.nextLine();
        
       int length = stringToTranslate.length();
       
       for(int r = 0; r < numTimesPrint; r++)
       {
           for(int s = 0; s < m; s++)
           {
               for(int t = 0; t < length; t++)
               {
                   System.out.print(zoom[findIndex(letters, stringToTranslate.charAt(t))][s]);
               }
               System.out.println();
           }
           System.out.println();
       }
    }
}