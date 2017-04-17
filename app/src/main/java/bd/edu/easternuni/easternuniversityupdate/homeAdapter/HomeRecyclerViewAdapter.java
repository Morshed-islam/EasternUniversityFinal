package bd.edu.easternuni.easternuniversityupdate.homeAdapter;

import android.content.Context;
import android.support.v4.content.ContextCompat;
import android.support.v7.widget.RecyclerView.Adapter;
import android.view.LayoutInflater;
import android.view.ViewGroup;

import java.util.List;

import bd.edu.easternuni.easternuniversity.R;
import bd.edu.easternuni.easternuniversityupdate.homeModel.HomeItem;

public class HomeRecyclerViewAdapter extends Adapter<HomeRecyclerViewHolder> {
    private Context context;
    private List<HomeItem> itemList;

    public HomeRecyclerViewAdapter(Context context, List<HomeItem> itemList) {
        this.itemList = itemList;
        this.context = context;
    }

    public HomeRecyclerViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        return new HomeRecyclerViewHolder(LayoutInflater.from(parent.getContext()).inflate(R.layout.home_custom_design_recyclerview, null));
    }

    public void onBindViewHolder(HomeRecyclerViewHolder holder, int position) {
        holder.name.setText(((HomeItem) this.itemList.get(position)).getHeadingText());
        holder.photo.setImageResource(((HomeItem) this.itemList.get(position)).getHeadingImg());
        //holder.bgColor.setCardBackgroundColor(((HomeItem) this.itemList.get(position)).getBgColor());
        if(position==0) {
            holder.bgColor.setBackgroundColor(ContextCompat.getColor(this.context, R.color.colorOne));
        }else if(position==1) {
            holder.bgColor.setBackgroundColor(ContextCompat.getColor(this.context, R.color.colorTwo));
        }else if(position==2) {
            holder.bgColor.setBackgroundColor(ContextCompat.getColor(this.context, R.color.colorThree));
        }else if(position==3) {
            holder.bgColor.setBackgroundColor(ContextCompat.getColor(this.context, R.color.colorFour));
        }else if(position==4) {
            holder.bgColor.setBackgroundColor(ContextCompat.getColor(this.context, R.color.colorFive));
        }else if(position==5) {
            holder.bgColor.setBackgroundColor(ContextCompat.getColor(this.context, R.color.colorSix));
        }
    }

    public int getItemCount() {
        return this.itemList.size();
    }
}
