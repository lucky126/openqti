package cn.com.open.openqti.Exception;

/**
 * Created by lucky on 2017/6/23.
 */

/**
 * 填空项分数无效异常
 */
public class OpenTextEntryInteractionScoreInvalidException extends Exception {
    /**
     * 填空项分数无效异常
     *
     * @param itemIdentifier 试题
     * @param itemTitle      试题标题
     * @param sequence       填空项序号
     */
    public OpenTextEntryInteractionScoreInvalidException(String itemIdentifier, String itemTitle, int sequence) {
        super(String.format(ExceptionMessage.openTextEntryInteractionScoreInvalidMessage, itemIdentifier, itemTitle, sequence));
    }

    /**
     * Instantiates a new Open text entry interaction score invalid exception.
     */
    public OpenTextEntryInteractionScoreInvalidException() {
        this("", "", 0);
    }

}
