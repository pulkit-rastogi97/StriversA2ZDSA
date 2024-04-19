package Step1.LearningTheBasics;

public class IfElse {

	public static void main(String[] args) {
		int a = IOUtils.takeIntInput();
		int b = IOUtils.takeIntInput();
		
		String result = compareIfElse(a, b);
		System.out.println(result);
	}
	
    public static String compareIfElse(int a, int b) {
        if(a<b){
            return "smaller";
        }else if(a>b){
            return "greater";
        }else{
            return "equal";
        }
    }
}
