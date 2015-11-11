import java.util.ArrayList;

//public class search {
//	public static int linearSearch(int searchedContestant,int[] contestants){
//	    for (int i = 0; i<contestants.length; i++){
//	    	if (contestants[i] == searchedContestant){
//	    		return(i);
//	    	}
//	    }
//	    return(-1);
//	}
//}



public class Search {

	public static int linearSearch(ContestantInformation x,ContestantInformation[] contestants){
	    for (int i = 0; i<contestants.length; i++){
	    	if (contestants[i] == x){
	    		return(i);
	    	}
	    }
	    return(-1);
	}
	
	//____________________________________________________________________============_
	
public static int linearSearch(double x,double[] array){
    for (int n = 0; n<array.length; n++){
	    	if (array[n] == x){
	    		return(n);
	    		}
    }
	    return(-1);
	}

//____________________________________________________________________============_

public static int linearSearch(String x,String[] array){
    for (int n = 0; n<array.length; n++){
	    	if (array[n].equalsIgnoreCase(x)){
	    		return(n);
	    		}
    }
	    return(-1);
	}
	
public static int linearSearch(ContestantInformation x,ArrayList<ContestantInformation> contestants){
    for (int n = 0; n < contestants.size(); n++){
	    	if (contestants.get(n).equalsIgnoreCase(x)){
	    		return(n);
	    		}
    }
	    return(-1);
	}
	
	//____________________________________________________________________============_
//____________________________________________________________________============_
//_________________________________________________________________===========_
//public static int binarySearch(ContestantInformation x, ArrayList  <ContestantInformation> contestants){
//	int begIndex = 0;
//	int endIndex =contestants.size() - 1;
//	
//	while(begIndex <= endIndex){
//	int midIndex = (begIndex + endIndex)/2;
//    if (x.compareToIgnoreCase(contestants.get(midIndex)) > 0){
//	begIndex = midIndex+1; 
//    }
//
//	else if (x.compareToIgnoreCase(contestants.get(midIndex))< 0){
//		endIndex = midIndex-1;
//		   }
//	else if(x.compareToIgnoreCase(contestants.get(midIndex))==0){
//		return(midIndex);
//		}
//    }
//	return(-1);
//}

public static int binarySearch(ContestantInformation x, ArrayList  <ContestantInformation> contestants){
	int begIndex = 0;
	int endIndex =contestants.size() - 1;
	int result = binarySearch(x, contestants, begIndex, endIndex);
	return result;
}

private static int binarySearch(ContestantInformation x, ArrayList <ContestantInformation> contestants,int begIndex,int endIndex){
	if (begIndex>endIndex){
		return - 1;
	}
	int mid = (begIndex + endIndex) /2; 
	if (contestants.get(mid).compareToIgnoreCase(x) == 0){
		return mid;
	}
	else if (contestants.get(mid).compareToIgnoreCase(x) <= 0){
		return binarySearch(x,contestants,mid+1,endIndex);
	}
	else // (contestants.get(mid).compareToIgnoreCase(x) >= 0)
	{
		return binarySearch(x,contestants, begIndex, mid-1);
	}
}
public static int binarySearch(int x, int[] array){
		int begIndex = 0;
		int endIndex = array.length - 1;
		
		while(begIndex <= endIndex){
		int midIndex = (begIndex + endIndex)/2;
	    if (x > array[midIndex]){
		begIndex = midIndex+1;
	    }
  
		else if (x < array[midIndex]){
			endIndex = midIndex-1;
			   }
		else if(x == array[midIndex]){
			return(midIndex);
			}
	    }
		return(-1);
	}
		
//____________________________________________________________________============_


		public static int binarySearch(double x, double[] array){
			int begIndex = 0;
			int endIndex = array.length - 1;
			
			while(begIndex <= endIndex){
			int midIndex = (begIndex + endIndex)/2;
		    if (x > array[midIndex]){
			begIndex = midIndex+1;
		    }
	  
			else if (x < array[midIndex]){
				endIndex = midIndex-1;
				   }
			else if(x == array[midIndex]){
				return(midIndex);
				}
		    }
			return(-1);
		}
			
//____________________________________________________________________============_

		public static int binarySearch(String x, String[] array){
				int begIndex = 0;
				int endIndex = array.length - 1;
				
				while(begIndex <= endIndex){
				int midIndex = (begIndex + endIndex)/2;
			    if (x.compareToIgnoreCase(array[midIndex]) > 0){
				begIndex = midIndex+1; 
			    }
		  
				else if (x.compareToIgnoreCase(array[midIndex])<0){
					endIndex = midIndex-1;
					   }
				else if(x.compareToIgnoreCase(array[midIndex])==0){
					return(midIndex);
					}
			    }
				return(-1);
		

		}
}

