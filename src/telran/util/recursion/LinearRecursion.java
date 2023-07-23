package telran.util.recursion;

public class LinearRecursion {
	public static void function(int a) {
		if(a > 3) {
			System.out.println(a);
			function(a - 1);
		}
		
	}
	
	public static void function1(int i) {
		for(;i>3;i--) {
			System.out.println(i);
		}
	}
	
	public static long factorial1(int n) {
		if (n < 0) {
			throw new IllegalArgumentException("factorial exists only for positive numbers and 0");
		}
		long res = 1;
		for(; n>0; n--){
			res *= n;
	 }
		return res;
	}
	
	public static long factorial(int n) {
		long res = 1;
		if (n < 0) {
			throw new IllegalArgumentException("factorial exists only for positive numbers and 0");
		}
		if (n > 0) {
			res = n * factorial(n - 1);
		}
		return res;
		
	}
	public static long pow (int a, int b) {
//		long res = 1;
//		if (b < 0) {
//			throw new IllegalArgumentException("degree cannot be a negative");
//		}
//		if (b > 0) {
//			res = a * pow(a, b - 1);
//		}
//		return res;
		//TODO
		
		    if (b < 0) {
		        throw new IllegalArgumentException("degree cannot be negative");
		    }

		    if (b == 0) {
		        return 1;
		    }

		    return pow(a, b - 1) * a;
		
	}
	public static void displayArray(int[] ar) {
		displayArray(0, ar, false);
	}
private static void displayArray(int index, int[] ar, boolean isReverse) {
		if (index < ar.length) {
			if (isReverse) {
				displayArray(index + 1, ar, isReverse);
				System.out.print(ar[index] + " ");
			} else {
				System.out.print(ar[index] + " ");
				displayArray(index + 1, ar, isReverse);
			}
		}
		
	}
public static void displayReversedArray(int[] ar) {
	displayArray(0, ar, true);
	}

public static long sumArray(int []array) {
	return sumArray(0, array);
}
private static long sumArray(int index, int[] array) {
	long res = 0;
	if (index < array.length) {
		res = array[index] + sumArray(index + 1, array);
	}
	return res;
}
public static void reverseArray(int[] array) {
	reverseArray(0, array, array.length -1);
}
private static void reverseArray(int left, int[] array, int right) {
	if(left < right) {
		int tmp = array[left];
		array[left] = array[right];
		array[right] = tmp;
		reverseArray(left + 1, array, right - 1);
	}
	
}
public static int square(int x) {
    int result = 0;
    int absX = (x < 0) ? -x : x;

    if (x >= 0) {
        for (int i = 0; i < absX; i++) {
            result += absX;
        }
    } else {
        for (int i = 0; i < absX; i++) {
            result -= absX;
        }
    }

    return result;
}
public static boolean isSubstring(String string, String substr) {
    int strLength = string.length();
    int subLength = substr.length();

    if (subLength == 0) {
        return true; 
    }

    if (subLength > strLength) {
        return false;
    }

    for (int i = 0; i <= strLength - subLength; i++) {
        if (checkSubstringAtPosition(string, substr, i)) {
            return true;
        }
    }

    return false;
}
private static boolean checkSubstringAtPosition(String string, String substr, int index) {
    if (index == substr.length()) {
        return true;
    }
    
    char expectedChar = substr.charAt(index);
    char actualChar = string.charAt(index + index);
    if (expectedChar != actualChar) {
        return false;
    }
    
    return checkSubstringAtPosition(string, substr, index + 1);
}
}