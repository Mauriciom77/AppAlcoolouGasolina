package gasolinaoualcool.mauricio.com.gasolinaoualcool;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private EditText precoAlcool;
    private EditText precoGasolina;
    private Button botaoConfirmar;
    private TextView textoResultado;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        precoAlcool = (EditText) findViewById(R.id.precoAlcoolId);
        precoGasolina = (EditText) findViewById(R.id.precoGasolinaId);
        botaoConfirmar = (Button) findViewById(R.id.botaoConfirmarId);
        textoResultado = (TextView) findViewById(R.id.textoResultadoId);

        botaoConfirmar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                //recuperar os valores digitador

                String textoPrecoAlcool = precoAlcool.getText().toString();
                String textoPrecoGasolina = precoGasolina.getText().toString();

                // converter valores strings para numeros

                Double valorAlcool = Double.parseDouble(textoPrecoAlcool);
                Double valorGasolina = Double.parseDouble(textoPrecoGasolina);

                // alcool / gasolina

                double resultado = valorAlcool / valorGasolina;
                if (resultado >= 0.7){
                    //Gasolina

                    textoResultado.setText("É Melhor utilizar Gasolina");
                }else {
                    //Alcool
                    textoResultado.setText("É Melhor utilizar Alcool");
                }
            }
        });
    }
}
