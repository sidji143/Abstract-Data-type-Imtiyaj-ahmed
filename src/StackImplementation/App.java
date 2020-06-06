package StackImplementation;

public class App {

	public static void main(String[] args) {
		Stack st = new Stack(10); 
		/*
		 * st.push(20); st.push(40); st.push(60); st.push(80);
		 * st.push(100); st.push(120); st.push(140);
		 * 
		 * 
		 * 
		 * while(!st.isEmpty()) { System.out.println(st.pop()); }
		 * System.out.println("--------------------------");
		 * 
		 * System.out.println(st.pop());
		 */
		 System.out.println(reverseString("siddharth"));
			
	}
	public static String reverseString(String str) {
		int stringLength = str.length();
		Stack  stack = new Stack(stringLength);
		for(int i =0; i< str.length(); i++) {
			char ch = str.charAt(i);
			stack.push(ch);
		}
		String result="";
		while(!stack.isEmpty()) {
			char ch = (char) stack.pop();
			result = result + ch;
		}
		return result;
	}

}
