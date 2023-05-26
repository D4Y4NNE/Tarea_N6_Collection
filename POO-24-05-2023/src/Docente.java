import com.sun.management.UnixOperatingSystemMXBean;

public class Docente
{
    private int id;
    private String nombres;
    private String apellidos;
    private  String carrera;

    //Constructor vacio
    public Docente()
    {
    }

    //constructores
    public Docente(int id, String nombres, String apellidos, String carrera)
    {
        this.id = id;
        this.nombres = nombres;
        this.apellidos = apellidos;
        this.carrera = carrera;
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
    public String getNombres()
    {
        return nombres;
    }
    public void setNombres(String nombres)
    {
        this.nombres = nombres;
    }
    public String getApellidos()
    {
        return  apellidos;
    }
    public void setApellidos(String apellidos)
    {
        this.apellidos = apellidos;
    }
    public String getCarrera()
    {
        return carrera;
    }
    public void setCarrera()
    {
        this.carrera = carrera;
    }
}
