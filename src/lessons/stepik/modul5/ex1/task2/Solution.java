package lessons.stepik.modul5.ex1.task2;

import java.io.IOException;

public class Solution {
    public static void main(String[] args) throws IOException {
//        byte[] arr = {65, 66, 13, 13, 10, 10, 13, 67, 13, 13};
//        ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(arr);
//        System.setIn(byteArrayInputStream);
        int tmp = 0;
        int preview =  System.in.read();
        while (preview != -1) {
            tmp = System.in.read();
            if(preview != 13 && tmp != 10) System.out.write(preview);
            System.out.print(tmp + "\t");
            preview = tmp;
        }
        System.out.flush();
    }
}
