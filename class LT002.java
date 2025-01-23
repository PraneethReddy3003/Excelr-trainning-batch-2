class LT002 {
    public int reverse(int x) {
        int reversed = 0;
        int sign = x < 0 ? -1 : 1;
        x = Math.abs(x);

        while (x != 0) {
            int digit = x % 10;
            x /= 10;
            if (reversed > Integer.MAX_VALUE / 10 || (reversed == Integer.MAX_VALUE / 10 && digit > 7)) {
                return 0; 
            }
            
            // Check for underflow
            if (reversed < Integer.MIN_VALUE / 10 || (reversed == Integer.MIN_VALUE / 10 && digit < -8)) {
                return 0; 
            }

            reversed = reversed * 10 + digit;
        }
        return sign * reversed;
    }

    public static void main(String[] args) {
        LT002 solution = new LT002();
        System.out.println(solution.reverse(123));
        System.out.println(solution.reverse(-123));
        System.out.println(solution.reverse(120));
        System.out.println(solution.reverse(0));
    }
}