import java.util.ArrayList;

class Lists {

	public static void main(String[] args) {
		ArrayList<Integer> c = random(9);
		System.out.print("Unsorted: ");
		print(c);
		System.out.print("Selection: ");
		print(selectionSort(c));
		System.out.print("Insertion: ");
		print(insertionSort(c));
		System.out.print("Bubble: ");
		print(bubbleSort(c));
	}

	public static void print(ArrayList<Integer> a) {
		for (int i : a) {
			System.out.print(i + ", ");
		}
		System.out.println();
	}

	public static ArrayList<Integer> random(int s) {
		ArrayList<Integer> t = new ArrayList<Integer>();
		int n = (int)Math.random() * s;
		for (int i = 0; i < s; i++) {
			t.add((int)(Math.random() * 100));
		}
		return t;
	}
	
	public static int size(ArrayList<Integer> a) {
		int c = 0;
		for (Integer i : a) {
			c++;
		}
		return c;
	}

	public static boolean unSortExists(int n, ArrayList<Integer> a) {
		for (int i = 0; i < size(a); i++) {
			if (n == a.get(i)) {
				return true;
			}
		}
		return false;
	}

	// public static boolean ordExists(int n, ArrayList<Integer> a) {
	// 	ArrayList<Integer> t = new ArrayList<Integer>();
	// 	ArrayList<Integer> b = new ArrayList<Integer>();
	// 	while (size(a) >= 0) {
			
	// 	}
	// 	return false;
	// }

	public static ArrayList<Integer> reverse(ArrayList<Integer> a) {
		int temp;
		for (int i = 0; i < (size(a)/2); i++) {
			temp = a.get(i);
			a.set(i, a.get(size(a) - (i + 1)));
			a.set(size(a) - (i + 1), temp);
		}
		return a;
	}

	public static boolean ordered(ArrayList<Integer> a) {
		int o = 0;
		for (int i = 0; i < size(a) - 1; i++) {
			if (a.get(i) > a.get(i + 1)) {
				o++;
			}
		}
		if (o == size(a) - 1) {
			return true;
		}
		return false;
	}

	public static ArrayList<Integer> selectionSort(ArrayList<Integer> a) {
		int min, ind;
		int temp;
		for (int i = 0; i < size(a); i++) {
			min = a.get(i);
			ind = i;
			for (int j = i + 1; j < size(a); j++) {
				if (min > a.get(j)) {
					min = a.get(j);
					ind = j;
				}
			}
			a.set(ind, a.get(i));
			a.set(i, min);
		}
		return a;
	}

	public static ArrayList<Integer> bubbleSort(ArrayList<Integer> a) {
		boolean t = false;
		int temp;
		int c = 0;
		while (!t) {
			t = true;
			for (int i = 0 + c % 2; i < size(a) - 1; i+=2) {
				if (a.get(i) > a.get(i + 1)) {
					temp = a.get(i + 1);
					a.set(i + 1, a.get(i));
					a.set(i, temp);
					t = false;
				}
			}
			c++;
		}
		return a;
	}

	public static ArrayList<Integer> insertionSort(ArrayList<Integer> a) {
		int temp;
		int j, t;
		for (int i = 1; i < size(a); i++) {
			j = i - 1;
			t = i;
			while (a.get(t) < a.get(j)) {
				temp = a.get(t);
				a.set(t, a.get(j));
				a.set(j, temp);
				if (j != 0) {
					j--;
					t--;
				} else {
					break;
				}
			}
		}
		return a;
	}

	

}