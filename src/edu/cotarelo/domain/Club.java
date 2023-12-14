package edu.cotarelo.domain;

/**
 * La clase Club representa un club con atributos como nombre, descripción, campo y un identificador único.
 */
public class Club {
    
    /** El nombre del club. */
    private String nombre;
    
    /** La descripción del club. */
    private String descripcion;
    
    /** El campo asociado al club. */
    private String campo;
    
    /** El identificador único del club. */
    private String IdClub;

    /**
     * Obtiene la descripción del club.
     * @return La descripción del club.
     */
    public String getDescripcion() {
        return descripcion;
    }

    /**
     * Constructor de la clase Club.
     * @param paramNombre El nombre del club.
     * @param paramDescripcion La descripción del club.
     * @param paramCampo El campo asociado al club.
     */
    public Club(String paramNombre, String paramDescripcion, String paramCampo) {
        super();
        this.nombre = paramNombre;
        this.descripcion = paramDescripcion;
        this.campo = paramCampo;
    }

    /**
     * Establece la descripción del club.
     * @param descripcion La nueva descripción del club.
     */
    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    /**
     * Obtiene el campo asociado al club.
     * @return El campo asociado al club.
     */
    public String getCampo() {
        return campo;
    }

    /**
     * Establece el campo asociado al club.
     * @param campo El nuevo campo asociado al club.
     */
    public void setCampo(String campo) {
        this.campo = campo;
    }

    /**
     * Constructor sin parámetros de la clase Club.
     */
    public Club() {
        super();
    }

    /**
     * Constructor de la clase Club con el nombre del club.
     * @param nombre El nombre del club.
     */
    public Club(String nombre) {
        // el id es un autonumérico
        super();
        this.nombre = nombre;
    }

    /**
     * Obtiene el nombre del club.
     * @return El nombre del club.
     */
    public String getNombre() {
        return this.nombre;
    }

    /**
     * Establece el nombre del club.
     * @param nombre El nuevo nombre del club.
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * Obtiene el identificador único del club.
     * @return El identificador único del club.
     */
    public String getIdClub() {
        return this.IdClub;
    }

    /**
     * Establece el identificador único del club.
     * @param idClub El nuevo identificador único del club.
     */
    public void setIdClub(String idClub) {
        this.IdClub = idClub;
    }
}
