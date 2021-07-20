import java.util.*;
class HashMap_general{
    public static void main(String [] args){
        // HashMap <Integer,String> hashmap=new HashMap<>();
        // hashmap.put(1,"My name is King Khan.");
        // hashmap.put(2,"I live in kolkata");
        // hashmap.put(3,"Do you want me right now");
        // hashmap.put(4,"I love turkish series");
        // String s=hashmap.get(3);       // returns the value contained against the key
        // System.out.println(s);
        // System.out.println(hashmap.containsKey(5));    // checks if the key is present or not and accordingly returns boolean value
        // System.out.println(hashmap.containsValue("Hi all"));   // checks if the value is present or not and accordingly returns the boolean value
        // System.out.println(hashmap.values());
        // System.out.println(hashmap.keySet());
        // System.out.println(hashmap.entrySet());
        // hashmap.replace(3,"My new job is to love coding");
        // System.out.println(hashmap.entrySet());
        // System.out.println(hashmap.remove(3));   // returns the value for the key given as argument
        // System.out.println(hashmap.keySet());
        // hashmap.put(3,"My new job is to love coding");
        // System.out.println(hashmap.values());
        // System.out.println(hashmap.entrySet());
        // hashmap.putIfAbsent(3,"Kolkata");
        // System.out.println(hashmap.entrySet());
        // hashmap.toString();
        // System.out.println(hashmap.entrySet());

    
        
        List<String> l=new ArrayList<>();
        l.add("Sayantika is a good girl");
        l.add("She will learn to code one day");
        l.add("She will crack this difficult coding round one day");
        l.add("She will do it");
        // for (String s1:l){
        //     System.out.println(s1);
        // }
        // l.forEach(s1->System.out.print(s1+" "));
        putValue(l);
        





        /* METHODS USED IN HASH MAP
        K=key
        V=value
        HashMap <T,E> hash=new HasMap <>();


        hash.put(K,V)       // inserts the value against the key
        hash.putAll()        // assigns another map as the new map
        hash.putIfAbsent(K,V)    // assigns the value against the key if the value is absent
        hash.get(K)              // returns the value associated with the key
        hash.getOrDefault(K,Default Value)    // returns the value if its present otherwise the default value
        hash.containsKey(K)              // checks if the key is present or not and returns the boolean value accordingly
        hash.containsValue(V)            // checks if the value is present or not and returns the boolean value accordingly
        hash.replace(K,V)                // first checks whether the key is present or not and if its present then puts the value as the value associated with that key
        hash.replace(K,Old Value,New value)       // first checks whether the key is present or not and if its present then checks whether the value associated with the key is the same as the Old Value then only it replaces that with the New Value
        hash.remove(K)      // removes the key,value pair  if the key exists
        hash.remove(K,V)    // removes the key, value pair if key exists and the value is the same as the value associated with the key
        hash.keySet()        // returns all the keys as an ArrayList
        hash.values()        // returns all the values as an ArrayList
        hash.entrySet()       // returns the key,value pair as an ArrayList
        
        
        */
    }

    public static void putValue( List <String> l){
        HashMap <Integer, ArrayList<String>> hash=new HashMap<>();
        int k=1;
        for (String s:l){

            if(! hash.containsKey(k)){
                hash.put(k,new ArrayList<String>());
            }
            hash.get(k).add(s);
            
            k++;

        }
        System.out.println(hash.entrySet());


            
        
    }
}