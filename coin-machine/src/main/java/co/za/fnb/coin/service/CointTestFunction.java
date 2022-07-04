package co.za.fnb.coin.service;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class CointTestFunction {

	// maximum number of input amount
	 final int MAX = 100000;
	 
	// tempReslt array to memoize the results
	 int []tempReslt = new int[MAX + 1];
	 
	// List to store the result
	 List<Integer> denomination =  new ArrayList<Integer>();
	 
	/* Function to find the minimum number of coins 
	 *to make the sum equals to X
	 */
	 int countMinCoins(int amount,int coinDenomination[])
	{
	  // Base case (If the value amount is 0)
	  if (amount == 0)
	  {
	    tempReslt[0] = 0;
	    return 0;
	  }
	 
	  // If previously computed subproblem occurred
	  if (tempReslt[amount] != -1)
	    return tempReslt[amount];
	 
	  // Initialize result
	  int ret = Integer.MAX_VALUE;
	 
	  // Try every coin that has smaller value than amount
	  for (int i = 0; i < coinDenomination.length; i++)
	  {
	    if (coinDenomination[i] <= amount)
	    {
	    // this is a recurssion(method calling itself)
	      int x = countMinCoins(amount - coinDenomination[i], coinDenomination);
	 
	      // Check for Integer.MAX_VALUE to avoid overflow and see if result can be minimized
	      if (x != Integer.MAX_VALUE)
	        ret = Math.min(ret, 1 + x);
	    }
	  }
	 
	  // Memoizing value of current state
	  tempReslt[amount] = ret;
	  return ret;
	}
	 
	// Function to find the possible
	List<Integer> findSolution(int amount,int coinDenomination[]){
	  // Base Case
	  if (amount == 0){
	    // Print Solutions		  
		  return denomination;	    
	  }
	 
	  for (int i = 0; i < coinDenomination.length; i++)
	  {
	    // Try every coin that has
	    // value smaller than amount
	    if (amount - coinDenomination[i] >= 0 && tempReslt[amount - coinDenomination[i]] + 1 == tempReslt[amount])
	    {
	      // Add current denominations
	      denomination.add(coinDenomination[i]);
	 
	      // Backtrack
	      findSolution(amount - coinDenomination[i], coinDenomination);
	      break;
	    }
	  }
	return denomination;
	}
	 
	// Function to find the minimum combinations of coins for value X
	 public List<Integer> countMinCoinsUtil(int X, int coinDenomination[])
	{
	  // Initialize tempReslt with -1
	  for (int i = 0; i < tempReslt.length; i++)
	    tempReslt[i] = -1;
	 
	  // Min coins
	  int isPossible = countMinCoins(X, coinDenomination);	  
	 
	  // If no solution exists
	  if (isPossible == Integer.MAX_VALUE)
	  {
	    System.out.print("-1");
	    return new ArrayList<>();
	  }
	 
	  // Backtrack to find the solution
	  else
	  {
		  
	   return findSolution(X, coinDenomination);
	  }
	
	}
	
	}