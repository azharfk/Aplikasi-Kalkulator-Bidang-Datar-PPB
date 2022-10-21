package com.example.myapplication;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class Segitiga extends Fragment {
    private EditText txtAlas, txtTinggi, txtSisi1, txtSisi2, txtSisi3;
    private Button btnHasilLuas, btnHasilKeliling;
    private TextView hasilLuas, hasilKeliling;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View v = inflater.inflate(R.layout.segitiga, container, false);

        txtAlas = v.findViewById(R.id.txtAlas);
        txtTinggi = v.findViewById(R.id.txtTinggi);
        txtSisi1 = v.findViewById(R.id.txtSisi1);
        txtSisi2 = v.findViewById(R.id.txtSisi2);
        txtSisi3 = v.findViewById(R.id.txtSisi3);
        btnHasilLuas = v.findViewById(R.id.btnHasilLuas);
        btnHasilKeliling = v.findViewById(R.id.btnHasilKeliling);
        hasilLuas = v.findViewById(R.id.hasilLuas);
        hasilKeliling = v.findViewById(R.id.hasilKeliling);

        btnHasilLuas.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                    String nilai1 = txtAlas.getText().toString();
                    String nilai2 = txtTinggi.getText().toString();

                    if (nilai1.isEmpty()) {
                        txtAlas.setError("Tidak Boleh Kosong!");
                        txtAlas.requestFocus();
                    } else if (nilai2.isEmpty()) {
                        txtTinggi.setError("Tidak Boleh Kosong!");
                        txtTinggi.requestFocus();
                    } else {
                        Double alas = Double.parseDouble(nilai1);
                        Double tinggi = Double.parseDouble(nilai2);

                        Double luas = 0.5 * alas * tinggi;
                        hasilLuas.setText(String.format("%.2f", luas));
                    }
            }
        });

        btnHasilKeliling.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String nilai1 = txtSisi1.getText().toString();
                String nilai2 = txtSisi2.getText().toString();
                String nilai3 = txtSisi3.getText().toString();

                if (nilai1.isEmpty()) {
                    txtSisi1.setError("Tidak Boleh Kosong!");
                    txtSisi1.requestFocus();
                } else if (nilai2.isEmpty()) {
                    txtSisi2.setError("Tidak Boleh Kosong!");
                    txtSisi2.requestFocus();
                } else if (nilai3.isEmpty()){
                    txtSisi3.setError("Tidak Boleh Kosong!");
                    txtSisi3.requestFocus();
                } else {
                    Double sisi1 = Double.parseDouble(nilai1);
                    Double sisi2 = Double.parseDouble(nilai2);
                    Double sisi3 = Double.parseDouble(nilai3);

                    Double keliling = sisi1 + sisi2 + sisi3;
                    hasilKeliling.setText(String.format("%.2f", keliling));
                }
            }
        });

        return v;
    }
}