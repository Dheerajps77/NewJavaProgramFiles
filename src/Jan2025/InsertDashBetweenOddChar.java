package Jan2025;

public class InsertDashBetweenOddChar {

	public static String DashInsert(String str) {
		StringBuilder result = new StringBuilder();
		for (int i = 0; i < str.length(); i++) {
			result.append(str.charAt(i));

			if (i < str.length() - 1) {
				char currentChar = str.charAt(i);
				char nextChar = str.charAt(i + 1);

				if (isOdd(currentChar) && isOdd(nextChar)) {
					result.append('-');
				}
			}
		}

		return result.toString();
	}

public static String DashInsert(String str) {
    StringBuilder sb = new StringBuilder();

    for (int i = 0; i < str.length() - 1; i++) {
        sb.append(str.charAt(i));

        if ((str.charAt(i) % 2 == 1) && (str.charAt(i + 1) % 2 == 1)) {
            sb.append('-');
        }
    }

    sb.append(str.charAt(str.length() - 1)); // Add last char

    return sb.toString();
}

	public static boolean isOdd(char c) {
		return c == '1' || c == '3' || c == '5' || c == '7' || c == '9';
	}

	public static void main(String[] args) {
		String str = "454793";
		String result = DashInsert(str);
		System.out.println("Result: " + result);
	}

}
