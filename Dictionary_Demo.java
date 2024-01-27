package com.javacollections;

import java.util.Iterator;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeMap;

public class Dictionary_Demo {

    public static void main(String args[])
    {
            TreeMap<String,String> hm = new TreeMap<>();

//put(String key, Object value)
            hm.put("Dawn","Early morning");
            hm.put("Rigid","Constant");
            hm.put("Vintage","Older");
            hm.put("Robust","Anticipating problems");
            hm.put("Boilerplate","REpeated set of code in an application");
            
            Scanner obj = new Scanner(System.in);
            System.out.println("Enter a word to add into Dictionary");
            String word = obj.next();
            System.out.println("Enter meaning of the word");
            String meaning = obj.next();
            
            hm.put(word, meaning);
            
            System.out.println("Enter a word to find meaning");
             word = obj.next();
            
            if(hm.containsKey(word))
            {
            	System.out.println("Meaning of the word: " + hm.get(word));
            }
            else
            {
            	System.out.println("Searching word not present in the dictionary...");
            }
            
            Set s = hm.entrySet();

            Iterator it = s.iterator();

            System.out.println("\n\nWord and Synonym present in Treeset");
            while (it.hasNext())
            {
                    Map.Entry me = (Map.Entry) it.next();

                    System.out.println(me.getKey() + "-" + me.getValue());
                    }
            
            }
    

}