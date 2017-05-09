package br.com.fiap.ex02;

public class DecimalToBinary {
	
	public static void main(String[] args) {
		Integer test = 12;
		StringBuffer result = new StringBuffer();
		while (test/2 >= 0){
			result.append(Integer.toString(test%2));
			if (test/2 == 0) {
				break;
			}
			test /= 2;
		}
		System.out.println(result.reverse().toString());
	}
}
