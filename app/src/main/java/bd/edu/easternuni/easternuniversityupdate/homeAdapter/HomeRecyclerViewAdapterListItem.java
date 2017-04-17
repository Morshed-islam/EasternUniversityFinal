package bd.edu.easternuni.easternuniversityupdate.homeAdapter;

import android.content.Context;
import android.support.v7.widget.RecyclerView.Adapter;
import android.view.LayoutInflater;
import android.view.ViewGroup;

import java.util.List;

import bd.edu.easternuni.easternuniversity.R;
import bd.edu.easternuni.easternuniversityupdate.homeModel.HomeItem;

public class HomeRecyclerViewAdapterListItem extends Adapter<HomeRecyclerViewHolderListItem> {
    private Context context;
    private List<HomeItem> itemList;

    public HomeRecyclerViewAdapterListItem(Context context, List<HomeItem> itemList) {
        this.itemList = itemList;
        this.context = context;
    }

    public HomeRecyclerViewHolderListItem onCreateViewHolder(ViewGroup parent, int viewType) {
        return new HomeRecyclerViewHolderListItem(LayoutInflater.from(parent.getContext()).inflate(R.layout.home_custom_design_recyclerview, null));
    }

    public void onBindViewHolder(HomeRecyclerViewHolderListItem holder, int position) {
        holder.name.setText(((HomeItem) this.itemList.get(position)).getHeadingText());
        //holder.photo.setText(((HomeItem) this.itemList.get(position)).getHeadingImg());

    }

    public int getItemCount() {
        return this.itemList.size();
    }
}
