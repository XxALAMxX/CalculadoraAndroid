package com.example.calculadora;

import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;


public class MainActivity extends ActionBarActivity {

	  private EditText tbValor;
	  private Button bt0;
	  private Button bt1;
	  private Button bt2;
	  private Button bt3;
	  private Button bt4;
	  private Button bt5;
	  private Button bt6;
	  private Button bt7;
	  private Button bt8;
	  private Button bt9;
	  private Button btPunto;
	  private Button btIgual;
	  private Button btRetroceso;
	  private Button btLimpiar;
	  private Button btSuma;
	  private Button btResta;
	  private Button btMultiplicacion;
	  private Button btDivision;
	  
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        
      this.tbValor = (EditText) findViewById(R.id.tbValor);
      this.bt0 = (Button)findViewById(R.id.bt0);
      this.bt1 = (Button)findViewById(R.id.bt1);
      this.bt2 = (Button)findViewById(R.id.bt2);
      this.bt3 = (Button)findViewById(R.id.bt3);
      this.bt4 = (Button)findViewById(R.id.bt4);
      this.bt5 = (Button)findViewById(R.id.bt5);
      this.bt6 = (Button)findViewById(R.id.bt6);
      this.bt7 = (Button)findViewById(R.id.bt7);
      this.bt8 = (Button)findViewById(R.id.bt8);
      this.bt9 = (Button)findViewById(R.id.bt9);
      this.btPunto = (Button)findViewById(R.id.btPunto);
      this.btIgual = (Button)findViewById(R.id.btIgual);
      this.btRetroceso = (Button)findViewById(R.id.btRetroceso);
      this.btLimpiar = (Button)findViewById(R.id.btLimpiar);
      this.btSuma = (Button)findViewById(R.id.btSuma);
      this.btResta = (Button)findViewById(R.id.btResta);
      this.btMultiplicacion = (Button)findViewById(R.id.btMultiplicacion);
      this.btDivision = (Button)findViewById(R.id.btDivision);
    }
    private boolean lPunto = false;
    private int bandera = 0;
    private float tempo = 0, numero2 = 0;
    
    public void Operacion(int bandera)
    {
    	if(numero2 != 0)
    	{
    		if (bandera == 1)
    			tbValor.setText(tempo + numero2 + "");
    		else if (bandera == 2)
        			tbValor.setText(tempo - numero2 + "");
    		else if (bandera == 3)
    			tbValor.setText(tempo * numero2 + "");
    		else if (bandera == 4)
    			tbValor.setText(tempo / numero2 + "");
    	}
    		
    }
    
    public void bt1OnClick(View v)
    {
    	this.tbValor.setText(tbValor.getText() + "1");
    }
    public void bt2OnClick(View v)
    {
    	this.tbValor.setText(tbValor.getText() + "2");
    }
    public void bt3OnClick(View v)
    {
    	this.tbValor.setText(tbValor.getText() + "3");
    }
    public void bt4OnClick(View v)
    {
    	this.tbValor.setText(tbValor.getText() + "4");
    }
    public void bt5OnClick(View v)
    {
    	this.tbValor.setText(tbValor.getText() + "5");
    }
    public void bt6OnClick(View v)
    {
    	this.tbValor.setText(tbValor.getText() + "6");
    }
    public void bt7OnClick(View v)
    {
    	this.tbValor.setText(tbValor.getText() + "7");
    }
    public void bt8OnClick(View v)
    {
    	this.tbValor.setText(tbValor.getText() + "8");
    }
    public void bt9OnClick(View v)
    {
    	this.tbValor.setText(tbValor.getText() + "9");
    }
    public void bt0OnClick(View v)
    {
    	if(this.tbValor.getText().length() > 0)
    	this.tbValor.setText(tbValor.getText() + "0");
    }
    public void btSumaOnClick(View v)
    {
    	if(tempo == 0)
    	tempo = Float.parseFloat(tbValor.getText().toString());
    	else if (tempo != 0)
    		numero2 = Float.parseFloat(tbValor.getText().toString());
    	tbValor.setText("");
    	bandera = 1;
    	Operacion(bandera);
    }
    public void btRestaOnClick(View v)
    {
    	if(tempo == 0)
        	tempo = Float.parseFloat(tbValor.getText().toString());
        	else if (tempo != 0)
        		numero2 = Float.parseFloat(tbValor.getText().toString());
        	tbValor.setText("");
        	bandera = 2;
    	Operacion(bandera);
    }
    public void btMultiplicacionOnClick(View v)
    {
    	if(tempo == 0)
        	tempo = Float.parseFloat(tbValor.getText().toString());
        	else if (tempo != 0)
        		numero2 = Float.parseFloat(tbValor.getText().toString());
        	tbValor.setText("");
        	bandera = 3;
    	Operacion(bandera);
    }
    public void btDivisionOnClick(View v)
    {
    	if(tempo == 0)
        	tempo = Float.parseFloat(tbValor.getText().toString());
        	else if (tempo != 0)
        		numero2 = Float.parseFloat(tbValor.getText().toString());
        	tbValor.setText("");
        	bandera = 4;
    	Operacion(bandera);
    }
    public void btIgualOnClick(View v)
    {
    	if(tempo != 0)
    	{
    		if (bandera == 1)
    		{
    			numero2 = Float.parseFloat(tbValor.getText().toString());
    			tbValor.setText(tempo + numero2 + "");
    		}
    		else if (bandera == 2)
    		{
    			numero2 = Float.parseFloat(tbValor.getText().toString());
    			tbValor.setText(tempo - numero2 + "");
    		}
    		else if (bandera == 3)
    		{
    			numero2 = Float.parseFloat(tbValor.getText().toString());
    			tbValor.setText(tempo * numero2 + "");
    		}
    		else if (bandera == 4)
    		{
    			numero2 = Float.parseFloat(tbValor.getText().toString());
    			tbValor.setText(tempo / numero2 + "");
    		}
    		lPunto = false;
        	tempo = 0;
        	numero2 = 0;
    	}
    }
    public void btLimpiarOnClick(View v)
    {
    	this.tbValor.setText("");
    	lPunto = false;
    	tempo = 0;
    	numero2 = 0;
    }
    public void btPuntoOnClick(View v)
    {
    	if(lPunto == false)
    	{
    		if(this.tbValor.getText().length() == 0)
    	    	this.tbValor.setText(tbValor.getText() + "0.");
    		else
    	this.tbValor.setText(tbValor.getText() + ".");
    	lPunto = true;
    	}
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();
        if (id == R.id.action_settings) {
            return true;
        }
        return super.onOptionsItemSelected(item);
    }
}