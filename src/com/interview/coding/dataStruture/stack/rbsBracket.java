

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.Stack;

public class rbsBracket {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        List<String> finalResult=new ArrayList<>();
        int inputCount=sc.nextInt();
        for(int i=0;i<inputCount;i++)
        {
            String s=sc.next();
            if(checkForRbs(s))
            {
                finalResult.add("YES");
            }
            else
            {
                finalResult.add("NO");
            }
        }
        for(String i:finalResult)
        {
            System.out.println(i);
        }
    }

    private static boolean checkForRbs(String s) {
    Stack<Character> temp=new Stack<>();
    int otherCount=0;
    for (int i=0;i<s.length();i++)
    {
        if(s.charAt(i)=='(')
        {
            temp.push(s.charAt(i));
        }
        else if(s.charAt(i)=='?' && (otherCount%2==0||otherCount==0))
        {
            temp.push('(');
            otherCount++;
        }
        else if(s.charAt(i)=='?' && otherCount%2!=0 && !temp.isEmpty())
        {
            temp.pop();
            otherCount++;
        }
        else if(s.charAt(i)==')' && !temp.isEmpty())
        {
            temp.pop();
        }

    }
    if(temp.isEmpty()) return true;
    return false;
    }
}
