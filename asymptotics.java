/** 
Midterm 2 Asymptotics Review
**/

/* Question 1: Give the best and worst case runtimes. Assume ping() is a constant time function that returns an int.
Use M and N in your result */
int j = 0;
for (int i = N; i > 0; i--) {
	for (; j <=M; j++) {
		if ping(i, j) > 6) {
			break;
		}
	}
}

/* Question 2: Give the best and worst case runtimes
Use N in your result, where N is the length of arr. Assume mrpoolsort(arr) is theta(NlogN).  */
public static boolean mystery(int[] arr) {
	arr = mrpoolsort(arr);
	int N = arr.length;
	for (int i = 0; i < N; i++) {
		boolean x = false;
		for (int j = 0; j < N; j++) {
			if (i != j && arr[i] == arr[j]) {
				x = true;
			}
		}
		if (!x) {
			return false;
		}
	}
	return true;
}


/* Question 3: Give the tightest runtime bound on the following function. */
public static int pinkTrout(int a) {
	if (a % 7 == 0) {
		return 1;
	} else {
		return pinkTrout(a-1) + 1;
	}
}


/* Question 4: Give the tightest runtime bound on the following function. Assume f1 runs in theta(N^2) time. */
public static int f2(int N) {
	if (N < 1) {
		return 5;
	} else {
		f2(N/5);
		f2(N/5);
		f2(N/5);
		f2(N/5);
		f2(N/5);
		f1(10);
		f1(10);
	}
}

/* Question 5: Give the tightest runtime bound on the following function with respect to N = input.length. */

public static void arrayFrenzy(int[][] input) {
	for (int i = 0; i < input.length; i++) {
		for (int j = 0; j < input[0].length; j++) {
			if (i <= j) {
				input[i][j] = i * 2 + input[j];
			}
		}
	}

	for (int i = 0; i < input.length; i++) {
		for (int j = 0; j < input[0].length; j++) {
			input[j][i] = 0;
		}
	}

	for (int i = 0; i < input.length; i++) {
		for (int j = 0; j < input[0].length; j++) {
			if (i < j) {
				input[i][j] = input[j] - input[i];
			}
		}
	}

}





