package Pattern_Questions;

public class solid_pattern {
    public static void main(String[] args) {

        int n = 4;
        int m = 5;
        //outer loop

        for (i=1; i<=n; i++){
            //inner loop
            for(j=1; j<=m; j++){

                if(i == 1 || j == 1 || i == n || j == m) {
                    System.out.print("*");
            } else{
                System.out.println(" ");
            }
        }     
    }    System.out.println();
}

}