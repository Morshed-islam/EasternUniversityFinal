package com.eubd.easternuniversity.Clubs.ClubAdapter;

import android.content.Intent;
import android.support.v7.widget.CardView;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.eubd.easternuniversity.Clubs.ClubModel.DataModel;
import com.eubd.easternuniversity.Clubs.EUCCClub;
import com.eubd.easternuniversity.R;

import java.util.ArrayList;

/**
 * Created by ThirdEye-lll on 1/28/2017.
 */

public class ExecutiveCustomAdapter extends RecyclerView.Adapter<PresidentCustomAdapter.MyViewHolder> {

    private ArrayList<DataModel> dataSet;


    public static class MyViewHolder extends RecyclerView.ViewHolder {
        public CardView cv;
        public TextView textViewName;
        public TextView textViewVersion;
        public ImageView imageView;

        public MyViewHolder(View itemView) {
            super(itemView);

            this.cv = (CardView) itemView.findViewById(R.id.card_view);
            this.textViewName = (TextView) itemView.findViewById(R.id.textViewName);
            this.textViewVersion = (TextView) itemView.findViewById(R.id.textViewVersion);
            this.imageView = (ImageView) itemView.findViewById(R.id.imageView);

        }

    }

    public ExecutiveCustomAdapter(ArrayList<DataModel> data) {
        this.dataSet = data;
    }

    @Override
    public PresidentCustomAdapter.MyViewHolder onCreateViewHolder(ViewGroup parent,
                                                                  int viewType) {
        View view = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.president_cards_layout, parent, false);

        view.setOnClickListener(EUCCClub.myOnClickListener);

        PresidentCustomAdapter.MyViewHolder myViewHolder = new PresidentCustomAdapter.MyViewHolder(view);
        return myViewHolder;
    }

    @Override
    public void onBindViewHolder(final PresidentCustomAdapter.MyViewHolder holder, final int listPosition) {

        TextView textViewName = holder.textViewName;
        ImageView imageView = holder.imageViewIcon;

        textViewName.setText(dataSet.get(listPosition).getName());
        imageView.setImageResource(dataSet.get(listPosition).getImage());

     /*   holder.cv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                switch (listPosition) {
                    case 0:
                        Intent intent = new Intent(v.getContext().getApplicationContext(), EUCCClubMember.class);
                        v.getContext().startActivity(intent);
                        break;
                    case 1:
                        Intent i2 = new Intent(v.getContext().getApplicationContext(), EUCCClubMember.class);
                        v.getContext().startActivity(i2);
                        break;
                    case 2:
                        Intent i3 = new Intent(v.getContext().getApplicationContext(), EUCCClubMember.class);
                        v.getContext().startActivity(i3);
                        break;
                    default:
                        break;
                }
            }
        });*/

    }

    @Override
    public int getItemCount() {
        return dataSet.size();
    }
}