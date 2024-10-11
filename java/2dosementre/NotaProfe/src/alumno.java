/*
Dada una clase curso, que contiene los atributos:
- Nombre
- Nota
- Profesor

El minimo para aprobar el curso es nota 6, mientras que para exonerar 
directamente sin examen final es 9 o mas que 9

+ METODO 1: METODO QUE SE LLAME PUEDE APROBAR QUE VERIFICA SI LA NOTA 
ES MAYOR O IGUAL A 6

+ METODO 2: PUEDE EXONERAR Y ESTE METODO VERIFICA SI LA NOTA ES MAYOR 
A 9 Y MENOR A 12

EN AMBOS CASOS MOSTRAR UN TEXTO INDICATIVO

+ METODO 3: MOSTRAR INFORMACION; MUESTRA TODA LA INFORMACION JUNTA
*/
public class alumno {
private String neim;
private String profe;
private int nota;

public void lanota(){
    if (nota>=6) {
        System.out.println("su nota es mayor o igual a 6, aprobo");
    }else{
        System.out.println("su nota es menor a 6, no aprobo");
    }
    if (nota>8 && nota<12) {
        System.out.println("Exonero con" +nota);
    }if (nota<=8) {
        System.out.println("no exonero");
    }if (nota<0 || nota>=13) {
        System.out.println("no existe");
    }
}
    public void mo(){
        System.out.println("Resultados: \n su nota:"+nota+ "\n su nombre:" +
                neim +"\n el profesor:"+profe+"\n");
    }

    public String getNeim() {
        return neim;
    }

    public void setNeim(String neim) {
        this.neim = neim;
    }

    public String getProfe() {
        return profe;
    }

    public void setProfe(String profe) {
        this.profe = profe;
    }

    public int getNota() {
        return nota;
    }

    public void setNota(int nota) {
        this.nota = nota;
    }


       
}


