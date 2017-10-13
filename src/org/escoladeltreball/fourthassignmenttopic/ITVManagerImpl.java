/**
 * 
 */
package org.escoladeltreball.fourthassignmenttopic;

import java.time.LocalDateTime;

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
	    return null;
	  }

	}
