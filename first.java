import java.util.*;
class Dog{
    String color; // state or properties
    boolean hasFur;
 
    //methods or functions
    // access specifier return type method name(parameters)
    public void colour(){
        System.out.println("My dog has "+color+" colour");
    }
    public void fur(){
        System.out.println(hasFur);
    }

}
class First{
    public static void main(String [] args){
        String s="I am Sayantika Ghosh. I live in Newtown.";
        String [] s1;
       
        s1=s.split(" ");
        String [] s2= new String [s1.length];
        for (int i=0;i<s1.length;i++){
            s2[s1.length-1-i]=s1[i];

        }
        System.out.println("\n");
        for (int i=0;i<s2.length;i++){
            System.out.print(s2[i]+" ");
        }
        System.out.println("\n");
        Dog doggy=new Dog();
        doggy.color="blue";
        doggy.hasFur=true;

        doggy.colour();
        doggy.fur();
        
    }
    
}