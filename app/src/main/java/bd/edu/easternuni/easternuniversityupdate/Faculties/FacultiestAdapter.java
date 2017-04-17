package bd.edu.easternuni.easternuniversityupdate.Faculties;

/**
 * Created by Android Kothon on 8/4/2016.
 */
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import bd.edu.easternuni.easternuniversity.R;

public class FacultiestAdapter extends BaseAdapter{

    private Context c;

    String[] name ={"Prof. Dr. Mortuza Ali","Name : Prof. Dr. Aynal Haque ",
            "Prof. Dr. Mirza Golam Rabbani ","Dr. Zakia Begum ",
            "Prof. Dr. Md. Mahfuzur Rahman ", "Dr. Amena Ferdousi",
            "Dr. A. K. M. Alamgir ","Muhammad Mahfuz Hasan",
            "Mr. Mohammad Abdur Rob ","Gulshan Khatun ","Dr. Iqbal Mahmud ",
            "Md. Shariful Islam "," Md. Rashedul Amin Tuhin","Rakibul Islam Rony",
            "Kazi Rizwanul Huq ","S.M. Shakil Hassan ","Md. Maidul Islam ",
            "Md. Mehedy Hasan Sumon ","Mr. Md. Imran Bin Azad ","Ms. Mashrura Tasnim",
            "Md. Nazmus Shakib Khan ","Md. Ehsanul Haque Nirjhar ","Ishtiaque Ahmed Navid ",
            "Mr. Md. Naimul Hoque","Ms. Jannatul Ferdous ","Ms. Jenia Afrin Jeba ",
            "Ashfaqul Islam Tonmoy ","Ekram Hossain "

    };

    String[] designation ={"Designation : Dean and Professor ","Designation : Advisor and Professor ",
            "Designation : Chairperson and Professor", "Designation : Professor ",
            "Designation : Chairperson and Professor ",
            "Designation : Associate Professor " ,
            "Designation : Associate Professor ","Designation : Coordinator Evening Program and Assistant Professor ",
            "Designation : Assistant Proctor and Assistant Professor ", "Designation : Assistant Professor ",
            "Designation : Assistant Professor","Designation : Assistant Professor",
            "Designation : Assistant Professor ","Designation : Assistant Professor ",
            "Designation : Coordinator of EEE (Day) and Senior Lecturer ",
            "Designation : Senior Lecturer","Designation : Senior Lecturer ","Designation : Lecturer",
            "Designation : Lecturer","Designation : Lecturer","Designation : Lecturer",
            "Designation : Lecturer ","Designation : Lecturer","Designation : Lecturer ",
            "Designation : Lecturer","Designation : Lecturer","Designation : Lecturer ",
            "Designation : Lecturer "

    };

    String[] qualification ={"Qualification : Ph.D. 1992 Niigata University, Japan ","Qualification : PhD in EEE; 1997; Muroran Institute of Technology, Japan "

            , "Qualification : Ph.D., National University of Singapore","Ph. D on Health,Medical and Radiation Physics,DU",
            "Qualification : Ph.D. Hiroshima University, Japan ",
            "Qualification : Ph.D in Civil & Environmental Eng; MPhil in Mathematics (BUET);",
            "Qualification : Ph.D. (Material Science & Engineering, Dept. of EEE, Yamaguchi University, Japan) ",
            "M.Sc. in Applied IT, Royal Institute of Tech., Sweden 2005", "Qualification : M.Phil (Continue), BUET ,M.Sc. and B.Sc. (Hons) in Math, CU ",
            "M.phil (Mathematics), 2013 in BUET","Qualification : PhD in Materials Science and Engineering, 2015,South Korea",
            "Qualification : Continuing MSc. in EEE (BUET) B.Sc. Engineering EEE, RUET ",
            "Qualification : M.Sc. in Network Services and Systems, 2016",
            "Unknown", "Qualification : B.Sc in EEE , CUET ","Qualification : B Sc. in EEE (Eastern University)",
            "Unknown", "Unknown","Qualification : B.Sc. in Computer Science & Engineering, 2013,DU",
            "B.Sc in CSE, 2014,(BUET)", "Unknown","Unknown","Unknown", "Unknown",
            "Unknown","Unknown", "Unknown","Unknown"
    };

