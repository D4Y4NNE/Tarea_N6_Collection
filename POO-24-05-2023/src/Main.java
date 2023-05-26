import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Main
{
    public static void main (String args[])
    {
        //////////////////// ARRAYLIST //////////////////////////////
        //Agregar/guardar cursos
        List<Curso>lista1 = new ArrayList<Curso>()/*los () hacen referencia a que esto es una construccion de un nuevo array */;
        lista1.add(new Curso(23456789, "POO", "4"));
        lista1.add(new Curso(43216554, "FRT", "3"));
        lista1.add(new Curso(68905431, "BDI", "2"));
        lista1.add(new Curso(12142753, "REDES", "1"));

        //-----1ra forma-----Recorrer por el indice
        System.out.println("----------FOR----------");
        for(int i=0; i<lista1.size(); i++)
        {
            System.out.println(" Id: " + lista1.get(i).getId() + " Nombre: " + lista1.get(i).getNombre() + " Credito: "+lista1.get(i).getCredito());
        }

        //-----2da forma-----Recorrido con foreach
        System.out.println("----------FOREACH----------");

        for (Curso curso:lista1)
        {
            System.out.println(" Id: "+curso.getId() + " Nombre: " + curso.getNombre() + " Credito: " + curso.getCredito());
        }

        ////////////////////////LINKEDLIST///////////////////////////////
        //agregar cursos al final de la lista
        List<Curso>lista2 = new LinkedList<Curso>()/*los () hacen referencia a que esto es una construccion de un nuevo array */;
        lista2.add(new Curso(23456789, "POO", "4"));
        lista2.add(new Curso(43216554, "FRT", "3"));
        lista2.add(new Curso(68905431, "BDI", "2"));
        lista2.add(new Curso(43327437, "ARTE", "1"));

        //Agregar en la pocision indicada
        lista2.add(4, new Curso(83982082, "FISICA", "5"));

        //Recorrido con foreach
        System.out.println("----------FOREACH----------");

        for (Curso curso:lista2)
        {
            System.out.println(" Id: "+curso.getId() + " Nombre: " + curso.getNombre() + " Credito: " + curso.getCredito());
        }
        ////////OTRA BASES DE DATOS////////////
        List<Curso> listaArray = new ArrayList<Curso>();
        listaArray.add(new Curso(1,"Poo","1"));
        listaArray.add(new Curso(2,"Base","2"));
        listaArray.add(new Curso(3,"Calculo III","3"));
        listaArray.add(new Curso(4,"Estructura","4"));

        LinkedList<Curso> linkedList = new LinkedList<Curso>();
        linkedList.add(new Curso(1,"Poo","10"));
        linkedList.add(new Curso(2,"Base","20"));
        linkedList.add(new Curso(3,"Calculo III","30"));
        linkedList.add(new Curso(4,"Estructura","40"));
        //Remover en ArrayList
        listaArray.remove(2);

        //Remover en LinkedList
        String nombreBorrar = "Calculo III";
        for(Curso curso2 :linkedList)
        {
            if (curso2.getNombre().equals(nombreBorrar))
            {
                linkedList.remove(curso2);
                break;
            }
        }
        // recordando por foreach
        System.out.println("------------ARRAYLIS---------------");
        for (Curso curso : listaArray)
        {
            System.out.println(" Nombre " + curso.getNombre());
        }
        System.out.println("------------LINKEDLIST---------------");
        for (Curso curso : linkedList)
        {
            System.out.println(" Nombre " + curso.getNombre());
        }
        //Tamaño lista
        System.out.println("-------------TAMAÑO DE LISTA------------");
        System.out.println(" ArrayList: " + listaArray.size());
        System.out.println(" LinkedList: " + listaArray.size());

        //Obtener primer y ultimo objeto:
        System.out.println("-------------PRIMERO Y ULTIMO------------");
        System.out.println(" PRIMER LINKEDLIST: " + linkedList.getFirst().toString());
        System.out.println(" ULTIMO LINKEDLIST: " + linkedList.getLast().toString());


        //Borrar toda la lista
        System.out.println("---------------Borrar lista----------------");
        listaArray.clear();
        linkedList.clear();

        //Comprobar si esta vacia
        System.out.println("-----------Lista vacia------------");
        System.out.println("ArrayList: " + listaArray.isEmpty());
        System.out.println("LinkeList: " + linkedList.isEmpty());
    }
}