package cn.com.open.questiontransfer;

import junit.framework.Assert;
import org.junit.Test;

/**
 * Created by lucky on 2017/7/6.
 */
public class MediaMakerTest {
    @Test
    public void Test() {
        String orginalString = "<img class=\"addinput\" hearingcontent=\"1\" height=\"30px\" name=\"openimgaudio\" repeatcount=\"1\" repeatinterval=\"1\" src=\"/asset/images/common/music.jpg\" videocontent=\"1\" videoname=\"1\" videotype=\"\" videourl=\"1\" width=\"30px\" workvideotimes=\"61\" />这是一个测试题目";

        MediaMaker maker = new MediaMaker(orginalString);

        Assert.assertEquals(maker.getWithoutMediaString(), "<media/>这是一个测试题目");
    }
}
