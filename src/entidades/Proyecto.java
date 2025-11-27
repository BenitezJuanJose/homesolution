package entidades;

    import java.util.ArrayList;



    public class Proyecto {
        public String titulos[];
        public String descripciones[];
        public double duracion[];
        public String clientes[];
        public String fechaInicio;
        public String fechaFinalizacion;
        public String domicilio;
        public String estado;



        Proyecto(String[] titulos,String[] descripciones,double[] duracion,String domicilio,String[] clientes, String fechaInicio, String fechaFinalizacion){
            this.titulos = titulos;
            this.descripciones = descripciones;
            this.duracion = duracion;
            this.domicilio = domicilio;
            this.clientes = clientes;
            this.fechaInicio = fechaInicio;
            this.fechaFinalizacion = fechaFinalizacion;
            this.estado = "PENDIENTE";

        }
    }