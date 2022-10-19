package com.rays.pro4.Bean;

/**
 * DropdownList interface is implemented by Beans those are used to create drop
 * down list on HTML pages.
 * 
 * @author Pratik Dhurkari
 *
 */

public interface DropdownListBean {

	/**
	 * return key of list element
	 * @return key
	 */
	public String getkey();
	
	/**
	 * display list of key element
	 * @return value
	 */
	public String getValue();

}
