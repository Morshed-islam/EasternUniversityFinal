package com.eubd.easternuniversity.Clubs;

import android.app.AlertDialog;
import android.app.Dialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.AdapterView;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

import com.eubd.easternuniversity.Clubs.ClubAdapter.MemberAdapter;
import com.eubd.easternuniversity.MainActivity;
import com.eubd.easternuniversity.R;

public class EUCCClubMember extends AppCompatActivity {

    private LayoutInflater inflater;
    private View dialogView;
    private AlertDialog.Builder dialogBuilder;
    private AlertDialog alertDialog;
    private Button exit, btn1, btn2, btn3, btn4, btn5, btn6, btn7, btn8, btn9, btn10, btn11, btn12, btn13;
    private TextView exTitle, exEmail, exPhone;
    MemberAdapter adapter;
    private ImageView dialogImage;

    private String email[] = {
            "morshedislam21@gmail.com",
            "pkemran@roketmail.com",
            "jannatuljoyee96@gmail.com",
            "afzalhossainshishir@gmail.com",
            "mdwahid5048@gmail.com",
            "alauddintuhin1411@gmail.com",
            "shasan731@gmail.com",
            "meheraeu@gmail.com",
            "NULL"

    };
    private String phone[] = {
            "01680-124836", //morshed
            "01521-213396", //emran
            "01755-714344", //joyee
            "01792-090477", //afzal
            "01689-308776", //wahid
            "01571-711249", //tuhin
            "01986-890230", //shahriar
            "01745-911235", //mehra
            "NULL"

    };

    public EUCCClubMember() {
        alertDialog = null;
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.member_main);


        ListView lv = (ListView) findViewById(R.id.listView_member);
        adapter = new MemberAdapter(this);
        lv.setAdapter(adapter);


        lv.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int pos, long l) {

                if (pos == 0) {
                    customDialog();
                    init();
                    dialogImage.setImageResource(MemberAdapter.images[0]);
                    exTitle.setText(MemberAdapter.names[0]);
                    exEmail.setText(email[0]);
                    exPhone.setText(phone[0]);

                    dialogCreateAndShow();
                } else if (pos == 1) {
                    customDialog();
                    init();
                    dialogImage.setImageResource(MemberAdapter.images[1]);
                    exTitle.setText(MemberAdapter.names[1]);
                    exEmail.setText(email[1]);
                    exPhone.setText(phone[1]);

                    dialogCreateAndShow();
                } else if (pos == 2) {
                    customDialog();
                    init();
                    dialogImage.setImageResource(MemberAdapter.images[2]);
                    exTitle.setText(MemberAdapter.names[2]);
                    exEmail.setText(email[2]);
                    exPhone.setText(phone[2]);

                    dialogCreateAndShow();
                } else if (pos == 3) {
                    customDialog();
                    init();
                    dialogImage.setImageResource(MemberAdapter.images[3]);
                    exTitle.setText(MemberAdapter.names[3]);
                    exEmail.setText(email[3]);
                    exPhone.setText(phone[3]);

                    dialogCreateAndShow();
                } else if (pos == 4) {
                    customDialog();
                    init();
                    dialogImage.setImageResource(MemberAdapter.images[4]);
                    exTitle.setText(MemberAdapter.names[4]);
                    exEmail.setText(email[4]);
                    exPhone.setText(phone[4]);

                    dialogCreateAndShow();
                } else if (pos == 5) {
                    customDialog();
                    init();
                    dialogImage.setImageResource(MemberAdapter.images[5]);
                    exTitle.setText(MemberAdapter.names[5]);
                    exEmail.setText(email[5]);
                    exPhone.setText(phone[5]);

                    dialogCreateAndShow();
                } else if (pos == 6) {
                    customDialog();
                    init();
                    dialogImage.setImageResource(MemberAdapter.images[6]);
                    exTitle.setText(MemberAdapter.names[6]);
                    exEmail.setText(email[6]);
                    exPhone.setText(phone[6]);
                    dialogCreateAndShow();
                } else if (pos == 7) {
                    customDialog();
                    init();
                    dialogImage.setImageResource(MemberAdapter.images[7]);
                    exTitle.setText(MemberAdapter.names[7]);
                    exEmail.setText(email[7]);
                    exPhone.setText(phone[7]);
                    dialogCreateAndShow();
                } else if (pos == 8) {
                    customDialog();
                    init();
                    dialogImage.setImageResource(MemberAdapter.images[8]);
                    exTitle.setText(MemberAdapter.names[8]);
                    exEmail.setText(email[8]);
                    exPhone.setText(phone[8]);
                    dialogCreateAndShow();

                }

               /* switch (pos) {

                    case 0:

                        dialogBuilder = new AlertDialog.Builder(EUCCClubMember.this);
                        inflater = getLayoutInflater();
                        dialogView = inflater.inflate(R.layout.alert_details_member_dialog, null);
                        dialogBuilder.setView(dialogView);

                        //exTitle.setText(MemberAdapter.names[1]);

                        exTitle = (TextView) dialogView.findViewById(R.id.executive_alert_name);
                        exEmail = (TextView) dialogView.findViewById(R.id.executive_email);
                        exPhone = (TextView) dialogView.findViewById(R.id.executive_phone);
                        dialogImage = (ImageView) dialogView.findViewById(R.id.alert_img);
                        //btn0 = (Button) dialogView.findViewById(R.id.alert_btn);
                        exTitle.setText("Morshed");


                        alertDialog = dialogBuilder.create();

                        *//*btn0.setOnClickListener(new View.OnClickListener() {
                            @Override
                            public void onClick(View view) {
                                // Intent i = new Intent(getApplicationContext(),EUCCClubMember.class).setFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
                                // startActivity(i);
                                alertDialog.dismiss();
                            }
                        });*//*


                        alertDialog.show();

                    case 1:

                        dialogBuilder = new AlertDialog.Builder(EUCCClubMember.this);
                        inflater = getLayoutInflater();
                        dialogView = inflater.inflate(R.layout.alert_details_member_dialog, null);
                        dialogBuilder.setView(dialogView);

                        //exTitle.setText(MemberAdapter.names[1]);


                        //btn1 = (Button) dialogView.findViewById(R.id.alert_btn);
                        exTitle.setText("Emran");


                        alertDialog = dialogBuilder.create();

                       *//* btn1.setOnClickListener(new View.OnClickListener() {
                            @Override
                            public void onClick(View view) {
                                // Intent i = new Intent(getApplicationContext(),EUCCClubMember.class).setFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
                                // startActivity(i);
                                alertDialog.dismiss();
                            }
                        });*//*


                        alertDialog.show();
                }*/
            }
        });


    }


    private void init() {
        exTitle = (TextView) dialogView.findViewById(R.id.executive_alert_name);
        exEmail = (TextView) dialogView.findViewById(R.id.executive_email);
        exPhone = (TextView) dialogView.findViewById(R.id.executive_phone);
        dialogImage = (ImageView) dialogView.findViewById(R.id.Executive_proPic);
        exit = (Button) dialogView.findViewById(R.id.alert_btn);
    }

    private void customDialog() {

        dialogBuilder = new AlertDialog.Builder(EUCCClubMember.this);
        inflater = getLayoutInflater();
        dialogView = inflater.inflate(R.layout.alert_details_member_dialog, null);
        dialogBuilder.setView(dialogView);
    }

    private void dialogExitBtnAction() {
        exit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                alertDialog.dismiss();
            }
        });
    }

    private void dialogCreateAndShow(){
        alertDialog = dialogBuilder.create();
        dialogExitBtnAction();
        alertDialog.show();
    }


}
