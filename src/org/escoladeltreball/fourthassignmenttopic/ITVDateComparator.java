/**
 * 
 */
package org.escoladeltreball.fourthassignmenttopic;

import java.util.Comparator;

/**
 * @author iaw47941842
 *
 */
public class ITVDateComparator implements Comparator<ITV> {
	
	@Override
	public int compare(ITV itv1, ITV itv2) {
		return itv1.getData().compareTo(itv2.getData());
	}

}
