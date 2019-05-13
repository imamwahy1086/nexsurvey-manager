package id.nexcloud.nexsurvey.helper;

public class StringHelper
{

    public static final String[] XML_SPECIAL_CHAR_ORIGINAL =
    {
        "&", "\"", "<", ">", "'"
    };
    public static final String[] XML_SPECIAL_CHAR_REPLACEMENT =
    {
        "&amp;", "&quot;", "&lt;", "&gt;", "&apos;"
    };

    private StringHelper()
    {
        // do nothing, non-instantiable
    }

    public static boolean nullOrEmpty(String s)
    {
        return (s == null) ? true : "".equals(s.trim());
    }

    public static String emptyIfNull(String s)
    {
        return (s == null) ? "" : s;
    }

    public static String defaultIfNull(String s, String defaultString)
    {
        return (s == null) ? trim(defaultString) : s;
    }

    public static String trim(String s)
    {
        return emptyIfNull(s).trim();
    }

    public static String escapeXmlSpecialCharacter(String input)
    {
        if (input != null)
        {
            for (int index = 0; index < XML_SPECIAL_CHAR_ORIGINAL.length; index++)
            {
                input.replaceAll(XML_SPECIAL_CHAR_ORIGINAL[index], XML_SPECIAL_CHAR_REPLACEMENT[index]);
            }
        }
        return input;
    }

    public static String validateSingleQuote(String input)
    {
        if(input != null)
        {
            input = input.replaceAll("'", "''");
        }
        return input;
    }
    
    public static String createPad(char padding, int length)
    {
    	StringBuilder out = new StringBuilder();
    	for(int repeat = 0; repeat < length; repeat++)
    		out.append(padding);
    	return out.toString();
    }
    
    public static String leftPad(String input, char padding, int length)
    {
    	if(nullOrEmpty(input)) input = "";
    	if(input.length() >= length) return input;
    	String padString = createPad(padding, length - input.length());
    	return padString.concat(input);
    }
    
    public static String rightPad(String input, char padding, int length)
    {
    	if(nullOrEmpty(input)) input = "";
    	if(input.length() >= length) return input;
    	String padString = createPad(padding, length - input.length());
    	return input.concat(padString);
    }
    
    public static String centraltPad(String input, char padding, int length)
    {
    	if(nullOrEmpty(input)) input = "";
    	if(input.length() >= length) return input;
        length = length - input.length();
        int l = length/2;
        int s = length-l;
        String ps = createPad(padding, s);
        input = ps+input;
    	String padString = createPad(padding, l);
    	return input.concat(padString);
    }   
	/**
	 * Get substring from left
	 * @param str string
	 * @param len length
	 * @return substring from left
	 */
	public static String left(String str, int len) {
		if (!nullOrEmpty(str) && str.length() > len) {
			return str.substring(0, len);
		}
		return str;
	}    

	/**
	 * Get substring from right
	 * @param str string
	 * @param len length
	 * @return substring from right
	 */
	public static String right(String str, int len) {
		if (!nullOrEmpty(str) && str.length() > len) {
			return str.substring(str.length() - len);
		}
		return str;
	}    
	
	
	
	
}
