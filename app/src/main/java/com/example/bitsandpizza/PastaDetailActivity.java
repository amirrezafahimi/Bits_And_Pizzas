package com.example.bitsandpizza;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.core.content.ContextCompat;

import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

public class PastaDetailActivity extends AppCompatActivity {

    public static final String EXTRA_PASTA_ID = "pizzaId";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail);

        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        int pizzaId = (Integer) getIntent().getExtras().get(EXTRA_PASTA_ID);
        String pastaName = Pasta.pastas[pizzaId].getName();
        TextView textView = findViewById(R.id.view_text);
        textView.setText(pastaName);
        int pizzaImage = Pasta.pastas[pizzaId].getImageResourceId();
        ImageView imageView = findViewById(R.id.view_image);
        imageView.setImageDrawable(ContextCompat.getDrawable(this, pizzaImage));
        imageView.setContentDescription(pastaName);
    }
}
