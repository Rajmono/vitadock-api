package com.medisanaspace.library;

import java.io.PrintWriter;
import java.io.StringWriter;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import flexjson.JSONDeserializer;
import flexjson.JSONSerializer;

/**
 * Helper class for string comparisons.
 * 
 * @author Clemens Lode (c) Medisana Space Technologies GmbH, 2012
 *         clemens.lode@medisanaspace.com
 * 
 * @version $Revision: 1.0 $
 */
public final class StringUtil {

	private StringUtil() {
	}
	
	/**
	 *  Cutting a float down to 2 digits only:
	 *  see: http://stackoverflow.com/questions/5051395/java-float-123-129456-to-123-12-without-rounding
	 * @param value
	 * @return
	 */
	public static String floatToTwoDigits(float value){
		String s = String.valueOf(value);
	    StringBuilder sbFloat = new StringBuilder(s);
	    int start = sbFloat.indexOf(".");
	    if (start < 0) {
	        return sbFloat.toString();
	    }
	    int end = start+3;
	    if(end>(sbFloat.length()-1)){
	    	end = sbFloat.length();
	    }
	    String twoPlaces = sbFloat.substring(start, end);
	    sbFloat.replace(start, sbFloat.length(), twoPlaces);
	    return sbFloat.toString();
	}
	
	/**
	 * Method isNotNullOrEmpty.
	 * @param string String
	 * @return boolean
	 */
	public static boolean isNotNullOrEmpty(final String string) {
		if (string == null || "".equals(string)) {
			return false;
		}
		return true;
	}

	/**
	 * Method isNullOrEmpty.
	 * @param string String
	 * @return boolean
	 */
	public static boolean isNullOrEmpty(final String string) {
		return !isNotNullOrEmpty(string);
	}

	/**
	 * Method getStackTraceAsString.
	 * @param t Throwable
	 * @return String
	 */
	public static String getStackTraceAsString(final Throwable t) {
		StringWriter writer = new StringWriter();
		PrintWriter out = new PrintWriter(writer);
		t.printStackTrace(out);
		return writer.getBuffer().toString();
	}

	/**
	 * Method toJsonArray.
	 * @param collection Collection<String>
	 * @return String
	 */
	public static String toJsonArray(final Collection<String> collection) {
		return new JSONSerializer().exclude("*.class").serialize(collection);
	}

	/**
	 * Method fromJsonArrayToStrings.
	 * @param json String
	 * @return Collection<String>
	 */
	public static ArrayList<String> fromJsonArrayToStrings(final String json) {
		return new JSONDeserializer<ArrayList<String>>().use(null, ArrayList.class)
				.use("values", String.class).deserialize(json);
	}
	
	public static Collection<Map<String, String>> fromJsonArrayToMap(final String json) {
	List<Map<String, String>> jsonList;
//		jsonList = new JSONDeserializer<List<Map<String, String>>>().use(null, ArrayList.class).deserializeInto(json, jsonList);
		jsonList = new JSONDeserializer<List<Map<String, String>>>().
				use(null, ArrayList.class).use("values", HashMap.class).deserialize(json);
				
				
//		HashMap<String, String> jsonMap = new HashMap<String, String>();
//		new JSONDeserializer<Map<String, String>>().deserializeInto(json, jsonMap);
		return jsonList;
	}

}
