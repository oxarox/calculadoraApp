package cl.inacap.calculadoraApp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private EditText n1Txt;
    private EditText n2Txt;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        // Desde aqui puede acceder a los elementos de la interfaz
        this.n1Txt = findViewById(R.id.n1_txt);
        this.n2Txt = findViewById(R.id.n2_txt);


    }

    private double calcular(int n1, int n2, String op) throws Exception {
        double resultado = 0;
        switch (op) {
            case "suma":
                resultado = n1 + n2;
                break;
            case "resta":
                resultado = n1 - n2;
                break;
            case "multiplicacion":
                resultado = n1 * n2;
                break;
            case "division":
                resultado = n1 / n2;
                break;
            default:
                throw new Exception();
        }

        return resultado;
    }

    public void sumar(View v) {
        int n1, n2;
        n1 = Integer.parseInt(this.n1Txt.getText().toString());
        n2 = Integer.parseInt(this.n2Txt.getText().toString());
        try {
            double suma = calcular(n1, n2, "suma");
            Toast.makeText(this, "La suma es" + suma, Toast.LENGTH_SHORT).show();
        } catch (Exception ex) {
            Toast.makeText(this, "Error de calculo", Toast.LENGTH_SHORT).show();
        }

    }

    public void restar(View v) {
        int n1, n2;
        n1 = Integer.parseInt(this.n1Txt.getText().toString());
        n2 = Integer.parseInt(this.n2Txt.getText().toString());
        try {
            double restar = calcular(n1, n2, "resta");
            Toast.makeText(this, "La restar es" + restar, Toast.LENGTH_SHORT).show();
        } catch (Exception ex) {
            Toast.makeText(this, "Error de calculo", Toast.LENGTH_SHORT).show();
        }
    }

    public void multiplicar(View v) {
        int n1, n2;
        n1 = Integer.parseInt(this.n1Txt.getText().toString());
        n2 = Integer.parseInt(this.n2Txt.getText().toString());
        try {
            double multiplicacion = calcular(n1, n2, "multiplicacion");
            Toast.makeText(this, "La multiplicacion es" + multiplicacion, Toast.LENGTH_SHORT).show();
        } catch (Exception ex) {
            Toast.makeText(this, "Error de calculo", Toast.LENGTH_SHORT).show();
        }
    }

    public void dividir(View v) {
        int n1, n2;
        n1 = Integer.parseInt(this.n1Txt.getText().toString());
        n2 = Integer.parseInt(this.n2Txt.getText().toString());
        try {
            double division = calcular(n1, n2, "division");
            Toast.makeText(this, "La division es" + division, Toast.LENGTH_SHORT).show();
        } catch (Exception ex) {
            Toast.makeText(this, "Error de calculo", Toast.LENGTH_SHORT).show();
        }
    }
}