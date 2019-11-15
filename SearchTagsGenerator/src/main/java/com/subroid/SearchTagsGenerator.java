package com.subroid;

import android.util.Log;

import java.util.ArrayList;
import java.util.List;

public class SearchTagsGenerator {

    public static List<String> generateSearchTags(String string) {
        string = string.toLowerCase();
        List<String> searchTags = new ArrayList<>();
        String searchTag = "";
        for (int i = 0; i < string.length(); i++) {
            char searchTagLetter = string.charAt(i);
            searchTag = searchTag.concat(String.valueOf(searchTagLetter));
            searchTags.add(searchTag);
        }
        return searchTags;
    }
    
}
