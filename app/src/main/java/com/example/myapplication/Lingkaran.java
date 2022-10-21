package com.example.myapplication;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class Lingkaran extends Fragment {
    private EditText txtDiameter;
    private Button btnHasilLuas, btnHasilKeliling;
    private TextView hasilLuas, hasilKeliling;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View v = inflater.inflate(R.layout.lingkaran, container, false);

        btnHasilLuas = v.findViewById(R.id.btnHasilLuas);
        btnHasilKeliling = v.findViewById(R.id.btnHasilKeliling);
        txtDiameter = v.findViewById(R.id.txtDiameter);
        hasilLuas = v.findViewById(R.id.hasilLuas);
        hasilKeliling = v.findViewById(R.id.hasilKeliling);

        btnHasilLuas.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String nilai = txtDiameter.getText().toString();
                if (nilai.isEmpty()) {
                    txtDiameter.setError("Tidak Boleh Kosong");
                    txtDiameter.requestFocus();
                } else {
                    Double diameter = Double.parseDouble(nilai);
                    Double luas = 0.25 * Math.PI * Math.pow(diameter, 2);
                    hasilLuas.setText(String.format("%.2f", luas));
                }
            }
        });
        btnHasilKeliling.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String nilai = txtDiameter.getText().toString();
                if (nilai.isEmpty()) {
                    txtDiameter.setError("Tidak Boleh Kosong");
                    txtDiameter.requestFocus();
                } else {
                    Double diameter = Double.parseDouble(nilai);
                    Double keliling = Math.PI * diameter;
                    hasilKeliling.setText(String.format("%.2f", keliling));
                }
            }
        });

        return v;
    }
}