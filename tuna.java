public class tuna {
    private String girlName; // private variable so any method within the class can access it 

    // CONSTRUCTORS
    public tuna (String name){ // defined like a method with no return type but the method name should be exactly the same as the class name
        girlName=name;
    }

    public void setName(String name){
        girlName=name;
        
        
    }
    public String getName(){
        return girlName;

    }
    public void printOn(){
        System.out.printf("Your name is %s", getName());
        System.out.println("\n");
    }
    
}