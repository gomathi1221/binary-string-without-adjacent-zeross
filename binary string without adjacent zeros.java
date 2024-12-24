class Solution {
    public List<String> validStrings(int n) {
      
       List<String>list=new ArrayList<>();
        generate(n,"",list);
        return list;
        
    }
    public void generate(int n, String c,List<String>list){
        if(n==c.length()){
            list.add(c);
            return;
        }
        
        if(c.isEmpty()||c.charAt(c.length()-1)!='0'){
            generate(n,c+"0",list);
        }
         generate(n,c+"1",list);
    }
}