//to find the length of the substring containing all characters

package com.company;

import java.util.*;

public class Main {

    public static void main(String[] args) {
        String S;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a string :");
        S = sc.nextLine();
        int len = leastSubstringLength(S);
        System.out.println("The length of the smallest substring containing all characters is: " + len);

    }
    static int leastSubstringLength(String s)
    {
        if(s.length()==1)
            return 1;
        Set<Character> sb = new HashSet<Character>();
        Set<Character> Sn = new HashSet<Character>();
        int cnt=100000000;
        for(int i=0;i<s.length();i++) {
            if (!sb.contains(s.charAt(i)))
                sb.add(s.charAt(i));

        }
        String str;
        for(int i=0;i<s.length();i++)
        {
            for(int count=i+2;count<=s.length();count++)
            {
                  str=s.substring(i,count);

                for(int j=0;j<str.length();j++)
                    Sn.add(str.charAt(j));

                if(sb.equals(Sn))
                {
                    if (str.length() < cnt) {
                        cnt = str.length();
                    }
                }
                str=null;
                Sn.clear();
            }
        }
        return cnt;
    }

}
