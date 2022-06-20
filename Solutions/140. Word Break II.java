//https://leetcode.com/problems/word-break-ii/
class Trie{
    Trie[]trie;
    boolean isEnd;
    String word;
    Trie(){
        this.trie=new Trie[26];
    }
}
class Solution {
        Trie root=new Trie();
    public List<String> wordBreak(String s, List<String> dic) {
        Trie root=buildTrie(dic);
        List<String> res = new ArrayList<>();
        List<String> current = new ArrayList<>();
        dfs(s, 0, root, current, res);
        return res;
    }
        Trie buildTrie(List<String>dic){
        for(int i=0;i<dic.size();i++){
            Trie temp=root;
            for(char c:dic.get(i).toCharArray()){
                if(temp.trie[c-'a']==null){
                    temp.trie[c-'a']=new Trie();
                }
                temp=temp.trie[c-'a'];
            }
            temp.isEnd=true;
            temp.word=dic.get(i);
        }
        return root;
    }
     void dfs(String s, int index, Trie node, List<String> current, List<String> res) {
        if(index == s.length()) {
            if(node == root) {
                res.add(String.join(" ", current));
            }
            return;
        }
        if(node == null) return;
        Trie trie = node.trie[s.charAt(index) - 'a'];
        if(trie != null && trie.isEnd) {
            current.add(trie.word);
            dfs(s, index + 1, root, current, res);
            current.remove(current.size() - 1);
        }
        dfs(s, index + 1, trie, current, res);
    }    
}
