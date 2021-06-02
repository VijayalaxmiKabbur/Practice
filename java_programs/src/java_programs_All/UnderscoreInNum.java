package java_programs_All;

public class UnderscoreInNum {
	public static void main(String args[]) {
		int a= 057;
		System.out.println(a); // It will print decimal values
		
		//to print octal values use Integer.toOctalString()
		
		System.out.println("to octal value = " + Integer.toOctalString(a));
		
		int hexval = 0x1E;
		System.out.println(hexval);
		System.out.println(Integer.toHexString(hexval));
		
		int binValue = 0b1001;
		System.out.println(binValue);
		System.out.println("to binary value = " + Integer.toBinaryString(binValue));
		
		
		//hexadecimal floating point notation
		double hexfloat = 0x1.2EbA0p1;
		System.out.println(hexfloat);
		
		System.out.println(Double.toHexString(hexfloat));
		
		
		double hexvalue = 0x1.234p1;
		
		boolean True = true;
		
		
	}

}
