package com.alex.gri;

import java.util.StringJoiner;

/**
* Created by alex on 01.05.16.
*
* Many people choose to obfuscate their email address when displaying it on the Web. One common way of doing this is by substituting the @ and . characters for their literal equivalents in brackets.
*
* Example 1:
* user_name@example.com
*    => user_name [at] example [dot] com
*
* Example 2:
* af5134@borchmore.edu
*    => af5134 [at] borchmore [dot] edu
*
* Example 3:
* jim.kuback@ennerman-hatano.com
*    => jim [dot] kuback [at] ennerman-hatano [dot] com
*
 */
public class EmailObfuscator {

    /**
     * Takes an email address string and returns the obfuscated version as a string that replaces the characters @ and . with [at] and [dot], respectively.
     * @param email an email address string
     * @return obfuscated version as a string
     */
    public static String obfuscate(String email) {
        return email.replace("@", " [at] ")
                .replace(".", " [dot] ")
                .trim();
    }
}
