
package labexe3;


public class harmonic {
    public static void main(String[] args)
    { 
        int i=Integer.parseInt(args[0]);//command line argument can be done only in main class
        abc.series(i);
        
    }
    
}
    class abc
    {
        
        static double r=0;
        
         static void series(int i)
        {
           
            while(i>0)
            {
                r=(r+((double)1/i));
                i--;
            }  
            System.out.println("the harmonic series is"+r);
        }        
    }        
 