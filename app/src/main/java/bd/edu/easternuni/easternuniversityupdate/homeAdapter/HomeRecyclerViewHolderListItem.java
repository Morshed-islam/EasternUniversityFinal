package bd.edu.easternuni.easternuniversityupdate.homeAdapter;

import android.content.Context;
import android.content.Intent;
import android.support.v7.widget.RecyclerView.ViewHolder;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.TextView;


public class HomeRecyclerViewHolderListItem extends ViewHolder implements OnClickListener {
    private final Context context;
    private Intent i;
    public TextView name;


    public HomeRecyclerViewHolderListItem(View itemView) {
        super(itemView);
        this.context = itemView.getContext();
        itemView.setOnClickListener(this);
        //this.name = (TextView) itemView.findViewById(R.id.tv_list);
    }

    public void onClick(View v) {

    }
}
