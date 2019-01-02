package com.example.abhinav.mybalajinagar;

import android.support.annotation.NonNull;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import com.google.firebase.database.ChildEventListener;
import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.ValueEventListener;

import java.util.ArrayList;
import java.util.List;

public class Messages extends AppCompatActivity {
    private FirebaseDatabase mFirebaseDatabase;
    private  DatabaseReference mMessagesDatabaseReference;
    private ChildEventListener mChildEventListener;
    private MessageAdapter mMessageAdapter;
    private ListView mMessageListView;
    List<Message> messages = new ArrayList<>();



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_messages);

        mMessageListView = findViewById(R.id.messageListView);

        mFirebaseDatabase = FirebaseDatabase.getInstance();
        mMessagesDatabaseReference = mFirebaseDatabase.getReference().child("messages");









    }

    @Override
    protected void onStart() {

        super.onStart();
        mMessagesDatabaseReference.addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(@NonNull DataSnapshot dataSnapshot) {
                messages.clear();

                mMessageAdapter = new MessageAdapter(Messages.this, R.layout.item_message, messages);
                mMessageAdapter.notifyDataSetChanged();

                for (DataSnapshot messagesSnapshot : dataSnapshot.getChildren()){
                    Message message = messagesSnapshot.getValue(Message.class);
                    messages.add(message);
                }
                mMessageAdapter.notifyDataSetChanged();
                mMessageAdapter = new MessageAdapter(Messages.this, R.layout.item_message, messages);
                mMessageListView.setAdapter(mMessageAdapter);

            }

            @Override
            public void onCancelled(@NonNull DatabaseError databaseError) {

            }
        });
    }
}
