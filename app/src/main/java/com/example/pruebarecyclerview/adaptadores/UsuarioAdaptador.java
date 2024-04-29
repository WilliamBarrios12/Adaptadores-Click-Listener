package com.example.pruebarecyclerview.adaptadores;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.pruebarecyclerview.NuevaActividad;
import com.example.pruebarecyclerview.R;
import com.example.pruebarecyclerview.clases.Usuario;
import com.squareup.picasso.Picasso;

import java.util.List;

public class UsuarioAdaptador extends RecyclerView.Adapter<UsuarioAdaptador.ViewHolder> {

    private List<Usuario> datos;

    public UsuarioAdaptador(List<Usuario> datos){
        this.datos = datos;
    }

    @NonNull
    @Override
    public UsuarioAdaptador.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_usuario,parent,false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull UsuarioAdaptador.ViewHolder holder, int position) {
        Usuario dato = datos.get(position);
        holder.bind(dato);

        holder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Context context = holder.itemView.getContext();
                Intent intent = new Intent(context, NuevaActividad.class);
                context.startActivity(intent);
            }
        });
    }

    @Override
    public int getItemCount() {
        return datos.size();
    }

    public static class ViewHolder extends RecyclerView.ViewHolder{
        TextView txt_nombre_cancion, txt_nombre_cantantes;
        ImageView img_usuario;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            txt_nombre_cancion = itemView.findViewById(R.id.txt_nombre_cancion);
            txt_nombre_cantantes = itemView.findViewById(R.id.txt_nombre_cantantes);
            img_usuario = itemView.findViewById(R.id.img_usuario);
        }

        public void bind(Usuario dato){
            txt_nombre_cancion.setText(dato.getNombre());
            txt_nombre_cantantes.setText(dato.getCantantes());
            //imagen libreria
            Picasso.get().load(dato.getPortada()).into(img_usuario);
        }
    }

}
