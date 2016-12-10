package com.example.cresh.practica3.pojo;

/**
 * Created by Cresh on 09/12/2016.
 */

public final class UserData {
    private final String valido;
    public final long id;
    private final String nombre_completo;
    private final String rol;
    private final User user;

    public UserData(String valido, long id, String nombre_completo, String rol, User user){
        this.valido = valido;
        this.id = id;
        this.nombre_completo = nombre_completo;
        this.rol = rol;
        this.user = user;
    }

    public String getValido() {
        return valido;
    }

    public static final class User {
        public final String first_name;
        public final String last_name;
        public final String email;
        public final String[] roles;
        public final String avatar;

        public User(String first_name, String last_name, String email, String[] roles, String avatar){
            this.first_name = first_name;
            this.last_name = last_name;
            this.email = email;
            this.roles = roles;
            this.avatar = avatar;
        }
    }
}