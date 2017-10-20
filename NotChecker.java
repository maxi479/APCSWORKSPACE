/*** Part (c) ***/

/**
 * if it isnt
 *
 * @author Maxwelllwang
 * @version Oct 19, 2017
 * @author Period: 1
 * @author Assignment: A11_3Checker
 *
 * @author Sources: none
 */
public class NotChecker implements Checker
{
    private Checker string1;


    /**
     * @param text
     *            string froma checker
     */
    public NotChecker( Checker text )
    {
        string1 = text;

    }


    /**
     * @param text
     *            from
     * @return true or false
     */
    public boolean accept( String text )
    {
        return !string1.accept( text );
    }

}
