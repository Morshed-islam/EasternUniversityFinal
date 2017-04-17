package bd.edu.easternuni.easternuniversityupdate.Notice.model;

/**
 * Created by Morshed on 3/13/2017.
 */

public class NoticeInfoModel {

    private String heading;
    private String date;

    public NoticeInfoModel(String heading, String date) {
        this.heading = heading;
        this.date = date;
    }

    public String getHeading() {
        return heading;
    }

    public void setHeading(String heading) {
        this.heading = heading;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }
}
