package au.com.smedia.baseproject.util;

/**
 * Created by puzhao on 5/2/18.
 */

public class SmediaUtil {
    public static String thumbNailToBigImage(String thumbnailUrl){
        String bigThumbImage = thumbnailUrl;
        if (bigThumbImage != null && !bigThumbImage.isEmpty()){
            bigThumbImage = bigThumbImage.replace("thumb", "thumb_big");
        }
        return bigThumbImage;
    }
}
