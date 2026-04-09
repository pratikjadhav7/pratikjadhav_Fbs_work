public class q4{
    public static void main(String[] args) {
        for(int i=1;i<=15;i++){
            for(int j=1;j<=15;j++){
                if(i==1||i==15||j==1||j==15){
                System.err.print(" *");
            }else{
                System.out.print("  ");
            }
        }
            System.out.print("\n");
        }
    }
}