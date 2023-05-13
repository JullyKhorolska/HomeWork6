package user;
public class User {
    public User (){
    }
    public User (String userName){

        this.userName = userName;
    }
    public User (String userName, String password){
        this.userName = userName;
        this.password = password;
    }
    public String userName;
    private  int age;
    private String password;
    public String email;
    public boolean isActive;
    static public double amountSpentMoney = 0;
    public double purchasePrice = 0;

    public int getAge() {
        return age;
    }

    // set-function for user's age validation
    public void setAge(int age) {
        if(age > 0 ){
            if(age < 18){
                this.age = age;
                System.out.println(this.age + " years" + " - is less than 18." + " You can't make purchase");
            } else this.age = age;
        } else {
            System.out.println(this.age + " years" + " - isn't valid." + " You must enter your age!");
        }
    }
    public String getPassword() {

        return password;
    }

    // set-function for user's password validation
    public void setPassword(String password) {
        if(!password.contains(" ") && password.length() == 8) {
            if(password.matches("(.*)[0-9](.*)") && password.equals(password.toLowerCase())){
                System.out.println("Password must contain numbers and not less one uppercase symbol");
            } else this.password = password;
        } else System.out.println("Please, enter password with 8 symbols");
    }

    //  function that counts sum of purchase by one user and total sum of purchase by all users
    public void makePurchase(double purchasePrise){
        if(purchasePrise >= 0){
            User.amountSpentMoney += purchasePrise;
            this.purchasePrice += purchasePrise;
            if(User.amountSpentMoney >= 100){
                isActive = true;
            }
            System.out.println(this.userName + " made purchase on: " + purchasePrise);
            if(isActive){
                System.out.println("You are active. Keep it up!");
            } else {
                System.out.println("You aren't active. Let's make another purchase!");
            }
        } else System.out.println("You purchase price is not valid " + purchasePrise);
    }

    //  function that displays total sum of purchase by the user
    public void purchaseOfUserPrint(){
        System.out.println(this.userName + " spent " + this.purchasePrice);
    }

    //  function that displays total sum of purchase by ALL users
    static public void printTotalAmountOfSpentMoney(){
        System.out.println("All users spent " + amountSpentMoney);
    }
}

