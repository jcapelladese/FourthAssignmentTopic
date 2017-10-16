/**
 * 
 */
package org.escoladeltreball.fourthassignmenttopic;

import java.nio.file.Files;
import java.nio.file.Paths;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/**
 * @author iaw47941842
 *
 */
public class ITVManagerImpl extends ITVManager {

	  /**
	   * @param itvFile
	   * @throws Exception
	   */
	  public ITVManagerImpl(String itvFile) throws Exception {
	    super(itvFile);
	  }

	  /* (non-Javadoc)
	   * @see org.escoladeltreball.fourthAssignmentTopics.Manager#getNext()
	   */
	  @Override
	  public ITV getNext() throws Exception {
	    // Explicacion de local date y local time
	    LocalDateTime now = LocalDateTime.now();
	    List<ITV> itvsSortedByDate = sort(new ITVDateComparator());
	    for (ITV itv : itvsSortedByDate) {
	    	if (now.isBefore(itv.getData())) {
	    		return itv;
	    	}
	    }	    
	    return null;
	  }
	  
	  @Override
	  public List<ITV> sort(Comparator<ITV> comparator) throws Exception {
		  List<ITV> itvSorted = new ArrayList<>(itvs);
		  Collections.sort(itvSorted, comparator);		  
		  return itvSorted;
	  }
	  
	  @Override
	  public List<ITV> from(String where) throws Exception {
		  List<ITV> itvFromWhere = new ArrayList<>(itvs);
		  for (ITV itv : itvs) {
			  System.out.println("hola");
			  if (itv.getLloc() == where) {
				  System.out.println("hola");
				  itvFromWhere.add(itv);
			  }
		  }
		  return itvFromWhere;
	  }
	  
	  @Override
	  public List<ITV> from(LocalDateTime ini, LocalDateTime fin) throws Exception {
		  List<ITV> itvDateRange = new ArrayList<>(itvs);
		  for (ITV itv : itvs) {
			  if (itv.getData().isAfter(ini) && itv.getData().isBefore(fin)) {
				  itvDateRange.add(itv);
			  }			
		}		  
		  return itvDateRange;
	  }

	}
