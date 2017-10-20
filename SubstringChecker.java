
/**
 * nah
 *
 * @author Maxwelllwang
 * @version Oct 19, 2017
 * @author Period: 1
 * @author Assignment: A11_3Checker
 *
 * @author Sources: none
 */
public class SubstringChecker implements Checker
{

    private String string1;


    /**
     * @param text
     *            string from checker
     */
    public SubstringChecker( String text )
    {
        string1 = text;
    }


    /**
     * @param text
     *            from checker
     * @return true or flase
     */
    public boolean accept( String text )
    {
        return text.contains( string1 );
    }
}
