class Solution {
    public static List<String> helper(String ip,List<String> res,String op){
        if(ip.length()==0){
            res.add(op);
            return res;
        }
        if(Character.isLetter(ip.charAt(0))){
            helper(ip.substring(1),res,(op+Character.toUpperCase(ip.charAt(0))));
            helper(ip.substring(1),res,(op+Character.toLowerCase(ip.charAt(0))));
            
        }else{
             if(!Character.isLetter(ip.charAt(0))){
            helper(ip.substring(1),res,(op+ip.charAt(0)));
        }
        }
        return res;
    }
    public List<String> letterCasePermutation(String s) {
        String op = "";
        List<String> res = new ArrayList<>();
        return helper(s,res,op);
    }
}