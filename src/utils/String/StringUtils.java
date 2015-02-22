package utils.String;

import java.util.Hashtable;

/**
 * @version 1.2.0
 * @author Shinigami
 * @category "String Manipultion"
 */
public class StringUtils {
	

	/**
	 * @version 1.0.0
	 * @since 1.0.0
	 * @author Shinigami
	 * @category "String Manipultion","HTML"
	 * @param targetString
	 */
	public static String unescapeHTML(String s)
	{
		return unescapeHTML(s,0);
	}
	/**
	 * @version 1.0.1
	 * @since 1.0.0
	 * @author Shinigami
	 * @category "String Manipultion","HTML"
	 * @param targetString
	 * @param startindex (0)
	 */
	public static String unescapeHTML(String s,int offset)
	{
		int start = s.indexOf('&',offset);
		int end = s.indexOf(';', start);
		if(start<0 || end<0)
			return s;

		String sequence = s.substring(start, end+1);
		String unescaped = null;
		
		unescaped = StringUtilsConfig.getHTML_ES(sequence).toString();
			
			if(unescaped == null)
				unescaped=sequence;
		

		
		s= s.substring(0, start)+ unescaped + s.substring(end+1);
		
		return unescapeHTML(s,end+1);
	}

}
