// https://leetcode.com/problems/implement-trie-prefix-tree/
class TrieNode {
    TrieNode[]trie;
    boolean isend;
    public TrieNode() {
        this.trie=new TrieNode[26];
        this.isend=false;
    }
}
class Trie{
    Trie(){}
    TrieNode root=new TrieNode();
    public void insert(String word) {
        TrieNode temp=root;
        for(int i=0;i<word.length();i++){
            if(temp.trie[word.charAt(i)-'a']==null)
                temp.trie[word.charAt(i)-'a']=new TrieNode();
                temp=temp.trie[word.charAt(i)-'a'];
        }
        temp.isend=true;
    }
    
    public boolean search(String word) {
        TrieNode temp=root;
        int i=0;
        while(i<word.length()){
            if(temp.trie[word.charAt(i)-'a']==null)return false;
            temp=temp.trie[word.charAt(i)-'a'];
            ++i;
        }
        return temp.isend;
        
    }
    
    public boolean startsWith(String word) {
         TrieNode temp=root;
        int i=0;
        while(i<word.length()&&temp.trie[word.charAt(i)-'a']!=null){
            temp=temp.trie[word.charAt(i)-'a'];
            i++;
        }
        return word.length()==i;
    }
}

/**
 * Your Trie object will be instantiated and called as such:
 * Trie obj = new Trie();
 * obj.insert(word);
 * boolean param_2 = obj.search(word);
 * boolean param_3 = obj.startsWith(prefix);
 */
