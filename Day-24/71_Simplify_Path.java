class Solution {
    public String simplifyPath(String path) {
        String originalString = path;
        originalString = originalString + "/"; // Adding additional / to avoid a case where there is no / at the end.

        // First, replace all "/./"
        String substringToReplace = "/./";
        String newSubstring = "/";
        int pos = originalString.indexOf(substringToReplace);
        while (pos != -1) {
            originalString = originalString.substring(0, pos) + newSubstring + originalString.substring(pos + substringToReplace.length());
            pos = originalString.indexOf(substringToReplace);
        }

        // Secondly, replace all "//"
        substringToReplace = "//";
        newSubstring = "/";
        pos = originalString.indexOf(substringToReplace);
        while (pos != -1) {
            originalString = originalString.substring(0, pos) + newSubstring + originalString.substring(pos + substringToReplace.length());
            pos = originalString.indexOf(substringToReplace);
        }

        // Finally, replace "/../" and the previous path/Directory.
        substringToReplace = "/../";
        pos = originalString.indexOf(substringToReplace);
        while (pos != -1) {
            int cnt = 0;
            int newPos = 0;
            for (int i = pos - 1; i >= 0; i--) {
                if (originalString.charAt(i) != '/') {
                    cnt++;
                    newPos = i;
                } else {
                    newPos = i;
                    cnt++;
                    break;
                }
            }
            originalString = originalString.substring(0, newPos) + originalString.substring(newPos + cnt);
            pos = originalString.indexOf(substringToReplace);
            originalString = originalString.substring(0, pos) + newSubstring + originalString.substring(pos + substringToReplace.length());
            pos = originalString.indexOf(substringToReplace);
        }

        if (originalString.length() > 1 && originalString.charAt(originalString.length() - 1) == '/') {
            originalString = originalString.substring(0, originalString.length() - 1);
        }

        return originalString;
    }
}
