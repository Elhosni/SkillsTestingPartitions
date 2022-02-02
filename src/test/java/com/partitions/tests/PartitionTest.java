package com.partitions.tests;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.junit.Assert;
import org.junit.Test;

import com.partitions.impl.PartitionImpl;



public class PartitionTest {
	
	private final PartitionImpl partitionImpl = new PartitionImpl();
	
	private List<Integer> integerList = Arrays.asList(5,3,1,2,9,5,0,7);	
	
	@Test
	public void testCase1(){		
        // Il faut que la méthode crée une list de 4 liste de taille 2
		Assert.assertEquals(partitionImpl.partitionner(integerList, 2).size(),4);		
		System.out.println("Partitions de TestCase 1: " + partitionImpl.partitionner(integerList, 2));
	}
	
	@Test
	public void testCase2(){		
        // Il faut que la méthode crée une list de 4 liste de taille 2
		Assert.assertEquals(partitionImpl.partitionner(integerList, 4).size(),2);		
		System.out.println("Partitions de TestCase 2: " + partitionImpl.partitionner(integerList, 4));
	}
	
	
	@Test
	public void testCase3(){		
        // Il faut que la méthode crée une list contenant une seule liste de taille de taille au max 9
		Assert.assertEquals(partitionImpl.partitionner(integerList, 9).size(),1);		
		System.out.println("Partitions de TestCase 3: " + partitionImpl.partitionner(integerList, 9));
	}
	
	
	@Test
	public void testCase4(){		
        // Il faut que la méthode crée une list contenant une seule liste de taille de taille au max 9
		Assert.assertNotEquals(partitionImpl.partitionner(integerList, 3).size(),2);		
		System.out.println("Partitions de TestCase 4: " + partitionImpl.partitionner(integerList, 3));
	}
	
	// Test case ou inputList est une liste vide
	@Test
	public void testCase5(){		
        // La méthode est écrite pour qu'elle renvoie une liste vide quand le input integerList est une liste vide
		Assert.assertEquals(partitionImpl.partitionner(new ArrayList<Integer>(), 2).size(),0);		
		System.out.println("Partitions de TestCase 5: " + partitionImpl.partitionner(new ArrayList<Integer>(), 2));
	}
	
	// Test case ou taille est égale à 0
	@Test
	public void testCase6(){		
        // La méthode est écrite pour qu'elle renvoie une liste vide quand le input taille est 0
		Assert.assertEquals(partitionImpl.partitionner(integerList, 0).size(),0);		
		System.out.println("Partitions de TestCase 6: " + partitionImpl.partitionner(integerList, 0));
	}
	
	// Test case ou taille est inférieur à 0
	@Test
	public void testCase7(){		
        // La méthode est écrite pour qu'elle renvoie une liste vide quand le input taille est 0
		Assert.assertEquals(partitionImpl.partitionner(integerList, -1).size(),0);		
		System.out.println("Partitions de TestCase 7: " + partitionImpl.partitionner(integerList, -1));
	}
}
