import org.junit.Test;

public class TrieTest {
    @Test
    public void trieTest(){
        /*https://java2blog.com/trie-data-structure-in-java/*/
        Trie t = new Trie();
        t.insert("ugur");
        t.insert("ugurcan");
        t.insert("do");
        t.insert("he");
        t.insert("hen");
        t.insert("heat");

        System.out.println("ugur present in trie : "+t.search("ugur"));
        System.out.println("ugurcan present in trie : "+t.search("ugurcan"));
        System.out.println("deal present in trie : "+t.search("deal"));
        System.out.println("Printing all word present in trie : ");
        t.remove("ugur");
        t.printAllWordsInTrie(t.root,"");
    }
}
