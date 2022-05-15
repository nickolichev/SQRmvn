package ru.netology.sqr;

public class Main {

   public static void main(String[] args) {

        SQRService service = new SQRService();

      int down = 10;
      int high = 99;
      int downsqr = 300;
      int highsqr = 600;

       int sqrlist = service.sqrRange(10, 99, 300, 600);

       System.out.println(sqrlist);
    }
}
