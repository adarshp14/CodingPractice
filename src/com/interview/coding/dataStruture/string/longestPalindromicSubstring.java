package com.interview.coding.dataStruture.string;

import java.util.*;

public class longestPalindromicSubstring {

    public static void main(String[] args) {
        String input="uzhynqvopdbnkvuxizirzjsslptlhmvyfqhqvqffmq" +
                "ldkrrdwapbdcxqbchvxqixmvbbtalrgzvkobyxlkonkfknabjwz" +
                "eoazankqzuhexhcwkbvwtioubrcujqqeqoedhploqklhgeilw" +
                "wnndbnzeadzefkcvaxdhgnmocadvvzjocoweyoidhleuwhmavpd" +
                "iizbwkukpstyorlwwyiwwyyyzqqgipzzlxsgcdjscdfvrrrqmllb" +
                "djkkuisxeqaprfblvjuixajhucmcvffmevaztvadrujbthlnsdrxzvbl" +
                "dwxbazxmilpkbccigkihcgjbtpvignmrgzdqnufaacxtihfgwrllrwgfhi" +
                "txcaafunqdzgrmngivptbjgchikgiccbkplimxzabxwdlbvzxrdsnlhtbju" +
                "rdavtzavemffvcmcuhjaxiujvlbfrpaqexsiukkjdbllmqrrrvfdcsjdcgsxl" +
                "zzpigqqzyyywwiywwlroytspkukwbziidpvamhwuelhdioyewocojzvvd" +
                "acomnghdxavckfezdaeznbdnnwwlieghlkqolphdeoqeqqjucrbuoitwvb" +
                "kwchxehuzqknazaoezwjbankfknoklxybokvzgrlatbbvmxiqxvhcbqxcdbp" +
                "awdrrkdlqmffqvqhqfyvmhltplssjzrizixuvknbdpovqnyhzu" ;

        System.out.println(findLongestPalindrome(input));
    }
   public  static  String findLongestPalindrome(String s)
   {
       String output="";
       for(int i=0;i<s.length();i++)
       {
           String maxString="";
           boolean found=false;
           for (int j=i;j<s.length();j++)
           {
               String temp=s.substring(i,j+1);
               if(checkPalindrome(temp) && temp.length()>maxString.length())
               {
                 maxString=temp;
                 found=true;
               }
               if(found&&maxString.length()>s.length()-j)
               {
                   break;
               }
           }
       if(maxString.length()>output.length())
       {
           output=maxString;
       }
       if(output.length()>s.length()-i)
       {
           break;
       }
       }
       return output;
    }

    private static boolean checkPalindrome(String s) {
      int startPoint=0;
      int endPoint=s.length()-1;
      while(startPoint<=endPoint)
      {
          if(s.charAt(startPoint)==s.charAt(endPoint))
          {
              startPoint++;
              endPoint--;
          }
          else {
              return false;
          }
      }
      return true;
    }
}
