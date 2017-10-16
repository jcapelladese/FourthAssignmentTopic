package org.escoladeltreball.fourthassignmenttopic;

import java.time.LocalDateTime;
import java.util.Comparator;
import java.util.List;

public interface Manager {
	
	
	/**
	 * This method returns the next ITV
	 * 
	 * @return The next ITV
	 * @throws Exception when null
	 */
	public abstract ITV getNext() throws Exception;
	
	/**
	 * This method returns a sorted list according to a comparator expression
	 * 
	 * @param comparator 
	 * @return A sorted list according to a comparator expression
	 * @throws Exception when null
	 */	
	public abstract List<ITV> sort(Comparator<ITV> comparator) throws Exception;
	
	/**
	 * This method returns a list of ITV's from where
	 * 
	 * @param where
	 * @return A list of ITV's from where
	 * @throws Exception when where is null
	 */	
	public abstract List<ITV> from(String where) throws Exception;
	
	
	/**
	 * This method returns a list of ITV's ranging from init to fin
	 * 
	 * @param ini
	 * @param fin
	 * @return A list of ITV's in the range
	 * @throws Exception when empty
	 */
	public abstract List<ITV> from(LocalDateTime ini, LocalDateTime fin) throws Exception;
	
	
}
