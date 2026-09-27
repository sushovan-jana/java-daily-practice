class ByteArithmeticQ8
{
    public static void main(String args[])
    {
        // byte[] contains raw byte values
        byte[] byteData = {54, 76, 34, 98};

        // Convert byte data into a String
        String decodedText = new String(byteData);
        System.out.println(decodedText); // Output : 6L"b


        // char[] contains character values
        char[] characters = {'h', 'e', 'l', 'l', 'o'};

        // Convert character array into a String
        String textFromCharacters = new String(characters);
        System.out.println(textFromCharacters); // output : hello
    }
}

