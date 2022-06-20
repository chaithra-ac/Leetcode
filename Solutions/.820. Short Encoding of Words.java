//https://leetcode.com/problems/short-encoding-of-words/
class Trie{
    Trie[]trie;
    boolean isEnd;
    Trie(){
        this.trie=new Trie[26];
        this.isEnd=false;
    }
}

class Solution {
    HashSet<String>set=new HashSet<>();
    public int minimumLengthEncoding(String[] words) {
        Arrays.sort(words,(a,b)->b.length()-a.length());
        Trie root=buildTrie(words);
        StringBuilder sb=new StringBuilder();
        for(int i=0;i<words.length;i++){
            if(set.contains(words[i]))
                continue;
            sb.append(words[i]+'#');
            set.add(words[i]);
            Trie cur=root;
            for(int j=1;j<words[i].length();j++){
                if(root.trie[words[i].charAt(j)-'a']!=null){
                    if(hasShortString(cur,j,words[i]))
                        set.add(words[i].substring(j));
                }
            }
            
        // System.out.println(set+" "+sb.toString());
        }
        return sb.length(); 
    }
    boolean hasShortString(Trie root,int start,String word){
        for(int i=start;i<word.length();i++){
            if(root.trie[word.charAt(i)-'a']==null)
                return false;
            root=root.trie[word.charAt(i)-'a'];
        }
        return true;
    }
    Trie buildTrie(String[]w){
        Trie root=new Trie();
        for(int i=0;i<w.length;i++){
            Trie temp=root;
            for(char c:w[i].toCharArray()){
                if(temp.trie[c-'a']==null){
                    temp.trie[c-'a']=new Trie();
                }
                temp=temp.trie[c-'a'];
            }
            temp.isEnd=true;
        }
        return root;
    }
}
