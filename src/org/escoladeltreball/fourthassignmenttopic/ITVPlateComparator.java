/**
 * 
 */
package org.escoladeltreball.fourthassignmenttopic;

import java.util.Comparator;

/**
 * @author iaw47941842
 *
 */
public class ITVPlateComparator implements Comparator<ITV> {

	@Override
	public int compare(ITV itv1, ITV itv2) {
		return itv1.getMatricula().compareTo(itv2.getMatricula());
	}
}
