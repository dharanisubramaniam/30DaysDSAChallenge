import java.util.*;
import java.lang.*;
import java.io.*;

class Atoi
{
public int myAtoi(String s) {
    if (s == null || s.isEmpty()) return 0;
    
    int n = s.length();
    int i = 0;
    int sign = 1;
    long result = 0;

    // 1. Skip leading whitespaces
    while (i < n && s.charAt(i) == ' ') i++;

    // 2. Check for optional sign
    if (i < n && (s.charAt(i) == '+' || s.charAt(i) == '-')) {
        sign = (s.charAt(i) == '-') ? -1 : 1;
        i++;
    }

    // 3. Process digits
    while (i < n && Character.isDigit(s.charAt(i))) {
        int digit = s.charAt(i) - '0';
        result = result * 10 + digit;

        // 4. Handle Overflow immediately
        if (sign == 1 && result > Integer.MAX_VALUE) return Integer.MAX_VALUE;
        if (sign == -1 && result * -1 < Integer.MIN_VALUE) return Integer.MIN_VALUE;
        
        i++;
    }

    return (int) result * sign;
}
}
