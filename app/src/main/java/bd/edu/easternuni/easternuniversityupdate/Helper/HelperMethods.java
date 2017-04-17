package bd.edu.easternuni.easternuniversityupdate.Helper;

import android.app.ProgressDialog;
import android.content.Context;

/**
 * Created by ThirdEye-lll on 3/12/2017.
 */
public class HelperMethods{

    public static ProgressDialog getProgressBar(Context context){
        ProgressDialog progressBar = new ProgressDialog(context);
        progressBar.setProgressStyle(ProgressDialog.STYLE_SPINNER);
        return progressBar;
    }
    public static void startProgressBar(ProgressDialog progressBar, String message){

        progressBar.setCancelable(false);//you can cancel it by pressing back button
        progressBar.setMessage(message);
        progressBar.show();//displays the progress bar
    }

    public static void stopProgressBar(ProgressDialog progressDialog){
        progressDialog.cancel();
    }


}