public class array2 {
    public static void main(String args[]){
        String input_Strings = "abbccccc";
        String updatesInput = "";

        for(int i = 0; i<input_Strings.length()-1; i++){
            char currentChar = input_Strings.charAt(i);
            char nextChar = input_Strings.charAt(i+1);

            if(currentChar == nextChar){
                updatesInput += currentChar;
            }else{
                System.out.println(currentChar+updatesInput);
                updatesInput = "";
            }
        }
    }
}
