package com.SrCarrillo.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.text.Html;
import android.text.Spanned;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ScrollView;
import android.widget.Spinner;
import android.widget.TextView;

import static android.text.Html.FROM_HTML_MODE_LEGACY;

public class BibliaActivity extends AppCompatActivity {

    private TextView TextoBiblia;
    String Biblia, bienvenido;
    ScrollView ScrollBiblia;
    Spinner spinnerlibros, spinnercapitulos;
    int capitulo;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_biblia);

        TextoBiblia = findViewById(R.id.TextoBiblia);
        ScrollBiblia = findViewById(R.id.ScrollBiblia);
        spinnerlibros = findViewById(R.id.spinnerlibros);
        spinnercapitulos = findViewById(R.id.spinnercapitulos);

        bienvenido = getResources().getString(R.string.bienvenido);
        Spanned styledText = Html.fromHtml(String.valueOf(bienvenido), FROM_HTML_MODE_LEGACY);
        TextoBiblia.setText(styledText);


        ArrayAdapter<CharSequence> adapter = ArrayAdapter.createFromResource(
                this, R.array.libros, R.layout.spinner);
        adapter.setDropDownViewResource(R.layout.spinner);
        spinnerlibros.setAdapter(adapter);
        spinnerlibros.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                String libro = parent.getSelectedItem().toString();
                int[] libros = {R.array.Selecciona, R.array.genesis, R.array.exodo, R.array.levitico, R.array.numeros, R.array.deuteronomio, R.array.josue, R.array.jueces, R.array.rut, R.array.samuel1, R.array.samuel2, R.array.reyes1, R.array.reyes2, R.array.cronicas1, R.array.cronicas2, R.array.nehemias, R.array.esdras, R.array.ester, R.array.job, R.array.salmos, R.array.proverbios, R.array.eclesiastes, R.array.cantares, R.array.isaias, R.array.jeremias, R.array.lamentaciones, R.array.ezequiel, R.array.daniel, R.array.oseas, R.array.joel, R.array.amos, R.array.abdias, R.array.jonas, R.array.miqueas, R.array.nahum, R.array.habacuc, R.array.sofonias, R.array.hageo, R.array.zacarias, R.array.malaquias, R.array.mateo, R.array.marcos, R.array.lucas, R.array.juan, R.array.hechos, R.array.romanos, R.array.corintios1, R.array.corintios2, R.array.galatas, R.array.efesios, R.array.filipenses, R.array.colosenses, R.array.tesalonicenses1, R.array.tesalonicenses2, R.array.timoteo1, R.array.timoteo2, R.array.tito, R.array.filemon, R.array.hebreos, R.array.santiago, R.array.pedro1, R.array.pedro2, R.array.juan1, R.array.juan2, R.array.juan3, R.array.judas, R.array.apocalipsis};
                ArrayAdapter<CharSequence> adapter = ArrayAdapter.createFromResource(
                        BibliaActivity.this, libros[position],
                        R.layout.spinner);
                adapter.setDropDownViewResource(R.layout.spinner);
                spinnercapitulos.setAdapter(adapter);
                spinnercapitulos.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
                    @Override
                    public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                        capitulo = position;
                        Spanned styledText;
                        switch (libro) {
                            case "Libros:":
                                Biblia = bienvenido;
                                styledText = Html.fromHtml(String.valueOf(Biblia), FROM_HTML_MODE_LEGACY);
                                TextoBiblia.setText(styledText);
                                ScrollBiblia.scrollTo(100, 0);
                                break;
                            case "Génesis":
                                switch (capitulo) {
                                    default:
                                        Biblia = bienvenido;
                                    case 1:
                                        Biblia = getString(R.string.genesis1);
                                        break;
                                    case 2:
                                        Biblia = getString(R.string.genesis2);
                                        break;
                                    case 3:
                                        Biblia = getString(R.string.genesis3);
                                        break;
                                    case 4:
                                        Biblia = getString(R.string.genesis4);
                                        break;
                                    case 5:
                                        Biblia = getString(R.string.genesis5);
                                        break;
                                    case 6:
                                        Biblia = getString(R.string.genesis6);
                                        break;
                                    case 7:
                                        Biblia = getString(R.string.genesis7);
                                        break;
                                    case 8:
                                        Biblia = getString(R.string.genesis8);
                                        break;
                                    case 9:
                                        Biblia = getString(R.string.genesis9);
                                        break;
                                    case 10:
                                        Biblia = getString(R.string.genesis10);
                                        break;
                                    case 11:
                                        Biblia = getString(R.string.genesis11);
                                        break;
                                    case 12:
                                        Biblia = getString(R.string.genesis12);
                                        break;
                                    case 13:
                                        Biblia = getString(R.string.genesis13);
                                        break;
                                    case 14:
                                        Biblia = getString(R.string.genesis14);
                                        break;
                                    case 15:
                                        Biblia = getString(R.string.genesis15);
                                        break;
                                    case 16:
                                        Biblia = getString(R.string.genesis16);
                                        break;
                                    case 17:
                                        Biblia = getString(R.string.genesis17);
                                        break;
                                    case 18:
                                        Biblia = getString(R.string.genesis18);
                                        break;
                                    case 19:
                                        Biblia = getString(R.string.genesis19);
                                        break;
                                    case 20:
                                        Biblia = getString(R.string.genesis20);
                                        break;
                                    case 21:
                                        Biblia = getString(R.string.genesis21);
                                        break;
                                    case 22:
                                        Biblia = getString(R.string.genesis22);
                                        break;
                                    case 23:
                                        Biblia = getString(R.string.genesis23);
                                        break;
                                    case 24:
                                        Biblia = getString(R.string.genesis24);
                                        break;
                                    case 25:
                                        Biblia = getString(R.string.genesis25);
                                        break;
                                    case 26:
                                        Biblia = getString(R.string.genesis26);
                                        break;
                                    case 27:
                                        Biblia = getString(R.string.genesis27);
                                        break;
                                    case 28:
                                        Biblia = getString(R.string.genesis28);
                                        break;
                                    case 29:
                                        Biblia = getString(R.string.genesis29);
                                        break;
                                    case 30:
                                        Biblia = getString(R.string.genesis30);
                                        break;
                                    case 31:
                                        Biblia = getString(R.string.genesis31);
                                        break;
                                    case 32:
                                        Biblia = getString(R.string.genesis32);
                                        break;
                                    case 33:
                                        Biblia = getString(R.string.genesis33);
                                        break;
                                    case 34:
                                        Biblia = getString(R.string.genesis34);
                                        break;
                                    case 35:
                                        Biblia = getString(R.string.genesis35);
                                        break;
                                    case 36:
                                        Biblia = getString(R.string.genesis36);
                                        break;
                                    case 37:
                                        Biblia = getString(R.string.genesis37);
                                        break;
                                    case 38:
                                        Biblia = getString(R.string.genesis38);
                                        break;
                                    case 39:
                                        Biblia = getString(R.string.genesis39);
                                        break;
                                    case 40:
                                        Biblia = getString(R.string.genesis40);
                                        break;
                                    case 41:
                                        Biblia = getString(R.string.genesis41);
                                        break;
                                    case 42:
                                        Biblia = getString(R.string.genesis42);
                                        break;
                                    case 43:
                                        Biblia = getString(R.string.genesis43);
                                        break;
                                    case 44:
                                        Biblia = getString(R.string.genesis44);
                                        break;
                                    case 45:
                                        Biblia = getString(R.string.genesis45);
                                        break;
                                    case 46:
                                        Biblia = getString(R.string.genesis46);
                                        break;
                                    case 47:
                                        Biblia = getString(R.string.genesis47);
                                        break;
                                    case 48:
                                        Biblia = getString(R.string.genesis48);
                                        break;
                                    case 49:
                                        Biblia = getString(R.string.genesis49);
                                        break;
                                    case 50:
                                        Biblia = getString(R.string.genesis50);
                                        break;

                                }
                                styledText = Html.fromHtml(String.valueOf(Biblia), FROM_HTML_MODE_LEGACY);
                                TextoBiblia.setText(styledText);
                                ScrollBiblia.scrollTo(100, 0);
                                break;
                            case "Éxodo":
                                switch (capitulo) {
                                    default:
                                        Biblia = bienvenido;
                                    case 1:
                                        Biblia = getString(R.string.exodo1);
                                        break;
                                    case 2:
                                        Biblia = getString(R.string.exodo2);
                                        break;
                                    case 3:
                                        Biblia = getString(R.string.exodo3);
                                        break;
                                    case 4:
                                        Biblia = getString(R.string.exodo4);
                                        break;
                                    case 5:
                                        Biblia = getString(R.string.exodo5);
                                        break;
                                    case 6:
                                        Biblia = getString(R.string.exodo6);
                                        break;
                                    case 7:
                                        Biblia = getString(R.string.exodo7);
                                        break;
                                    case 8:
                                        Biblia = getString(R.string.exodo8);
                                        break;
                                    case 9:
                                        Biblia = getString(R.string.exodo9);
                                        break;
                                    case 10:
                                        Biblia = getString(R.string.exodo10);
                                        break;
                                    case 11:
                                        Biblia = getString(R.string.exodo11);
                                        break;
                                    case 12:
                                        Biblia = getString(R.string.exodo12);
                                        break;
                                    case 13:
                                        Biblia = getString(R.string.exodo13);
                                        break;
                                    case 14:
                                        Biblia = getString(R.string.exodo14);
                                        break;
                                    case 15:
                                        Biblia = getString(R.string.exodo15);
                                        break;
                                    case 16:
                                        Biblia = getString(R.string.exodo16);
                                        break;
                                    case 17:
                                        Biblia = getString(R.string.exodo17);
                                        break;
                                    case 18:
                                        Biblia = getString(R.string.exodo18);
                                        break;
                                    case 19:
                                        Biblia = getString(R.string.exodo19);
                                        break;
                                    case 20:
                                        Biblia = getString(R.string.exodo20);
                                        break;
                                    case 21:
                                        Biblia = getString(R.string.exodo21);
                                        break;
                                    case 22:
                                        Biblia = getString(R.string.exodo22);
                                        break;
                                    case 23:
                                        Biblia = getString(R.string.exodo23);
                                        break;
                                    case 24:
                                        Biblia = getString(R.string.exodo24);
                                        break;
                                    case 25:
                                        Biblia = getString(R.string.exodo25);
                                        break;
                                    case 26:
                                        Biblia = getString(R.string.exodo26);
                                        break;
                                    case 27:
                                        Biblia = getString(R.string.exodo27);
                                        break;
                                    case 28:
                                        Biblia = getString(R.string.exodo8);
                                        break;
                                    case 29:
                                        Biblia = getString(R.string.exodo29);
                                        break;
                                    case 30:
                                        Biblia = getString(R.string.exodo30);
                                        break;
                                    case 31:
                                        Biblia = getString(R.string.exodo31);
                                        break;
                                    case 32:
                                        Biblia = getString(R.string.exodo2);
                                        break;
                                    case 33:
                                        Biblia = getString(R.string.exodo33);
                                        break;
                                    case 34:
                                        Biblia = getString(R.string.exodo34);
                                        break;
                                    case 35:
                                        Biblia = getString(R.string.exodo35);
                                        break;
                                    case 36:
                                        Biblia = getString(R.string.exodo36);
                                        break;
                                    case 37:
                                        Biblia = getString(R.string.exodo37);
                                        break;
                                    case 38:
                                        Biblia = getString(R.string.exodo38);
                                        break;
                                    case 39:
                                        Biblia = getString(R.string.exodo39);
                                        break;
                                    case 40:
                                        Biblia = getString(R.string.exodo40);
                                        break;
                                }
                                styledText = Html.fromHtml(String.valueOf(Biblia), FROM_HTML_MODE_LEGACY);
                                TextoBiblia.setText(styledText);
                                ScrollBiblia.scrollTo(100, 0);
                                break;
                            case "Levítico":
                                switch (capitulo) {
                                    default:
                                        Biblia = bienvenido;
                                    case 1:
                                        Biblia = getString(R.string.levitico1);
                                        break;
                                    case 2:
                                        Biblia = getString(R.string.levitico2);
                                        break;
                                    case 3:
                                        Biblia = getString(R.string.levitico3);
                                        break;
                                    case 4:
                                        Biblia = getString(R.string.levitico4);
                                        break;
                                    case 5:
                                        Biblia = getString(R.string.levitico5);
                                        break;
                                    case 6:
                                        Biblia = getString(R.string.levitico6);
                                        break;
                                    case 7:
                                        Biblia = getString(R.string.levitico7);
                                        break;
                                    case 8:
                                        Biblia = getString(R.string.levitico8);
                                        break;
                                    case 9:
                                        Biblia = getString(R.string.levitico9);
                                        break;
                                    case 10:
                                        Biblia = getString(R.string.levitico10);
                                        break;
                                    case 11:
                                        Biblia = getString(R.string.levitico11);
                                        break;
                                    case 12:
                                        Biblia = getString(R.string.levitico12);
                                        break;
                                    case 13:
                                        Biblia = getString(R.string.levitico13);
                                        break;
                                    case 14:
                                        Biblia = getString(R.string.levitico14);
                                        break;
                                    case 15:
                                        Biblia = getString(R.string.levitico15);
                                        break;
                                    case 16:
                                        Biblia = getString(R.string.levitico16);
                                        break;
                                    case 17:
                                        Biblia = getString(R.string.levitico17);
                                        break;
                                    case 18:
                                        Biblia = getString(R.string.levitico18);
                                        break;
                                    case 19:
                                        Biblia = getString(R.string.levitico19);
                                        break;
                                    case 20:
                                        Biblia = getString(R.string.levitico20);
                                        break;
                                    case 21:
                                        Biblia = getString(R.string.levitico21);
                                        break;
                                    case 22:
                                        Biblia = getString(R.string.levitico22);
                                        break;
                                    case 23:
                                        Biblia = getString(R.string.levitico23);
                                        break;
                                    case 24:
                                        Biblia = getString(R.string.levitico24);
                                        break;
                                    case 25:
                                        Biblia = getString(R.string.levitico25);
                                        break;
                                    case 26:
                                        Biblia = getString(R.string.levitico26);
                                        break;
                                    case 27:
                                        Biblia = getString(R.string.levitico27);
                                        break;
                                }
                                styledText = Html.fromHtml(String.valueOf(Biblia), FROM_HTML_MODE_LEGACY);
                                TextoBiblia.setText(styledText);
                                ScrollBiblia.scrollTo(100, 0);
                                break;
                            case "Números":
                                switch (capitulo) {
                                    default:
                                        Biblia = bienvenido;
                                    case 1:
                                        Biblia = getString(R.string.numeros1);
                                        break;
                                    case 2:
                                        Biblia = getString(R.string.numeros2);
                                        break;
                                    case 3:
                                        Biblia = getString(R.string.numeros3);
                                        break;
                                    case 4:
                                        Biblia = getString(R.string.numeros4);
                                        break;
                                    case 5:
                                        Biblia = getString(R.string.numeros5);
                                        break;
                                    case 6:
                                        Biblia = getString(R.string.numeros6);
                                        break;
                                    case 7:
                                        Biblia = getString(R.string.numeros7);
                                        break;
                                    case 8:
                                        Biblia = getString(R.string.numeros8);
                                        break;
                                    case 9:
                                        Biblia = getString(R.string.numeros9);
                                        break;
                                    case 10:
                                        Biblia = getString(R.string.numeros10);
                                        break;
                                    case 11:
                                        Biblia = getString(R.string.numeros11);
                                        break;
                                    case 12:
                                        Biblia = getString(R.string.numeros12);
                                        break;
                                    case 13:
                                        Biblia = getString(R.string.numeros13);
                                        break;
                                    case 14:
                                        Biblia = getString(R.string.numeros14);
                                        break;
                                    case 15:
                                        Biblia = getString(R.string.numeros15);
                                        break;
                                    case 16:
                                        Biblia = getString(R.string.numeros16);
                                        break;
                                    case 17:
                                        Biblia = getString(R.string.numeros17);
                                        break;
                                    case 18:
                                        Biblia = getString(R.string.numeros18);
                                        break;
                                    case 19:
                                        Biblia = getString(R.string.numeros19);
                                        break;
                                    case 20:
                                        Biblia = getString(R.string.numeros20);
                                        break;
                                    case 21:
                                        Biblia = getString(R.string.numeros21);
                                        break;
                                    case 22:
                                        Biblia = getString(R.string.numeros22);
                                        break;
                                    case 23:
                                        Biblia = getString(R.string.numeros23);
                                        break;
                                    case 24:
                                        Biblia = getString(R.string.numeros24);
                                        break;
                                    case 25:
                                        Biblia = getString(R.string.numeros25);
                                        break;
                                    case 26:
                                        Biblia = getString(R.string.numeros26);
                                        break;
                                    case 27:
                                        Biblia = getString(R.string.numeros27);
                                        break;
                                    case 28:
                                        Biblia = getString(R.string.numeros28);
                                        break;
                                    case 29:
                                        Biblia = getString(R.string.numeros29);
                                        break;
                                    case 30:
                                        Biblia = getString(R.string.numeros30);
                                        break;
                                    case 31:
                                        Biblia = getString(R.string.numeros31);
                                        break;
                                    case 32:
                                        Biblia = getString(R.string.numeros32);
                                        break;
                                    case 33:
                                        Biblia = getString(R.string.numeros33);
                                        break;
                                    case 34:
                                        Biblia = getString(R.string.numeros34);
                                        break;
                                    case 35:
                                        Biblia = getString(R.string.numeros35);
                                        break;
                                    case 36:
                                        Biblia = getString(R.string.numeros36);
                                        break;
                                }
                                styledText = Html.fromHtml(String.valueOf(Biblia), FROM_HTML_MODE_LEGACY);
                                TextoBiblia.setText(styledText);
                                ScrollBiblia.scrollTo(100, 0);
                                break;
                            case "Deuteronomio":
                                switch (capitulo) {
                                    default:
                                        Biblia = bienvenido;
                                    case 1:
                                        Biblia = getString(R.string.deuteronomio1);
                                        break;
                                    case 2:
                                        Biblia = getString(R.string.deuteronomio2);
                                        break;
                                    case 3:
                                        Biblia = getString(R.string.deuteronomio3);
                                        break;
                                    case 4:
                                        Biblia = getString(R.string.deuteronomio4);
                                        break;
                                    case 5:
                                        Biblia = getString(R.string.deuteronomio5);
                                        break;
                                    case 6:
                                        Biblia = getString(R.string.deuteronomio6);
                                        break;
                                    case 7:
                                        Biblia = getString(R.string.deuteronomio7);
                                        break;
                                    case 8:
                                        Biblia = getString(R.string.deuteronomio8);
                                        break;
                                    case 9:
                                        Biblia = getString(R.string.deuteronomio9);
                                        break;
                                    case 10:
                                        Biblia = getString(R.string.deuteronomio10);
                                        break;
                                    case 11:
                                        Biblia = getString(R.string.deuteronomio11);
                                        break;
                                    case 12:
                                        Biblia = getString(R.string.deuteronomio12);
                                        break;
                                    case 13:
                                        Biblia = getString(R.string.deuteronomio13);
                                        break;
                                    case 14:
                                        Biblia = getString(R.string.deuteronomio14);
                                        break;
                                    case 15:
                                        Biblia = getString(R.string.deuteronomio15);
                                        break;
                                    case 16:
                                        Biblia = getString(R.string.deuteronomio16);
                                        break;
                                    case 17:
                                        Biblia = getString(R.string.deuteronomio17);
                                        break;
                                    case 18:
                                        Biblia = getString(R.string.deuteronomio18);
                                        break;
                                    case 19:
                                        Biblia = getString(R.string.deuteronomio19);
                                        break;
                                    case 20:
                                        Biblia = getString(R.string.deuteronomio20);
                                        break;
                                    case 21:
                                        Biblia = getString(R.string.deuteronomio21);
                                        break;
                                    case 22:
                                        Biblia = getString(R.string.deuteronomio22);
                                        break;
                                    case 23:
                                        Biblia = getString(R.string.deuteronomio23);
                                        break;
                                    case 24:
                                        Biblia = getString(R.string.deuteronomio24);
                                        break;
                                    case 25:
                                        Biblia = getString(R.string.deuteronomio25);
                                        break;
                                    case 26:
                                        Biblia = getString(R.string.deuteronomio26);
                                        break;
                                    case 27:
                                        Biblia = getString(R.string.deuteronomio27);
                                        break;
                                    case 28:
                                        Biblia = getString(R.string.deuteronomio28);
                                        break;
                                    case 29:
                                        Biblia = getString(R.string.deuteronomio29);
                                        break;
                                    case 30:
                                        Biblia = getString(R.string.deuteronomio30);
                                        break;
                                    case 31:
                                        Biblia = getString(R.string.deuteronomio31);
                                        break;
                                    case 32:
                                        Biblia = getString(R.string.deuteronomio32);
                                        break;
                                    case 33:
                                        Biblia = getString(R.string.deuteronomio33);
                                        break;
                                    case 34:
                                        Biblia = getString(R.string.deuteronomio34);
                                        break;
                                }
                                styledText = Html.fromHtml(String.valueOf(Biblia), FROM_HTML_MODE_LEGACY);
                                TextoBiblia.setText(styledText);
                                ScrollBiblia.scrollTo(100, 0);
                                break;
                            case "Josué":
                                switch (capitulo) {
                                    default:
                                        Biblia = bienvenido;
                                    case 1:
                                        Biblia = getString(R.string.josue1);
                                        break;
                                    case 2:
                                        Biblia = getString(R.string.josue2);
                                        break;
                                    case 3:
                                        Biblia = getString(R.string.josue3);
                                        break;
                                    case 4:
                                        Biblia = getString(R.string.josue4);
                                        break;
                                    case 5:
                                        Biblia = getString(R.string.josue5);
                                        break;
                                    case 6:
                                        Biblia = getString(R.string.josue6);
                                        break;
                                    case 7:
                                        Biblia = getString(R.string.josue7);
                                        break;
                                    case 8:
                                        Biblia = getString(R.string.josue8);
                                        break;
                                    case 9:
                                        Biblia = getString(R.string.josue9);
                                        break;
                                    case 10:
                                        Biblia = getString(R.string.josue10);
                                        break;
                                    case 11:
                                        Biblia = getString(R.string.josue11);
                                        break;
                                    case 12:
                                        Biblia = getString(R.string.josue12);
                                        break;
                                    case 13:
                                        Biblia = getString(R.string.josue13);
                                        break;
                                    case 14:
                                        Biblia = getString(R.string.josue14);
                                        break;
                                    case 15:
                                        Biblia = getString(R.string.josue15);
                                        break;
                                    case 16:
                                        Biblia = getString(R.string.josue16);
                                        break;
                                    case 17:
                                        Biblia = getString(R.string.josue17);
                                        break;
                                    case 18:
                                        Biblia = getString(R.string.josue18);
                                        break;
                                    case 19:
                                        Biblia = getString(R.string.josue19);
                                        break;
                                    case 20:
                                        Biblia = getString(R.string.josue20);
                                        break;
                                    case 21:
                                        Biblia = getString(R.string.josue21);
                                        break;
                                    case 22:
                                        Biblia = getString(R.string.josue22);
                                        break;
                                    case 23:
                                        Biblia = getString(R.string.josue23);
                                        break;
                                    case 24:
                                        Biblia = getString(R.string.josue24);
                                        break;
                                }
                                styledText = Html.fromHtml(String.valueOf(Biblia), FROM_HTML_MODE_LEGACY);
                                TextoBiblia.setText(styledText);
                                ScrollBiblia.scrollTo(100, 0);
                                break;
                            case "Jueces":
                                switch (capitulo) {
                                    default:
                                        Biblia = bienvenido;
                                    case 1:
                                        Biblia = getString(R.string.jueces1);
                                        break;
                                    case 2:
                                        Biblia = getString(R.string.jueces2);
                                        break;
                                    case 3:
                                        Biblia = getString(R.string.jueces3);
                                        break;
                                    case 4:
                                        Biblia = getString(R.string.jueces4);
                                        break;
                                    case 5:
                                        Biblia = getString(R.string.jueces5);
                                        break;
                                    case 6:
                                        Biblia = getString(R.string.jueces6);
                                        break;
                                    case 7:
                                        Biblia = getString(R.string.jueces7);
                                        break;
                                    case 8:
                                        Biblia = getString(R.string.jueces8);
                                        break;
                                    case 9:
                                        Biblia = getString(R.string.jueces9);
                                        break;
                                    case 10:
                                        Biblia = getString(R.string.jueces10);
                                        break;
                                    case 11:
                                        Biblia = getString(R.string.jueces11);
                                        break;
                                    case 12:
                                        Biblia = getString(R.string.jueces12);
                                        break;
                                    case 13:
                                        Biblia = getString(R.string.jueces13);
                                        break;
                                    case 14:
                                        Biblia = getString(R.string.jueces14);
                                        break;
                                    case 15:
                                        Biblia = getString(R.string.jueces15);
                                        break;
                                    case 16:
                                        Biblia = getString(R.string.jueces16);
                                        break;
                                    case 17:
                                        Biblia = getString(R.string.jueces17);
                                        break;
                                    case 18:
                                        Biblia = getString(R.string.jueces18);
                                        break;
                                    case 19:
                                        Biblia = getString(R.string.jueces19);
                                        break;
                                    case 20:
                                        Biblia = getString(R.string.jueces20);
                                        break;
                                    case 21:
                                        Biblia = getString(R.string.jueces21);
                                        break;
                                }
                                styledText = Html.fromHtml(String.valueOf(Biblia), FROM_HTML_MODE_LEGACY);
                                TextoBiblia.setText(styledText);
                                ScrollBiblia.scrollTo(100, 0);
                                break;
                            case "Rut":
                                switch (capitulo) {
                                    default:
                                        Biblia = bienvenido;
                                    case 1:
                                        Biblia = getString(R.string.rut1);
                                        break;
                                    case 2:
                                        Biblia = getString(R.string.rut2);
                                        break;
                                    case 3:
                                        Biblia = getString(R.string.rut3);
                                        break;
                                    case 4:
                                        Biblia = getString(R.string.rut4);
                                        break;
                                }
                                styledText = Html.fromHtml(String.valueOf(Biblia), FROM_HTML_MODE_LEGACY);
                                TextoBiblia.setText(styledText);
                                ScrollBiblia.scrollTo(100, 0);
                                break;
                            case "1° de Samuel":
                                switch (capitulo) {
                                    default:
                                        Biblia = bienvenido;
                                    case 1:
                                        Biblia = getString(R.string.primeraSamuel1);
                                        break;
                                    case 2:
                                        Biblia = getString(R.string.primeraSamuel2);
                                        break;
                                    case 3:
                                        Biblia = getString(R.string.primeraSamuel3);
                                        break;
                                    case 4:
                                        Biblia = getString(R.string.primeraSamuel4);
                                        break;
                                    case 5:
                                        Biblia = getString(R.string.primeraSamuel5);
                                        break;
                                    case 6:
                                        Biblia = getString(R.string.primeraSamuel6);
                                        break;
                                    case 7:
                                        Biblia = getString(R.string.primeraSamuel7);
                                        break;
                                    case 8:
                                        Biblia = getString(R.string.primeraSamuel8);
                                        break;
                                    case 9:
                                        Biblia = getString(R.string.primeraSamuel9);
                                        break;
                                    case 10:
                                        Biblia = getString(R.string.primeraSamuel10);
                                        break;
                                    case 11:
                                        Biblia = getString(R.string.primeraSamuel11);
                                        break;
                                    case 12:
                                        Biblia = getString(R.string.primeraSamuel12);
                                        break;
                                    case 13:
                                        Biblia = getString(R.string.primeraSamuel13);
                                        break;
                                    case 14:
                                        Biblia = getString(R.string.primeraSamuel14);
                                        break;
                                    case 15:
                                        Biblia = getString(R.string.primeraSamuel15);
                                        break;
                                    case 16:
                                        Biblia = getString(R.string.primeraSamuel16);
                                        break;
                                    case 17:
                                        Biblia = getString(R.string.primeraSamuel17);
                                        break;
                                    case 18:
                                        Biblia = getString(R.string.primeraSamuel18);
                                        break;
                                    case 19:
                                        Biblia = getString(R.string.primeraSamuel19);
                                        break;
                                    case 20:
                                        Biblia = getString(R.string.primeraSamuel20);
                                        break;
                                    case 21:
                                        Biblia = getString(R.string.primeraSamuel21);
                                        break;
                                    case 22:
                                        Biblia = getString(R.string.primeraSamuel22);
                                        break;
                                    case 23:
                                        Biblia = getString(R.string.primeraSamuel23);
                                        break;
                                    case 24:
                                        Biblia = getString(R.string.primeraSamuel24);
                                        break;
                                    case 25:
                                        Biblia = getString(R.string.primeraSamuel25);
                                        break;
                                    case 26:
                                        Biblia = getString(R.string.primeraSamuel26);
                                        break;
                                    case 27:
                                        Biblia = getString(R.string.primeraSamuel27);
                                        break;
                                    case 28:
                                        Biblia = getString(R.string.primeraSamuel28);
                                        break;
                                    case 29:
                                        Biblia = getString(R.string.primeraSamuel29);
                                        break;
                                    case 30:
                                        Biblia = getString(R.string.primeraSamuel30);
                                        break;
                                    case 31:
                                        Biblia = getString(R.string.primeraSamuel31);
                                        break;
                                }
                                styledText = Html.fromHtml(String.valueOf(Biblia), FROM_HTML_MODE_LEGACY);
                                TextoBiblia.setText(styledText);
                                ScrollBiblia.scrollTo(100, 0);
                                break;
                            case "2° de Samuel":
                                switch (capitulo) {
                                    default:
                                        Biblia = bienvenido;
                                    case 1:
                                        Biblia = getString(R.string.segundaSamuel1);
                                        break;
                                    case 2:
                                        Biblia = getString(R.string.segundaSamuel2);
                                        break;
                                    case 3:
                                        Biblia = getString(R.string.segundaSamuel3);
                                        break;
                                    case 4:
                                        Biblia = getString(R.string.segundaSamuel4);
                                        break;
                                    case 5:
                                        Biblia = getString(R.string.segundaSamuel5);
                                        break;
                                    case 6:
                                        Biblia = getString(R.string.segundaSamuel6);
                                        break;
                                    case 7:
                                        Biblia = getString(R.string.segundaSamuel7);
                                        break;
                                    case 8:
                                        Biblia = getString(R.string.segundaSamuel8);
                                        break;
                                    case 9:
                                        Biblia = getString(R.string.segundaSamuel9);
                                        break;
                                    case 10:
                                        Biblia = getString(R.string.segundaSamuel10);
                                        break;
                                    case 11:
                                        Biblia = getString(R.string.segundaSamuel11);
                                        break;
                                    case 12:
                                        Biblia = getString(R.string.segundaSamuel12);
                                        break;
                                    case 13:
                                        Biblia = getString(R.string.segundaSamuel13);
                                        break;
                                    case 14:
                                        Biblia = getString(R.string.segundaSamuel14);
                                        break;
                                    case 15:
                                        Biblia = getString(R.string.segundaSamuel15);
                                        break;
                                    case 16:
                                        Biblia = getString(R.string.segundaSamuel16);
                                        break;
                                    case 17:
                                        Biblia = getString(R.string.segundaSamuel17);
                                        break;
                                    case 18:
                                        Biblia = getString(R.string.segundaSamuel18);
                                        break;
                                    case 19:
                                        Biblia = getString(R.string.segundaSamuel19);
                                        break;
                                    case 20:
                                        Biblia = getString(R.string.segundaSamuel20);
                                        break;
                                    case 21:
                                        Biblia = getString(R.string.segundaSamuel21);
                                        break;
                                    case 22:
                                        Biblia = getString(R.string.segundaSamuel22);
                                        break;
                                    case 23:
                                        Biblia = getString(R.string.segundaSamuel23);
                                        break;
                                    case 24:
                                        Biblia = getString(R.string.segundaSamuel24);
                                        break;
                                }
                                styledText = Html.fromHtml(String.valueOf(Biblia), FROM_HTML_MODE_LEGACY);
                                TextoBiblia.setText(styledText);
                                ScrollBiblia.scrollTo(100, 0);
                                break;
                            case "1° de Reyes":
                                switch (capitulo) {
                                    default:
                                        Biblia = bienvenido;
                                    case 1:
                                        Biblia = getString(R.string.primeraReyes1);
                                        break;
                                    case 2:
                                        Biblia = getString(R.string.primeraReyes2);
                                        break;
                                    case 3:
                                        Biblia = getString(R.string.primeraReyes3);
                                        break;
                                    case 4:
                                        Biblia = getString(R.string.primeraReyes4);
                                        break;
                                    case 5:
                                        Biblia = getString(R.string.primeraReyes5);
                                        break;
                                    case 6:
                                        Biblia = getString(R.string.primeraReyes6);
                                        break;
                                    case 7:
                                        Biblia = getString(R.string.primeraReyes7);
                                        break;
                                    case 8:
                                        Biblia = getString(R.string.primeraReyes8);
                                        break;
                                    case 9:
                                        Biblia = getString(R.string.primeraReyes9);
                                        break;
                                    case 10:
                                        Biblia = getString(R.string.primeraReyes10);
                                        break;
                                    case 11:
                                        Biblia = getString(R.string.primeraReyes11);
                                        break;
                                    case 12:
                                        Biblia = getString(R.string.primeraReyes12);
                                        break;
                                    case 13:
                                        Biblia = getString(R.string.primeraReyes13);
                                        break;
                                    case 14:
                                        Biblia = getString(R.string.primeraReyes14);
                                        break;
                                    case 15:
                                        Biblia = getString(R.string.primeraReyes15);
                                        break;
                                    case 16:
                                        Biblia = getString(R.string.primeraReyes16);
                                        break;
                                    case 17:
                                        Biblia = getString(R.string.primeraReyes17);
                                        break;
                                    case 18:
                                        Biblia = getString(R.string.primeraReyes18);
                                        break;
                                    case 19:
                                        Biblia = getString(R.string.primeraReyes19);
                                        break;
                                    case 20:
                                        Biblia = getString(R.string.primeraReyes20);
                                        break;
                                    case 21:
                                        Biblia = getString(R.string.primeraReyes21);
                                        break;
                                    case 22:
                                        Biblia = getString(R.string.primeraReyes22);
                                        break;
                                }
                                styledText = Html.fromHtml(String.valueOf(Biblia), FROM_HTML_MODE_LEGACY);
                                TextoBiblia.setText(styledText);
                                ScrollBiblia.scrollTo(100, 0);
                                break;
                            case "2° de Reyes":
                                switch (capitulo) {
                                    default:
                                        Biblia = bienvenido;
                                    case 1:
                                        Biblia = getString(R.string.segundaReyes1);
                                        break;
                                    case 2:
                                        Biblia = getString(R.string.segundaReyes2);
                                        break;
                                    case 3:
                                        Biblia = getString(R.string.segundaReyes3);
                                        break;
                                    case 4:
                                        Biblia = getString(R.string.segundaReyes4);
                                        break;
                                    case 5:
                                        Biblia = getString(R.string.segundaReyes5);
                                        break;
                                    case 6:
                                        Biblia = getString(R.string.segundaReyes6);
                                        break;
                                    case 7:
                                        Biblia = getString(R.string.segundaReyes7);
                                        break;
                                    case 8:
                                        Biblia = getString(R.string.segundaReyes8);
                                        break;
                                    case 9:
                                        Biblia = getString(R.string.segundaReyes9);
                                        break;
                                    case 10:
                                        Biblia = getString(R.string.segundaReyes10);
                                        break;
                                    case 11:
                                        Biblia = getString(R.string.segundaReyes11);
                                        break;
                                    case 12:
                                        Biblia = getString(R.string.segundaReyes12);
                                        break;
                                    case 13:
                                        Biblia = getString(R.string.segundaReyes13);
                                        break;
                                    case 14:
                                        Biblia = getString(R.string.segundaReyes14);
                                        break;
                                    case 15:
                                        Biblia = getString(R.string.segundaReyes15);
                                        break;
                                    case 16:
                                        Biblia = getString(R.string.segundaReyes16);
                                        break;
                                    case 17:
                                        Biblia = getString(R.string.segundaReyes17);
                                        break;
                                    case 18:
                                        Biblia = getString(R.string.segundaReyes18);
                                        break;
                                    case 19:
                                        Biblia = getString(R.string.segundaReyes19);
                                        break;
                                    case 20:
                                        Biblia = getString(R.string.segundaReyes20);
                                        break;
                                    case 21:
                                        Biblia = getString(R.string.segundaReyes21);
                                        break;
                                    case 22:
                                        Biblia = getString(R.string.segundaReyes22);
                                        break;
                                    case 23:
                                        Biblia = getString(R.string.segundaReyes23);
                                        break;
                                    case 24:
                                        Biblia = getString(R.string.segundaReyes24);
                                        break;
                                    case 25:
                                        Biblia = getString(R.string.segundaReyes25);
                                        break;
                                }
                                styledText = Html.fromHtml(String.valueOf(Biblia), FROM_HTML_MODE_LEGACY);
                                TextoBiblia.setText(styledText);
                                ScrollBiblia.scrollTo(100, 0);
                                break;
                            case "1° de Crónicas":
                                switch (capitulo) {
                                    default:
                                        Biblia = bienvenido;
                                    case 1:
                                        Biblia = getString(R.string.primeraCronicas1);
                                        break;
                                    case 2:
                                        Biblia = getString(R.string.primeraCronicas2);
                                        break;
                                    case 3:
                                        Biblia = getString(R.string.primeraCronicas3);
                                        break;
                                    case 4:
                                        Biblia = getString(R.string.primeraCronicas4);
                                        break;
                                    case 5:
                                        Biblia = getString(R.string.primeraCronicas5);
                                        break;
                                    case 6:
                                        Biblia = getString(R.string.primeraCronicas6);
                                        break;
                                    case 7:
                                        Biblia = getString(R.string.primeraCronicas7);
                                        break;
                                    case 8:
                                        Biblia = getString(R.string.primeraCronicas8);
                                        break;
                                    case 9:
                                        Biblia = getString(R.string.primeraCronicas9);
                                        break;
                                    case 10:
                                        Biblia = getString(R.string.primeraCronicas10);
                                        break;
                                    case 11:
                                        Biblia = getString(R.string.primeraCronicas11);
                                        break;
                                    case 12:
                                        Biblia = getString(R.string.primeraCronicas12);
                                        break;
                                    case 13:
                                        Biblia = getString(R.string.primeraCronicas13);
                                        break;
                                    case 14:
                                        Biblia = getString(R.string.primeraCronicas14);
                                        break;
                                    case 15:
                                        Biblia = getString(R.string.primeraCronicas15);
                                        break;
                                    case 16:
                                        Biblia = getString(R.string.primeraCronicas16);
                                        break;
                                    case 17:
                                        Biblia = getString(R.string.primeraCronicas17);
                                        break;
                                    case 18:
                                        Biblia = getString(R.string.primeraCronicas18);
                                        break;
                                    case 19:
                                        Biblia = getString(R.string.primeraCronicas19);
                                        break;
                                    case 20:
                                        Biblia = getString(R.string.primeraCronicas20);
                                        break;
                                    case 21:
                                        Biblia = getString(R.string.primeraCronicas21);
                                        break;
                                    case 22:
                                        Biblia = getString(R.string.primeraCronicas22);
                                        break;
                                    case 23:
                                        Biblia = getString(R.string.primeraCronicas23);
                                        break;
                                    case 24:
                                        Biblia = getString(R.string.primeraCronicas24);
                                        break;
                                    case 25:
                                        Biblia = getString(R.string.primeraCronicas25);
                                        break;
                                    case 26:
                                        Biblia = getString(R.string.primeraCronicas26);
                                        break;
                                    case 27:
                                        Biblia = getString(R.string.primeraCronicas27);
                                        break;
                                    case 28:
                                        Biblia = getString(R.string.primeraCronicas28);
                                        break;
                                    case 29:
                                        Biblia = getString(R.string.primeraCronicas29);
                                        break;
                                }
                                styledText = Html.fromHtml(String.valueOf(Biblia), FROM_HTML_MODE_LEGACY);
                                TextoBiblia.setText(styledText);
                                ScrollBiblia.scrollTo(100, 0);
                                break;
                            case "2° de Crónicas":
                                switch (capitulo) {
                                    default:
                                        Biblia = bienvenido;
                                    case 1:
                                        Biblia = getString(R.string.segundaCronicas1);
                                        break;
                                    case 2:
                                        Biblia = getString(R.string.segundaCronicas2);
                                        break;
                                    case 3:
                                        Biblia = getString(R.string.segundaCronicas3);
                                        break;
                                    case 4:
                                        Biblia = getString(R.string.segundaCronicas4);
                                        break;
                                    case 5:
                                        Biblia = getString(R.string.segundaCronicas5);
                                        break;
                                    case 6:
                                        Biblia = getString(R.string.segundaCronicas6);
                                        break;
                                    case 7:
                                        Biblia = getString(R.string.segundaCronicas7);
                                        break;
                                    case 8:
                                        Biblia = getString(R.string.segundaCronicas8);
                                        break;
                                    case 9:
                                        Biblia = getString(R.string.segundaCronicas9);
                                        break;
                                    case 10:
                                        Biblia = getString(R.string.segundaCronicas10);
                                        break;
                                    case 11:
                                        Biblia = getString(R.string.segundaCronicas11);
                                        break;
                                    case 12:
                                        Biblia = getString(R.string.segundaCronicas12);
                                        break;
                                    case 13:
                                        Biblia = getString(R.string.segundaCronicas13);
                                        break;
                                    case 14:
                                        Biblia = getString(R.string.segundaCronicas14);
                                        break;
                                    case 15:
                                        Biblia = getString(R.string.segundaCronicas15);
                                        break;
                                    case 16:
                                        Biblia = getString(R.string.segundaCronicas16);
                                        break;
                                    case 17:
                                        Biblia = getString(R.string.segundaCronicas17);
                                        break;
                                    case 18:
                                        Biblia = getString(R.string.segundaCronicas18);
                                        break;
                                    case 19:
                                        Biblia = getString(R.string.segundaCronicas19);
                                        break;
                                    case 20:
                                        Biblia = getString(R.string.segundaCronicas20);
                                        break;
                                    case 21:
                                        Biblia = getString(R.string.segundaCronicas21);
                                        break;
                                    case 22:
                                        Biblia = getString(R.string.segundaCronicas22);
                                        break;
                                    case 23:
                                        Biblia = getString(R.string.segundaCronicas23);
                                        break;
                                    case 24:
                                        Biblia = getString(R.string.segundaCronicas24);
                                        break;
                                    case 25:
                                        Biblia = getString(R.string.segundaCronicas25);
                                        break;
                                    case 26:
                                        Biblia = getString(R.string.segundaCronicas26);
                                        break;
                                    case 27:
                                        Biblia = getString(R.string.segundaCronicas27);
                                        break;
                                    case 28:
                                        Biblia = getString(R.string.segundaCronicas28);
                                        break;
                                    case 29:
                                        Biblia = getString(R.string.segundaCronicas29);
                                        break;
                                    case 30:
                                        Biblia = getString(R.string.segundaCronicas30);
                                        break;
                                    case 31:
                                        Biblia = getString(R.string.segundaCronicas31);
                                        break;
                                    case 32:
                                        Biblia = getString(R.string.segundaCronicas32);
                                        break;
                                    case 33:
                                        Biblia = getString(R.string.segundaCronicas33);
                                        break;
                                    case 34:
                                        Biblia = getString(R.string.segundaCronicas34);
                                        break;
                                    case 35:
                                        Biblia = getString(R.string.segundaCronicas35);
                                        break;
                                    case 36:
                                        Biblia = getString(R.string.segundaCronicas36);
                                        break;
                                }
                                styledText = Html.fromHtml(String.valueOf(Biblia), FROM_HTML_MODE_LEGACY);
                                TextoBiblia.setText(styledText);
                                ScrollBiblia.scrollTo(100, 0);
                                break;
                            case "Nehemías":
                                switch (capitulo) {
                                    default:
                                        Biblia = bienvenido;
                                    case 1:
                                        Biblia = getString(R.string.nehemias1);
                                        break;
                                    case 2:
                                        Biblia = getString(R.string.nehemias2);
                                        break;
                                    case 3:
                                        Biblia = getString(R.string.nehemias3);
                                        break;
                                    case 4:
                                        Biblia = getString(R.string.nehemias4);
                                        break;
                                    case 5:
                                        Biblia = getString(R.string.nehemias5);
                                        break;
                                    case 6:
                                        Biblia = getString(R.string.nehemias6);
                                        break;
                                    case 7:
                                        Biblia = getString(R.string.nehemias7);
                                        break;
                                    case 8:
                                        Biblia = getString(R.string.nehemias8);
                                        break;
                                    case 9:
                                        Biblia = getString(R.string.nehemias9);
                                        break;
                                    case 10:
                                        Biblia = getString(R.string.nehemias10);
                                        break;
                                    case 11:
                                        Biblia = getString(R.string.nehemias11);
                                        break;
                                    case 12:
                                        Biblia = getString(R.string.nehemias12);
                                        break;
                                    case 13:
                                        Biblia = getString(R.string.nehemias13);
                                        break;
                                }
                                styledText = Html.fromHtml(String.valueOf(Biblia), FROM_HTML_MODE_LEGACY);
                                TextoBiblia.setText(styledText);
                                ScrollBiblia.scrollTo(100, 0);
                                break;
                            case "Esdras":
                                switch (capitulo) {
                                    default:
                                        Biblia = bienvenido;
                                    case 1:
                                        Biblia = getString(R.string.esdras1);
                                        break;
                                    case 2:
                                        Biblia = getString(R.string.esdras2);
                                        break;
                                    case 3:
                                        Biblia = getString(R.string.esdras3);
                                        break;
                                    case 4:
                                        Biblia = getString(R.string.esdras4);
                                        break;
                                    case 5:
                                        Biblia = getString(R.string.esdras5);
                                        break;
                                    case 6:
                                        Biblia = getString(R.string.esdras6);
                                        break;
                                    case 7:
                                        Biblia = getString(R.string.esdras7);
                                        break;
                                    case 8:
                                        Biblia = getString(R.string.esdras8);
                                        break;
                                    case 9:
                                        Biblia = getString(R.string.esdras9);
                                        break;
                                    case 10:
                                        Biblia = getString(R.string.esdras10);
                                        break;
                                }
                                styledText = Html.fromHtml(String.valueOf(Biblia), FROM_HTML_MODE_LEGACY);
                                TextoBiblia.setText(styledText);
                                ScrollBiblia.scrollTo(100, 0);
                                break;
                            case "Ester":
                                switch (capitulo) {
                                    default:
                                        Biblia = bienvenido;
                                    case 1:
                                        Biblia = getString(R.string.ester1);
                                        break;
                                    case 2:
                                        Biblia = getString(R.string.ester2);
                                        break;
                                    case 3:
                                        Biblia = getString(R.string.ester3);
                                        break;
                                    case 4:
                                        Biblia = getString(R.string.ester4);
                                        break;
                                    case 5:
                                        Biblia = getString(R.string.ester5);
                                        break;
                                    case 6:
                                        Biblia = getString(R.string.ester6);
                                        break;
                                    case 7:
                                        Biblia = getString(R.string.ester7);
                                        break;
                                    case 8:
                                        Biblia = getString(R.string.ester8);
                                        break;
                                    case 9:
                                        Biblia = getString(R.string.ester9);
                                        break;
                                    case 10:
                                        Biblia = getString(R.string.ester10);
                                        break;
                                }
                                styledText = Html.fromHtml(String.valueOf(Biblia), FROM_HTML_MODE_LEGACY);
                                TextoBiblia.setText(styledText);
                                ScrollBiblia.scrollTo(100, 0);
                                break;
                            case "Job":
                                switch (capitulo) {
                                    default:
                                        Biblia = bienvenido;
                                    case 1:
                                        Biblia = getString(R.string.job1);
                                        break;
                                    case 2:
                                        Biblia = getString(R.string.job2);
                                        break;
                                    case 3:
                                        Biblia = getString(R.string.job3);
                                        break;
                                    case 4:
                                        Biblia = getString(R.string.job4);
                                        break;
                                    case 5:
                                        Biblia = getString(R.string.job5);
                                        break;
                                    case 6:
                                        Biblia = getString(R.string.job6);
                                        break;
                                    case 7:
                                        Biblia = getString(R.string.job7);
                                        break;
                                    case 8:
                                        Biblia = getString(R.string.job8);
                                        break;
                                    case 9:
                                        Biblia = getString(R.string.job9);
                                        break;
                                    case 10:
                                        Biblia = getString(R.string.job10);
                                        break;
                                    case 11:
                                        Biblia = getString(R.string.job11);
                                        break;
                                    case 12:
                                        Biblia = getString(R.string.job12);
                                        break;
                                    case 13:
                                        Biblia = getString(R.string.job13);
                                        break;
                                    case 14:
                                        Biblia = getString(R.string.job14);
                                        break;
                                    case 15:
                                        Biblia = getString(R.string.job15);
                                        break;
                                    case 16:
                                        Biblia = getString(R.string.job16);
                                        break;
                                    case 17:
                                        Biblia = getString(R.string.job17);
                                        break;
                                    case 18:
                                        Biblia = getString(R.string.job18);
                                        break;
                                    case 19:
                                        Biblia = getString(R.string.job19);
                                        break;
                                    case 20:
                                        Biblia = getString(R.string.job20);
                                        break;
                                    case 21:
                                        Biblia = getString(R.string.job21);
                                        break;
                                    case 22:
                                        Biblia = getString(R.string.job22);
                                        break;
                                    case 23:
                                        Biblia = getString(R.string.job23);
                                        break;
                                    case 24:
                                        Biblia = getString(R.string.job24);
                                        break;
                                    case 25:
                                        Biblia = getString(R.string.job25);
                                        break;
                                    case 26:
                                        Biblia = getString(R.string.job26);
                                        break;
                                    case 27:
                                        Biblia = getString(R.string.job27);
                                        break;
                                    case 28:
                                        Biblia = getString(R.string.job28);
                                        break;
                                    case 29:
                                        Biblia = getString(R.string.job29);
                                        break;
                                    case 30:
                                        Biblia = getString(R.string.job30);
                                        break;
                                    case 31:
                                        Biblia = getString(R.string.job31);
                                        break;
                                    case 32:
                                        Biblia = getString(R.string.job32);
                                        break;
                                    case 33:
                                        Biblia = getString(R.string.job33);
                                        break;
                                    case 34:
                                        Biblia = getString(R.string.job34);
                                        break;
                                    case 35:
                                        Biblia = getString(R.string.job35);
                                        break;
                                    case 36:
                                        Biblia = getString(R.string.job36);
                                        break;
                                    case 37:
                                        Biblia = getString(R.string.job37);
                                        break;
                                    case 38:
                                        Biblia = getString(R.string.job38);
                                        break;
                                    case 39:
                                        Biblia = getString(R.string.job39);
                                        break;
                                    case 40:
                                        Biblia = getString(R.string.job40);
                                        break;
                                    case 41:
                                        Biblia = getString(R.string.job41);
                                        break;
                                    case 42:
                                        Biblia = getString(R.string.job42);
                                        break;
                                }
                                styledText = Html.fromHtml(String.valueOf(Biblia), FROM_HTML_MODE_LEGACY);
                                TextoBiblia.setText(styledText);
                                ScrollBiblia.scrollTo(100, 0);
                                break;
                            case "Salmos":
                                switch (capitulo) {
                                    default:
                                        Biblia = bienvenido;
                                    case 1:
                                        Biblia = getString(R.string.salmos1);
                                        break;
                                    case 2:
                                        Biblia = getString(R.string.salmos2);
                                        break;
                                    case 3:
                                        Biblia = getString(R.string.salmos3);
                                        break;
                                    case 4:
                                        Biblia = getString(R.string.salmos4);
                                        break;
                                    case 5:
                                        Biblia = getString(R.string.salmos5);
                                        break;
                                    case 6:
                                        Biblia = getString(R.string.salmos6);
                                        break;
                                    case 7:
                                        Biblia = getString(R.string.salmos7);
                                        break;
                                    case 8:
                                        Biblia = getString(R.string.salmos8);
                                        break;
                                    case 9:
                                        Biblia = getString(R.string.salmos9);
                                        break;
                                    case 10:
                                        Biblia = getString(R.string.salmos10);
                                        break;
                                    case 11:
                                        Biblia = getString(R.string.salmos11);
                                        break;
                                    case 12:
                                        Biblia = getString(R.string.salmos12);
                                        break;
                                    case 13:
                                        Biblia = getString(R.string.salmos13);
                                        break;
                                    case 14:
                                        Biblia = getString(R.string.salmos14);
                                        break;
                                    case 15:
                                        Biblia = getString(R.string.salmos15);
                                        break;
                                    case 16:
                                        Biblia = getString(R.string.salmos16);
                                        break;
                                    case 17:
                                        Biblia = getString(R.string.salmos17);
                                        break;
                                    case 18:
                                        Biblia = getString(R.string.salmos18);
                                        break;
                                    case 19:
                                        Biblia = getString(R.string.salmos19);
                                        break;
                                    case 20:
                                        Biblia = getString(R.string.salmos20);
                                        break;
                                    case 21:
                                        Biblia = getString(R.string.salmos21);
                                        break;
                                    case 22:
                                        Biblia = getString(R.string.salmos22);
                                        break;
                                    case 23:
                                        Biblia = getString(R.string.salmos23);
                                        break;
                                    case 24:
                                        Biblia = getString(R.string.salmos24);
                                        break;
                                    case 25:
                                        Biblia = getString(R.string.salmos25);
                                        break;
                                    case 26:
                                        Biblia = getString(R.string.salmos26);
                                        break;
                                    case 27:
                                        Biblia = getString(R.string.salmos27);
                                        break;
                                    case 28:
                                        Biblia = getString(R.string.salmos28);
                                        break;
                                    case 29:
                                        Biblia = getString(R.string.salmos29);
                                        break;
                                    case 30:
                                        Biblia = getString(R.string.salmos30);
                                        break;
                                    case 31:
                                        Biblia = getString(R.string.salmos31);
                                        break;
                                    case 32:
                                        Biblia = getString(R.string.salmos32);
                                        break;
                                    case 33:
                                        Biblia = getString(R.string.salmos33);
                                        break;
                                    case 34:
                                        Biblia = getString(R.string.salmos34);
                                        break;
                                    case 35:
                                        Biblia = getString(R.string.salmos35);
                                        break;
                                    case 36:
                                        Biblia = getString(R.string.salmos36);
                                        break;
                                    case 37:
                                        Biblia = getString(R.string.salmos37);
                                        break;
                                    case 38:
                                        Biblia = getString(R.string.salmos38);
                                        break;
                                    case 39:
                                        Biblia = getString(R.string.salmos39);
                                        break;
                                    case 40:
                                        Biblia = getString(R.string.salmos40);
                                        break;
                                    case 41:
                                        Biblia = getString(R.string.salmos41);
                                        break;
                                    case 42:
                                        Biblia = getString(R.string.salmos42);
                                        break;
                                    case 43:
                                        Biblia = getString(R.string.salmos43);
                                        break;
                                    case 44:
                                        Biblia = getString(R.string.salmos44);
                                        break;
                                    case 45:
                                        Biblia = getString(R.string.salmos45);
                                        break;
                                    case 46:
                                        Biblia = getString(R.string.salmos46);
                                        break;
                                    case 47:
                                        Biblia = getString(R.string.salmos47);
                                        break;
                                    case 48:
                                        Biblia = getString(R.string.salmos48);
                                        break;
                                    case 49:
                                        Biblia = getString(R.string.salmos49);
                                        break;
                                    case 50:
                                        Biblia = getString(R.string.salmos50);
                                        break;
                                    case 51:
                                        Biblia = getString(R.string.salmos51);
                                        break;
                                    case 52:
                                        Biblia = getString(R.string.salmos52);
                                        break;
                                    case 53:
                                        Biblia = getString(R.string.salmos53);
                                        break;
                                    case 54:
                                        Biblia = getString(R.string.salmos54);
                                        break;
                                    case 55:
                                        Biblia = getString(R.string.salmos55);
                                        break;
                                    case 56:
                                        Biblia = getString(R.string.salmos56);
                                        break;
                                    case 57:
                                        Biblia = getString(R.string.salmos57);
                                        break;
                                    case 58:
                                        Biblia = getString(R.string.salmos58);
                                        break;
                                    case 59:
                                        Biblia = getString(R.string.salmos59);
                                        break;
                                    case 60:
                                        Biblia = getString(R.string.salmos60);
                                        break;
                                    case 61:
                                        Biblia = getString(R.string.salmos61);
                                        break;
                                    case 62:
                                        Biblia = getString(R.string.salmos62);
                                        break;
                                    case 63:
                                        Biblia = getString(R.string.salmos63);
                                        break;
                                    case 64:
                                        Biblia = getString(R.string.salmos64);
                                        break;
                                    case 65:
                                        Biblia = getString(R.string.salmos65);
                                        break;
                                    case 66:
                                        Biblia = getString(R.string.salmos66);
                                        break;
                                    case 67:
                                        Biblia = getString(R.string.salmos67);
                                        break;
                                    case 68:
                                        Biblia = getString(R.string.salmos68);
                                        break;
                                    case 69:
                                        Biblia = getString(R.string.salmos69);
                                        break;
                                    case 70:
                                        Biblia = getString(R.string.salmos70);
                                        break;
                                    case 71:
                                        Biblia = getString(R.string.salmos71);
                                        break;
                                    case 72:
                                        Biblia = getString(R.string.salmos72);
                                        break;
                                    case 73:
                                        Biblia = getString(R.string.salmos73);
                                        break;
                                    case 74:
                                        Biblia = getString(R.string.salmos74);
                                        break;
                                    case 75:
                                        Biblia = getString(R.string.salmos75);
                                        break;
                                    case 76:
                                        Biblia = getString(R.string.salmos76);
                                        break;
                                    case 77:
                                        Biblia = getString(R.string.salmos77);
                                        break;
                                    case 78:
                                        Biblia = getString(R.string.salmos78);
                                        break;
                                    case 79:
                                        Biblia = getString(R.string.salmos79);
                                        break;
                                    case 80:
                                        Biblia = getString(R.string.salmos80);
                                        break;
                                    case 81:
                                        Biblia = getString(R.string.salmos81);
                                        break;
                                    case 82:
                                        Biblia = getString(R.string.salmos82);
                                        break;
                                    case 83:
                                        Biblia = getString(R.string.salmos83);
                                        break;
                                    case 84:
                                        Biblia = getString(R.string.salmos84);
                                        break;
                                    case 85:
                                        Biblia = getString(R.string.salmos85);
                                        break;
                                    case 86:
                                        Biblia = getString(R.string.salmos86);
                                        break;
                                    case 87:
                                        Biblia = getString(R.string.salmos87);
                                        break;
                                    case 88:
                                        Biblia = getString(R.string.salmos88);
                                        break;
                                    case 89:
                                        Biblia = getString(R.string.salmos89);
                                        break;
                                    case 90:
                                        Biblia = getString(R.string.salmos90);
                                        break;
                                    case 91:
                                        Biblia = getString(R.string.salmos91);
                                        break;
                                    case 92:
                                        Biblia = getString(R.string.salmos92);
                                        break;
                                    case 93:
                                        Biblia = getString(R.string.salmos93);
                                        break;
                                    case 94:
                                        Biblia = getString(R.string.salmos94);
                                        break;
                                    case 95:
                                        Biblia = getString(R.string.salmos95);
                                        break;
                                    case 96:
                                        Biblia = getString(R.string.salmos96);
                                        break;
                                    case 97:
                                        Biblia = getString(R.string.salmos97);
                                        break;
                                    case 98:
                                        Biblia = getString(R.string.salmos98);
                                        break;
                                    case 99:
                                        Biblia = getString(R.string.salmos99);
                                        break;
                                    case 100:
                                        Biblia = getString(R.string.salmos100);
                                        break;
                                    case 101:
                                        Biblia = getString(R.string.salmos101);
                                        break;
                                    case 102:
                                        Biblia = getString(R.string.salmos102);
                                        break;
                                    case 103:
                                        Biblia = getString(R.string.salmos103);
                                        break;
                                    case 104:
                                        Biblia = getString(R.string.salmos104);
                                        break;
                                    case 105:
                                        Biblia = getString(R.string.salmos105);
                                        break;
                                    case 106:
                                        Biblia = getString(R.string.salmos106);
                                        break;
                                    case 107:
                                        Biblia = getString(R.string.salmos107);
                                        break;
                                    case 108:
                                        Biblia = getString(R.string.salmos108);
                                        break;
                                    case 109:
                                        Biblia = getString(R.string.salmos109);
                                        break;
                                    case 110:
                                        Biblia = getString(R.string.salmos110);
                                        break;
                                    case 111:
                                        Biblia = getString(R.string.salmos111);
                                        break;
                                    case 112:
                                        Biblia = getString(R.string.salmos112);
                                        break;
                                    case 113:
                                        Biblia = getString(R.string.salmos113);
                                        break;
                                    case 114:
                                        Biblia = getString(R.string.salmos114);
                                        break;
                                    case 115:
                                        Biblia = getString(R.string.salmos115);
                                        break;
                                    case 116:
                                        Biblia = getString(R.string.salmos116);
                                        break;
                                    case 117:
                                        Biblia = getString(R.string.salmos117);
                                        break;
                                    case 118:
                                        Biblia = getString(R.string.salmos118);
                                        break;
                                    case 119:
                                        Biblia = getString(R.string.salmos119);
                                        break;
                                    case 120:
                                        Biblia = getString(R.string.salmos120);
                                        break;
                                    case 121:
                                        Biblia = getString(R.string.salmos121);
                                        break;
                                    case 122:
                                        Biblia = getString(R.string.salmos122);
                                        break;
                                    case 123:
                                        Biblia = getString(R.string.salmos123);
                                        break;
                                    case 124:
                                        Biblia = getString(R.string.salmos124);
                                        break;
                                    case 125:
                                        Biblia = getString(R.string.salmos125);
                                        break;
                                    case 126:
                                        Biblia = getString(R.string.salmos126);
                                        break;
                                    case 127:
                                        Biblia = getString(R.string.salmos127);
                                        break;
                                    case 128:
                                        Biblia = getString(R.string.salmos128);
                                        break;
                                    case 129:
                                        Biblia = getString(R.string.salmos129);
                                        break;
                                    case 130:
                                        Biblia = getString(R.string.salmos130);
                                        break;
                                    case 131:
                                        Biblia = getString(R.string.salmos131);
                                        break;
                                    case 132:
                                        Biblia = getString(R.string.salmos132);
                                        break;
                                    case 133:
                                        Biblia = getString(R.string.salmos133);
                                        break;
                                    case 134:
                                        Biblia = getString(R.string.salmos134);
                                        break;
                                    case 135:
                                        Biblia = getString(R.string.salmos135);
                                        break;
                                    case 136:
                                        Biblia = getString(R.string.salmos136);
                                        break;
                                    case 137:
                                        Biblia = getString(R.string.salmos137);
                                        break;
                                    case 138:
                                        Biblia = getString(R.string.salmos138);
                                        break;
                                    case 139:
                                        Biblia = getString(R.string.salmos139);
                                        break;
                                    case 140:
                                        Biblia = getString(R.string.salmos140);
                                        break;
                                    case 141:
                                        Biblia = getString(R.string.salmos141);
                                        break;
                                    case 142:
                                        Biblia = getString(R.string.salmos142);
                                        break;
                                    case 143:
                                        Biblia = getString(R.string.salmos143);
                                        break;
                                    case 144:
                                        Biblia = getString(R.string.salmos144);
                                        break;
                                    case 145:
                                        Biblia = getString(R.string.salmos145);
                                        break;
                                    case 146:
                                        Biblia = getString(R.string.salmos146);
                                        break;
                                    case 147:
                                        Biblia = getString(R.string.salmos147);
                                        break;
                                    case 148:
                                        Biblia = getString(R.string.salmos148);
                                        break;
                                    case 149:
                                        Biblia = getString(R.string.salmos149);
                                        break;
                                    case 150:
                                        Biblia = getString(R.string.salmos150);
                                        break;

                                }
                                styledText = Html.fromHtml(String.valueOf(Biblia), FROM_HTML_MODE_LEGACY);
                                TextoBiblia.setText(styledText);
                                ScrollBiblia.scrollTo(100, 0);
                                break;
                            case "Proverbios":
                                switch (capitulo) {
                                    default:
                                        Biblia = bienvenido;
                                    case 1:
                                        Biblia = getString(R.string.proverbios1);
                                        break;
                                    case 2:
                                        Biblia = getString(R.string.proverbios2);
                                        break;
                                    case 3:
                                        Biblia = getString(R.string.proverbios3);
                                        break;
                                    case 4:
                                        Biblia = getString(R.string.proverbios4);
                                        break;
                                    case 5:
                                        Biblia = getString(R.string.proverbios5);
                                        break;
                                    case 6:
                                        Biblia = getString(R.string.proverbios6);
                                        break;
                                    case 7:
                                        Biblia = getString(R.string.proverbios7);
                                        break;
                                    case 8:
                                        Biblia = getString(R.string.proverbios8);
                                        break;
                                    case 9:
                                        Biblia = getString(R.string.proverbios9);
                                        break;
                                    case 10:
                                        Biblia = getString(R.string.proverbios10);
                                        break;
                                    case 11:
                                        Biblia = getString(R.string.proverbios11);
                                        break;
                                    case 12:
                                        Biblia = getString(R.string.proverbios12);
                                        break;
                                    case 13:
                                        Biblia = getString(R.string.proverbios13);
                                        break;
                                    case 14:
                                        Biblia = getString(R.string.proverbios14);
                                        break;
                                    case 15:
                                        Biblia = getString(R.string.proverbios15);
                                        break;
                                    case 16:
                                        Biblia = getString(R.string.proverbios16);
                                        break;
                                    case 17:
                                        Biblia = getString(R.string.proverbios17);
                                        break;
                                    case 18:
                                        Biblia = getString(R.string.proverbios18);
                                        break;
                                    case 19:
                                        Biblia = getString(R.string.proverbios19);
                                        break;
                                    case 20:
                                        Biblia = getString(R.string.proverbios20);
                                        break;
                                    case 21:
                                        Biblia = getString(R.string.proverbios21);
                                        break;
                                    case 22:
                                        Biblia = getString(R.string.proverbios22);
                                        break;
                                    case 23:
                                        Biblia = getString(R.string.proverbios23);
                                        break;
                                    case 24:
                                        Biblia = getString(R.string.proverbios24);
                                        break;
                                    case 25:
                                        Biblia = getString(R.string.proverbios25);
                                        break;
                                    case 26:
                                        Biblia = getString(R.string.proverbios26);
                                        break;
                                    case 27:
                                        Biblia = getString(R.string.proverbios27);
                                        break;
                                    case 28:
                                        Biblia = getString(R.string.proverbios28);
                                        break;
                                    case 29:
                                        Biblia = getString(R.string.proverbios29);
                                        break;
                                    case 30:
                                        Biblia = getString(R.string.proverbios30);
                                        break;
                                    case 31:
                                        Biblia = getString(R.string.proverbios31);
                                        break;
                                }
                                styledText = Html.fromHtml(String.valueOf(Biblia), FROM_HTML_MODE_LEGACY);
                                TextoBiblia.setText(styledText);
                                ScrollBiblia.scrollTo(100, 0);
                                break;
                            case "Eclesiastés":
                                switch (capitulo) {
                                    default:
                                        Biblia = bienvenido;
                                    case 1:
                                        Biblia = getString(R.string.eclesiastes1);
                                        break;
                                    case 2:
                                        Biblia = getString(R.string.eclesiastes2);
                                        break;
                                    case 3:
                                        Biblia = getString(R.string.eclesiastes3);
                                        break;
                                    case 4:
                                        Biblia = getString(R.string.eclesiastes4);
                                        break;
                                    case 5:
                                        Biblia = getString(R.string.eclesiastes5);
                                        break;
                                    case 6:
                                        Biblia = getString(R.string.eclesiastes6);
                                        break;
                                    case 7:
                                        Biblia = getString(R.string.eclesiastes7);
                                        break;
                                    case 8:
                                        Biblia = getString(R.string.eclesiastes8);
                                        break;
                                    case 9:
                                        Biblia = getString(R.string.eclesiastes9);
                                        break;
                                    case 10:
                                        Biblia = getString(R.string.eclesiastes10);
                                        break;
                                    case 11:
                                        Biblia = getString(R.string.eclesiastes11);
                                        break;
                                    case 12:
                                        Biblia = getString(R.string.eclesiastes12);
                                        break;
                                }
                                styledText = Html.fromHtml(String.valueOf(Biblia), FROM_HTML_MODE_LEGACY);
                                TextoBiblia.setText(styledText);
                                ScrollBiblia.scrollTo(100, 0);
                                break;
                            case "Cantar de los Cantares":
                                switch (capitulo) {
                                    default:
                                        Biblia = bienvenido;
                                    case 1:
                                        Biblia = getString(R.string.cantares1);
                                        break;
                                    case 2:
                                        Biblia = getString(R.string.cantares2);
                                        break;
                                    case 3:
                                        Biblia = getString(R.string.cantares3);
                                        break;
                                    case 4:
                                        Biblia = getString(R.string.cantares4);
                                        break;
                                    case 5:
                                        Biblia = getString(R.string.cantares5);
                                        break;
                                    case 6:
                                        Biblia = getString(R.string.cantares6);
                                        break;
                                    case 7:
                                        Biblia = getString(R.string.cantares7);
                                        break;
                                    case 8:
                                        Biblia = getString(R.string.cantares8);
                                        break;
                                }
                                styledText = Html.fromHtml(String.valueOf(Biblia), FROM_HTML_MODE_LEGACY);
                                TextoBiblia.setText(styledText);
                                ScrollBiblia.scrollTo(100, 0);
                                break;
                            case "Isaías":
                                switch (capitulo) {
                                    default:
                                        Biblia = bienvenido;
                                    case 1:
                                        Biblia = getString(R.string.isaias1);
                                        break;
                                    case 2:
                                        Biblia = getString(R.string.isaias2);
                                        break;
                                    case 3:
                                        Biblia = getString(R.string.isaias3);
                                        break;
                                    case 4:
                                        Biblia = getString(R.string.isaias4);
                                        break;
                                    case 5:
                                        Biblia = getString(R.string.isaias5);
                                        break;
                                    case 6:
                                        Biblia = getString(R.string.isaias6);
                                        break;
                                    case 7:
                                        Biblia = getString(R.string.isaias7);
                                        break;
                                    case 8:
                                        Biblia = getString(R.string.isaias8);
                                        break;
                                    case 9:
                                        Biblia = getString(R.string.isaias9);
                                        break;
                                    case 10:
                                        Biblia = getString(R.string.isaias10);
                                        break;
                                    case 11:
                                        Biblia = getString(R.string.isaias11);
                                        break;
                                    case 12:
                                        Biblia = getString(R.string.isaias12);
                                        break;
                                    case 13:
                                        Biblia = getString(R.string.isaias13);
                                        break;
                                    case 14:
                                        Biblia = getString(R.string.isaias14);
                                        break;
                                    case 15:
                                        Biblia = getString(R.string.isaias15);
                                        break;
                                    case 16:
                                        Biblia = getString(R.string.isaias16);
                                        break;
                                    case 17:
                                        Biblia = getString(R.string.isaias17);
                                        break;
                                    case 18:
                                        Biblia = getString(R.string.isaias18);
                                        break;
                                    case 19:
                                        Biblia = getString(R.string.isaias19);
                                        break;
                                    case 20:
                                        Biblia = getString(R.string.isaias20);
                                        break;
                                    case 21:
                                        Biblia = getString(R.string.isaias21);
                                        break;
                                    case 22:
                                        Biblia = getString(R.string.isaias22);
                                        break;
                                    case 23:
                                        Biblia = getString(R.string.isaias23);
                                        break;
                                    case 24:
                                        Biblia = getString(R.string.isaias24);
                                        break;
                                    case 25:
                                        Biblia = getString(R.string.isaias25);
                                        break;
                                    case 26:
                                        Biblia = getString(R.string.isaias26);
                                        break;
                                    case 27:
                                        Biblia = getString(R.string.isaias27);
                                        break;
                                    case 28:
                                        Biblia = getString(R.string.isaias28);
                                        break;
                                    case 29:
                                        Biblia = getString(R.string.isaias29);
                                        break;
                                    case 30:
                                        Biblia = getString(R.string.isaias30);
                                        break;
                                    case 31:
                                        Biblia = getString(R.string.isaias31);
                                        break;
                                    case 32:
                                        Biblia = getString(R.string.isaias32);
                                        break;
                                    case 33:
                                        Biblia = getString(R.string.isaias33);
                                        break;
                                    case 34:
                                        Biblia = getString(R.string.isaias34);
                                        break;
                                    case 35:
                                        Biblia = getString(R.string.isaias35);
                                        break;
                                    case 36:
                                        Biblia = getString(R.string.isaias36);
                                        break;
                                    case 37:
                                        Biblia = getString(R.string.isaias37);
                                        break;
                                    case 38:
                                        Biblia = getString(R.string.isaias38);
                                        break;
                                    case 39:
                                        Biblia = getString(R.string.isaias39);
                                        break;
                                    case 40:
                                        Biblia = getString(R.string.isaias40);
                                        break;
                                    case 41:
                                        Biblia = getString(R.string.isaias41);
                                        break;
                                    case 42:
                                        Biblia = getString(R.string.isaias42);
                                        break;
                                    case 43:
                                        Biblia = getString(R.string.isaias43);
                                        break;
                                    case 44:
                                        Biblia = getString(R.string.isaias44);
                                        break;
                                    case 45:
                                        Biblia = getString(R.string.isaias45);
                                        break;
                                    case 46:
                                        Biblia = getString(R.string.isaias46);
                                        break;
                                    case 47:
                                        Biblia = getString(R.string.isaias47);
                                        break;
                                    case 48:
                                        Biblia = getString(R.string.isaias48);
                                        break;
                                    case 49:
                                        Biblia = getString(R.string.isaias49);
                                        break;
                                    case 50:
                                        Biblia = getString(R.string.isaias50);
                                        break;
                                    case 51:
                                        Biblia = getString(R.string.isaias51);
                                        break;
                                    case 52:
                                        Biblia = getString(R.string.isaias52);
                                        break;
                                    case 53:
                                        Biblia = getString(R.string.isaias53);
                                        break;
                                    case 54:
                                        Biblia = getString(R.string.isaias54);
                                        break;
                                    case 55:
                                        Biblia = getString(R.string.isaias55);
                                        break;
                                    case 56:
                                        Biblia = getString(R.string.isaias56);
                                        break;
                                    case 57:
                                        Biblia = getString(R.string.isaias57);
                                        break;
                                    case 58:
                                        Biblia = getString(R.string.isaias58);
                                        break;
                                    case 59:
                                        Biblia = getString(R.string.isaias59);
                                        break;
                                    case 60:
                                        Biblia = getString(R.string.isaias60);
                                        break;
                                    case 61:
                                        Biblia = getString(R.string.isaias61);
                                        break;
                                    case 62:
                                        Biblia = getString(R.string.isaias62);
                                        break;
                                    case 63:
                                        Biblia = getString(R.string.isaias63);
                                        break;
                                    case 64:
                                        Biblia = getString(R.string.isaias64);
                                        break;
                                    case 65:
                                        Biblia = getString(R.string.isaias65);
                                        break;
                                    case 66:
                                        Biblia = getString(R.string.isaias66);
                                        break;

                                }
                                styledText = Html.fromHtml(String.valueOf(Biblia), FROM_HTML_MODE_LEGACY);
                                TextoBiblia.setText(styledText);
                                ScrollBiblia.scrollTo(100, 0);
                                break;
                            case "Jeremías":
                                switch (capitulo) {
                                    default:
                                        Biblia = bienvenido;
                                    case 1:
                                        Biblia = getString(R.string.jeremias1);
                                        break;
                                    case 2:
                                        Biblia = getString(R.string.jeremias2);
                                        break;
                                    case 3:
                                        Biblia = getString(R.string.jeremias3);
                                        break;
                                    case 4:
                                        Biblia = getString(R.string.jeremias4);
                                        break;
                                    case 5:
                                        Biblia = getString(R.string.jeremias5);
                                        break;
                                    case 6:
                                        Biblia = getString(R.string.jeremias6);
                                        break;
                                    case 7:
                                        Biblia = getString(R.string.jeremias7);
                                        break;
                                    case 8:
                                        Biblia = getString(R.string.jeremias8);
                                        break;
                                    case 9:
                                        Biblia = getString(R.string.jeremias9);
                                        break;
                                    case 10:
                                        Biblia = getString(R.string.jeremias10);
                                        break;
                                    case 11:
                                        Biblia = getString(R.string.jeremias11);
                                        break;
                                    case 12:
                                        Biblia = getString(R.string.jeremias12);
                                        break;
                                    case 13:
                                        Biblia = getString(R.string.jeremias13);
                                        break;
                                    case 14:
                                        Biblia = getString(R.string.jeremias14);
                                        break;
                                    case 15:
                                        Biblia = getString(R.string.jeremias15);
                                        break;
                                    case 16:
                                        Biblia = getString(R.string.jeremias16);
                                        break;
                                    case 17:
                                        Biblia = getString(R.string.jeremias17);
                                        break;
                                    case 18:
                                        Biblia = getString(R.string.jeremias18);
                                        break;
                                    case 19:
                                        Biblia = getString(R.string.jeremias19);
                                        break;
                                    case 20:
                                        Biblia = getString(R.string.jeremias20);
                                        break;
                                    case 21:
                                        Biblia = getString(R.string.jeremias21);
                                        break;
                                    case 22:
                                        Biblia = getString(R.string.jeremias22);
                                        break;
                                    case 23:
                                        Biblia = getString(R.string.jeremias23);
                                        break;
                                    case 24:
                                        Biblia = getString(R.string.jeremias24);
                                        break;
                                    case 25:
                                        Biblia = getString(R.string.jeremias25);
                                        break;
                                    case 26:
                                        Biblia = getString(R.string.jeremias26);
                                        break;
                                    case 27:
                                        Biblia = getString(R.string.jeremias27);
                                        break;
                                    case 28:
                                        Biblia = getString(R.string.jeremias28);
                                        break;
                                    case 29:
                                        Biblia = getString(R.string.jeremias29);
                                        break;
                                    case 30:
                                        Biblia = getString(R.string.jeremias30);
                                        break;
                                    case 31:
                                        Biblia = getString(R.string.jeremias31);
                                        break;
                                    case 32:
                                        Biblia = getString(R.string.jeremias32);
                                        break;
                                    case 33:
                                        Biblia = getString(R.string.jeremias33);
                                        break;
                                    case 34:
                                        Biblia = getString(R.string.jeremias34);
                                        break;
                                    case 35:
                                        Biblia = getString(R.string.jeremias35);
                                        break;
                                    case 36:
                                        Biblia = getString(R.string.jeremias36);
                                        break;
                                    case 37:
                                        Biblia = getString(R.string.jeremias37);
                                        break;
                                    case 38:
                                        Biblia = getString(R.string.jeremias38);
                                        break;
                                    case 39:
                                        Biblia = getString(R.string.jeremias39);
                                        break;
                                    case 40:
                                        Biblia = getString(R.string.jeremias40);
                                        break;
                                    case 41:
                                        Biblia = getString(R.string.jeremias41);
                                        break;
                                    case 42:
                                        Biblia = getString(R.string.jeremias42);
                                        break;
                                    case 43:
                                        Biblia = getString(R.string.jeremias43);
                                        break;
                                    case 44:
                                        Biblia = getString(R.string.jeremias44);
                                        break;
                                    case 45:
                                        Biblia = getString(R.string.jeremias45);
                                        break;
                                    case 46:
                                        Biblia = getString(R.string.jeremias46);
                                        break;
                                    case 47:
                                        Biblia = getString(R.string.jeremias47);
                                        break;
                                    case 48:
                                        Biblia = getString(R.string.jeremias48);
                                        break;
                                    case 49:
                                        Biblia = getString(R.string.jeremias49);
                                        break;
                                    case 50:
                                        Biblia = getString(R.string.jeremias50);
                                        break;
                                    case 51:
                                        Biblia = getString(R.string.jeremias51);
                                        break;
                                    case 52:
                                        Biblia = getString(R.string.jeremias52);
                                        break;
                                }
                                styledText = Html.fromHtml(String.valueOf(Biblia), FROM_HTML_MODE_LEGACY);
                                TextoBiblia.setText(styledText);
                                ScrollBiblia.scrollTo(100, 0);
                                break;
                            case "Lamentaciones":
                                switch (capitulo) {
                                    default:
                                        Biblia = bienvenido;
                                    case 1:
                                        Biblia = getString(R.string.lamentaciones1);
                                        break;
                                    case 2:
                                        Biblia = getString(R.string.lamentaciones2);
                                        break;
                                    case 3:
                                        Biblia = getString(R.string.lamentaciones3);
                                        break;
                                    case 4:
                                        Biblia = getString(R.string.lamentaciones4);
                                        break;
                                    case 5:
                                        Biblia = getString(R.string.lamentaciones5);
                                        break;
                                }
                                styledText = Html.fromHtml(String.valueOf(Biblia), FROM_HTML_MODE_LEGACY);
                                TextoBiblia.setText(styledText);
                                ScrollBiblia.scrollTo(100, 0);
                                break;
                            case "Ezequiel":
                                switch (capitulo) {
                                    default:
                                        Biblia = bienvenido;
                                    case 1:
                                        Biblia = getString(R.string.ezequiel1);
                                        break;
                                    case 2:
                                        Biblia = getString(R.string.ezequiel2);
                                        break;
                                    case 3:
                                        Biblia = getString(R.string.ezequiel3);
                                        break;
                                    case 4:
                                        Biblia = getString(R.string.ezequiel4);
                                        break;
                                    case 5:
                                        Biblia = getString(R.string.ezequiel5);
                                        break;
                                    case 6:
                                        Biblia = getString(R.string.ezequiel6);
                                        break;
                                    case 7:
                                        Biblia = getString(R.string.ezequiel7);
                                        break;
                                    case 8:
                                        Biblia = getString(R.string.ezequiel8);
                                        break;
                                    case 9:
                                        Biblia = getString(R.string.ezequiel9);
                                        break;
                                    case 10:
                                        Biblia = getString(R.string.ezequiel10);
                                        break;
                                    case 11:
                                        Biblia = getString(R.string.ezequiel11);
                                        break;
                                    case 12:
                                        Biblia = getString(R.string.ezequiel12);
                                        break;
                                    case 13:
                                        Biblia = getString(R.string.ezequiel13);
                                        break;
                                    case 14:
                                        Biblia = getString(R.string.ezequiel14);
                                        break;
                                    case 15:
                                        Biblia = getString(R.string.ezequiel15);
                                        break;
                                    case 16:
                                        Biblia = getString(R.string.ezequiel16);
                                        break;
                                    case 17:
                                        Biblia = getString(R.string.ezequiel17);
                                        break;
                                    case 18:
                                        Biblia = getString(R.string.ezequiel18);
                                        break;
                                    case 19:
                                        Biblia = getString(R.string.ezequiel19);
                                        break;
                                    case 20:
                                        Biblia = getString(R.string.ezequiel20);
                                        break;
                                    case 21:
                                        Biblia = getString(R.string.ezequiel21);
                                        break;
                                    case 22:
                                        Biblia = getString(R.string.ezequiel22);
                                        break;
                                    case 23:
                                        Biblia = getString(R.string.ezequiel23);
                                        break;
                                    case 24:
                                        Biblia = getString(R.string.ezequiel24);
                                        break;
                                    case 25:
                                        Biblia = getString(R.string.ezequiel25);
                                        break;
                                    case 26:
                                        Biblia = getString(R.string.ezequiel26);
                                        break;
                                    case 27:
                                        Biblia = getString(R.string.ezequiel27);
                                        break;
                                    case 28:
                                        Biblia = getString(R.string.ezequiel28);
                                        break;
                                    case 29:
                                        Biblia = getString(R.string.ezequiel29);
                                        break;
                                    case 30:
                                        Biblia = getString(R.string.ezequiel30);
                                        break;
                                    case 31:
                                        Biblia = getString(R.string.ezequiel31);
                                        break;
                                    case 32:
                                        Biblia = getString(R.string.ezequiel32);
                                        break;
                                    case 33:
                                        Biblia = getString(R.string.ezequiel33);
                                        break;
                                    case 34:
                                        Biblia = getString(R.string.ezequiel34);
                                        break;
                                    case 35:
                                        Biblia = getString(R.string.ezequiel35);
                                        break;
                                    case 36:
                                        Biblia = getString(R.string.ezequiel36);
                                        break;
                                    case 37:
                                        Biblia = getString(R.string.ezequiel37);
                                        break;
                                    case 38:
                                        Biblia = getString(R.string.ezequiel38);
                                        break;
                                    case 39:
                                        Biblia = getString(R.string.ezequiel39);
                                        break;
                                    case 40:
                                        Biblia = getString(R.string.ezequiel40);
                                        break;
                                    case 41:
                                        Biblia = getString(R.string.ezequiel41);
                                        break;
                                    case 42:
                                        Biblia = getString(R.string.ezequiel42);
                                        break;
                                    case 43:
                                        Biblia = getString(R.string.ezequiel43);
                                        break;
                                    case 44:
                                        Biblia = getString(R.string.ezequiel44);
                                        break;
                                    case 45:
                                        Biblia = getString(R.string.ezequiel45);
                                        break;
                                    case 46:
                                        Biblia = getString(R.string.ezequiel46);
                                        break;
                                    case 47:
                                        Biblia = getString(R.string.ezequiel47);
                                        break;
                                    case 48:
                                        Biblia = getString(R.string.ezequiel48);
                                        break;
                                }
                                styledText = Html.fromHtml(String.valueOf(Biblia), FROM_HTML_MODE_LEGACY);
                                TextoBiblia.setText(styledText);
                                ScrollBiblia.scrollTo(100, 0);
                                break;
                            case "Daniel":
                                switch (capitulo) {
                                    default:
                                        Biblia = bienvenido;
                                    case 1:
                                        Biblia = getString(R.string.daniel1);
                                        break;
                                    case 2:
                                        Biblia = getString(R.string.daniel2);
                                        break;
                                    case 3:
                                        Biblia = getString(R.string.daniel3);
                                        break;
                                    case 4:
                                        Biblia = getString(R.string.daniel4);
                                        break;
                                    case 5:
                                        Biblia = getString(R.string.daniel5);
                                        break;
                                    case 6:
                                        Biblia = getString(R.string.daniel6);
                                        break;
                                    case 7:
                                        Biblia = getString(R.string.daniel7);
                                        break;
                                    case 8:
                                        Biblia = getString(R.string.daniel8);
                                        break;
                                    case 9:
                                        Biblia = getString(R.string.daniel9);
                                        break;
                                    case 10:
                                        Biblia = getString(R.string.daniel10);
                                        break;
                                    case 11:
                                        Biblia = getString(R.string.daniel11);
                                        break;
                                    case 12:
                                        Biblia = getString(R.string.daniel12);
                                        break;
                                }
                                styledText = Html.fromHtml(String.valueOf(Biblia), FROM_HTML_MODE_LEGACY);
                                TextoBiblia.setText(styledText);
                                ScrollBiblia.scrollTo(100, 0);
                                break;
                            case "Oseas":
                                switch (capitulo) {
                                    default:
                                        Biblia = bienvenido;
                                    case 1:
                                        Biblia = getString(R.string.oseas1);
                                        break;
                                    case 2:
                                        Biblia = getString(R.string.oseas2);
                                        break;
                                    case 3:
                                        Biblia = getString(R.string.oseas3);
                                        break;
                                    case 4:
                                        Biblia = getString(R.string.oseas4);
                                        break;
                                    case 5:
                                        Biblia = getString(R.string.oseas5);
                                        break;
                                    case 6:
                                        Biblia = getString(R.string.oseas6);
                                        break;
                                    case 7:
                                        Biblia = getString(R.string.oseas7);
                                        break;
                                    case 8:
                                        Biblia = getString(R.string.oseas8);
                                        break;
                                    case 9:
                                        Biblia = getString(R.string.oseas9);
                                        break;
                                    case 10:
                                        Biblia = getString(R.string.oseas10);
                                        break;
                                    case 11:
                                        Biblia = getString(R.string.oseas11);
                                        break;
                                    case 12:
                                        Biblia = getString(R.string.oseas12);
                                        break;
                                    case 13:
                                        Biblia = getString(R.string.oseas13);
                                        break;
                                    case 14:
                                        Biblia = getString(R.string.oseas14);
                                        break;
                                }
                                styledText = Html.fromHtml(String.valueOf(Biblia), FROM_HTML_MODE_LEGACY);
                                TextoBiblia.setText(styledText);
                                ScrollBiblia.scrollTo(100, 0);
                                break;
                            case "Joel":
                                switch (capitulo) {
                                    default:
                                        Biblia = bienvenido;
                                    case 1:
                                        Biblia = getString(R.string.joel1);
                                        break;
                                    case 2:
                                        Biblia = getString(R.string.joel2);
                                        break;
                                    case 3:
                                        Biblia = getString(R.string.joel3);
                                        break;
                                }
                                styledText = Html.fromHtml(String.valueOf(Biblia), FROM_HTML_MODE_LEGACY);
                                TextoBiblia.setText(styledText);
                                ScrollBiblia.scrollTo(100, 0);
                                break;
                            case "Amós":
                                switch (capitulo) {
                                    default:
                                        Biblia = bienvenido;
                                    case 1:
                                        Biblia = getString(R.string.amos1);
                                        break;
                                    case 2:
                                        Biblia = getString(R.string.amos2);
                                        break;
                                    case 3:
                                        Biblia = getString(R.string.amos3);
                                        break;
                                    case 4:
                                        Biblia = getString(R.string.amos4);
                                        break;
                                    case 5:
                                        Biblia = getString(R.string.amos5);
                                        break;
                                    case 6:
                                        Biblia = getString(R.string.amos6);
                                        break;
                                    case 7:
                                        Biblia = getString(R.string.amos7);
                                        break;
                                    case 8:
                                        Biblia = getString(R.string.amos8);
                                        break;
                                    case 9:
                                        Biblia = getString(R.string.amos9);
                                        break;
                                }
                                styledText = Html.fromHtml(String.valueOf(Biblia), FROM_HTML_MODE_LEGACY);
                                TextoBiblia.setText(styledText);
                                ScrollBiblia.scrollTo(100, 0);
                                break;
                            case "Abdías":
                                switch (capitulo) {
                                    default:
                                        Biblia = bienvenido;
                                    case 1:
                                        Biblia = getString(R.string.abdias1);
                                        break;
                                }
                                styledText = Html.fromHtml(String.valueOf(Biblia), FROM_HTML_MODE_LEGACY);
                                TextoBiblia.setText(styledText);
                                ScrollBiblia.scrollTo(100, 0);
                                break;
                            case "Jonas":
                                switch (capitulo) {
                                    default:
                                        Biblia = bienvenido;
                                    case 1:
                                        Biblia = getString(R.string.jonas1);
                                        break;
                                    case 2:
                                        Biblia = getString(R.string.jonas2);
                                        break;
                                    case 3:
                                        Biblia = getString(R.string.jonas3);
                                        break;
                                    case 4:
                                        Biblia = getString(R.string.jonas4);
                                        break;
                                }
                                styledText = Html.fromHtml(String.valueOf(Biblia), FROM_HTML_MODE_LEGACY);
                                TextoBiblia.setText(styledText);
                                ScrollBiblia.scrollTo(100, 0);
                                break;
                            case "Miqueas":
                                switch (capitulo) {
                                    default:
                                        Biblia = bienvenido;
                                    case 1:
                                        Biblia = getString(R.string.miqueas1);
                                        break;
                                    case 2:
                                        Biblia = getString(R.string.miqueas2);
                                        break;
                                    case 3:
                                        Biblia = getString(R.string.miqueas3);
                                        break;
                                    case 4:
                                        Biblia = getString(R.string.miqueas4);
                                        break;
                                    case 5:
                                        Biblia = getString(R.string.miqueas5);
                                        break;
                                    case 6:
                                        Biblia = getString(R.string.miqueas6);
                                        break;
                                    case 7:
                                        Biblia = getString(R.string.miqueas7);
                                        break;
                                }
                                styledText = Html.fromHtml(String.valueOf(Biblia), FROM_HTML_MODE_LEGACY);
                                TextoBiblia.setText(styledText);
                                ScrollBiblia.scrollTo(100, 0);
                                break;
                            case "Nahum":
                                switch (capitulo) {
                                    default:
                                        Biblia = bienvenido;
                                    case 1:
                                        Biblia = getString(R.string.nahum1);
                                        break;
                                    case 2:
                                        Biblia = getString(R.string.nahum2);
                                        break;
                                    case 3:
                                        Biblia = getString(R.string.nahum3);
                                        break;
                                }
                                styledText = Html.fromHtml(String.valueOf(Biblia), FROM_HTML_MODE_LEGACY);
                                TextoBiblia.setText(styledText);
                                ScrollBiblia.scrollTo(100, 0);
                                break;
                            case "Habacuc":
                                switch (capitulo) {
                                    default:
                                        Biblia = bienvenido;
                                    case 1:
                                        Biblia = getString(R.string.habacuc1);
                                        break;
                                    case 2:
                                        Biblia = getString(R.string.habacuc2);
                                        break;
                                    case 3:
                                        Biblia = getString(R.string.habacuc3);
                                        break;
                                }
                                styledText = Html.fromHtml(String.valueOf(Biblia), FROM_HTML_MODE_LEGACY);
                                TextoBiblia.setText(styledText);
                                ScrollBiblia.scrollTo(100, 0);
                                break;
                            case "Sofonías":
                                switch (capitulo) {
                                    default:
                                        Biblia = bienvenido;
                                    case 1:
                                        Biblia = getString(R.string.sofonias1);
                                        break;
                                    case 2:
                                        Biblia = getString(R.string.sofonias2);
                                        break;
                                    case 3:
                                        Biblia = getString(R.string.sofonias3);
                                        break;
                                }
                                styledText = Html.fromHtml(String.valueOf(Biblia), FROM_HTML_MODE_LEGACY);
                                TextoBiblia.setText(styledText);
                                ScrollBiblia.scrollTo(100, 0);
                                break;
                            case "Hageo":
                                switch (capitulo) {
                                    default:
                                        Biblia = bienvenido;
                                    case 1:
                                        Biblia = getString(R.string.hageo1);
                                        break;
                                    case 2:
                                        Biblia = getString(R.string.hageo2);
                                        break;
                                }
                                styledText = Html.fromHtml(String.valueOf(Biblia), FROM_HTML_MODE_LEGACY);
                                TextoBiblia.setText(styledText);
                                ScrollBiblia.scrollTo(100, 0);
                                break;
                            case "Zacarías":
                                switch (capitulo) {
                                    default:
                                        Biblia = bienvenido;
                                    case 1:
                                        Biblia = getString(R.string.zacarias1);
                                        break;
                                    case 2:
                                        Biblia = getString(R.string.zacarias2);
                                        break;
                                    case 3:
                                        Biblia = getString(R.string.zacarias3);
                                        break;
                                    case 4:
                                        Biblia = getString(R.string.zacarias4);
                                        break;
                                    case 5:
                                        Biblia = getString(R.string.zacarias5);
                                        break;
                                    case 6:
                                        Biblia = getString(R.string.zacarias6);
                                        break;
                                    case 7:
                                        Biblia = getString(R.string.zacarias7);
                                        break;
                                    case 8:
                                        Biblia = getString(R.string.zacarias8);
                                        break;
                                    case 9:
                                        Biblia = getString(R.string.zacarias9);
                                        break;
                                    case 10:
                                        Biblia = getString(R.string.zacarias10);
                                        break;
                                    case 11:
                                        Biblia = getString(R.string.zacarias11);
                                        break;
                                    case 12:
                                        Biblia = getString(R.string.zacarias12);
                                        break;
                                    case 13:
                                        Biblia = getString(R.string.zacarias13);
                                        break;
                                    case 14:
                                        Biblia = getString(R.string.zacarias14);
                                        break;
                                }
                                styledText = Html.fromHtml(String.valueOf(Biblia), FROM_HTML_MODE_LEGACY);
                                TextoBiblia.setText(styledText);
                                ScrollBiblia.scrollTo(100, 0);
                                break;
                            case "Malaquías":
                                switch (capitulo) {
                                    default:
                                        Biblia = bienvenido;
                                    case 1:
                                        Biblia = getString(R.string.malaquias1);
                                        break;
                                    case 2:
                                        Biblia = getString(R.string.malaquias2);
                                        break;
                                    case 3:
                                        Biblia = getString(R.string.malaquias3);
                                        break;
                                    case 4:
                                        Biblia = getString(R.string.malaquias4);
                                        break;
                                }
                                styledText = Html.fromHtml(String.valueOf(Biblia), FROM_HTML_MODE_LEGACY);
                                TextoBiblia.setText(styledText);
                                ScrollBiblia.scrollTo(100, 0);
                                break;
                            case "Mateo":
                                switch (capitulo) {
                                    default:
                                        Biblia = bienvenido;
                                    case 1:
                                        Biblia = getString(R.string.mateo1);
                                        break;
                                    case 2:
                                        Biblia = getString(R.string.mateo2);
                                        break;
                                    case 3:
                                        Biblia = getString(R.string.mateo3);
                                        break;
                                    case 4:
                                        Biblia = getString(R.string.mateo4);
                                        break;
                                    case 5:
                                        Biblia = getString(R.string.mateo5);
                                        break;
                                    case 6:
                                        Biblia = getString(R.string.mateo6);
                                        break;
                                    case 7:
                                        Biblia = getString(R.string.mateo7);
                                        break;
                                    case 8:
                                        Biblia = getString(R.string.mateo8);
                                        break;
                                    case 9:
                                        Biblia = getString(R.string.mateo9);
                                        break;
                                    case 10:
                                        Biblia = getString(R.string.mateo10);
                                        break;
                                    case 11:
                                        Biblia = getString(R.string.mateo11);
                                        break;
                                    case 12:
                                        Biblia = getString(R.string.mateo12);
                                        break;
                                    case 13:
                                        Biblia = getString(R.string.mateo13);
                                        break;
                                    case 14:
                                        Biblia = getString(R.string.mateo14);
                                        break;
                                    case 15:
                                        Biblia = getString(R.string.mateo15);
                                        break;
                                    case 16:
                                        Biblia = getString(R.string.mateo16);
                                        break;
                                    case 17:
                                        Biblia = getString(R.string.mateo17);
                                        break;
                                    case 18:
                                        Biblia = getString(R.string.mateo18);
                                        break;
                                    case 19:
                                        Biblia = getString(R.string.mateo19);
                                        break;
                                    case 20:
                                        Biblia = getString(R.string.mateo20);
                                        break;
                                    case 21:
                                        Biblia = getString(R.string.mateo21);
                                        break;
                                    case 22:
                                        Biblia = getString(R.string.mateo22);
                                        break;
                                    case 23:
                                        Biblia = getString(R.string.mateo23);
                                        break;
                                    case 24:
                                        Biblia = getString(R.string.mateo24);
                                        break;
                                    case 25:
                                        Biblia = getString(R.string.mateo25);
                                        break;
                                    case 26:
                                        Biblia = getString(R.string.mateo26);
                                        break;
                                    case 27:
                                        Biblia = getString(R.string.mateo27);
                                        break;
                                    case 28:
                                        Biblia = getString(R.string.mateo28);
                                        break;
                                }
                                styledText = Html.fromHtml(String.valueOf(Biblia), FROM_HTML_MODE_LEGACY);
                                TextoBiblia.setText(styledText);
                                ScrollBiblia.scrollTo(100, 0);
                                break;
                            case "Marcos":
                                switch (capitulo) {
                                    default:
                                        Biblia = bienvenido;
                                    case 1:
                                        Biblia = getString(R.string.marcos1);
                                        break;
                                    case 2:
                                        Biblia = getString(R.string.marcos2);
                                        break;
                                    case 3:
                                        Biblia = getString(R.string.marcos3);
                                        break;
                                    case 4:
                                        Biblia = getString(R.string.marcos4);
                                        break;
                                    case 5:
                                        Biblia = getString(R.string.marcos5);
                                        break;
                                    case 6:
                                        Biblia = getString(R.string.marcos6);
                                        break;
                                    case 7:
                                        Biblia = getString(R.string.marcos7);
                                        break;
                                    case 8:
                                        Biblia = getString(R.string.marcos8);
                                        break;
                                    case 9:
                                        Biblia = getString(R.string.marcos9);
                                        break;
                                    case 10:
                                        Biblia = getString(R.string.marcos10);
                                        break;
                                    case 11:
                                        Biblia = getString(R.string.marcos11);
                                        break;
                                    case 12:
                                        Biblia = getString(R.string.marcos12);
                                        break;
                                    case 13:
                                        Biblia = getString(R.string.marcos13);
                                        break;
                                    case 14:
                                        Biblia = getString(R.string.marcos14);
                                        break;
                                    case 15:
                                        Biblia = getString(R.string.marcos15);
                                        break;
                                    case 16:
                                        Biblia = getString(R.string.marcos16);
                                        break;
                                }
                                styledText = Html.fromHtml(String.valueOf(Biblia), FROM_HTML_MODE_LEGACY);
                                TextoBiblia.setText(styledText);
                                ScrollBiblia.scrollTo(100, 0);
                                break;
                            case "Lucas":
                                switch (capitulo) {
                                    default:
                                        Biblia = bienvenido;
                                    case 1:
                                        Biblia = getString(R.string.lucas1);
                                        break;
                                    case 2:
                                        Biblia = getString(R.string.lucas2);
                                        break;
                                    case 3:
                                        Biblia = getString(R.string.lucas3);
                                        break;
                                    case 4:
                                        Biblia = getString(R.string.lucas4);
                                        break;
                                    case 5:
                                        Biblia = getString(R.string.lucas5);
                                        break;
                                    case 6:
                                        Biblia = getString(R.string.lucas6);
                                        break;
                                    case 7:
                                        Biblia = getString(R.string.lucas7);
                                        break;
                                    case 8:
                                        Biblia = getString(R.string.lucas8);
                                        break;
                                    case 9:
                                        Biblia = getString(R.string.lucas9);
                                        break;
                                    case 10:
                                        Biblia = getString(R.string.lucas10);
                                        break;
                                    case 11:
                                        Biblia = getString(R.string.lucas11);
                                        break;
                                    case 12:
                                        Biblia = getString(R.string.lucas12);
                                        break;
                                    case 13:
                                        Biblia = getString(R.string.lucas13);
                                        break;
                                    case 14:
                                        Biblia = getString(R.string.lucas14);
                                        break;
                                    case 15:
                                        Biblia = getString(R.string.lucas15);
                                        break;
                                    case 16:
                                        Biblia = getString(R.string.lucas16);
                                        break;
                                    case 17:
                                        Biblia = getString(R.string.lucas17);
                                        break;
                                    case 18:
                                        Biblia = getString(R.string.lucas18);
                                        break;
                                    case 19:
                                        Biblia = getString(R.string.lucas19);
                                        break;
                                    case 20:
                                        Biblia = getString(R.string.lucas20);
                                        break;
                                    case 21:
                                        Biblia = getString(R.string.lucas21);
                                        break;
                                    case 22:
                                        Biblia = getString(R.string.lucas22);
                                        break;
                                    case 23:
                                        Biblia = getString(R.string.lucas23);
                                        break;
                                    case 24:
                                        Biblia = getString(R.string.lucas24);
                                        break;
                                }
                                styledText = Html.fromHtml(String.valueOf(Biblia), FROM_HTML_MODE_LEGACY);
                                TextoBiblia.setText(styledText);
                                ScrollBiblia.scrollTo(100, 0);
                                break;
                            case "Juan":
                                switch (capitulo) {
                                    default:
                                        Biblia = bienvenido;
                                    case 1:
                                        Biblia = getString(R.string.juan1);
                                        break;
                                    case 2:
                                        Biblia = getString(R.string.juan2);
                                        break;
                                    case 3:
                                        Biblia = getString(R.string.juan3);
                                        break;
                                    case 4:
                                        Biblia = getString(R.string.juan4);
                                        break;
                                    case 5:
                                        Biblia = getString(R.string.juan5);
                                        break;
                                    case 6:
                                        Biblia = getString(R.string.juan6);
                                        break;
                                    case 7:
                                        Biblia = getString(R.string.juan7);
                                        break;
                                    case 8:
                                        Biblia = getString(R.string.juan8);
                                        break;
                                    case 9:
                                        Biblia = getString(R.string.juan9);
                                        break;
                                    case 10:
                                        Biblia = getString(R.string.juan10);
                                        break;
                                    case 11:
                                        Biblia = getString(R.string.juan11);
                                        break;
                                    case 12:
                                        Biblia = getString(R.string.juan12);
                                        break;
                                    case 13:
                                        Biblia = getString(R.string.juan13);
                                        break;
                                    case 14:
                                        Biblia = getString(R.string.juan14);
                                        break;
                                    case 15:
                                        Biblia = getString(R.string.juan15);
                                        break;
                                    case 16:
                                        Biblia = getString(R.string.juan16);
                                        break;
                                    case 17:
                                        Biblia = getString(R.string.juan17);
                                        break;
                                    case 18:
                                        Biblia = getString(R.string.juan18);
                                        break;
                                    case 19:
                                        Biblia = getString(R.string.juan19);
                                        break;
                                    case 20:
                                        Biblia = getString(R.string.juan20);
                                        break;
                                    case 21:
                                        Biblia = getString(R.string.juan21);
                                        break;
                                }
                                styledText = Html.fromHtml(String.valueOf(Biblia), FROM_HTML_MODE_LEGACY);
                                TextoBiblia.setText(styledText);
                                ScrollBiblia.scrollTo(100, 0);
                                break;
                            case "Hechos":
                                switch (capitulo) {
                                    default:
                                        Biblia = bienvenido;
                                    case 1:
                                        Biblia = getString(R.string.hechos1);
                                        break;
                                    case 2:
                                        Biblia = getString(R.string.hechos2);
                                        break;
                                    case 3:
                                        Biblia = getString(R.string.hechos3);
                                        break;
                                    case 4:
                                        Biblia = getString(R.string.hechos4);
                                        break;
                                    case 5:
                                        Biblia = getString(R.string.hechos5);
                                        break;
                                    case 6:
                                        Biblia = getString(R.string.hechos6);
                                        break;
                                    case 7:
                                        Biblia = getString(R.string.hechos7);
                                        break;
                                    case 8:
                                        Biblia = getString(R.string.hechos8);
                                        break;
                                    case 9:
                                        Biblia = getString(R.string.hechos9);
                                        break;
                                    case 10:
                                        Biblia = getString(R.string.hechos10);
                                        break;
                                    case 11:
                                        Biblia = getString(R.string.hechos11);
                                        break;
                                    case 12:
                                        Biblia = getString(R.string.hechos12);
                                        break;
                                    case 13:
                                        Biblia = getString(R.string.hechos13);
                                        break;
                                    case 14:
                                        Biblia = getString(R.string.hechos14);
                                        break;
                                    case 15:
                                        Biblia = getString(R.string.hechos15);
                                        break;
                                    case 16:
                                        Biblia = getString(R.string.hechos16);
                                        break;
                                    case 17:
                                        Biblia = getString(R.string.hechos17);
                                        break;
                                    case 18:
                                        Biblia = getString(R.string.hechos18);
                                        break;
                                    case 19:
                                        Biblia = getString(R.string.hechos19);
                                        break;
                                    case 20:
                                        Biblia = getString(R.string.hechos20);
                                        break;
                                    case 21:
                                        Biblia = getString(R.string.hechos21);
                                        break;
                                    case 22:
                                        Biblia = getString(R.string.hechos22);
                                        break;
                                    case 23:
                                        Biblia = getString(R.string.hechos23);
                                        break;
                                    case 24:
                                        Biblia = getString(R.string.hechos24);
                                        break;
                                    case 25:
                                        Biblia = getString(R.string.hechos25);
                                        break;
                                    case 26:
                                        Biblia = getString(R.string.hechos26);
                                        break;
                                    case 27:
                                        Biblia = getString(R.string.hechos27);
                                        break;
                                    case 28:
                                        Biblia = getString(R.string.hechos28);
                                        break;
                                }
                                styledText = Html.fromHtml(String.valueOf(Biblia), FROM_HTML_MODE_LEGACY);
                                TextoBiblia.setText(styledText);
                                ScrollBiblia.scrollTo(100, 0);
                                break;
                            case "Romanos":
                                switch (capitulo) {
                                    default:
                                        Biblia = bienvenido;
                                    case 1:
                                        Biblia = getString(R.string.romanos1);
                                        break;
                                    case 2:
                                        Biblia = getString(R.string.romanos2);
                                        break;
                                    case 3:
                                        Biblia = getString(R.string.romanos3);
                                        break;
                                    case 4:
                                        Biblia = getString(R.string.romanos4);
                                        break;
                                    case 5:
                                        Biblia = getString(R.string.romanos5);
                                        break;
                                    case 6:
                                        Biblia = getString(R.string.romanos6);
                                        break;
                                    case 7:
                                        Biblia = getString(R.string.romanos7);
                                        break;
                                    case 8:
                                        Biblia = getString(R.string.romanos8);
                                        break;
                                    case 9:
                                        Biblia = getString(R.string.romanos9);
                                        break;
                                    case 10:
                                        Biblia = getString(R.string.romanos10);
                                        break;
                                    case 11:
                                        Biblia = getString(R.string.romanos11);
                                        break;
                                    case 12:
                                        Biblia = getString(R.string.romanos12);
                                        break;
                                    case 13:
                                        Biblia = getString(R.string.romanos13);
                                        break;
                                    case 14:
                                        Biblia = getString(R.string.romanos14);
                                        break;
                                    case 15:
                                        Biblia = getString(R.string.romanos15);
                                        break;
                                    case 16:
                                        Biblia = getString(R.string.romanos16);
                                        break;
                                }
                                styledText = Html.fromHtml(String.valueOf(Biblia), FROM_HTML_MODE_LEGACY);
                                TextoBiblia.setText(styledText);
                                ScrollBiblia.scrollTo(100, 0);
                                break;
                            case "1° de Corintios":
                                switch (capitulo) {
                                    default:
                                        Biblia = bienvenido;
                                    case 1:
                                        Biblia = getString(R.string.primeraCorintios1);
                                        break;
                                    case 2:
                                        Biblia = getString(R.string.primeraCorintios2);
                                        break;
                                    case 3:
                                        Biblia = getString(R.string.primeraCorintios3);
                                        break;
                                    case 4:
                                        Biblia = getString(R.string.primeraCorintios4);
                                        break;
                                    case 5:
                                        Biblia = getString(R.string.primeraCorintios5);
                                        break;
                                    case 6:
                                        Biblia = getString(R.string.primeraCorintios6);
                                        break;
                                    case 7:
                                        Biblia = getString(R.string.primeraCorintios7);
                                        break;
                                    case 8:
                                        Biblia = getString(R.string.primeraCorintios8);
                                        break;
                                    case 9:
                                        Biblia = getString(R.string.primeraCorintios9);
                                        break;
                                    case 10:
                                        Biblia = getString(R.string.primeraCorintios10);
                                        break;
                                    case 11:
                                        Biblia = getString(R.string.primeraCorintios11);
                                        break;
                                    case 12:
                                        Biblia = getString(R.string.primeraCorintios12);
                                        break;
                                    case 13:
                                        Biblia = getString(R.string.primeraCorintios13);
                                        break;
                                    case 14:
                                        Biblia = getString(R.string.primeraCorintios14);
                                        break;
                                    case 15:
                                        Biblia = getString(R.string.primeraCorintios15);
                                        break;
                                    case 16:
                                        Biblia = getString(R.string.primeraCorintios16);
                                        break;
                                }
                                styledText = Html.fromHtml(String.valueOf(Biblia), FROM_HTML_MODE_LEGACY);
                                TextoBiblia.setText(styledText);
                                ScrollBiblia.scrollTo(100,0);
                                break;
                            case "2° de Corintios":
                                switch (capitulo) {
                                    default:
                                        Biblia = bienvenido;
                                    case 1:
                                        Biblia = getString(R.string.segundaCorintios1);
                                        break;
                                    case 2:
                                        Biblia = getString(R.string.segundaCorintios2);
                                        break;
                                    case 3:
                                        Biblia = getString(R.string.segundaCorintios3);
                                        break;
                                    case 4:
                                        Biblia = getString(R.string.segundaCorintios4);
                                        break;
                                    case 5:
                                        Biblia = getString(R.string.segundaCorintios5);
                                        break;
                                    case 6:
                                        Biblia = getString(R.string.segundaCorintios6);
                                        break;
                                    case 7:
                                        Biblia = getString(R.string.segundaCorintios7);
                                        break;
                                    case 8:
                                        Biblia = getString(R.string.segundaCorintios8);
                                        break;
                                    case 9:
                                        Biblia = getString(R.string.segundaCorintios9);
                                        break;
                                    case 10:
                                        Biblia = getString(R.string.segundaCorintios10);
                                        break;
                                    case 11:
                                        Biblia = getString(R.string.segundaCorintios11);
                                        break;
                                    case 12:
                                        Biblia = getString(R.string.segundaCorintios12);
                                        break;
                                    case 13:
                                        Biblia = getString(R.string.segundaCorintios13);
                                        break;
                                }
                                styledText = Html.fromHtml(String.valueOf(Biblia), FROM_HTML_MODE_LEGACY);
                                TextoBiblia.setText(styledText);
                                ScrollBiblia.scrollTo(100,0);
                                break;
                            case "Gálatas":
                                switch (capitulo) {
                                    default:
                                        Biblia = bienvenido;
                                    case 1:
                                        Biblia = getString(R.string.galatas1);
                                        break;
                                    case 2:
                                        Biblia = getString(R.string.galatas2);
                                        break;
                                    case 3:
                                        Biblia = getString(R.string.galatas3);
                                        break;
                                    case 4:
                                        Biblia = getString(R.string.galatas4);
                                        break;
                                    case 5:
                                        Biblia = getString(R.string.galatas5);
                                        break;
                                    case 6:
                                        Biblia = getString(R.string.galatas6);
                                        break;
                                }
                                styledText = Html.fromHtml(String.valueOf(Biblia), FROM_HTML_MODE_LEGACY);
                                TextoBiblia.setText(styledText);
                                ScrollBiblia.scrollTo(100,0);
                                break;
                            case "Efesios":
                                switch (capitulo) {
                                    default:
                                        Biblia = bienvenido;
                                    case 1:
                                        Biblia = getString(R.string.efesios1);
                                        break;
                                    case 2:
                                        Biblia = getString(R.string.efesios2);
                                        break;
                                    case 3:
                                        Biblia = getString(R.string.efesios3);
                                        break;
                                    case 4:
                                        Biblia = getString(R.string.efesios4);
                                        break;
                                    case 5:
                                        Biblia = getString(R.string.efesios5);
                                        break;
                                    case 6:
                                        Biblia = getString(R.string.efesios6);
                                        break;
                                }
                                styledText = Html.fromHtml(String.valueOf(Biblia), FROM_HTML_MODE_LEGACY);
                                TextoBiblia.setText(styledText);
                                ScrollBiblia.scrollTo(100,0);
                                break;
                            case "Filipenses":
                                switch (capitulo) {
                                    default:
                                        Biblia = bienvenido;
                                    case 1:
                                        Biblia = getString(R.string.filipenses1);
                                        break;
                                    case 2:
                                        Biblia = getString(R.string.filipenses2);
                                        break;
                                    case 3:
                                        Biblia = getString(R.string.filipenses3);
                                        break;
                                    case 4:
                                        Biblia = getString(R.string.filipenses4);
                                        break;
                                }
                                styledText = Html.fromHtml(String.valueOf(Biblia), FROM_HTML_MODE_LEGACY);
                                TextoBiblia.setText(styledText);
                                ScrollBiblia.scrollTo(100,0);
                                break;
                            case "Colosenses":
                                switch (capitulo) {
                                    default:
                                        Biblia = bienvenido;
                                    case 1:
                                        Biblia = getString(R.string.colosenses1);
                                        break;
                                    case 2:
                                        Biblia = getString(R.string.colosenses2);
                                        break;
                                    case 3:
                                        Biblia = getString(R.string.colosenses3);
                                        break;
                                    case 4:
                                        Biblia = getString(R.string.colosenses4);
                                        break;
                                }
                                styledText = Html.fromHtml(String.valueOf(Biblia), FROM_HTML_MODE_LEGACY);
                                TextoBiblia.setText(styledText);
                                ScrollBiblia.scrollTo(100,0);
                                break;
                            case "1° de Tesalonicenses":
                                switch (capitulo) {
                                    default:
                                        Biblia = bienvenido;
                                    case 1:
                                        Biblia = getString(R.string.primeraTesalonicenses1);
                                        break;
                                    case 2:
                                        Biblia = getString(R.string.primeraTesalonicenses2);
                                        break;
                                    case 3:
                                        Biblia = getString(R.string.primeraTesalonicenses3);
                                        break;
                                    case 4:
                                        Biblia = getString(R.string.primeraTesalonicenses4);
                                        break;
                                    case 5:
                                        Biblia = getString(R.string.primeraTesalonicenses5);
                                        break;

                                }
                                styledText = Html.fromHtml(String.valueOf(Biblia), FROM_HTML_MODE_LEGACY);
                                TextoBiblia.setText(styledText);
                                ScrollBiblia.scrollTo(100,0);
                                break;
                            case "2° de Tesalonicenses":
                                switch (capitulo) {
                                    default:
                                        Biblia = bienvenido;
                                    case 1:
                                        Biblia = getString(R.string.segundaTesalonicenses1);
                                        break;
                                    case 2:
                                        Biblia = getString(R.string.segundaTesalonicenses2);
                                        break;
                                    case 3:
                                        Biblia = getString(R.string.segundaTesalonicenses3);
                                        break;
                                }
                                styledText = Html.fromHtml(String.valueOf(Biblia), FROM_HTML_MODE_LEGACY);
                                TextoBiblia.setText(styledText);
                                ScrollBiblia.scrollTo(100,0);
                                break;
                            case "1° de Timoteo":
                                switch (capitulo) {
                                    default:
                                        Biblia = bienvenido;
                                    case 1:
                                        Biblia = getString(R.string.primeraTimoteo1);
                                        break;
                                    case 2:
                                        Biblia = getString(R.string.primeraTimoteo2);
                                        break;
                                    case 3:
                                        Biblia = getString(R.string.primeraTimoteo3);
                                        break;
                                    case 4:
                                        Biblia = getString(R.string.primeraTimoteo4);
                                        break;
                                    case 5:
                                        Biblia = getString(R.string.primeraTimoteo5);
                                        break;
                                    case 6:
                                        Biblia = getString(R.string.primeraTimoteo6);
                                        break;
                                }
                                styledText = Html.fromHtml(String.valueOf(Biblia), FROM_HTML_MODE_LEGACY);
                                TextoBiblia.setText(styledText);
                                ScrollBiblia.scrollTo(100,0);
                                break;
                            case "2° de Timoteo":
                                switch (capitulo) {
                                    default:
                                        Biblia = bienvenido;
                                    case 1:
                                        Biblia = getString(R.string.segundaTimoteo1);
                                        break;
                                    case 2:
                                        Biblia = getString(R.string.segundaTimoteo2);
                                        break;
                                    case 3:
                                        Biblia = getString(R.string.segundaTimoteo3);
                                        break;
                                    case 4:
                                        Biblia = getString(R.string.segundaTimoteo4);
                                        break;
                                }
                                styledText = Html.fromHtml(String.valueOf(Biblia), FROM_HTML_MODE_LEGACY);
                                TextoBiblia.setText(styledText);
                                ScrollBiblia.scrollTo(100,0);
                                break;
                            case "Tito":
                                switch (capitulo) {
                                    default:
                                        Biblia = bienvenido;
                                    case 1:
                                        Biblia = getString(R.string.tito1);
                                        break;
                                    case 2:
                                        Biblia = getString(R.string.tito2);
                                        break;
                                    case 3:
                                        Biblia = getString(R.string.tito3);
                                        break;
                                }
                                styledText = Html.fromHtml(String.valueOf(Biblia), FROM_HTML_MODE_LEGACY);
                                TextoBiblia.setText(styledText);
                                ScrollBiblia.scrollTo(100,0);
                                break;

                            case "Filemón":
                                switch (capitulo) {
                                    default:
                                        Biblia = bienvenido;
                                    case 1:
                                        Biblia = getString(R.string.filemon1);
                                        break;
                                }
                                styledText = Html.fromHtml(String.valueOf(Biblia), FROM_HTML_MODE_LEGACY);
                                TextoBiblia.setText(styledText);
                                ScrollBiblia.scrollTo(100,0);
                                break;
                            case "Hebreos":
                                switch (capitulo) {
                                    default:
                                        Biblia = bienvenido;
                                    case 1:
                                        Biblia = getString(R.string.hebreos1);
                                        break;
                                    case 2:
                                        Biblia = getString(R.string.hebreos2);
                                        break;
                                    case 3:
                                        Biblia = getString(R.string.hebreos3);
                                        break;
                                    case 4:
                                        Biblia = getString(R.string.hebreos4);
                                        break;
                                    case 5:
                                        Biblia = getString(R.string.hebreos5);
                                        break;
                                    case 6:
                                        Biblia = getString(R.string.hebreos6);
                                        break;
                                    case 7:
                                        Biblia = getString(R.string.hebreos7);
                                        break;
                                    case 8:
                                        Biblia = getString(R.string.hebreos8);
                                        break;
                                    case 9:
                                        Biblia = getString(R.string.hebreos9);
                                        break;
                                    case 10:
                                        Biblia = getString(R.string.hebreos10);
                                        break;
                                    case 11:
                                        Biblia = getString(R.string.hebreos11);
                                        break;
                                    case 12:
                                        Biblia = getString(R.string.hebreos12);
                                        break;
                                    case 13:
                                        Biblia = getString(R.string.hebreos13);
                                        break;
                                }
                                styledText = Html.fromHtml(String.valueOf(Biblia), FROM_HTML_MODE_LEGACY);
                                TextoBiblia.setText(styledText);
                                ScrollBiblia.scrollTo(100,0);
                                break;
                            case "Santiago":
                                switch (capitulo) {
                                    default:
                                        Biblia = bienvenido;
                                    case 1:
                                        Biblia = getString(R.string.santiago1);
                                        break;
                                    case 2:
                                        Biblia = getString(R.string.santiago2);
                                        break;
                                    case 3:
                                        Biblia = getString(R.string.santiago3);
                                        break;
                                    case 4:
                                        Biblia = getString(R.string.santiago4);
                                        break;
                                    case 5:
                                        Biblia = getString(R.string.santiago5);
                                        break;

                                }
                                styledText = Html.fromHtml(String.valueOf(Biblia), FROM_HTML_MODE_LEGACY);
                                TextoBiblia.setText(styledText);
                                ScrollBiblia.scrollTo(100,0);
                                break;
                            case "1° de Pedro":
                                switch (capitulo) {
                                    default:
                                        Biblia = bienvenido;
                                    case 1:
                                        Biblia = getString(R.string.primeraPedro1);
                                        break;
                                    case 2:
                                        Biblia = getString(R.string.primeraPedro2);
                                        break;
                                    case 3:
                                        Biblia = getString(R.string.primeraPedro3);
                                        break;
                                    case 4:
                                        Biblia = getString(R.string.primeraPedro4);
                                        break;
                                    case 5:
                                        Biblia = getString(R.string.primeraPedro5);
                                        break;
                                }
                                styledText = Html.fromHtml(String.valueOf(Biblia), FROM_HTML_MODE_LEGACY);
                                TextoBiblia.setText(styledText);
                                ScrollBiblia.scrollTo(100,0);
                                break;
                            case "2° de Pedro":
                                switch (capitulo) {
                                    default:
                                        Biblia = bienvenido;
                                    case 1:
                                        Biblia = getString(R.string.segundaPedro1);
                                        break;
                                    case 2:
                                        Biblia = getString(R.string.segundaPedro2);
                                        break;
                                    case 3:
                                        Biblia = getString(R.string.segundaPedro3);
                                        break;
                                }
                                styledText = Html.fromHtml(String.valueOf(Biblia), FROM_HTML_MODE_LEGACY);
                                TextoBiblia.setText(styledText);
                                ScrollBiblia.scrollTo(100,0);
                                break;
                            case "1° de Juan":
                                switch (capitulo) {
                                    default:
                                        Biblia = bienvenido;
                                    case 1:
                                        Biblia = getString(R.string.primeraJuan1);
                                        break;
                                    case 2:
                                        Biblia = getString(R.string.primeraJuan2);
                                        break;
                                    case 3:
                                        Biblia = getString(R.string.primeraJuan3);
                                        break;
                                    case 4:
                                        Biblia = getString(R.string.primeraJuan4);
                                        break;
                                    case 5:
                                        Biblia = getString(R.string.primeraJuan5);
                                        break;
                                }
                                styledText = Html.fromHtml(String.valueOf(Biblia), FROM_HTML_MODE_LEGACY);
                                TextoBiblia.setText(styledText);
                                ScrollBiblia.scrollTo(100,0);
                                break;
                            case "2° de Juan":
                                switch (capitulo) {
                                    default:
                                        Biblia = bienvenido;
                                    case 1:
                                        Biblia = getString(R.string.segundaJuan1);
                                        break;
                                }
                                styledText = Html.fromHtml(String.valueOf(Biblia), FROM_HTML_MODE_LEGACY);
                                TextoBiblia.setText(styledText);
                                ScrollBiblia.scrollTo(100,0);
                                break;
                            case "3° de Juan":
                                switch (capitulo) {
                                    default:
                                        Biblia = bienvenido;
                                    case 1:
                                        Biblia = getString(R.string.terceraJuan1);
                                        break;
                                }
                                styledText = Html.fromHtml(String.valueOf(Biblia), FROM_HTML_MODE_LEGACY);
                                TextoBiblia.setText(styledText);
                                ScrollBiblia.scrollTo(100,0);
                                break;
                            case "Judas":
                                switch (capitulo) {
                                    default:
                                        Biblia = bienvenido;
                                    case 1:
                                        Biblia = getString(R.string.judas1);
                                        break;
                                }
                                styledText = Html.fromHtml(String.valueOf(Biblia), FROM_HTML_MODE_LEGACY);
                                TextoBiblia.setText(styledText);
                                ScrollBiblia.scrollTo(100,0);
                                break;
                            case "Apocalipsis":
                                switch(capitulo){
                                    default:
                                        Biblia = bienvenido;
                                    case 1:
                                        Biblia = getString(R.string.apocalipsis1);
                                        break;
                                    case 2:
                                        Biblia = getString(R.string.apocalipsis2);
                                        break;
                                    case 3:
                                        Biblia = getString(R.string.apocalipsis3);
                                        break;
                                    case 4:
                                        Biblia = getString(R.string.apocalipsis4);
                                        break;
                                    case 5:
                                        Biblia = getString(R.string.apocalipsis5);
                                        break;
                                    case 6:
                                        Biblia = getString(R.string.apocalipsis6);
                                        break;
                                    case 7:
                                        Biblia = getString(R.string.apocalipsis7);
                                        break;
                                    case 8:
                                        Biblia = getString(R.string.apocalipsis8);
                                        break;
                                    case 9:
                                        Biblia = getString(R.string.apocalipsis9);
                                        break;
                                    case 10:
                                        Biblia = getString(R.string.apocalipsis10);
                                        break;
                                    case 11:
                                        Biblia = getString(R.string.apocalipsis11);
                                        break;
                                    case 12:
                                        Biblia = getString(R.string.apocalipsis12);
                                        break;
                                    case 13:
                                        Biblia = getString(R.string.apocalipsis13);
                                        break;
                                    case 14:
                                        Biblia = getString(R.string.apocalipsis14);
                                        break;
                                    case 15:
                                        Biblia = getString(R.string.apocalipsis15);
                                        break;
                                    case 16:
                                        Biblia = getString(R.string.apocalipsis16);
                                        break;
                                    case 17:
                                        Biblia = getString(R.string.apocalipsis17);
                                        break;
                                    case 18:
                                        Biblia = getString(R.string.apocalipsis18);
                                        break;
                                    case 19:
                                        Biblia = getString(R.string.apocalipsis19);
                                        break;
                                    case 20:
                                        Biblia = getString(R.string.apocalipsis20);
                                        break;
                                    case 21:
                                        Biblia = getString(R.string.apocalipsis21);
                                        break;
                                    case 22:
                                        Biblia = getString(R.string.apocalipsis22);
                                        break;
                                }
                                styledText = Html.fromHtml(String.valueOf(Biblia), FROM_HTML_MODE_LEGACY);
                                TextoBiblia.setText(styledText);
                                ScrollBiblia.scrollTo(100,0);
                                break;
                        }

                    }

                    @Override
                    public void onNothingSelected (AdapterView < ? > parent){

                    }
                });
            }

            @Override
            public void onNothingSelected (AdapterView < ? > parent){

            }
        });

    }
}