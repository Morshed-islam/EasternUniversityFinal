package com.eubd.easternuniversity.Clubs.ClubAdapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.eubd.easternuniversity.R;

/**
 * Created by ThirdEye-lll on 2/13/2017.
 */

public class MemberAdapter extends BaseAdapter {

    private Context c;

    public static int [] images ={
            R.drawable.morshed,R.drawable.emran,
            R.drawable.white,R.drawable.white, //joyee, afzal
            R.drawable.wahid,R.drawable.tuhin,
            R.drawable.shahriar,R.drawable.mehera,
            R.drawable.sharmin};

    //,"Jannatul Ferdous(Joyee)"
    public static String [] names = {
            "Morshed Islam",
            "Emran Parvez",
            "Jannatul Ferdous (Joyee) ",
            "Afzal Hossain",
            "Md. Wahid",
            "Md. Tuhin",
            "Md. Shahriar",
            "Mehra ",
            "Sharmin ",
           };


    public static String [] positions = {"Executive Member","Executive Member","Executive Member","Executive Member","Executive Member","Executive Member","Executive Member","Executive Member",
            "Executive Member","Executive Member","Executive Member","Executive Member"};

    public MemberAdapter(Context c) {
        this.c = c;
    }

    @Override
    public int getCount() {
        return names.length;
    }

    @Override
    public Object getItem(int pos) {
        return names[pos];
    }

    @Override
    public long getItemId(int i) {
        return i;
    }

    @Override
    public View getView(int pos, View convertView, ViewGroup viewGroup) {

        if (convertView==null){
             LayoutInflater inflater = (LayoutInflater)c.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
            convertView = inflater.inflate(R.layout.member_custom_design,null);
        }



        TextView name = (TextView) convertView.findViewById(R.id.member_name);
        TextView position = (TextView) convertView.findViewById(R.id.member_position);

        ImageView img = (ImageView) convertView.findViewById(R.id.list_image);


        //img.setImageResource(images[pos]);
        name.setText(names[pos]);
        position.setText(positions[pos]);
        img.setImageResource(images[pos]);

        return convertView;
    }
}
