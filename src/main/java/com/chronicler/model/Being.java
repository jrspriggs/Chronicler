/**
 * 
 */
package com.chronicler.model;

import java.util.Iterator;
import java.util.Set;

import org.springframework.data.neo4j.annotation.Fetch;
import org.springframework.data.neo4j.annotation.GraphId;
import org.springframework.data.neo4j.annotation.NodeEntity;
import org.springframework.data.neo4j.annotation.RelatedTo;
import org.springframework.data.neo4j.annotation.RelatedToVia;

/**
 * @author Joel
 *
 */
@NodeEntity
public class Being {

	public Long getId() {
		return id;
	}
	@GraphId private Long id;
	
	private String firstName;
	private String lastName;
	private boolean hero;
	private boolean villain;
	@RelatedToVia(type="TOOK_PART_IN")
	@Fetch private Set<Involvement> involvements;
	
	public Set<Involvement> getInvolvements() {
		return involvements;
	}
	public void setInvolvements(Set<Involvement> involvements) {
		this.involvements = involvements;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public boolean isHero() {
		return hero;
	}
	public void setHero(boolean hero) {
		this.hero = hero;
	}
	public boolean isVillain() {
		return villain;
	}
	public void setVillain(boolean villain) {
		this.villain = villain;
	}
	
	
	
}
