public class exercicioAula58 {
    public static void main(String[] args) {
        String original = "   ABCD abcd AbCd aaa bbb ccc ddd";
        
        System.out.println(original);
        System.out.println(original.toLowerCase());
        System.out.println(original.toUpperCase());
        System.out.println(original.trim());
        System.out.println(original.substring(10, 15));
        System.out.println(original.replace("b", "W"));
        System.out.println(original.indexOf("ab"));
        System.out.println(original.lastIndexOf("dd"));

        String text = "A cebola melhora o alface";
        
        String[] textVector = text.split(" ");
        
        for(int i = 0; !textVector[i].isEmpty(); i++){
            System.out.println(textVector[i]);    
        }
    }
}
    