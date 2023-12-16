package edu.cotarelo.dao.objects;

import java.util.ArrayList;
import java.util.Hashtable;

import javax.naming.NamingException;

import edu.cotarelo.domain.Club;
import edu.cotarelo.domain.Partido;
import java.util.List;

public interface PartidoDAO {
    public int insertar(Partido partido) throws NamingException;
    public Partido getPartidoById(String IdClub1, String IdClub2) throws NamingException;
    public boolean estaPartidoEnBBDD(Partido user);
    public boolean estaClubEnPartido(Club club);
    public int borrar(Partido partido) throws NamingException;
    public int modificar(Partido partido, Partido nuevopartido) throws NamingException;
    public ArrayList<Partido> getlistaPartidos();
    public Hashtable<Integer, String> getlistaPartidosSelect();

    // ====================================================================
    // ====================== by Borja Gallego ============================
    // ====================================================================
    
    public List<Partido> listar() throws Exception;
    public void eliminar(int idPartido) throws Exception;
}
