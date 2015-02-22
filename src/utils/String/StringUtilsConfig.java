package utils.String;

import java.util.Hashtable;

/**
 * @version 1.0.0
 * @author Shinigami
 * @category "String Manipultion"
 */
public class StringUtilsConfig
{
	public static Hashtable<String, Character> HTML_ES = new Hashtable<String, Character>() 
		{
			private static final long serialVersionUID = 7793952623035314880L;
		{ 
				put("&amp;", '&'); 
				put("&lt;",'<');
				put("&gt;",'>');
				put("&quot;",'\"');
				put("&apos;",'\'');
				put("&nbsp;",' ');
		}};
	/**
	 * @version 1.0.0
	 * @author Shinigami
	 * @category "String Manipultion"
	 */
	public static void putHTML_ES(String key,Character value)
	{
		HTML_ES.put(key, value);
	}
	/**
	 * @version 1.0.0
	 * @author Shinigami
	 * @category "String Manipultion"
	 */
	public static Character getHTML_ES(String key)
	{
		return HTML_ES.get(key);
	}
	
	/**
	 * @version 1.0.0
	 * @author Shinigami
	 * @category "String Manipultion"
	 */
	{
		HTML_ES = new Hashtable<String, Character>() 
				{
					private static final long serialVersionUID = 7793952623035314880L;
				{ 
					put("&amp;", '&'); 
					put("&lt;",'<');
					put("&gt;",'>');
					put("&quot;",'\"');
					put("&apos;",'\'');
					put("&nbsp;",' ');
			}};								
	}
}
