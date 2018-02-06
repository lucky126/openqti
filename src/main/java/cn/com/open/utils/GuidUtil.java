package cn.com.open.utils;

/**
 * Created by lucky on 2017/7/12.
 */
public class GuidUtil {

    /**
     * Format guid string.
     *
     * @param orignalGuid the orignal guid
     * @return the string
     */
    public static String formatGuid(String orignalGuid) {
        if (orignalGuid.length() == 36) {
            return orignalGuid;
        } else {
            String noSplitGuid = orignalGuid.replaceAll("_", "").replaceAll("-", "");
            String getLast32Guid = noSplitGuid.substring(noSplitGuid.length() - 32, noSplitGuid.length() );
            if (getLast32Guid.length() != 32) {
                return "";
            }
            String formatedGuid = String.format("%s-%s-%s-%s-%s",
                    getLast32Guid.substring(0, 8),
                    getLast32Guid.substring(8, 12),
                    getLast32Guid.substring(12, 16),
                    getLast32Guid.substring(16, 20),
                    getLast32Guid.substring(20, 32));

            return formatedGuid;
        }
    }
}
