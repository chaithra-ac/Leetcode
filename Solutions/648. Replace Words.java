//https://leetcode.com/problems/replace-words/
class Trie {
     
    Trie[] trie;
    boolean isend;
    Trie(){
        this.trie=new Trie[26];
        isend=false;
    }
    
}
class Solution {
    public String replaceWords(List<String> dic, String sen) {
      Trie root=buildTrie(dic);
        
       String[]words=sen.split(" ");
        StringBuffer sb=new StringBuffer();
        for(int i=0;i<words.length;i++){
            sb.append(shortest(words[i],root));
            sb.append(" ");
        }
    return sb.toString().trim();
    }
    
   Trie buildTrie(List<String>dic){
        Trie root=new Trie();
        for(int i=0;i<dic.size();i++){
            Trie temp=root;
            for(Character c:dic.get(i).toCharArray()){
               if(temp.trie[c-'a']==null){
                   temp.trie[c-'a']=new Trie();
               }
                   temp=temp.trie[c-'a'];
            }
            temp.isend=true;
        }
       return root;
    } 
    public String shortest(String w,Trie root){
            StringBuffer sw=new StringBuffer();
        Trie cur=root;
           for(char c:w.toCharArray()){
                   sw.append(c);
               
               if(cur.trie[c-'a']!=null){
                  if(cur.trie[c-'a'].isend){
                   return sw.toString();}
               cur=cur.trie[c-'a'];
               }
               else
                   return w;
               
           }
        return w;
       }
}
