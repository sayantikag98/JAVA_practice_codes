public class con1 {
    public static void main(String[] args) {
        String s="{{[[(())]]}}";
        func1(s);
    }
        
        static void func1(String s){
            int count4=4;
            if(s.charAt(0)=='{'){
                int val=s.indexOf('}');
                
                if(val!=-1){
                    s=s.substring(1,val);
                    if(s.isEmpty()){
                        count4=0;
                    }
                    else{
                        func1(s);
                    }
                }
                else{
                    count4=1;

                }
            }
            else if(s.charAt(0)=='['){
                int val=s.indexOf(']');
                if(val!=-1){
                    s=s.substring(1,val);
                    if (s.isEmpty()==true){
                        count4=0;
                    }
                    else{
                        func1(s);
                    }
                }
                else{
                    count4=1;
                }
            }
            else{
                int val=s.indexOf(')');
                if(val!=-1){
                    s=s.substring(1,val);
                    if(s.isEmpty()==true){
                        count4=0;
                    }
                    else{
                        func1(s);
                    }
                }
                else{
                    count4=1;
                }

            }

        if(count4==0){
            System.out.println("Balanced");
        
        }
        else if(count4==1){
            System.out.println("Not");
        }
        }
    
       
    
}