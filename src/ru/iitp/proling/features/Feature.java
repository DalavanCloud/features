package ru.iitp.proling.features;

import java.util.List;

/**
 * Function to extract feature from an object
 * @author ant
 *
 */
public interface Feature {
	/**
	 * This interface indicates that the first element of the feature
	 * is an injected root element.
	 * 
	 * <p>
	 * Suppose, there is a w(n) feature, that returns word from a sentence at 
	 * position n. So, actually, this feature is a w(root, n) feature, if
	 * sentence is a root object.
	 * This interface permits to write w(n) instead of w(root, n)
	 * @author Anton Kazennikov
	 *
	 */
	public interface Injectable {
	}
	
	/**
	 * Get feature function name
	 * @return
	 */
	public String name();
	
	/**
	 * Return feature function arguments
	 */
	public List<Value> args();
	
	/**
	 * Evaluate feature and store result in a value object
	 * @param res result value object
	 */
	public void eval(Value res);
	
	/**
	 * Write feature function complete name to StringBuilder
	 * @param sb target string builder
	 * @return sb object
	 */
	public StringBuilder toStringBuilder(StringBuilder sb);
}
