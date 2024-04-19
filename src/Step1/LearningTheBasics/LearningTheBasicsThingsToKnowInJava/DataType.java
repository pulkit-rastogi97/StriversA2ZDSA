package Step1.LearningTheBasics.LearningTheBasicsThingsToKnowInJava;

import java.util.Scanner;

public class DataType {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String dataType = scan.next();
		int size = dataTypes(dataType);
		System.out.println(size);
		scan.close();
	}
	
	private static int dataTypes(String type) {
        
        if(type.equalsIgnoreCase("Long")){
            return 8;
        }else if(type.equalsIgnoreCase("Integer")){
            return 4;
        }else if(type.equalsIgnoreCase("Float")){
            return 4;
        }else if(type.equalsIgnoreCase("Double")){
            return 8;
        }else if(type.equalsIgnoreCase("Character")){
            return 1;
        }

        return 4;  // default for 32-bit memory pointer
    }

}
