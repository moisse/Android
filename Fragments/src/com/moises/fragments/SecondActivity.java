package com.moises.fragments;

import android.app.Activity;
import android.os.Bundle;
import android.widget.TextView;

public class SecondActivity extends Activity{

	private TextView tvDNI;
	private TextView tvNombre;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		//getActionBar().setTitle("Datos de la persona");
		setContentView(R.layout.second_activity);
		iniciarComponentes();
	}
	
	

	private void iniciarComponentes() {
		tvDNI = (TextView)findViewById(R.id.tvDNIDetallePersona);
		tvNombre = (TextView)findViewById(R.id.tvNombreDetallePersona);
		Bundle bundle = getIntent().getExtras();
		Persona persona = (Persona)bundle.getSerializable("per");
		tvDNI.setText("DNI: "+persona.getDni());
		tvNombre.setText("Nombre: "+persona.getNombre());
	}



	@Override
	public void onBackPressed() {
		// TODO Auto-generated method stub
		super.onBackPressed();
	}
}
