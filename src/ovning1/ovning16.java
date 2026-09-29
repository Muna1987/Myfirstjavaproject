package ovning1;

public class ovning16 {
    static void main(String[] args) {
       int number = 9;
       double priceperunit = 120;
       double totalprice = number * priceperunit;
       if (totalprice >= 1000){
           totalprice = totalprice * 0.90;
    }
        System.out.println("the customer should pay: + totalprice ");
}
}
//
//
//        int price = 120;
//        int nbrArticles = 9;
//        int limit = 1000;
//        double discount = 0.9;
//
//        //totalpris = pris*antalVaror
//        double total = price*nbrArticles;
//
//        //OM totalpris > gräns
//        if(total > limit) {
//            total = price*nbrArticles*discount;
//        }
//        //totalpris = pris*antalVaror*rabatt
//        //
//
//        //skriva ut totalpriset
//        System.out.println(total);
//
//
//    }
//
//}