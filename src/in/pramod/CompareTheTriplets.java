package in.pramod;

import java.util.ArrayList;
import java.util.List;

public class CompareTheTriplets {

	static int a[] = { 1, 2, 3 };
	static int b[] = { 3, 2, 1 };

	public static void main(String[] args) {
		List<Integer> count = new ArrayList<>();
		try {
			for (int i = 0; i < a.length; i++) {
				for (int j = 0; j < b.length; j++) {
					if (a[i] > a[j]) {
						count.add(i, 1);

					} else {
						i++;
						j++;
					}
					if (a[i] == b[j]) {
						i++;
						j++;
					}
					else if(a[i]<b[j]) {
						count.add(i, 1);
					}
				}

			}
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
