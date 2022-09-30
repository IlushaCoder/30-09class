import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static List<String> grabscrab(String s, List<String> words){

        for(int i=0;i<words.size();i++)
        {
            if (words.get(i).length()!=s.length())
                words.remove(i);
        }
        for(int i=0;i< words.size();i++)
        {
            int count=0;
            for(int j=0;j<words.get(i).length();j++) {

               for(int k=0;k<s.length();k++)
               {
                   if(s.charAt(k)==words.get(i).charAt(j))
                       count+=1;
               }


            }
            if(count!=words.get(i).length())
            {
                words.remove(i);
            }
        }

        return words;
    }

    public static void main(String[] args) {
       List<String> words=new ArrayList<String>(
                Arrays.asList("mountains", "hills", "mesa"));
        System.out.println(words);
        String s = "ainstuomn";
        for(int i=0;i<words.size();i++)
        {
            if(s.length()!=words.get(i).length())
                words.remove(i);
        }
        System.out.println(words);
    }




}