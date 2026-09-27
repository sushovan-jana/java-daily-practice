class ByteArithmeticQ3
{
    public static void main(String[] args)
    {
        byte a = 20;
        byte b = 30;

        // Case 1: Compile-time error
        // byte result1 = a + b;
        // Reason: byte operands are promoted to int during arithmetic.

        // Correct way:
        byte result1 = (byte)(a + b);
        System.out.println(result1); // 50


        // Case 2: Works without explicit casting
        byte result2 = 10 + 20;
        System.out.println(result2); // 30

        // Reason:
        // 10 and 20 are integer literals.
        // The expression is evaluated at compile time,
        // and the result 30 fits within the byte range.
    }
}