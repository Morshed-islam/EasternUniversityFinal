package bd.edu.easternuni.easternuniversityupdate.course;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseExpandableListAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.eubd.easternuniversity.R;

import java.util.ArrayList;

/**
 * Created by SWOPON on 6/10/2016.
 */
public class CourseAdapter extends BaseExpandableListAdapter {

    private Context c;
    private ArrayList<Course> course;
    private LayoutInflater inflater;


    public CourseAdapter(Context c, ArrayList<Course> course){
        this.c=c;
        this.course=course;
        inflater= (LayoutInflater) c.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
    }

    //Get a single semester
    @Override
    public Object getChild(int groupPosition, int childPosition) {
        return course.get(groupPosition).semesters.get(childPosition);
    }

    //Get  id
    @Override
    public long getChildId(int groupPosition, int childPosition) {
        return 0;
    }

    //get now
    @Override
    public View getChildView(int groupPosition, int childPosition, boolean isLastChild, View convertView, ViewGroup parent) {

        //only inflacter xml row layout
        if (convertView==null){
            convertView=inflater.inflate(R.layout.single_semister,null);
        }
        //Get child name
        String child = (String) getChild(groupPosition,childPosition);

        //Set child name
        TextView nameTv = (TextView) convertView.findViewById(R.id.textView1);
        ImageView img = (ImageView) convertView.findViewById(R.id.imageView1);

        nameTv.setText(child);

        //Get semester name
        String courses_name =getGroup(groupPosition).toString();

        if (courses_name=="Semester"){
            if (child=="First Semester"){
                img.setImageResource(R.drawable.one);
            }else if (child =="Second Semester"){
                img.setImageResource(R.drawable.two);
            }else if (child =="Third Semester"){
                img.setImageResource(R.drawable.three);
            }else if (child =="Fourth Semester"){
                img.setImageResource(R.drawable.four);
            }else if (child =="Fifth Semester"){
                img.setImageResource(R.drawable.five);
            }else if (child =="Sixth Semester"){
                img.setImageResource(R.drawable.six);
            }else if (child =="Seven Semester"){
                img.setImageResource(R.drawable.seven);
            }else if (child =="Eight Semester"){
                img.setImageResource(R.drawable.eight);
            }else if (child =="Nine Semester"){
                img.setImageResource(R.drawable.nine);
            }else if (child =="Ten Semester"){
                img.setImageResource(R.drawable.ten);
            }else if (child =="Eleven Semester"){
                img.setImageResource(R.drawable.eleven);
            }else if (child =="Twelve Semester"){
                img.setImageResource(R.drawable.twelve);
            }

        }else if (courses_name=="All Courses") {
            if (child == "Click Here") {
                img.setImageResource(R.drawable.go_for);
            }
        }
        return convertView;
    }

    @Override
    public int getChildrenCount(int groupPosw) {
        return course.get(groupPosw).semesters.size();
    }


    @Override
    public Object getGroup(int groupPosition) {
        return course.get(groupPosition);
    }
    //

    @Override
    public int getGroupCount() {
        return course.size();
    }

    @Override
    public long getGroupId(int groupPosition) {
        return 0;
    }

    @Override
    public View getGroupView(int groupPosition, boolean isExpanded, View convertView, ViewGroup parent) {
        //Only Infalte xml  row model
        if (convertView==null){
            convertView=inflater.inflate(R.layout.courses,null);
        }


        Course t = (Course) getGroup(groupPosition);


        TextView nameTv= (TextView) convertView.findViewById(R.id.textView1);
        ImageView img = (ImageView) convertView.findViewById(R.id.imageView1);

        String name=t.Name;
        nameTv.setText(name);

        //Assigning team images acoording to team name
        if (name=="Semester"){
            img.setImageResource(R.drawable.book_1);
        }else if (name=="All Courses"){
            img.setImageResource(R.drawable.books_2);
        }
        //Row background color
        //convertView.setBackgroundColor(Color.LTGRAY);

        return convertView;
    }


    @Override
    public boolean hasStableIds() {
        return false;
    }




    @Override
    public boolean isChildSelectable(int groupPosition, int childPosition) {
        return true;
    }
}
