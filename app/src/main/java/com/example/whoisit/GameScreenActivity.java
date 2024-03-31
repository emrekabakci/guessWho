package com.example.whoisit;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class GameScreenActivity extends AppCompatActivity {
    private TextView textView;
    private ImageView imageView;
    private Button button;
    private Button button2;
    private Button button3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_game_screen);
        List<Character> characterList = new ArrayList<>();
        characterList.add(new Character("Andres", false, true, false));
        characterList.add(new Character("Berenice", false, false, true));
        characterList.add(new Character("Eduardo", true, false, false));
        characterList.add(new Character("Enrique", true, false, false));
        characterList.add(new Character("Ismael", false, false, true));
        characterList.add(new Character("Juan Pablo", false, false, true));
        characterList.add(new Character("Lorena", false, true, false));
        characterList.add(new Character("Sebastian", true, false, false));

        Character randomChar = getRandomChar(characterList);
        textView = findViewById(R.id.textView2);
        textView.setText(randomChar.getName());

        imageView = findViewById(R.id.imageView2);

        button = findViewById(R.id.button2);
        button2 = findViewById(R.id.button3);
        button3 = findViewById(R.id.button4);
        
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                closeAndres(imageView);
            }
        });
        


    }

    public static Character getRandomChar(List<Character> characterList) {
        Random random = new Random();
        int randomIndex = random.nextInt(characterList.size());
        return characterList.get(randomIndex);
    }

    public void closeAndres(View view){
        ImageView imageView = (ImageView) view;
        imageView.setImageResource(R.drawable.closed);
    }
}

