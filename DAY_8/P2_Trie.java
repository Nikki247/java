package DAY_8;

class trieNode {
    trieNode[] children;
    boolean eow;
    trieNode() {
        this.children = new trieNode[26];
        this.eow = false;
    }
}
class trieClass {
    trieNode root = new trieNode();
    public void insert(String word) {
        trieNode node = root;
        for(char ch:word.toCharArray()) {
            int index = ch - 'a';
            if(node.children[index] == null) {
                node.children[index] = new trieNode();
            }
            node = node.children[index];
        }
        node.eow = true;

    }
    public boolean search(String word) {
        trieNode node = root;
        for(char ch:word.toCharArray()) {
            int index = ch - 'a';
            if(node.children[index]==null) {
                return false;
            }
            node = node.children[index];

        }
        return node.eow;
    }
}

public class P2_Trie {
    public static void main() {
        String[] s = {"we","well","wellness","cit","gunda","swamy","swapna","swara"};
        trieClass trie = new trieClass();
        for(String i:s) {
            trie.insert(i);
        }
        System.out.println(trie.search("water"));

    }
}
