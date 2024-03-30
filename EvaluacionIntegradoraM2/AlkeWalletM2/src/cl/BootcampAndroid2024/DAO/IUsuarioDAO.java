package cl.BootcampAndroid2024.DAO;

import cl.BootcampAndroid2024.DTO.Usuario;

import java.util.List;

public interface IUsuarioDAO {
    void agregarUsuario(Usuario usuario);
    void actualizarUsuario(Usuario usuario);
    void eliminarUsuario(int id);
    Usuario obtenerUsuario(int id);
    List<Usuario> obtenerTodosUsuarios();
}
