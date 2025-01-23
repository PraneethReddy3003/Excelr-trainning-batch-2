public class LT003 {
    
    
    public int myAtoi(String s) {
        
        s = s.trim();

    
        if (s.isEmpty()) {
            return 0;
        }

        int sign = 1;
        int i = 0;
        
       
        if (s.charAt(i) == '-') {
            sign = -1;
            i++;
        } else if (s.charAt(i) == '+') {
            i++;
        }

        long result = 0;
        
        
        while (i < s.length() && Character.isDigit(s.charAt(i))) {
            result = result * 10 + (s.charAt(i) - '0');
            i++;

            
            if (result > Integer.MAX_VALUE) {
                return sign == 1 ? Integer.MAX_VALUE : Integer.MIN_VALUE;
            }
        }

        
        result *= sign;

        
        if (result < Integer.MIN_VALUE) {
            return Integer.MIN_VALUE;
        }
        if (result > Integer.MAX_VALUE) {
            return Integer.MAX_VALUE;
        }

        return (int) result;
    }

    
    public static void main(String[] args) {
        Solution solution = new Solution();
        
        
        System.out.println(solution.myAtoi("42"));            
        System.out.println(solution.myAtoi("   -042"));       
        System.out.println(solution.myAtoi("1337c0d3"));      
        System.out.println(solution.myAtoi("0-1"));           
        System.out.println(solution.myAtoi("words and 987")); 
        System.out.println(solution.myAtoi("21474836460"));  
    }
}