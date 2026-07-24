import java.util.List;

public class Main {
    public static void main(String[] args){
        HashUtil util = new HashUtil();

        String hash = util.sha256("uvg");
        System.out.println(hash);

        Transaction tx = new Transaction("Alex", "Otto", 2.3);
        //System.out.println(tx);
         Transaction tx2 = new Transaction("Marre", "Joss", 5.3);
        
         System.out.println(tx);


        Mempool mempool = new Mempool();
        mempool.submit(tx);
        mempool.submit(tx2);

        System.out.println("mempool has " + mempool.size() + "txs");

    }
    List<Transaction> pending = mempool.take(5);
    for (Transaction tmp : pending) {
        System.out.println(tmp);
    }
}