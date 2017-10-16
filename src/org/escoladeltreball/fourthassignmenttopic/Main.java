/**
 * 
 */
package org.escoladeltreball.fourthassignmenttopic;

/**
 * @author iaw47941842
 *
 */
public class Main {

	/**
	 * @param args
	 */
	public static void main(String[] args) throws Exception {
		ITVManagerImpl manager = new ITVManagerImpl("itv");		
		
//		System.out.println(manager.getNext());
//		
//		ITVDateComparator sortedByDate = new ITVDateComparator();
//		System.out.println(manager.sort(sortedByDate));
		
		
		System.out.println(manager.from("barcelona"));
		System.out.println();
		//LocalDateTime now = LocalDateTime.now();
		
	}
}
