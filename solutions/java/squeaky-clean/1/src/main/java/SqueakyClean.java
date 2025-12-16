import java.util.regex.Pattern;

class SqueakyClean {
    static String clean(String identifier) {
        //remove whitespace, replace with '_'
        char[] identifierAsArray = identifier.toCharArray();
        
        for (int i = 0; i < identifierAsArray.length; i++) {
            if (Character.isWhitespace(identifierAsArray[i])) {
                identifierAsArray[i] = '_';
            } 
        }
        String noWhitespace = new String(identifierAsArray);

        //kebabCase to CamelCase
        String kebabToCamel = Pattern.compile("-([a-zA-Z])")
            .matcher(noWhitespace)
            .replaceAll(mr -> mr.group(1).toUpperCase());

        //leetspeak to normal text
        String leekspreakToNormalText = kebabToCamel
            .replace('4', 'a')
            .replace('3', 'e')
            .replace('0', 'o')
            .replace('1', 'l')
            .replace('7', 't');
        String cleaned = leekspreakToNormalText.replaceAll("[^a-zA-Z_]", "");
        
        return cleaned;
    }
}


