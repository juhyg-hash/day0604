public class Main {
    public static void main(String[] args) {
        int input = 5;

        do{
            System.out.println("자판기 입니다");

            //키입력

            switch(input){
                case 1 :
                    System.out.println("콜라");
                    break;
                case 2 :
                    System.out.println("사이다");
                    break;
                case 3 :
                    System.out.println("물");
                    break;
                default:
                    System.out.println("잘못 고름");
            }

//            input = 0;

        } //while(input != 0);
            while(input == 0);

       }
}