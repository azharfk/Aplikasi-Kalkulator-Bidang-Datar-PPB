package com.example.myapplication;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class Persegi extends Fragment {

    private Button btnHasilKeliling, btnHasilLuas;
    private EditText txtPanjang, txtLebar;
    private TextView hasilLuas, hasilKeliling;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View v = inflater.inflate(R.layout.persegi, container, false);
        btnHasilLuas = v.findViewById(R.id.btnHasilLuas);
        btnHasilKeliling = v.findViewById(R.id.btnHasilKeliling);
        txtPanjang = v.findViewById(R.id.txtPanjang);
        txtLebar = v.findViewById(R.id.txtLebar);
        hasilLuas = v.findViewById(R.id.hasilLuas);
        hasilKeliling = v.findViewById(R.id.hasilKeliling);


        btnHasilLuas.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String nilai1 = txtPanjang.getText().toString();
                String nilai2 = txtLebar.getText().toString();

                if (nilai1.isEmpty()) {
                    txtPanjang.setError("Tidak Boleh Kosong!");
                    txtPanjang.requestFocus();
                } else if (nilai2.isEmpty()) {
                    txtLebar.setError("Tidak Boleh Kosong!");
                    txtLebar.requestFocus();
                } else {
                    Integer panjang = Integer.parseInt(nilai1);
                    Integer lebar = Integer.parseInt(nilai2);

                    Integer luas = panjang * lebar;
                    hasilLuas.setText(String.valueOf(luas));
                }
            }
        });

        btnHasilKeliling.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String nilai1 = txtPanjang.getText().toString();
                String nilai2 = txtLebar.getText().toString();

                if (nilai1.isEmpty()) {
                    txtPanjang.setError("Tidak Boleh Kosong!");
                    txtPanjang.requestFocus();
                } else if (nilai2.isEmpty()) {
                    txtLebar.setError("Tidak Boleh Kosong!");
                    txtLebar.requestFocus();
                } else {
                    Integer panjang = Integer.parseInt(nilai1);
                    Integer lebar = Integer.parseInt(nilai2);

                    Integer keliling = 2 * (panjang + lebar);
                    hasilKeliling.setText(String.valueOf(keliling));
                }
            }
        });
        return v;
    }
}