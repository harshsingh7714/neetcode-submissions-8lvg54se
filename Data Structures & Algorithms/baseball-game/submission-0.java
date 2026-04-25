class Solution {
    public int calPoints(String[] operations) {
        Stack<Integer> s=new Stack<>();
        int a=0,b=0,c=0;
        int result=0;
        for(String i:operations){
           if(i.equals("+"))
            {
             a=s.pop();
             b=s.pop();
             int sum=a+b;
             s.push(b);
             s.push(a);
             s.push(sum);
            }
            else if(i.equals("C")){
                s.pop();
            }
            else if(i.equals("D")){
              c=s.pop();
              s.push(c);
              s.push(c*2);
            }
            else{
                s.push(Integer.parseInt(i));
            }
        }
        for(int y:s){
           
            result+=y;
        }
        return result;
    }
}