package com.SrCarrillo.myapplication;

import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.net.Uri;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.ImageView;
import android.widget.PopupMenu;
import android.widget.ProgressBar;

import com.google.android.gms.tasks.OnSuccessListener;
import com.google.firebase.storage.FirebaseStorage;
import com.google.firebase.storage.ListResult;
import com.google.firebase.storage.StorageReference;

import java.util.ArrayList;

public class ImgVersiculosActivity extends AppCompatActivity {

    private RecyclerView recyclerView;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_img_versiculos);
        getSupportActionBar().setDisplayOptions(ActionBar.DISPLAY_SHOW_CUSTOM);
        getSupportActionBar().setCustomView(R.layout.abs_layout);


        ProgressBar progressBar = findViewById(R.id.imgProgress);
        ArrayList<String> imageList = new ArrayList<>();
        recyclerView = findViewById(R.id.recyclerView);
        ImageAdapter adapter = new ImageAdapter(imageList, this);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));


        StorageReference storageReference = FirebaseStorage.getInstance().getReference().child("versiculosimg");
        progressBar.setVisibility(View.VISIBLE);
        storageReference.listAll().addOnSuccessListener( new OnSuccessListener<ListResult>() {
            @Override
            public void onSuccess(ListResult listResult) {
                for (StorageReference fileRef : listResult.getItems()) {
                    fileRef.getDownloadUrl().addOnSuccessListener(new OnSuccessListener<Uri>() {
                        @Override
                        public void onSuccess(Uri uri) {
                            imageList.add(uri.toString());
                            Log.d("item", uri.toString());

                        }
                    }).addOnSuccessListener(new OnSuccessListener<Uri>() {
                        @Override
                        public void onSuccess(Uri uri) {
                            recyclerView.setAdapter(adapter);
                            progressBar.setVisibility(View.GONE);


                        }
                    });
                }
            }
        });


    }

    public void levantarMenu(View v) {
        ImageView imagen = (ImageView) findViewById(R.id.imageView);
        PopupMenu popupMenu = new PopupMenu(this, imagen);
        popupMenu.getMenuInflater().inflate(R.menu.imgmenu, popupMenu.getMenu());
        popupMenu.show();
    }
}