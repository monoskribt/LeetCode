package Medium;

import java.util.Arrays;
import java.util.List;

public class SimplifyPath {

    public static String simplifyPath(String path) {
        String[] pathArr = path.split("/");
        StringBuilder sb = new StringBuilder();

        for(String el : pathArr) {
            if(el.isEmpty() || el.equals(".")) {
                continue;
            }
            if(el.equals("..")) {
                int sbSize = sb.length();
                if(sbSize > 1) {
                    sb.delete(sb.lastIndexOf("/"), sbSize);
                }
            }
            else {
                sb.append("/").append(el);
            }
        }

        return sb.isEmpty() ? "/" : sb.toString();
    }
}
