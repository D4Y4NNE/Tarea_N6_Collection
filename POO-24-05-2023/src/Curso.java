public class Curso
{
    private int id;
    private String nombre;
    private String credito;

    //constructor vacio
    private Curso()
    {
    }

    //constructor
    public Curso(int id, String nombre, String credito)
    {
        this.id = id;
        this.nombre = nombre;
        this.credito = credito;

    }

    //getters and setters

    public int getId()
    {
        return id;
    }

    public void setId(int id)
    {
        this.id = id;
    }

    public String getNombre()
    {
        return nombre;
    }

    public void setNombre(String nombre)
    {
        this.nombre = nombre;
    }

    public String getCredito()
    {
        return credito;
    }

    public void setCredito(String credito)
    {
        this.credito = credito;
    }
    public String toString()
    {
        return " CURSO: " + " ID " + getId() + " NOMBRE " + getNombre() + " CREDITO " + getCredito();
    }

}
