package com.example.eng_hossam.databindingexample2;

import android.content.Context;
import android.databinding.DataBindingUtil;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Toast;

import com.example.eng_hossam.databindingexample2.databinding.ActivityMainBinding;


public class MainActivity extends AppCompatActivity {

    private ClickHandler clickHandler;
    Contact contact;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
//        setContentView(R.layout.activity_main);
        ActivityMainBinding activityMainBinding= DataBindingUtil.setContentView(this,R.layout.activity_main);
        contact=new Contact("Hossam","Hawash");
        activityMainBinding.setContact(contact);
        setSupportActionBar(activityMainBinding.myToolbar);
        clickHandler=new ClickHandler(this);
        activityMainBinding.content.setClickHandler(clickHandler);



    }


    public  class ClickHandler{
        private Context context;

        public ClickHandler(Context context) {
            this.context = context;
        }

        public void simpleButtonClick(View view){
            Toast.makeText(context, "Simple Click", Toast.LENGTH_SHORT).show();
            contact.setFirstname("ALi");
            contact.setLastname("Mohamed");
        }
        public boolean simpleButtonLongClick(View view){
            Toast.makeText(context, "Simple Long Click", Toast.LENGTH_SHORT).show();
            return false;
        }

        public void simpleButtonLongClickWithParam(View view,Contact contact){
            Toast.makeText(context, "First Name : "+contact.firstname+"Last Name: "+contact.lastname, Toast.LENGTH_SHORT).show();

        }

    }
}
