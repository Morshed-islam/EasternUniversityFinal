package bd.edu.easternuni.easternuniversityupdate.course;

/**
 * Created by SWOPON on 8/1/2016.
 */

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import com.eubd.easternuniversity.R;
import com.eubd.easternuniversity.courses.SearchResults;

import java.util.ArrayList;

class MyCustomBaseAdapter extends BaseAdapter {
    private static ArrayList<SearchResults> searchArrayList;

    private LayoutInflater mInflater;

    public MyCustomBaseAdapter(Context context, ArrayList<SearchResults> results) {
        searchArrayList = results;
        mInflater = LayoutInflater.from(context);
    }

    public int getCount() {
        return searchArrayList.size();
    }

    public Object getItem(int position) {
        return searchArrayList.get(position);
    }

    public long getItemId(int position) {
        return position;
    }

    public View getView(int position, View convertView, ViewGroup parent) {
        ViewHolder holder;
        if (convertView == null) {
            convertView = mInflater.inflate(R.layout.subject_list, null);
            holder = new ViewHolder();
            holder.subCode = (TextView) convertView.findViewById(R.id.sub_code);
            holder.subName = (TextView) convertView
                    .findViewById(R.id.sub_name);


            convertView.setTag(holder);
        } else {
            holder = (ViewHolder) convertView.getTag();
        }

        holder.subCode.setText(searchArrayList.get(position).getSub_code());
        holder.subName.setText(searchArrayList.get(position)
                .getSub_name());


        return convertView;
    }

    static class ViewHolder {
        TextView subCode;
        TextView subName;


    }
}