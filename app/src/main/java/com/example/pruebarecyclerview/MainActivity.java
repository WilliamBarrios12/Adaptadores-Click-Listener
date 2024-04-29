package com.example.pruebarecyclerview;

import android.os.Bundle;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.example.pruebarecyclerview.adaptadores.UsuarioAdaptador;
import com.example.pruebarecyclerview.clases.Usuario;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    RecyclerView rcv_usuarios;
    List<Usuario> listaUsuarios = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        rcv_usuarios = findViewById(R.id.rcv_usuarios);

        Usuario usu1 = new Usuario("https://www.lahiguera.net/musicalia/artistas/varios/disco/0/tema/30625/adivino-portada.jpg","Adivino","Myke Towers, Bad Bunny");
        Usuario usu2 = new Usuario("https://www.lahiguera.net/musicalia/artistas/varios/disco/13476/saiko_sakura-portada.jpg","Eskeleto","Saiko, Bryant Myers");
        Usuario usu3 = new Usuario("https://images.genius.com/7b8f8f9162a5988815e0a9c66dc426e9.1000x1000x1.png","El Padrino","Feid");
        Usuario usu4 = new Usuario("https://images.genius.com/c426a941cfdc32dbed4f6bc9292bbb0e.1000x1000x1.png","Luces De Colores","Omar Courtz");

        listaUsuarios.add(usu1);
        listaUsuarios.add(usu2);
        listaUsuarios.add(usu3);
        listaUsuarios.add(usu4);


        rcv_usuarios.setLayoutManager(new LinearLayoutManager(this));
        rcv_usuarios.setAdapter(new UsuarioAdaptador(listaUsuarios));


    }
}