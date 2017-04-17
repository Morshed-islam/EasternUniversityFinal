package bd.edu.easternuni.easternuniversityupdate.AcademicCal;

import android.app.ProgressDialog;
import android.content.Context;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.os.AsyncTask;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.widget.TextView;
import android.widget.Toast;


import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;

import bd.edu.easternuni.easternuniversityupdate.AcademicCal.adapter.AcademicCalRCVAdapter;
import bd.edu.easternuni.easternuniversityupdate.AcademicCal.model.AcademicInfoModel;
import bd.edu.easternuni.easternuniversityupdate.Helper.HelperMethods;
import bd.edu.easternuni.easternuniversity.R;

/**
 * Created by morshed on 14/3/2017.
 */
public class AcademicCalendar extends AppCompatActivity {

    public String TAG = "morshed";
    private TextView mHeadline;
    private String mSession_headline;
    private AcademicInfoModel academicInfoModel;
    private AcademicCalRCVAdapter adapter;
    private ArrayList<AcademicInfoModel> arrayList;
    private RecyclerView recyclerView;
    private LinearLayoutManager layoutManager;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.academic_calendar);


        final android.support.v7.app.ActionBar actionBar = getSupportActionBar();
        if (actionBar != null) {
            //actionBar.setHomeAsUpIndicator(R.drawable.ic_keyboard_backspace_white_24dp);
            actionBar.setDisplayShowTitleEnabled(true);
            actionBar.setTitle("Academic Calender");
            actionBar.setDisplayHomeAsUpEnabled(true);
        }

        initialize();
        new AcademicParsing().execute();

    }

    @Override
    protected void onResume() {
        super.onResume();

    }

    public class AcademicParsing extends AsyncTask<Void,Void,Boolean>{
        private ProgressDialog progressDialog = HelperMethods.getProgressBar(getDialogContext());

        @Override
        protected void onPreExecute() {
            super.onPreExecute();
            HelperMethods.startProgressBar(progressDialog,"Loading..");
        }

        @Override
        protected Boolean doInBackground(Void... voids) {

            Document doc;
            Elements elements;

            try {
                doc = Jsoup.connect("http://webportal.easternuni.edu.bd:8080/Calender/_AcademicCalendarSearch.aspx").get();

                elements = doc.select("td.header");

                String sTitle = "ctl00_ContentPlaceHolder_definition_GridView_ClenderList_ctl02_lblEvent";
                String addStrTitle = "_lblEvent";

                String sDate = "ctl00_ContentPlaceHolder_definition_GridView_ClenderList_ctl02_lblFdate";
                String addStrDate= "_lblFdate";



                for (Element element : elements){

                    //TODO--------------This is for Headline ----------------------
                    Elements session_headline = element.select("span#ctl00_ContentPlaceHolder_definition_lbl_message");
                    mSession_headline = session_headline.text();

                    mSetText(mHeadline,mSession_headline);
                    Log.i("morshed",mSession_headline);


                   //For  getting heading event and date from academic calender website page
                    String strTitle ="";
                    String strDate ="";
                    //ctl00_ContentPlaceHolder_definition_GridView_ClenderList_ctl02_lblFdate
                    for (int i=2; i<21; i++) {
                        if (i<=9){
                            strTitle = sTitle.substring(0, sTitle.length() - 10);
                            strDate = sDate.substring(0, sDate.length() - 10);
                        }else{
                            strTitle = sTitle.substring(0, sTitle.length() - 11);
                            strDate = sDate.substring(0, sDate.length() - 11);
                        }

                        //this is for all title of academic calender
                        String strConcatTitle = strTitle.concat(""+i+addStrTitle);
                        Elements title = element.select("span#"+strConcatTitle);
                        String mTitle = title.text();
                        Log.i(TAG, "Sting title : " +mTitle);

                        //this is for all date of academic calender
                        String strConcatDate = strDate.concat(""+i+addStrDate);
                        Elements date = element.select("span#"+strConcatDate);
                        String mDate = date.text();
                        Log.i(TAG, "Sting date : " +mDate);

                        academicInfoModel = new AcademicInfoModel(mTitle,mDate);
                        arrayList.add(academicInfoModel);


                    }

                }


            } catch (IOException e) {
                e.printStackTrace();
            }

            return null;
        }


        @Override
        protected void onPostExecute(Boolean aBoolean) {
            HelperMethods.stopProgressBar(progressDialog);
            if (isOnline() == true){
                setUpAdapter();
                Toast.makeText(AcademicCalendar.this, "Success!", Toast.LENGTH_SHORT).show();
            }else {
                Toast.makeText(AcademicCalendar.this, "Plz check your Connection!!", Toast.LENGTH_SHORT).show();
            }
        }

    }

    private void setUpAdapter() {
        adapter = new AcademicCalRCVAdapter(arrayList,getApplicationContext());
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(getApplicationContext(),LinearLayoutManager.VERTICAL, false);
        linearLayoutManager.setAutoMeasureEnabled(true);
        recyclerView.setLayoutManager(linearLayoutManager);
        recyclerView.setAdapter(adapter);

    }

    private void initialize(){
        //final ImageView back = (ImageView) findViewById(R.id.back);
        final Calendar calendar = Calendar.getInstance();

        //for get real time format
        SimpleDateFormat formatter = new SimpleDateFormat("MMMM");
        SimpleDateFormat formatter1 = new SimpleDateFormat("EEEE");
        TextView month = (TextView) findViewById(R.id.month);
        int year = calendar.get(Calendar.YEAR);
        int day = calendar.get(Calendar.DAY_OF_MONTH);
        TextView footer = (TextView) findViewById(R.id.year);
        TextView date = (TextView) findViewById(R.id.date) ;
        TextView dayName =(TextView) findViewById(R.id.day);
        footer.setText("" + year);
        date.setText("" +day);
        month.setText(formatter.format(calendar.getTime()));
        dayName.setText(formatter1.format(calendar.getTime()));

        //back button listener
       /* back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(AcademicCalendar.this, MainActivity.class).setFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);

                startActivity(intent);

            }
        });*/


        //its for only the set headline text that is get from the AcademicParsing class
        mHeadline = (TextView) findViewById(R.id.academic_cal_session_headline);

        //view initialize

        arrayList = new ArrayList<>();
        recyclerView = (RecyclerView) findViewById(R.id.academic_cal_rcv);

        layoutManager = new LinearLayoutManager(getApplicationContext());

        recyclerView.setHasFixedSize(true);
        recyclerView.setLayoutManager(layoutManager);

        adapter = new AcademicCalRCVAdapter(arrayList,getApplicationContext());
        recyclerView.setAdapter(adapter);

    }


    private void mSetText (final TextView tv, final String value){
        runOnUiThread(new Runnable() {
            @Override
            public void run() {
                tv.setText(value);
            }
        });
    }

    //this is for dialog context
    private Context getDialogContext(){
        Context context;
        if(getParent() != null)
            context = getParent();
        else
            context = this;

        return context;
    }

    //network checked status
    private boolean isOnline() {
        ConnectivityManager cm = (ConnectivityManager) getSystemService(Context.CONNECTIVITY_SERVICE);
        NetworkInfo netInfo = cm.getActiveNetworkInfo();
        return netInfo != null && netInfo.isConnectedOrConnecting();
    }


}
