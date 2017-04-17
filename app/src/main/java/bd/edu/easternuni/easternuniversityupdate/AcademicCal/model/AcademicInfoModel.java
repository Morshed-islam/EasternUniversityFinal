package bd.edu.easternuni.easternuniversityupdate.AcademicCal.model;

/**
 * Created by ThirdEye-lll on 3/15/2017.
 */

public class AcademicInfoModel {
    private String title;
    private String date;

    public AcademicInfoModel(String title, String date) {
        this.title = title;
        this.date = date;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }
}