    String[] phone ={"Phone :8621419, 9677523, 9673657 Ex-301 ","Phone :8622563 Ext-320 ",
            "Phone :8621419, 9677523, 9673657 Ex-312 ", "Phone :09602666653 Ext:321 ",
            "Phone :8621419, 9677523, 9673657 Ex-403","Phone :8621419, 9677523, 9673657 Ex-307 ",
            "Phone :8621419, 9677523, 9673657 Ex-311","Phone :8621419, 9677523, 9673657 Ex-311",
            "Phone :8621419, 9677523 Ext-302 ", "Phone :8621419, 9677523, 9673657 Ex-307 ",
            "Phone :09602666653 Ext:314","Phone :8621419, 9677523, 9673657 Ex-318 ",
            "Phone :09602666653 Ext:317 ","Phone :9677523 Ext: 318 ", "Phone :8621419, 9677523, 9673657 Ex-318 ",
            "Phone :8621419, 9677523, 9673657 Ex-318 ","Phone :09602666653 Ext:314 ",
            "Phone :09602666653 Ext:314 ","Phone :9677523 Ext: 315","Phone :8621419, 9677523, 9673657 Ex-307",
            "Phone :9602666653 Ext: 310","Unknown","Unknown", "Unknown","Unknown",
            "Unknown", "Unknown","Unknown"

    };

    String[] email ={"Email : mmali@easternuni.edu.bd ","Email : aynal@easternuni.edu.bd ",
            "Email : mgrabbani@easternuni.edu.bd ","Email : zakia.et@easternuni.edu.bd ",
            "Email : chairperson_cse@easternuni.edu.bd "
            , "Email : a_ferdousi@easternuni.edu.bd","Email : akmalamgir@easternuni.edu.bd ",
            "Email : mhasan@easternuni.edu.bd ", "Email : abdurrob@easternuni.edu.bd",
            "Email : gulshan@easternuni.edu.bd ","Email : iqbal.et@easternuni.edu.bd ",
            "Email : shariful.islam@easternuni.edu.bd","Email : mcctuhin@easternuni.edu.bd ",
            "Email : rirony.et@easternuni.edu.bd ", "Email : krhoq@easternuni.edu.bd ",
            "Email : shakil@easternuni.edu.bd ","Email : maidul.et@easternuni.edu.bd " ,
            "Email : mehedy.et@easternuni.edu.bd ","Email : imranazad@easternuni.edu.bd ","Email : mashrura.cse@easternuni.edu.bd ",
            "Email : nskhan.et@easternuni.edu.bd ","Email : nirjhar.et@easternuni.edu.bd ",
            "Email : navid.et@easternuni.edu.bd ", "Email : naimul.et@easternuni.edu.bd ",
            "Email : jannatul.et@easternuni.edu.bd","Email : jenia.et@easternuni.edu.bd ", "Email : aitonmoy@easternuni.edu.bd ",
            "Email : ekramhossain.et@easternuni.edu.bd "

    };

    int[] images ={ R.drawable.dean, R.drawable.aynal,R.drawable.rabbany,R.drawable.zaki,R.drawable.chaiman,R.drawable.maam
            ,R.drawable.akhomo,R.drawable.milonsir,R.drawable.robsir,R.drawable.gulshan,R.drawable.iqbal,R.drawable.janinah
            ,R.drawable.mahfuz,R.drawable.rony,R.drawable.circle,R.drawable.shakil,R.drawable.maidul,R.drawable.sumon
            ,R.drawable.imran,R.drawable.mashura,R.drawable.sakib,R.drawable.nirjhar,R.drawable.navid,R.drawable.naimul
            ,R.drawable.jannatul,R.drawable.jeba,R.drawable.tonmoy,R.drawable.ikram
    };

    public FacultiestAdapter(Context ctx) {

        this.c = ctx;
    }

    @Override
    public int getCount() {
        // TODO Auto-generated method stub
        return name.length;

    }

    @Override
    public Object getItem(int pos) {
        // TODO Auto-generated method stub
        return name[pos];
    }

    @Override
    public long getItemId(int pos) {
        // TODO Auto-generated method stub
        return pos;
    }

    @Override
    public View getView(int pos, View convertView, ViewGroup parent) {
        // TODO Auto-generated method stub

        if (convertView==null) {

            LayoutInflater inflater = (LayoutInflater)c.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
            convertView = inflater.inflate(R.layout.faculties_list, null);
        }

        //get view
        TextView nameTxt1 = (TextView) convertView.findViewById(R.id.name);
        TextView nameTxt2 = (TextView) convertView.findViewById(R.id.designation);
        TextView nameTxt3 = (TextView) convertView.findViewById(R.id.qualification);
        TextView nameTxt4 = (TextView) convertView.findViewById(R.id.phone);
        TextView nameTxt5 = (TextView) convertView.findViewById(R.id.email);
        ImageView img = (ImageView) convertView.findViewById(R.id.imageView1);

        //set Data
        nameTxt1.setText(name[pos]);
        nameTxt2.setText(designation[pos]);
        nameTxt3.setText(qualification[pos]);
        nameTxt4.setText(phone[pos]);
        nameTxt5.setText(email[pos]);
        img.setImageResource(images[pos]);

        return convertView;
    }

}
