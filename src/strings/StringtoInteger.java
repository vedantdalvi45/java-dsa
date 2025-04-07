package strings;

public class StringtoInteger {
    public static int myAtoi(String s) {
        String st ="";
        boolean isNegative = false;
        for (int i = 0 ; i< s.length();i++){
            String stw = "";
            if(s.charAt(i) == ' ' || s.charAt(i) == '+')
                continue;
            else if (st.isEmpty() && s.charAt(i) == '-')
                isNegative = true;
            else if (!Character.isDigit(s.charAt(i))){
                if (st.isEmpty())
                    return 0;
                if (isNegative){
                    return -Integer.parseInt(st);
                }
                return Integer.parseInt(st);
            }
            
            if(Character.isDigit(s.charAt(i))){
                st += s.charAt(i);
            }
        }
        if (isNegative){
            return -Integer.parseInt(st);
        }
        return Integer.parseInt(st);
    }

    public static void main(String[] args) {
        System.out.println(myAtoi("-91283472332"));
    }
}
