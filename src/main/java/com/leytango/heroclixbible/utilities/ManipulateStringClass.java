package com.leytango.heroclixbible.utilities;

import java.util.Arrays;
import java.util.List;

public class ManipulateStringClass {
    private static final String URL_ICON_BASE = "https://storage.googleapis.com/heroclixbible.appspot.com/resources/images/icons/";
    private static final String OPEN_TAG = "<img href=\"";
    private static final String END_TAG = "\">";

    public static String modifyDescription(String coder) {

        /*
        String newString = null;

        if (stringSplitter.size() > 1) {
            for (String i : stringSplitter) {
                if (i.contains("$")) {
                    System.out.println(i);
                    newString += i.replace("$", )
                }
                else {
                    newString += i;
                }
            }
        } else {
            return coder;
        }

         */

        //coder = coder.replace("$", URL_ICON_BASE);
        coder = coder.replace("&", ".svg");

        return coder;
    }

    public static String putTagImgHtml(String fileName, String url) {
        List<String> stringSplitter = Arrays.asList(fileName.split("#"));
        String newString = null;

        if (stringSplitter.size() > 1) {
            for (String i : stringSplitter) {
                System.out.println(i);
                if (i.contains("$")) {
                    newString += i.replace("$", url + i);
                    newString += OPEN_TAG + i + END_TAG;
                } else {
                    newString += i;
                }
            }
        }
        return newString;
    }
}

