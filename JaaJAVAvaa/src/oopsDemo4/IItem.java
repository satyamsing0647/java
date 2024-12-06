package oopsDemo4;

/**
 * Auhtor : Satyam.3.Singh
 * Date   : 30 Oct 2024
 * Time   : 12:42:22 pm
 * Email  : satyam.3.singh@coforge.com
 * 
 * Interface that defines the basic operations for any item in the library
 *
 */

public interface IItem {

	// by default public abstract methods
	String getTitle();
	String getAuthor();
	String getCategory();
	boolean isAvailable();
	void borrowItem();
	void returnItem();
}
