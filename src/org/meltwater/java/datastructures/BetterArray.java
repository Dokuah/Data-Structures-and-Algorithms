package org.meltwater.java.datastructures;

public class BetterArray{
	
	//this is not meeting the unlimited criteria YET
	private static final int DEFAULT_SIZE = 10;
	private int[] jam;
	private int size;

/**
 * The constructor
 */
public BetterArray(){
	jam = new int[DEFAULT_SIZE];
	size = 0;
}




/**
 * Appends an element to an array
 *
 * @param  element  an element to be added to the array
 */
public void append(int element) {
	jam[size++] = element;
	if (size ==jam.length) {
		int[] newJam = new int [jam.length*2];
		for (int i = 0; i < jam.length; i++) {
			newJam[i] = jam[i];
		} 
		this.jam = newJam;
	}
	this.jam[size++] = element;

}




/**
 * Returns an Image object that can then be painted on the screen. 
 * 
 */
public void shift(int element) {
	insert(0, element);
}

/**
 * @return      the image at the specified URL
 * @see         Image
 */
public void insert(int position, int element) {
	if (position > size) return;
	if (position == size) {
		append(element);

	}	
}
/**
 * 
 */
public boolean contains(int key) {
	for (int i = 0; i < jam.length; i++) {
		if (i == key) {
			return true;
		}
	}
	return false;
}





	public int get(int index) {

		return jam[index];
	}

public int size() {
	return jam.length;
}
/**
 *
 * @see         Image
 */
public boolean IsEmpty() {
	if (jam.length == 0) 
	{
		return true	;	
	}
	else
	{
		return false;

	}

}
/**
 * Returns an array of integers
 *
 * @param  element  element in the array
 * @return      the image at the specified URL
 * @see         Image
 */

public int[] remove(int element){
	int[] n = new int[jam.length - 1];
	System.arraycopy(jam, 0, n, 0, element );
	System.arraycopy(jam, element+1, n, element, jam.length - element-1);
	return jam;
}

	// public void remove(int element) {

	// }



	/**
 * Returns an Image object that can then be painted on the screen. 
 
 */

	public void reverse() {

		for (int i = 0; i < jam.length / 2; i++) {
			int temp = jam[i];
			jam[i] = jam[jam.length - 1 - i];
			jam[jam.length - 1 - i] = temp;
		}

	}




	public String toString( ) {
		String elements = "";
		for(int i=1; i< jam.length; i++){
			elements += (String.valueOf(get(i))).toString();
		}
		return elements;
	}



	public static void main(String[] a) {
		BetterArray jam = new BetterArray ();
		jam.append(2);
		jam.append(3);
		// jam.append(3);
		// jam.append(3);
		// jam.append(3);
		// jam.append(3);
		System.out.println(jam.toString());

		jam.contains(2);
		jam.contains(10);

	}
}
