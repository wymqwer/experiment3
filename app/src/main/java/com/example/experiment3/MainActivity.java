package com.example.experiment3;

import androidx.appcompat.app.AppCompatActivity;

import android.app.Fragment;
import android.app.FragmentManager;
import android.app.FragmentTransaction;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.LinearLayout;


public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    private Fragment weixin = new weixin();
    private Fragment friends = new friends();
    private Fragment news =new news();
    private Fragment setting = new setting();
    private  FragmentManager fragmentManager;
    private LinearLayout linearLayout_weixin,linearLayout_friends,linearLayout_setting,linearLayout_news;
    private ImageButton weixin_button,friends_button,news_button,setting_button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        linearLayout_weixin=findViewById(R.id.id_tab_weixin);
        linearLayout_friends=findViewById(R.id.id_tab_friends);
        linearLayout_setting=findViewById(R.id.id_tab_setting);
        linearLayout_news=findViewById(R.id.id_tab_news);

        weixin_button = findViewById(R.id.id_tab_weixin_img);
        friends_button = findViewById(R.id.id_tab_friends_img);
        news_button = findViewById(R.id.id_tab_news_img);
        setting_button = findViewById(R.id.id_tab_setting_img);

        linearLayout_weixin.setOnClickListener(this);
        linearLayout_friends.setOnClickListener(this);
        linearLayout_setting.setOnClickListener(this);
        linearLayout_news.setOnClickListener(this);

        init_Fragment();

    }

    private void init_Fragment(){
        fragmentManager =getFragmentManager();

        FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
        fragmentTransaction.add(R.id.Frame_container,weixin);
        fragmentTransaction.add(R.id.Frame_container,friends);
        fragmentTransaction.add(R.id.Frame_container,news);
        fragmentTransaction.add(R.id.Frame_container,setting);
        fragmentTransaction.commit();
        showFragment(0);
        news_button.setImageResource(R.drawable.img1);
    }

    private void hide_Fragment(FragmentTransaction fragmentTransaction)
    {
        fragmentTransaction.hide(weixin);
        fragmentTransaction.hide(friends);
        fragmentTransaction.hide(news);
        fragmentTransaction.hide(setting);
    }

    @Override
    public void onClick(View view) {
        resetButton();

        switch (view.getId()){
            case R.id.id_tab_weixin:
                showFragment(0);
                weixin_button.setImageResource(R.drawable.img1);
                break;
            case R.id.id_tab_friends:
                showFragment(1);
                friends_button.setImageResource(R.drawable.img2);
                break;
            case R.id.id_tab_news:
                showFragment(2);
                news_button.setImageResource(R.drawable.img3);
                break;
            case R.id.id_tab_setting:

                showFragment(3);
                setting_button.setImageResource(R.drawable.img4);
                break;
            default:
                break;

        }

    }

    private void showFragment(int i) {
        FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
        hide_Fragment(fragmentTransaction);
        switch (i){
            case 0:
                fragmentTransaction.show(weixin);
                break;
            case 1:
                fragmentTransaction.show(friends);
                break;
            case 2:
                fragmentTransaction.show(news);
                break;
            case 3 :
                fragmentTransaction.show(setting);
                break;
            default:
                break;
        }
        fragmentTransaction.commit();
    }
    private void resetButton(){
        weixin_button.setImageResource(R.drawable.img1);
        friends_button.setImageResource(R.drawable.img2);
        news_button.setImageResource(R.drawable.img3);
        setting_button.setImageResource(R.drawable.img4);
    }


}