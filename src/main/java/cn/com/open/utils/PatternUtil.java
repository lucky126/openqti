package cn.com.open.utils;

import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Created by lucky on 2017/6/23.
 */
public class PatternUtil {

    /**
     * Gets pattern split.
     *
     * @param orginString   原始字符串
     * @param patternString 匹配用字符串
     * @return the pattern split split
     */
    public static List<String> getPatternSplit(String orginString, String patternString) {
        //make pattern
        Pattern p = Pattern.compile(patternString, Pattern.CASE_INSENSITIVE | Pattern.MULTILINE);
        String[] splitString = p.split(orginString);
        Matcher matcher = p.matcher(orginString);
        List<String> returnList = new ArrayList<String>();
        //edit info from split string
        for (int i = 0; i < splitString.length; i++) {
            returnList.add(splitString[i]);
        }

        return returnList;
    }

    /**
     * 根据正则表达式分隔字符串，获取含有正则匹配字符串的分隔后的字符串列表
     *
     * @param orginString   原始字符串
     * @param patternString 匹配用字符串
     * @return 返回字符串列表 pattern split list
     */
    public static List<String> getPatternSplitList(String orginString, String patternString) {
        //make pattern
        Pattern p = Pattern.compile(patternString, Pattern.CASE_INSENSITIVE | Pattern.MULTILINE);
        String[] splitString = p.split(orginString);
        Matcher matcher = p.matcher(orginString);

        //make a return list
        List<String> returnList = new ArrayList<String>();
        int size = splitString.length * 2 - 1;
        //init list size
        for (int i = 0; i < size; i++) {
            returnList.add("");
        }
        //edit info from split string
        for (int i = 0; i < splitString.length; i++) {
            returnList.set(i * 2, splitString[i]);
        }
        //edit info from match string
        int matchIndex = 1;
        while (matcher.find()) {
            if (returnList.size() <= matchIndex * 2 - 1) {
                returnList.add("");
            }
            returnList.set(matchIndex * 2 - 1, matcher.group(0));
            matchIndex++;
        }
        if (returnList.size() != (matchIndex-1) * 2 + 1) {
            returnList.add("");
        }

        return returnList;
    }
}
