class MethodOverload{
    static int plusMethod(int a, int b)
    {
        return a + b;
    }

    static float plusMethod(float a, float b)
    {
        return a + b;
    }

    static int plusMethod(int a, int b, int c)
    {
        return a + b + c;
    }

    public static void main(String[] args) {
        int myNum1 =  plusMethod(8, 2);
        float myNum2 = plusMethod(2.6f, 3.8f);
        int myNum3 = plusMethod(6, 6, 6);

        System.out.println("myNum1 = " + myNum1);
        System.out.println("myNum2 = " + myNum2);
        System.out.println("myNum3 = " + myNum3);
    }
}
