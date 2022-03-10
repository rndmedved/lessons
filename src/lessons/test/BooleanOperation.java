package lessons.test;

public class BooleanOperation {
    public static void main(String[] args) {
        BooleanOperation bool = new BooleanOperation();
        boolean[][] bul1 = {{true & true, false & true}, {true & false, false & false}};
        boolean[][] bul2 = {{true == true, false == true}, {true == false, false == false}};
        bool.printOperation(bul1);
        System.out.println("-------------------------------");
        bool.printOperation(bul2);

    }


    public void printOperation(boolean[][] booleans){
        for (int i = 0; i < booleans.length; i++) {
            for(int j = 0; j < booleans[i].length; j++){
                System.out.print(booleans[i][j] + "\t");
            }
            System.out.println();
        }
    }
}
