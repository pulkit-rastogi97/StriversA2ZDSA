package ProblemOfTheDay;

import utilities.IOUtils;

public class ConvertString {
	public static void main(String[] args) {
		String str = IOUtils.takeStringLineInput();
		System.out.println(convertString(str));
	}
	
	public static String convertString(String str) {
        StringBuilder sb = new StringBuilder();
        sb.append(Character.toUpperCase(str.charAt(0)));
        for(int i = 1; i < str.length(); i++){
            char ch = str.charAt(i);
            if(str.charAt(i - 1) == ' '){
                ch = Character.toUpperCase(ch);
            }
            sb.append(ch);
        }

        return sb.toString();
    }
}	
