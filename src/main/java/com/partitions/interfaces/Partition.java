package com.partitions.interfaces;

import java.util.List;

/**
 * 
 * @author m.elhosni
 *
 */
public interface Partition {	
	
	/**
	 * 
	 * @param inputList
	 * @param taille
	 * @return retourne une liste de sous liste, o� chaque sous liste a au maximum � taille � �l�ments
	 */
	<E> List<List<E>> partitionner(List<E> inputList, int taille);

}
