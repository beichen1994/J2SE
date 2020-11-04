package cn.itcast_05;

import java.util.Arrays;

/**
 * 					Class Arrays

						
				static void	sort(byte[] a)
							Sorts the specified array into ascending numerical order.
							
				static void	sort(byte[] a, int fromIndex, int toIndex)
							Sorts the specified range of the array into ascending order.
							
				static void	sort(int[] a)
							Sorts the specified array into ascending numerical order.
							
				static void	sort(int[] a, int fromIndex, int toIndex)
							Sorts the specified range of the array into ascending order
							.
				static void	sort(double[] a)
							Sorts the specified array into ascending numerical order.
							
				static void	sort(double[] a, int fromIndex, int toIndex)
							Sorts the specified range of the array into ascending order.
							
				static void	sort(float[] a)
							Sorts the specified array into ascending numerical order.
							
				static void	sort(float[] a, int fromIndex, int toIndex)
							Sorts the specified range of the array into ascending order.
							
				static void	sort(char[] a)
							Sorts the specified array into ascending numerical order.
							
				static void	sort(char[] a, int fromIndex, int toIndex)
							Sorts the specified range of the array into ascending order.
							

				static void	sort(Object[] a)
							Sorts the specified array of objects into ascending order, according to the natural ordering of its elements.
							
				static void	sort(Object[] a, int fromIndex, int toIndex)
							Sorts the specified range of the specified array of objects into ascending order, according to the natural ordering of its elements.
			
		static int	binarySearch(byte[] a, byte key)
					Searches the specified array of bytes for the specified value using the binary search algorithm.
					
		static int	binarySearch(byte[] a, int fromIndex, int toIndex, byte key)
					Searches a range of the specified array of bytes for the specified value using the binary search algorithm.
		
		static int	binarySearch(int[] a, int key)
					Searches the specified array of ints for the specified value using the binary search algorithm.
					
		static int	binarySearch(int[] a, int fromIndex, int toIndex, int key)
					Searches a range of the specified array of ints for the specified value using the binary search algorithm.
					
		static int	binarySearch(double[] a, double key)
					Searches the specified array of doubles for the specified value using the binary search algorithm.
					
		static int	binarySearch(double[] a, int fromIndex, int toIndex, double key)
					Searches a range of the specified array of doubles for the specified value using the binary search algorithm.
					
		static int	binarySearch(float[] a, float key)
					Searches the specified array of floats for the specified value using the binary search algorithm.
					
		static int	binarySearch(float[] a, int fromIndex, int toIndex, float key)
					Searches a range of the specified array of floats for the specified value using the binary search algorithm.	
										
		static int	binarySearch(char[] a, char key)
					Searches the specified array of chars for the specified value using the binary search algorithm
					
		static int	binarySearch(char[] a, int fromIndex, int toIndex, char key)
					Searches a range of the specified array of chars for the specified value using the binary search algorithm.
		
		static int	binarySearch(Object[] a, int fromIndex, int toIndex, Object key)
					Searches a range of the specified array for the specified object using the binary search algorithm.
					
		static int	binarySearch(Object[] a, Object key)
					Searches the specified array for the specified object using the binary search algorithm.
		
					

		static String	toString(byte[] a)
						Returns a string representation of the contents of the specified array.
						
		static String	toString(char[] a)
						Returns a string representation of the contents of the specified array.
						
		static String	toString(int[] a)
						Returns a string representation of the contents of the specified array.
						
		static String	toString(double[] a)
						Returns a string representation of the contents of the specified array.
						
		static String	toString(float[] a)
						Returns a string representation of the contents of the specified array.
						
  		static String	toString(boolean[] a)
				   		Returns a string representation of the contents of the specified array.
				   
		static String	toString(Object[] a)
						Returns a string representation of the contents of the specified array.




 *
 */
public class ArraysDemo {
	public static void main(String[] args) {
		
		int [] arr = {12,32,43,16,21,78,3};
		System.out.println("排序前：" + Arrays.toString(arr));
		
		Arrays.sort(arr);
		System.out.println("排序后： "  + Arrays.toString(arr));
		
		int []arrs = {11,43,65,75,93};
		int a = Arrays.binarySearch(arrs, 75);
		System.out.println("75 所在的位置 :" + a);
	}

}
