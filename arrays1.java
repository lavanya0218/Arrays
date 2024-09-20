/*public class arrays1 {
    public static void main(String[] args) {
        String input_string = "Move#Hash#to#Front";
        String word = "";
        String hashes = "";
        for(int i =0; i<input_string.length(); i++){
            char currentChar = input_string.charAt(i);
            if(currentChar == '#'){
                hashes += currentChar;
            }else{
                word += currentChar;
            }
        }
        String result = hashes+word ;
        System.out.println(result);
    }
}  O(n**2) below one is O(n)*/

public class arrays1 {
    public static void main(String[] args) {
        String input_string = "Move#Hash#to#Front";
        StringBuilder word = new StringBuilder();
        StringBuilder hashes = new StringBuilder();
        
        for(int i = 0; i < input_string.length(); i++){
            char currentChar = input_string.charAt(i);
            if(currentChar == '#'){
                hashes.append(currentChar);
            }else{
                word.append(currentChar);
            }
        }
        
        String result = hashes.append(word).toString();
        System.out.println(result);
    }
}

