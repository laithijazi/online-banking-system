public class mainProgram{
    public static void main(String args[]){
        bankSystem bank = new bankSystem();
        bank.createUser("64220039", "Laith Hijazi", "laith.hijazi@icloud.com", "123123");
        bank.createAccount("1", "64220039", 500);

        bank.createUser("64220068", "Hassan Ghezzaoui", "hassan.ghezzaoui@gmail.com", "53215321");
        bank.createAccount("2", "64220068", 300);
    }
}
