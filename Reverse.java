public class Reverse {
    public static void main(String[] args) {
        String word = args[0];
        int length=word.length()-1;
        int middleIndex= length/2;
        char middleChar=word.charAt(middleIndex);
        while (length>=0){
            System.out.print(word.charAt(length));
            length--;
        }

        System.out.println();

        System.out.println("The middle character is "+middleChar);



    }}