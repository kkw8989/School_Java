////import java.util.Scanner;
////
////public class Homework1 {
////    public static void main(String[] args) {
////        Scanner sc = new Scanner(System.in);
////        int sum = 0;
////
////        for (int i = 0; i < 5; i++) {
////            System.out.print("정수를 입력하세요: ");
////            int num = sc.nextInt();
////            sum += num;
////            System.out.println("현재까지 입력된 정수의 합은 " + sum + "입니다.");
////        }
////    }
////}
//
//import java.util.Scanner;
//
//public class Homework1{
//    public static void main(String[] args){
//        Scanner sc = new Scanner(System.in);
//        int sum=0;
//
//        for(int i=0;i<5;i++){
//            System.out.print("정수 입력: ");
//            int num= sc.nextInt();
//            if(num==0){
//                break;
//            }
//            sum+=num;
//            System.out.println("현재까지 입력된 정수 합은 "+sum+"입니다");
//        }
//    }
//}

class Rectangle {
    private double height;
    private double width;
    private double area;
    Rectangle(double h, double w) {
        height = h;
        width = w;
        area = w * h;
    }
    double getArea() {
        return area;
    }
}
// TestRectangle3.java
class Homework1 {
    public static void main(String[] args) {
        Rectangle rect = new Rectangle(10, 15);
        double area = rect.getArea();
        System.out.println("면적 = " + area);
// rect.calcArea(); // 오류
    }
}
