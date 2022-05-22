import java.util.Iterator;
import java.util.LinkedList;


class Trie{
    final TrieNode root = new TrieNode(' ');

    public void insert(String word){
        if (search(word) == true)
            return;
        TrieNode current = root;
        for(char c : word.toCharArray()){
            TrieNode child = current.getChild(c);
            if (child != null)
                current = child;
            else {
                current.childList.add(new TrieNode(c));
                current = current.getChild(c);
            }
            current.count++;
        }
        current.isEndOfWord = true;
    }

    public boolean search(String word){
        TrieNode current = root;
        for (char c : word.toCharArray()){
            if (current.getChild(c) == null){
                return false;
            } else {
                current = current.getChild(c);
            }
        }
        if (current.isEndOfWord == true){
            return true;
        }
        return false;
    }

    public void remove(String word){
        if (search(word) == false)
        {
            System.out.println(word +" does not present in trie");
            return;
        }
        TrieNode current = root;
        for (char ch : word.toCharArray())
        {
            TrieNode child = current.getChild(ch);
            if (child.count == 1)
            {
                current.childList.remove(child);
                return;
            }
            else
            {
                child.count--;
                current = child;
            }
        }
        current.isEndOfWord = false;
    }

    public static void printAllWordsInTrie(TrieNode root,String s)
    {
        TrieNode current = root;
        if(root.childList==null || root.childList.size()==0)
            return;
        Iterator iter=current.childList.iterator();
        while(iter.hasNext())
        {
            TrieNode node= (TrieNode) iter.next();
            s+=node.data;
            printAllWordsInTrie(node,s);
            if(node.isEndOfWord==true)
            {
                System.out.print(" "+s);
                s=s.substring(0,s.length()-1);
            }
            else
            {
                s=s.substring(0,s.length()-1);
            }
        }

    }
}

class TrieNode{
    boolean isEndOfWord;
    char data;
    LinkedList<TrieNode> childList;
    int count;

    TrieNode(char c){
        childList = new LinkedList<>();
        isEndOfWord = false;
        data = c;
        count = 0;
    }
    TrieNode getChild(char c){
        if (childList != null)
            for (TrieNode child : childList)
                if (child.data == c)
                    return child;
        return null;
    }
}