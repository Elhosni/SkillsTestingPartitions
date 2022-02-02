package com.partitions.impl;

import java.util.ArrayList;
import java.util.List;

import com.partitions.interfaces.Partition;

/**
 * Cr�ation de la m�thode partitionner() sert � retourner une liste de sous liste, 
 * o� chaque sous liste a au maximum � taille � �l�ments
 * @author m.elhosni
 * 
 */
public class PartitionImpl implements Partition{	
	

	/**
	 * Impl�mentation de la m�thode partionner()
	 * @param inputList
	 * @param taille
	 * @return retourne une liste de sous liste, o� chaque sous liste a au maximum � taille � �l�ments
	 * Si inputList est une liste vide la m�thode retourne une liste vide
	 * Si taille <= 0 la m�thode retourne une liste vide
	 */
	public	<E>  List<List<E>> partitionner(List<E> inputList, int taille) {
		// TODO Auto-generated method stub
		List<List<E>> partitions = new ArrayList<List<E>>();
		
		if(inputList != null && !inputList.isEmpty()){
			if(taille > 0 ){
				if(inputList.size() > taille){
					while(inputList.size() > taille){
						
						List<E> head = inputList.subList(0, taille);
						partitions.add(head);
						
						List<E> tail = inputList.subList(taille, inputList.size());						
						inputList = tail;						
					}
					partitions.add(inputList);
			    }else{
			    	partitions.add(inputList);
			    }				
			}
		}
		return partitions;
	}
	
	

}
