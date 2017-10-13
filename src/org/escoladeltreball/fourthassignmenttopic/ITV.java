/**
 * 
 */
package org.escoladeltreball.fourthassignmenttopic;


import java.time.LocalDateTime;


/**
 * @author iaw47941842
 *
 */
public class ITV implements Comparable<ITV> { // COMPARABLE ho fa amb ordre natural i el COMPARATOR ordenat per un altre camp 
	
	private long id;
	private String matricula;
	private LocalDateTime data;
	private String lloc;
	
	
	/**
	 * @param id
	 * @param matricula
	 * @param data
	 * @param lloc
	 */
	public ITV(long id, String matricula, LocalDateTime data, String lloc) {
		this.id = id;
		this.matricula = matricula;
		this.data = data;
		this.lloc = lloc;
	}
	
	// ************* Getters & Setters *************


	/**
	 * @return the id
	 */
	public long getId() {
		return id;
	}

	/**
	 * @param id the id to set
	 */
	public void setId(long id) {
		this.id = id;
	}

	/**
	 * @return the matricula
	 */
	public String getMatricula() {
		return matricula;
	}

	/**
	 * @param matricula the matricula to set
	 */
	public void setMatricula(String matricula) {
		this.matricula = matricula;
	}

	/**
	 * @return the data
	 */
	public LocalDateTime getData() {
		return data;
	}

	/**
	 * @param data the data to set
	 */
	public void setData(LocalDateTime data) {
		this.data = data;
	}

	/**
	 * @return the lloc
	 */
	public String getLloc() {
		return lloc;
	}

	/**
	 * @param lloc the lloc to set
	 */
	public void setLloc(String lloc) {
		this.lloc = lloc;
	}
		
	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return String.format("ITV [id=%s, matricula=%s, data=%s, lloc=%s]", id, matricula, data, lloc);
	}

	/**
	 * retornarà un int negatiu si el id d'aquesta itv és més petit que l'id de itv 
	 * 0 si són iguals
	 * positiu si el id d'aquesta itv és més gran que l'id de itv 
	 */
	@Override
	public int compareTo(ITV itv) {
		return (int) (id - itv.id);
	}
	
	

}
