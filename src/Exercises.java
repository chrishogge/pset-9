import java.util.ArrayList;

public class Exercises {

	public boolean commonEnd(ArrayList<Integer> a, ArrayList<Integer> b) {
		if (a == null || a.isEmpty() || b == null || b.isEmpty()) {
			return false;
		}
		
		if(a.get(0) == b.get(0) || a.get(a.size()-1) == b.get(b.size()-1)) {
			return true;
		}
		
		return false;	// default return value to ensure compilation
	}
	
	public ArrayList<String> endsMeet(ArrayList<String> values, int n) {
		if (values == null || values.size() == 0 || values.size() < n || n < 0) {
			ArrayList<String> returnArray = new ArrayList<String>();
			return returnArray;
		}else if(!(values == null || values.size() == 0 || values.size() < n || n < 0)){
			ArrayList<String> endsMeet = new ArrayList<String>();
			
			for(int i = 0; i < n; i++) {
				endsMeet.add(values.get(i));
			}
			
			int k = n;
			for(int j = values.size()-n; j < values.size(); j++) {
				endsMeet.add(values.get(j));
				k++;
			}
			
			return endsMeet;
			
		}
		
		
		ArrayList<String> returnArray = new ArrayList<String>();
		
		return returnArray;	// default return value to ensure compilation
	}
	
	public int difference(ArrayList<Integer> numbers) {
		if (numbers == null || numbers.size() < 1) {
			return -1;	
		} else if(!(numbers == null || numbers.size() < 1)){
			
			int inputMax = numbers.get(0);
			int inputMin = numbers.get(0);
			
			for(int i = 0; i < numbers.size(); i++) {
				if(numbers.get(i) > inputMax) {
					inputMax = numbers.get(i);
				}
				
				if(numbers.get(i) < inputMin) {
					inputMin = numbers.get(i);
				}
			}
			
			return inputMax - inputMin;
		}
		
		return -1;		// default return value to ensure compilation
	}
	
	public double biggest(ArrayList<Double> numbers) {
		if (numbers == null || numbers.size() < 3 || numbers.size() % 2 == 0) {
			return -1;
		} else if(!(numbers == null || numbers.size() < 3 || numbers.size() % 2 == 0)) {
			for(int a = 0; a < numbers.size(); a++) {
				if(numbers.get(a) < 0){
					return -1;
				}
			}
			
			double firstMax = numbers.get(0);
			double midMax = numbers.get(numbers.size()/2);
			double lastMax = numbers.get(numbers.size()-1);
			
			if(firstMax > midMax) {
				if(firstMax > lastMax) {
					return firstMax;
				}else if(lastMax > firstMax) {
					return lastMax;
				}
			}else if(midMax > firstMax) {
				if(midMax>lastMax) {
					return midMax;
				}else if(lastMax > midMax) {
					return lastMax;
				}
			}else if(firstMax == midMax && midMax == lastMax) {
				return firstMax;
			}
			
			
		}	
		
		return -1;		// default return value to ensure compilation
	}
	
	public ArrayList<String> middle(ArrayList<String> values) {
		ArrayList<String> returnArray = new ArrayList<String>();
		if (values == null || values.size() < 3 || values.size() % 2 == 0) {
			return returnArray;
		} else if(!(values == null || values.size() < 3 || values.size() % 2 == 0)) {
			for(int a = 0; a < values.size(); a++) {
				if(values.get(a) == null) {
					return returnArray;
				}
			}
			
			int mid = (values.size()-1)/2;
			
			String firstString = values.get(mid-1);
			String secondString = values.get(mid);
			String thirdString = values.get(mid+1);
			
			ArrayList<String> middleArray = new ArrayList<String>();
			middleArray.add(firstString);
			middleArray.add(secondString);
			middleArray.add(thirdString);
			
			return middleArray;
		}
		
		return null;	// default return value to ensure compilation
	}

	public boolean increasing(ArrayList<Integer> numbers) {
		if (numbers == null || numbers.size() < 3) {
			return false;
		} else if(!(numbers == null || numbers.size() < 3)) {
			for(int i = 1; i < numbers.size()-1; i++) {
				if(numbers.get(i) > numbers.get(i-1) && numbers.get(i) < numbers.get(i+1)) {
					return true;
				}
			}
			
			return false;
		}
		
		return false;	// default return value to ensure compilation
	}
	
	public boolean everywhere(ArrayList<Integer> numbers, int x) {
		if (numbers == null || numbers.size() < 1) {
			return false;
		} else if(!(numbers == null || numbers.size() < 1)) {
			int count = 0;
			
			for(int i = 1; i < numbers.size()-2; i++) {
				if((numbers.get(i) == x && numbers.get(i+1) == x) || (numbers.get(i) == x && numbers.get(i+2) == x)) {
					count++;
				}
			}
			
			if(count!=0) {
				return true;
			}else if(count==0) {
				return false;
			}
		}
		
		return false;	// default return value to ensure compilation
	}
	
	public boolean consecutive(ArrayList<Integer> numbers) {
		
		if (numbers == null || numbers.size() < 3) {
			return false;
		} else if(!(numbers == null || numbers.size() < 3)){
			for(int i = 1; i < numbers.size()-1; i++) {
				if((numbers.get(i-1)%2 == 0 && numbers.get(i)%2==0 && numbers.get(i+1)%2==0) || (numbers.get(i-1)%2 != 0 && numbers.get(i)%2!=0 && numbers.get(i+1)%2!=0)) {
					return true;
				}
			}
			
			return false;
		}
		
		return false;	// default return value to ensure compilation
	}
	
	public boolean balance(ArrayList<Integer> numbers) {
		if (numbers == null || numbers.size() < 2) {
			return false;
		} else if(!(numbers == null || numbers.size() < 2)) {
			int leftSum = 0;
			int rightSum = 0;
			
			for(int i = 0; i < numbers.size(); i++) {
				rightSum += numbers.get(i);
			}
			
			for(int j = 0; j < numbers.size()-1; j ++) {
				if(leftSum != rightSum) {
					leftSum+=numbers.get(j);
					rightSum-=numbers.get(j);
				}
			}
			
			return leftSum==rightSum;
		}
		
		return false;	// default return value to ensure compilation
	}
	
	public int clumps(ArrayList<String> values) {
		
		if (values == null) {
			return -1;
		} else if(values != null) {
			int clumps = 0;
			boolean clumpSection = false;
			for(int i = 0; i < values.size()-1; i++) {
				
				if(clumpSection) {
					if(!(values.get(i).equals(values.get(i+1)))){
						clumpSection = false;
					}
				}else if(clumpSection == false) {
					if(values.get(i).equals(values.get(i+1))) {
						clumps++;
						clumpSection = true;
					}
				}
			
			}
			return clumps;
		}
		
		
		return -1;		// default return value to ensure compilation
	}
}
