import java.util.HashMap;
import java.util.Scanner;

class CountFrequency
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter String: ");
        String str = sc.nextLine();
        HashMap<Character, Integer> freq = new HashMap<Character, Integer>();
        for(int i=0; i<str.length(); i++)
        {
            char ch = str.charAt(i);
            if(freq.containsKey(ch))
            {
                freq.put(ch, freq.get(ch)+1);
            }
            else
            {
                freq.put(ch, 1);
            }
        }
        System.out.println("Character Frequency:");
        for(Character key: freq.keySet())
        {
            System.out.println(key+": "+freq.get(key));
        }
    }
}