class C2DataTypes1{
    public static void main(String[] args) {
        int a = 10;
        int b = 5;
        System.out.println("===================Guess the answers =================");

        System.out.println("Uninary operator"+ (a++));
        System.out.println("Uninary operator"+ (b++));
        System.out.println("Binary operator");
        System.out.println("1+2"+1+2);
        System.out.println("1+2"+1+2);
        System.out.println(1+2+" =3");
        int increment = ++a * b++;
        System.out.println(increment);

        System.out.println("Ternary Operator");
        int largestNumber= (a>b)?a:b;
        System.out.println("largest of 2 numbers: "+largestNumber);
    }
}