import java.util.HashMap;

class DuplicateHashMap
{
    public static void main(String args[])
    {
        HashMap<Integer, String> map = new HashMap<Integer, String>();
        map.put(1, "Apple");
        map.put(2, "Banana");
        map.put(3, "Orange");
        map.put(2, "Grapes"); // Duplicate key, will overwrite the previous value

        for(Integer key: map.keySet())
        {
            System.out.println("Key: " + key + " & Value: " + map.get(key));
        }
    }
}