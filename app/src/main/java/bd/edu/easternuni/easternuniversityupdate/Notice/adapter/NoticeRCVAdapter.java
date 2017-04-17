package bd.edu.easternuni.easternuniversityupdate.Notice.adapter;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import java.util.ArrayList;

import bd.edu.easternuni.easternuniversityupdate.Notice.model.NoticeInfoModel;
import bd.edu.easternuni.easternuniversity.R;


/**
 * Created by ThirdEye-lll on 3/13/2017.
 */

public class NoticeRCVAdapter extends RecyclerView.Adapter<NoticeRCVAdapter.NoticeViewHolder> {

    public ArrayList<NoticeInfoModel> arrayList;
    private Context context;

    public NoticeRCVAdapter(ArrayList<NoticeInfoModel> arrayList, Context context) {
        this.arrayList = arrayList;
        this.context = context;
    }

    @Override
    public NoticeViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {

        View layout = LayoutInflater.from(parent.getContext()).inflate(R.layout.notice_custom_design,parent,false);
        return new NoticeViewHolder(layout);
    }

    @Override
    public void onBindViewHolder(NoticeViewHolder holder, int position) {

        holder.heading.setText(arrayList.get(position).getHeading());
        holder.date.setText(arrayList.get(position).getDate());
    }


    public class NoticeViewHolder extends RecyclerView.ViewHolder {

        public TextView heading;
        public TextView date;

        public NoticeViewHolder(View itemView) {
            super(itemView);

            context = itemView.getContext();
            heading = (TextView) itemView.findViewById(R.id.notice_heading_tv);
            date = (TextView) itemView.findViewById(R.id.notice_date_tv);

        }
    }


    @Override
    public int getItemCount() {
        return arrayList.size();
    }
}
