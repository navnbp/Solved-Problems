package String;
public class ReverseString {

	 public String reverseString(String s) {
		 
		 if(s==null || s.length()==0)
			 return s;
		 	char[] charArray=s.toCharArray();
		 	 int i=0,j=s.length()-1;
		 	 
		 	 while(i<j)
		 	 {
		 		 char temp=charArray[i];
		 		charArray[i]=charArray[j];
		 		charArray[j]=temp;
		 		i++;j--;
		 		 
		 		 
		 	 }
		 		 
		 		 return new String (charArray);
	    }
	 
	 
	public static void main(String[] args) {

		ReverseString obj= new ReverseString();
		System.out.println(5/2);
		System.out.println(obj.reverseString("hello   "));

	}

}
