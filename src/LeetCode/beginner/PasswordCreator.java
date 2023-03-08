package LeetCode.beginner;

public class PasswordCreator {

    public String generatePasswordFromStrings(String firstWord, String secondWord){
        String newPassword = "";

        if(isEitherWordNull(firstWord, secondWord)){
            newPassword = secondWord;
            return newPassword;
        }else if(isEitherWordNull(secondWord, firstWord)){
            newPassword = firstWord;
            return newPassword;
        }else if(!isNonNullStrings(firstWord, secondWord)){
            newPassword =  generatePasswordFromAlternatingWordCharacters(firstWord, secondWord);
        }

        return newPassword;
    }

    private boolean isEitherWordNull(String firstWord, String secondWord) {
        return isNullWord(firstWord) && !secondWord.isEmpty();
    }

    private boolean isNonNullStrings(String firstWord, String secondWord) {
        return isNullWord(firstWord) && isNullWord(secondWord);
    }

    private boolean isNullWord(String word) {
        return word == null;
    }


    public String generatePasswordFromAlternatingWordCharacters(String firstWord, String secondWord){
        int rearPointer = 0;
        int frontPointer = 0;
        StringBuffer newPassword = new StringBuffer();

        while(rearPointer < firstWord.length() || frontPointer < secondWord.length()){
            if(rearPointer < firstWord.length()){
                newPassword.append(firstWord.charAt(rearPointer));
                rearPointer++;
            }
            if(frontPointer < secondWord.length()){
                newPassword.append(secondWord.charAt(frontPointer));
                frontPointer++;
            }
        }

        return newPassword.toString();
    }
}
