public class CursoDocente
{
    private int id;
    private Curso curso[];
    private  int indiceCurso;
    private Docente docente[];
    private int indiceDocente;

    //constructor
    CursoDocente(int sizeCurso, int sizeDocente)
    {
        this.curso = new Curso[sizeCurso];
        this.indiceCurso = 0
        ;
        this.docente = new Docente[sizeDocente];
        this.indiceDocente = 0;
    }

    public CursoDocente()
    {
    }

    public void agregarCurso(Curso curso)
    {
        this.curso[this.indiceCurso] = curso;
        this.indiceCurso++;
    }
    public void mostrarCurso()
    {
        for (int i=0; i<this.curso.length; i++)
        {

            System.out.println(this.curso[i].getId()+" "+this.curso[i].getNombre()+" "+this.curso[i].getCredito());
        }
    }

    public void agregarDocente(Docente docente)
    {
        this.docente[this.indiceDocente] = docente;
        this.indiceDocente++;
    }
    public void mostrarDocente()
    {
        for (int i=0; i<this.docente.length; i++)
        {
            System.out.println(this.docente[i].getId()+" "+this.docente[i].getId()+" "+this.docente[i].getNombres()+""+this.docente[i].getApellidos()+""+this.docente[i].getCarrera());
        }
    }
    public void eliminarCurso()
    {
    }
}
