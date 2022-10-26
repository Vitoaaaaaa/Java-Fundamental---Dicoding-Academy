public class ForBersarang {
    public static void main(String[] args) {
        int a = 5;
        for (int i = 0; i <= a; i++) {
            for (int j = 0; j <= i; j++) {
                for (int k=0; k <= j; k++){
                    for (int y=0; y <= i;){
                        System.out.print("*");
                        break;
                    }
                }
                System.out.print("*");
            }
            System.out.println();
        }
    }
}