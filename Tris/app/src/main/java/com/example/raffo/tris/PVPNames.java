package com.example.raffo.tris;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class PVPNames extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pvpnames);

        EditText player1 = (EditText) findViewById(R.id.player1Field);
        EditText player2 = (EditText) findViewById(R.id.player2Field);
        Button startGame = (Button) findViewById(R.id.startGameButton);

        player1.addTextChangedListener(new TextWatcher() {
            EditText player1 = (EditText) findViewById(R.id.player1Field);
            EditText player2 = (EditText) findViewById(R.id.player2Field);
            Button startGame = (Button) findViewById(R.id.startGameButton);
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {

            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {
                if(player1.getText().toString().isEmpty() || player2.getText().toString().isEmpty())
                    startGame.setEnabled(false);
                else
                    startGame.setEnabled(true);
            }

            @Override
            public void afterTextChanged(Editable s) {

            }
        });

        player2.addTextChangedListener(new TextWatcher() {
            EditText player1 = (EditText) findViewById(R.id.player1Field);
            EditText player2 = (EditText) findViewById(R.id.player2Field);
            Button startGame = (Button) findViewById(R.id.startGameButton);
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {

            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {
                if(player1.getText().toString().isEmpty() || player2.getText().toString().isEmpty())
                    startGame.setEnabled(false);
                else
                    startGame.setEnabled(true);
            }

            @Override
            public void afterTextChanged(Editable s) {

            }
        });
    }

    public void startGame(View v){
        EditText player1 = (EditText) findViewById(R.id.player1Field);
        EditText player2 = (EditText) findViewById(R.id.player2Field);
        Button startGame = (Button) findViewById(R.id.startGameButton);

        String p1 = player1.getText().toString();
        String p2 = player2.getText().toString();

//        CONTROLS ON TEXT FIELDS
//        Boolean goo = true;



        Intent i = new Intent(this, PVPGame.class);
        i.putExtra("player1", p1);
        i.putExtra("player2", p2);
        startActivity(i);
    }
}
