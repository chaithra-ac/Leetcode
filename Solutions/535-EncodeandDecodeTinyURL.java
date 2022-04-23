//https://leetcode.com/problems/encode-and-decode-tinyurl/


public class Codec {
    Map<String,String>map=new HashMap<>();
    int i=0;
    // Encodes a URL to a shortened URL.
    public String encode(String longUrl) {
      if(map.containsKey(longUrl))
          return map.get(longUrl);
        String turl="https://tinyurl.com/";
            turl+=""+(i++);
        map.put(longUrl,turl);
        return turl;
    }

    // Decodes a shortened URL to its original URL.
    public String decode(String shortUrl) {
       for(Map.Entry<String,String>m:map.entrySet()){
           if(m.getValue().equals(shortUrl))
               return m.getKey();
       }
      return "";  
    }
}

// Your Codec object will be instantiated and called as such:
// Codec codec = new Codec();
// codec.decode(codec.encode(url));
