package com.example.foreignkoreansproject.Controller1.Main1;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import com.example.foreignkoreansproject.Controller.Main.Main.Adapter.ContactsAdapter;
import com.example.foreignkoreansproject.Model.Contact;
import com.example.foreignkoreansproject.R;
import com.example.foreignkoreansproject.Utils.Utils;
import com.google.gson.Gson;

public class ContactsActivity extends AppCompatActivity {
    RecyclerView rvContacts;
    Contact contact;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_contacts);
        configRvContacts();
        String strContacts = Utils.loadJSONFromAsset(this);
        Gson gson = new Gson();
        contact = gson.fromJson(strContacts, Contact.class);
    }

    private void configRvContacts() {
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(this, LinearLayoutManager.VERTICAL, false);
        rvContacts.setLayoutManager(linearLayoutManager);
        ContactsAdapter contactsAdapter = new ContactsAdapter();
        contactsAdapter.setData(contact.getContactResult());
        contactsAdapter.setContext(this);
        rvContacts.setAdapter(contactsAdapter);
    }

}
