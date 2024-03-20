package leetcode;

import java.util.HashSet;
import java.util.Set;

// https://leetcode.com/problems/unique-email-addresses/description/

public class Solution929 {
    public String simplifyEmail(String email) {
        StringBuilder sb = new StringBuilder();
        int i = 0;
        char ch = email.charAt(i);
        // skip dots in local name
        while (ch != '+' && ch != '@') {
            if (ch != '.') {
                sb.append(ch);
            }
            i++;
            ch = email.charAt(i);
        }
        // skip all after plus in local name
        while (ch != '@') {
            ch = email.charAt(i);
            i++;
            if (ch == '@') {
                sb.append(ch);
            }
        }
        // add domain name
        while (i < email.length()) {
            ch = email.charAt(i);
            sb.append(ch);
            i++;
        }
        //System.out.println(sb.toString());
        return sb.toString();
    }

    public int numUniqueEmails(String[] emails) {
        Set<String> set = new HashSet<>();
        for (String email : emails) {
            set.add(simplifyEmail(email));
        }
        return set.size();
    }
}
