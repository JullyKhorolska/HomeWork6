package checkUser;
import user.User;

public class CheckUser {
    public static void main(String[] args) {

        User firstUser = new User();
        User secondUser = new User("Vadim");
        User thirdUser = new User("Jon", "099999a");

//        information about first user

        firstUser.userName = "Yulia";
        System.out.println("\nInformation about: " + firstUser.userName);

        firstUser.setAge(18);
        System.out.println(firstUser.userName + " age: " + firstUser.getAge());

        firstUser.setPassword("1234579A");
        System.out.println(firstUser.userName + " password: " + firstUser.getPassword());

        firstUser.email = "uxa@ukr.net";
        System.out.println(firstUser.userName + " email: " + firstUser.email);
        System.out.println("------------------------------------");

        firstUser.makePurchase(0); // sum of purchase by first user
        firstUser.makePurchase(10);
        firstUser.makePurchase(100);

        System.out.println("------------------------------------");
        firstUser.purchaseOfUserPrint();
        firstUser.addDiscountForUser(5);
        System.out.println("\n");

//        information about second user

        System.out.println("Information about: " + secondUser.userName);

        secondUser.setAge(17);
        System.out.println(secondUser.userName + " age: " + secondUser.getAge());

        secondUser.setPassword("A1111111");
        System.out.println(secondUser.userName + " password: " + secondUser.getPassword());

        secondUser.email = "vadim@gmail.com";
        System.out.println(secondUser.userName + " email: " + secondUser.email);
        System.out.println("------------------------------------");

        secondUser.makePurchase(20.9);
        secondUser.makePurchase(20.0);
        System.out.println("------------------------------------");
        secondUser.purchaseOfUserPrint();
        secondUser.addDiscountForUser(10);

        System.out.println("\n");

//        information about third user

        System.out.println("Information about: " + thirdUser.userName);

        thirdUser.setAge(-70);
        System.out.println(thirdUser.userName + " age: " + thirdUser.getAge());

        System.out.println(thirdUser.userName + " password: " + thirdUser.getPassword());

        thirdUser.email = "jon1234@gmail.com";
        System.out.println(thirdUser.userName + " email: " + thirdUser.email);
        System.out.println("------------------------------------");

        thirdUser.makePurchase(0);
        thirdUser.makePurchase(100);
        thirdUser.makePurchase(-80);

        System.out.println("------------------------------------");
        thirdUser.purchaseOfUserPrint();
        thirdUser.addDiscountForUser(20);

        System.out.println("\n");
        User.printTotalAmountOfSpentMoney();
        User.addDiscount();

    }
}

