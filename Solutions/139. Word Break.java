//https://leetcode.com/problems/word-break/
class Trie{
    Trie[]trie;
    boolean isEnd;
    Trie(){
        this.trie=new Trie[26];
        this.isEnd=false;
    }
}
class Solution {
    boolean[]dp;
    public boolean wordBreak(String s, List<String> dic) {
        int len=s.length();
        dp=new boolean[s.length()+1];
        Trie root=buildTrie(dic);
        Trie temp=root;
        dp[0]=true;
        for(int i=0;i<len;i++){
            if(dp[i])check(i,s,root);
        }
        return dp[len];
    }
    
    Trie buildTrie(List<String>dic){
        Trie root=new Trie();
        for(int i=0;i<dic.size();i++){
            Trie temp=root;
            for(char c:dic.get(i).toCharArray()){
                if(temp.trie[c-'a']==null){
                    temp.trie[c-'a']=new Trie();
                }
                temp=temp.trie[c-'a'];
            }
            temp.isEnd=true;
        }
        return root;
    }
    void check(int st,String s,Trie root){
        Trie temp=root;
        for(int i=st;i<s.length();i++){
            if(temp.trie[s.charAt(i)-'a']!=null){
                if(temp.trie[s.charAt(i)-'a'].isEnd)
                    dp[i+1]=true;
                temp=temp.trie[s.charAt(i)-'a'];
            }
            else return;
        }
            if(temp.isEnd)
                dp[s.length()]=true;
    }
}
