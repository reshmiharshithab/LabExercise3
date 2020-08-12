package labexe3;

public class counterfn {

    public static void main(String[] args) {
       
  mn obj=new mn();
  obj.incr();
  
  mn obj1 =new mn();
  obj1.incr();
  
  mn obj2 =new mn();
  obj2.incr();
  
    }
    
}
class mn
{
     static int i=20;
            int j=10;
            void incr()
            {
                i=i+10;
                j=j+10;
                System.out.println(i);
                System.out.println(j);
                
            }
}

