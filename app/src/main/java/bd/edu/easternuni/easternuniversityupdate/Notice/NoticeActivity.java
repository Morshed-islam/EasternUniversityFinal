package bd.edu.easternuni.easternuniversityupdate.Notice;

import android.app.ProgressDialog;
import android.content.Context;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.os.AsyncTask;
import android.support.design.widget.FloatingActionButton;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.View;
import android.widget.Toast;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

import java.io.IOException;
import java.util.ArrayList;

import bd.edu.easternuni.easternuniversityupdate.Helper.HelperMethods;
import bd.edu.easternuni.easternuniversityupdate.Notice.adapter.NoticeRCVAdapter;
import bd.edu.easternuni.easternuniversityupdate.Notice.model.NoticeInfoModel;
import bd.edu.easternuni.easternuniversity.R;

public class NoticeActivity extends AppCompatActivity {

    private LinearLayoutManager layoutManager;
    private RecyclerView recyclerView;
    private NoticeRCVAdapter adapter;
    private NoticeInfoModel noticeInfoModel;
    private ArrayList<NoticeInfoModel> arrayList;
    private FloatingActionButton actionButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_notice);

        //final ImageView back = (ImageView) findViewById(R.id.back);

        final android.support.v7.app.ActionBar actionBar = getSupportActionBar();
        if (actionBar != null) {
            //actionBar.setHomeAsUpIndicator(R.drawable.ic_keyboard_backspace_white_24dp);
            actionBar.setDisplayShowTitleEnabled(true);
            actionBar.setTitle("Notice");
            actionBar.setDisplayHomeAsUpEnabled(true);
        }

        arrayList = new ArrayList<>();
        recyclerView = (RecyclerView) findViewById(R.id.recycler_view);
        actionButton = (FloatingActionButton) findViewById(R.id.fab);

        actionButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //Toast.makeText(NoticeActivity.this, "Reload", Toast.LENGTH_SHORT).show();
                NoticeParsing parsing = new NoticeParsing();
                parsing.onPostExecute(true);
            }
        });


        //execute notice parsing class here
        new NoticeParsing().execute();

        layoutManager = new LinearLayoutManager(getApplicationContext());

        recyclerView.setHasFixedSize(true);
        recyclerView.setLayoutManager(layoutManager);

        adapter = new NoticeRCVAdapter(arrayList,getApplicationContext());
        recyclerView.setAdapter(adapter);

    }


    public class NoticeParsing extends AsyncTask<Void,Void,Boolean>{

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

                doc = Jsoup.connect("http://www.easternuni.edu.bd/").get();

                elements = doc.select("div.Notice_box");

                for (Element element : elements){

                    String strHeading = "ContentPlaceHolder1_grdNotice_lnkDetail_0";
                    String strDate= "ContentPlaceHolder1_grdNotice_lblNoticeHeadingDate_0";

                    //Log.i("morshed",""+element);
                    for (int i=0; i<5; i++){
                        //for gettting Heading
                        strHeading = strHeading.substring(0,strHeading.length()-1);
                        strHeading = strHeading.concat(""+i);
                        Elements heading = element.select("td > a#"+strHeading);
                        String mHeading = heading.text();

                       // Log.i("morshed",mHeading);

                        // for Getting date
                        strDate = strDate.substring(0,strDate.length()-1);
                        strDate = strDate.concat(""+i);
                        Elements date = element.select("span#"+strDate);
                        String mDate = date.text();

                        noticeInfoModel = new NoticeInfoModel(mHeading,mDate);
                        arrayList.add(noticeInfoModel);

                        Log.i("morshed",mHeading+"\n"+mDate);

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
                Toast.makeText(getApplicationContext(), "Success!", Toast.LENGTH_SHORT).show();
            }else {
                Toast.makeText(getApplicationContext(), "Plz check your Connection!!", Toast.LENGTH_SHORT).show();
            }
        }
    }
    private void setUpAdapter() {
        adapter = new NoticeRCVAdapter(arrayList,getApplicationContext());
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(getApplicationContext(),LinearLayoutManager.VERTICAL, false);
        //linearLayoutManager.setAutoMeasureEnabled(true);

        recyclerView.setLayoutManager(linearLayoutManager);
        recyclerView.setAdapter(adapter);

    }
    private Context getDialogContext(){
        Context context;
        if(getParent() != null)
            context = getParent();
        else
            context = this;

        return context;
    }
    private boolean isOnline() {
        ConnectivityManager cm = (ConnectivityManager) getSystemService(Context.CONNECTIVITY_SERVICE);
        NetworkInfo netInfo = cm.getActiveNetworkInfo();
        return netInfo != null && netInfo.isConnectedOrConnecting();
    }

}
