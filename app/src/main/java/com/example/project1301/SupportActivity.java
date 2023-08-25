package com.example.project1301;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

import com.example.project1301.databinding.ActivitySupportBinding;

public class SupportActivity extends AppCompatActivity {
    ActivitySupportBinding binding2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding2=ActivitySupportBinding.inflate(getLayoutInflater());
        setContentView(binding2.getRoot());


        binding2.vikramcontact.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent1=new Intent(Intent.ACTION_DIAL);
                intent1.setData(Uri.parse("tel:"+"+919748824829"));
                startActivity(intent1);
            }
        });
        binding2.vikrammail.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent i = new Intent(Intent.ACTION_SENDTO);
                i.setType("message/rfc822");
                i.setData(Uri.parse("mailto:"));
                i.putExtra(Intent.EXTRA_EMAIL  , new String[]{"vikrakgkp2409@gmail.com"});
                i.putExtra(Intent.EXTRA_SUBJECT, "Hey Users! What's the issue");
                i.putExtra(Intent.EXTRA_TEXT   , "We Are Sorry For Inconvenience ! Kindly provide your feedback" +
                        "");
                if (i.resolveActivity(getPackageManager()) != null) {
                    startActivity(i);
                }
                try {
                    startActivity(Intent.createChooser(i, "Send mail..."));
                } catch (android.content.ActivityNotFoundException ex) {
                    Toast.makeText(SupportActivity.this, "There are no email clients installed.", Toast.LENGTH_SHORT).show();
                }

            }
        });

        binding2.vishwascontact.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent1=new Intent(Intent.ACTION_DIAL);
                intent1.setData(Uri.parse("tel:"+"+917860745246"));
                startActivity(intent1);
            }
        });
        binding2.vishwasmail.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent i = new Intent(Intent.ACTION_SENDTO);
                i.setType("message/rfc822");
                i.setData(Uri.parse("mailto:"));
                i.putExtra(Intent.EXTRA_EMAIL  , new String[]{"vishwasgupta666@gmail.com"});
                i.putExtra(Intent.EXTRA_SUBJECT, "Hey Users! What's the issue");
                i.putExtra(Intent.EXTRA_TEXT   , "We Are Sorry For Inconvenience ! Kindly provide your feedback" +
                        "");
                if (i.resolveActivity(getPackageManager()) != null) {
                    startActivity(i);
                }
                try {
                    startActivity(Intent.createChooser(i, "Send mail..."));
                } catch (android.content.ActivityNotFoundException ex) {
                    Toast.makeText(SupportActivity.this, "There are no email clients installed.", Toast.LENGTH_SHORT).show();
                }

            }
        });

        binding2.sonucontact.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent1=new Intent(Intent.ACTION_DIAL);
                intent1.setData(Uri.parse("tel:"+"+918874062622"));
                startActivity(intent1);
            }
        });
        binding2.sonumail.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent i = new Intent(Intent.ACTION_SENDTO);
                i.setType("message/rfc822");
                i.setData(Uri.parse("mailto:"));
                i.putExtra(Intent.EXTRA_EMAIL  , new String[]{"sg86377@gmail.com"});
                i.putExtra(Intent.EXTRA_SUBJECT, "Hey Users! What's the issue");
                i.putExtra(Intent.EXTRA_TEXT   , "We Are Sorry For Inconvenience ! Kindly provide your feedback" +
                        "");
                if (i.resolveActivity(getPackageManager()) != null) {
                    startActivity(i);
                }
                try {
                    startActivity(Intent.createChooser(i, "Send mail..."));
                } catch (android.content.ActivityNotFoundException ex) {
                    Toast.makeText(SupportActivity.this, "There are no email clients installed.", Toast.LENGTH_SHORT).show();
                }

            }
        });

        binding2.pravicontact.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent1=new Intent(Intent.ACTION_DIAL);
                intent1.setData(Uri.parse("tel:"+"+9199519002524"));
                startActivity(intent1);
            }
        });
        binding2.pravimail.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent i = new Intent(Intent.ACTION_SENDTO);
                i.setType("message/rfc822");
                i.setData(Uri.parse("mailto:"));
                i.putExtra(Intent.EXTRA_EMAIL  , new String[]{"gupta.pravi@gmail.com"});
                i.putExtra(Intent.EXTRA_SUBJECT, "Hey Users! What's the issue");
                i.putExtra(Intent.EXTRA_TEXT   , "We Are Sorry For Inconvenience ! Kindly provide your feedback" +
                        "");
                if (i.resolveActivity(getPackageManager()) != null) {
                    startActivity(i);
                }
                try {
                    startActivity(Intent.createChooser(i, "Send mail..."));
                } catch (android.content.ActivityNotFoundException ex) {
                    Toast.makeText(SupportActivity.this, "There are no email clients installed.", Toast.LENGTH_SHORT).show();
                }

            }
        });

    }
}