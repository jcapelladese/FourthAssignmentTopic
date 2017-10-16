/**
 * 
 */
package org.escoladeltreball.fourthassignmenttopic;

import java.util.Comparator;

/**
 * @author iaw47941842
 *
 */
public class ITVWhereComparator implements Comparator<ITV> {
	
	@Override
	public int compare(ITV itv1, ITV itv2) {
		return itv1.getLloc().compareTo(itv2.getLloc());
	}
}





