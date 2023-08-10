package com.example.miniproject;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.graphics.Color;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;

import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.ValueEventListener;

import java.util.ArrayList;
import java.util.List;

public class rcs51 extends AppCompatActivity {

    ListView listview;
    DatabaseReference databaseReference;
    List<putpdfcs11> uploadedPDF;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_rcs51);

        listview=findViewById(R.id.listview);
        uploadedPDF=new ArrayList<>();

        retrivePDFfiles();

        listview.setOnItemClickListener(new AdapterView.OnItemClickListener(){
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                putpdfcs11 putpdfcs11=uploadedPDF.get(i);
                Intent intent=new Intent(Intent.ACTION_VIEW);
                intent.setType("application/pdf");
                intent.setData(Uri.parse(putpdfcs11.getUrl()));
                startActivity(intent);
            }
        });
    }

    private void retrivePDFfiles() {
        databaseReference= FirebaseDatabase.getInstance().getReference().child("cs51");
        databaseReference.addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(@NonNull DataSnapshot snapshot) {

                for(DataSnapshot ds:snapshot.getChildren()){
                    putpdfcs11 putpdfcs11=ds.getValue(com.example.miniproject.putpdfcs11.class);
                    uploadedPDF.add(putpdfcs11);
                }

                String[] uploadsname=new String[uploadedPDF.size()];

                for(int i=0;i<uploadsname.length;i++){
                    uploadsname[i]=uploadedPDF.get(i).getName();
                }

                ArrayAdapter<String> arrayAdapter=new ArrayAdapter<String>(getApplicationContext(), android.R.layout.simple_list_item_1,uploadsname){

                    @NonNull
                    @Override
                    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {

                        View view= super.getView(position, convertView, parent);
                        TextView textView=(TextView)view.findViewById(android.R.id.text1);

                        textView.setTextColor(Color.BLACK);
                        textView.setTextSize(20);

                        return view;
                    }
                };

                listview.setAdapter(arrayAdapter);

            }

            @Override
            public void onCancelled(@NonNull DatabaseError error) {

            }
        });
    }
}