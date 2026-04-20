public class C4NestedIf{
    public static void main(String[] args){
        boolean Sunny = true;
        boolean hot = false;

        if (Sunny){
            if(hot){
                System.out.print("Wear a cap and half sleeves.");
            } else{
                System.out.print("Wear half sleeves only.");
            }
        }else {
            System.out.print("Wear a Rain-coat for safety");
        }
    }
}