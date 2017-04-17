package bd.edu.easternuni.easternuniversityupdate.homeModel;

/**
 * Created by ThirdEye-lll on 3/29/2017.
 */

public class HomeItem {
    private int headingImg;
    private int bgColor;
    private String headingText;

    public HomeItem(String headingText,int headingImg) {
        this.headingImg = headingImg;
        this.headingText = headingText;
    }

    public HomeItem( String headingText,int headingImg, int bgColor) {
        this.headingImg = headingImg;
        this.bgColor = bgColor;
        this.headingText = headingText;
    }

    public int getBgColor() {
        return bgColor;
    }

    public void setBgColor(int bgColor) {
        this.bgColor = bgColor;
    }

    public int getHeadingImg() {
        return headingImg;
    }

    public void setHeadingImg(int headingImg) {
        this.headingImg = headingImg;
    }

    public String getHeadingText() {
        return headingText;
    }

    public void setHeadingText(String headingText) {
        this.headingText = headingText;
    }
}
