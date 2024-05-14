package Calcupak;

import java.util.*;

public class Calculator {
//String s1;
	int a;
	int b;
	int res;
	public String eOrc;
	boolean flag = false;
	int counter;

	public void fun() {
		do {
			try {
				Scanner sc = new Scanner(System.in);

				System.out.println("Enter the operation needed to be performed.");
				System.out.println("dc");

				String s1 = sc.nextLine();
				System.out.println(s1);

				if (s1.equals("+") || s1.equals("-") || s1.equals("/") || s1.equals("*")) {

					if (flag == false) {
						System.out.println("Enter a 1number");
						a = sc.nextInt();
					}

					System.out.println("Enter a number");
					b = sc.nextInt();
					// System.out.println(b);

					switch (s1) {
					case ("+"): {
						res = a + b;
						if (flag == true) {
							res = res + b;
						}
						System.out.println(res);
						flag = true;
						break;
					}
					case ("-"): {
						res = a - b;
						if (flag == true) {
							res = res - b;
						}
						System.out.println(res);
						flag = true;
						break;
					}
					case ("*"): {
						res = a * b;
						if (flag == true) {
							res = res * b;
						}
						System.out.println(res);
						flag = true;
						break;
					}
					case ("/"): {
						res = a / b;
						if (flag == true) {
							res = res / b;
						}
						System.out.println(res);
						flag = true;
						break;
					}
					default: {
						System.out.println("Enter correct operaion(+,-,*,/) and a valid number.");
					}
					}
				} else {
					System.out.println("Errrrrrrorrrrrrrrr!!!!!!!!!!!!!");
					break;
				}

				System.out.println("1 to end or any key to continue.");
				counter = sc.nextInt();
			} finally {
			}

		} while (counter != 1);
	}

	public static void main(String[] arrgs) {
		Calculator niw = new Calculator();
		niw.fun();

	}

}
