package bd.edu.easternuni.easternuniversityupdate.AcademicCal.adapter;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import java.util.ArrayList;

import bd.edu.easternuni.easternuniversityupdate.AcademicCal.model.AcademicInfoModel;
import bd.edu.easternuni.easternuniversity.R;


/**
 * Created by ThirdEye-lll on 3/15/2017.
 */

public class AcademicCalRCVAdapter extends RecyclerView.Adapter<AcademicCalRCVAdapter.AcademicCalViewHolder> {
    private ArrayList<AcademicInfoModel> arrayList;
    private Context context;

    public AcademicCalRCVAdapter(ArrayList<AcademicInfoModel> arrayList, Context context) {
        this.arrayList = arrayList;
        this.context = context;
    }

    @Override
    public AcademicCalViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View layout = LayoutInflater.from(parent.getContext()).inflate(R.layout.custom_academic_cal_design,parent,false);
        return new AcademicCalViewHolder(layout);
    }

    @Override
    public void onBindViewHolder(AcademicCalViewHolder holder, int position) {
        holder.title.setText(arrayList.get(position).getTitle());
        holder.date.setText(arrayList.get(position).getDate());
    }

    @Override
    public int getItemCount() {
        return arrayList.size();
    }

    public class AcademicCalViewHolder extends RecyclerView.ViewHolder {
        public TextView title;
        public TextView date;

        public AcademicCalViewHolder(View itemView) {
            super(itemView);

            context = itemView.getContext();
            title = (TextView) itemView.findViewById(R.id.academic_cal_heading);
            date = (TextView) itemView.findViewById(R.id.academic_cal_date);

        }
    }
}
