package com.example.foreignkoreansproject.Controller.Main.Main.Adapter;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.example.foreignkoreansproject.Model.Contact;
import com.example.foreignkoreansproject.Model.ContactResult;
import com.example.foreignkoreansproject.R;

import java.util.List;

public class ContactsAdapter extends RecyclerView.Adapter<ContactsAdapter.ContactsViewHolder> {
    public List<ContactResult> data;
    Context context;

    public void setData(List<ContactResult> data) {
        this.data = data;
    }

    public void setContext(Context context) {
        this.context = context;
    }
    @NonNull
    @Override
    public ContactsViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        View view = LayoutInflater.from(context).inflate(R.layout.contacts_item_layout,viewGroup,false);
        return new ContactsViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ContactsViewHolder contactsViewHolder, int i) {
        ContactResult contact = data.get(i);
        contactsViewHolder.tvContactsTitle.setText(contact.getName());
        contactsViewHolder.tvContactsNumber.setText(contact.getPhone());
    }

    @Override
    public int getItemCount()
    {
        return data.size();
    }
    public class ContactsViewHolder extends RecyclerView.ViewHolder{
        TextView tvContactsTitle;
        TextView tvContactsNumber;


        public ContactsViewHolder(@NonNull View itemView){
            super(itemView);
            tvContactsTitle = itemView.findViewById(R.id.tv_contact_titles);
            tvContactsNumber = itemView.findViewById(R.id.tv_contact_titles);
        }
    }
}
