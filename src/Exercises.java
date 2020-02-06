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
				endsMeet.set(i, values.get(i));
			}
			
			int k = n;
			for(int j = values.size()-n; j < values.size(); j++) {
				endsMeet.set(k, values.get(j));
				k++;
			}
			
			return endsMeet;
			
		}
		
		
		ArrayList<String> returnArray = new ArrayList<String>();
		
		return null;	// default return value to ensure compilation
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
		// write your code here
		
		return -1;		// default return value to ensure compilation
	}
	
	public ArrayList<String> middle(ArrayList<String> values) {
		// write your code here
		
		return null;	// default return value to ensure compilation
	}

	public boolean increasing(ArrayList<Integer> numbers) {
		// write your code here
		
		return false;	// default return value to ensure compilation
	}
	
	public boolean everywhere(ArrayList<Integer> numbers, int x) {
		// write your code here
		
		return false;	// default return value to ensure compilation
	}
	
	public boolean consecutive(ArrayList<Integer> numbers) {
		// write your code here
		
		return false;	// default return value to ensure compilation
	}
	
	public boolean balance(ArrayList<Integer> numbers) {
		// write your code here
		
		return false;	// default return value to ensure compilation
	}
	
	public int clumps(ArrayList<String> values) {
		// write your code here
		
		return -1;		// default return value to ensure compilation
	}
}
