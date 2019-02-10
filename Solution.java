import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

/* 
Проверка на упорядоченность
*/
public class Solution {
    public static void main(String[] args) throws IOException {
        //напишите тут ваш код
        
         ArrayList<String> list = new ArrayList<String>();
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
         for (int a = 0; a < 10; a ++)
    {
        String s = reader.readLine();
        list.add(s);
    }   
         for (int i = 0; i < list.size(); i++)
             {
                if(list.get(i).length() < list.get(i+1).length())
                {
                    continue;
                }
                else
                {
                   System.out.println(list.get(i+1));
                   break;
                }
                    
             }
        
        
    }
}
