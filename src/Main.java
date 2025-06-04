public class Main {
    public static void main(String[] args) {

//        for (int i = 1; i <= 9; i++) {
//            for (int j = 1; j <= 9; j ++) {
//                System.out.println();
//            }
//        }

//
//        for (int i = 1; i <= 9; i++) {
//            // <--j의 반복이 끝난후 i 의 반복 시작
//            for (int j = 1; j <= 9; j ++) {
//                System.out.println("i는 " + i + ", j는 " + j);
//            }
//            // <-- j의 반복이시작 딜때 j의 반복을 하고 다시 i 두번째 반복으로 넘어가면 다시 j의 반복
//        }
        for (int i = 1; i <= 9; i++) {
            System.out.println(i+"단");
            for (int j = 1; j <= 9; j ++) {
                System.out.println(i + " x " + j + " = " + (i * j));

                
            }

        }
    }
}