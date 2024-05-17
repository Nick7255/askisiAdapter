public class App {
    public static void main(String[] args) {
        EDevice tv=new TV("TV");
        EDevice shaver=new Shaver("Shaver");
        PowerSocket pS=new PowerSocket(1);
        pS.supply(tv);
        pS.supply(shaver);
        System.out.println("--------------------------------");
        PowerAdapter pATv=new PowerAdapter(pS.getId(),tv);
        PowerAdapter pAShaver=new PowerAdapter(pS.getId(),shaver);
        pATv.supply(tv);
        pAShaver.supply(shaver);

    }

}
