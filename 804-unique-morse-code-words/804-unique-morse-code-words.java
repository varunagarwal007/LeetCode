class Solution {
    
    private String generateMorseCode(String str, HashMap<Character,String> map) {
        String answer = "";
        
        char[] ch = str.toCharArray();
        for(int i = 0; i<ch.length; i++) {
            answer = answer + map.get(ch[i]);
        }
        
        
        
       
        
        
        return answer;
    }
    
    
    public int uniqueMorseRepresentations(String[] words) {
        HashMap<Character, String> map = new HashMap<>();
        String arr[]  = {".-","-...","-.-.","-..",".","..-.","--.","....","..",".---","-.-",".-..","--","-.","---",".--.","--.-",".-.","...","-","..-","...-",".--","-..-","-.--","--.."};
        int count = 0;
        for(char a = 'a';a<='z';a++) {
            map.put(a,arr[count]);
            count++;
        }
        HashSet<String> set = new HashSet<>();
        
        int len = words.length;
        for(int i = 0 ; i<len ;i++) {
            set.add(generateMorseCode(words[i],map));
        }
        
        
        
        return set.size();
        
    }
}