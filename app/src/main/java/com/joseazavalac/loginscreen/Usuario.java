package com.joseazavalac.loginscreen;

import android.os.Parcel;
import android.os.Parcelable;

public class Usuario implements Parcelable {
    public String nombre;
    private String telefono;
    private String correo;
    private String contra;


    public Usuario (String nombre, String telefono, String correo, String contra){
        this.nombre = nombre;
        this.telefono = telefono;
        this.correo = correo;
        this.contra = contra;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public String getContra() {
        return contra;
    }

    public void setContra(String contra) {
        this.contra = contra;
    }


    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeString(this.contra);
        dest.writeString(this.telefono);
        dest.writeString(this.correo);
        dest.writeString(this.nombre);
    }

    public void readFromParcel(Parcel source) {
        this.contra = source.readString();
        this.telefono = source.readString();
        this.correo = source.readString();
        this.nombre = source.readString();
    }

    public Usuario() {
    }

    protected Usuario(Parcel in) {
        this.contra = in.readString();
        this.telefono = in.readString();
        this.correo = in.readString();
        this.nombre = in.readString();
    }

    public static final Parcelable.Creator<Usuario> CREATOR = new Parcelable.Creator<Usuario>() {
        @Override
        public Usuario createFromParcel(Parcel source) {
            return new Usuario(source);
        }

        @Override
        public Usuario[] newArray(int size) {
            return new Usuario[size];
        }
    };
}
