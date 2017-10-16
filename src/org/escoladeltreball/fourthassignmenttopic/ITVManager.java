/**
 * 
 */
package org.escoladeltreball.fourthassignmenttopic;

import java.nio.file.Files;
import java.nio.file.Paths;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;

/**
 * @author iaw47941842
 *
 */
public abstract class ITVManager implements Manager {

	protected List<ITV> itvs;

	/**
	 * 
	 */
	public ITVManager(String itvFile) throws Exception {
		setup(itvFile);
	}

	private void setup(String itvFile) throws Exception {

		/*
		 * Explicacion Paths y Files java 8 en el file itv: id es long, lo demás es
		 * cadena
		 */
	    List<String> records = Files.readAllLines(Paths.get(itvFile));
	    // System.out.println(records);

	    itvs = new ArrayList<>();

	    for (String record : records) {
	      String[] fields = record.split(",");
	      long id = Long.parseLong(fields[0]);
	      ITV itv = new ITV(id, fields[1], LocalDateTime.parse(fields[2], DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss")), fields[3]);
	      itvs.add(itv);
	      
	    }
//	    System.out.println(itvs.size());
	  }

}
