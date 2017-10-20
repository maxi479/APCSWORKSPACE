/*** Part (b) ***/

/**
 * check if both strings
 *
 * @author Maxwelllwang
 * @version Oct 19, 2017
 * @author Period: 1
 * @author Assignment: A11_3Checker
 *
 * @author Sources: none
 */
public class AndChecker implements Checker
{
    private Checker string1;

    private Checker string2;


    /**
     * @param s1
     *            string from checker
     * @param s2
     *            string from checker
     */
    public AndChecker( Checker s1, Checker s2 )
    {
        string1 = s1;
        string2 = s2;
    }


    /**
     * @param text
     *            yse
     * @return true or false
     */
    public boolean accept( String text )
    {
        return string1.accept( text ) && string2.accept( text );
    }
}
