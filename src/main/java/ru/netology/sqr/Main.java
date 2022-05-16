package ru.netology.sqr;

public class Main {

   public static void main(String[] args) {

        SQRService service = new SQRService();

      int downsqr = 300;
      int highsqr = 600;

       int sqrlist = service.sqrRange( 300, 600);

       System.out.println(sqrlist);
    }
}
