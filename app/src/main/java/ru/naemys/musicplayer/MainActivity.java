package ru.naemys.musicplayer;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.ImageView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private RecyclerView playListRecyclerView;
    private TextView titleMusicTextView;

    private ImageView maskMusicImageView;
    private ImageView prevMusicImageView;
    private ImageView playMusicImageView;
    private ImageView nextMusicImageView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_play_list);

        playListRecyclerView = findViewById(R.id.playListRecyclerView);
        titleMusicTextView = findViewById(R.id.titleMusicTextView);

        maskMusicImageView = findViewById(R.id.maskMusicImageView);
        prevMusicImageView = findViewById(R.id.prevMusicImageView);
        playMusicImageView = findViewById(R.id.playMusicImageView);
        nextMusicImageView = findViewById(R.id.nextMusicImageView);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.activity_play_list, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        switch (item.getItemId()) {
            case R.id.addMusicMenuItem:

                return true;
            default:
                return super.onOptionsItemSelected(item);
        }
    }
}