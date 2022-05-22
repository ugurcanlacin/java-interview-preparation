import org.junit.Test;

public class HashTableTest {
    @Test
    public void hashTableTest(){
        // https://gist.github.com/amadamala/3cdd53cb5a6b1c1df540981ab0245479
        // It is buggy implementation, but good example for the logic behind HashTable

        HashTable hashTable = new HashTable();
        // Put some key values.
        for(int i=0; i<30; i++) {
            final String key = String.valueOf(i);
            hashTable.put(key, key);
        }

        // Print the HashTable structure
        System.out.println("****   HashTable  ***");
        System.out.println(hashTable.toString());
        System.out.println("\nValue for key(20) : " + hashTable.get("20") );
    }
}
