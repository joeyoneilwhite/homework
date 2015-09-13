package homework.onsite;


/**
 * multiply some numbers
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	Multiplier m=new Multiplier();
    	int res = m.go(Integer.parseInt(args[0]), Integer.parseInt(args[1]));
    	System.out.println(args[0]+" * "+args[1]+" = "+res);
    }
}
