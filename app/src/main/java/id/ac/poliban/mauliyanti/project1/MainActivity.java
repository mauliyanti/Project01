package id.ac.poliban.mauliyanti.project1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    //Deklarasi Variable
    EditText TextNama;
    TextView Hasil;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //Panggil variabel berdasarkan id
        TextNama = (EditText) findViewById(R.id.etNama);
        Hasil = (TextView) findViewById(R.id.tvNama);
    }

    //Buat method tampil nama sesuai property onclick pada button
    public void TampilNama(View v) {
        Hasil.setText("Nama Anda: " + TextNama.getText());
    }

}

