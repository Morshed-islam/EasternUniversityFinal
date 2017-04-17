package bd.edu.easternuni.easternuniversityupdate.homeAdapter;

import android.content.Context;
import android.content.Intent;
import android.support.v7.widget.CardView;
import android.support.v7.widget.RecyclerView.ViewHolder;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.ImageView;
import android.widget.TextView;

import bd.edu.easternuni.easternuniversityupdate.AcademicCal.AcademicCalendar;
import bd.edu.easternuni.easternuniversityupdate.Academics.Academic;
import bd.edu.easternuni.easternuniversityupdate.CalculatorOfCgpa.CalMAin;
import bd.edu.easternuni.easternuniversityupdate.Faculties.Faculties;
import bd.edu.easternuni.easternuniversityupdate.Notice.NoticeActivity;
import bd.edu.easternuni.easternuniversity.R;
import bd.edu.easternuni.easternuniversityupdate.StudentLogin.StudentsLogin;

public class HomeRecyclerViewHolder extends ViewHolder implements OnClickListener {
    private final Context context;
    private Intent i;
    public TextView name;
    public ImageView photo;
    public CardView bgColor;

    public HomeRecyclerViewHolder(View itemView) {
        super(itemView);
        this.context = itemView.getContext();
        itemView.setOnClickListener(this);
        this.name = (TextView) itemView.findViewById(R.id.home_tv_heading);
        this.photo = (ImageView) itemView.findViewById(R.id.home_img);
        this.bgColor = (CardView) itemView.findViewById(R.id.card_view_bg_color);
    }

    public void onClick(View v) {
        switch (getPosition()) {
            case 0:
                context.startActivity(new Intent(this.context,Academic.class));
                return;
            case 1:
                context.startActivity(new Intent(this.context,Faculties.class));
                return;
            case 2:
                context.startActivity(new Intent(this.context,StudentsLogin.class));
                return;
            case 3:
                context.startActivity(new Intent(this.context,CalMAin.class));
                return;
            case 4:
                context.startActivity(new Intent(this.context,AcademicCalendar.class));
                return;
            case 5:
                context.startActivity(new Intent(this.context,NoticeActivity.class));
                return;

            default:
                return;
        }
    }
}

