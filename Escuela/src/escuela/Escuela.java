/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package escuela;
import java.util.Scanner;
/**
 *
 * @author medac
 */
public class Escuela {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    Alumno [] alumnos = new Alumno [10];
    String nombre;
        int resp = 0;
    rellenar (alumnos);
        do {
            System.out.println("1..Introducir notas por nombre del alumno 2.Ver todos los alumnos 3.Ver notas por nombre de alumno 4.Media notas por nombre del alumno 5.Salir ");
            resp=sc.nextInt();
            switch(resp){
                case 1:
                    System.out.println("Introduce nombre");
                    nombre=sc.next();
                    for (int i = 0; i < alumnos.length; i++) {
                        if (alumnos[i].getNombre().equals(nombre)) {
                            introduceNotas(alumnos[i]);
                        }else{
                            System.out.println("Nombre no valido");
                        }
                    }
                    break;
                case 2:
                    for (int i = 0; i < 10; i++) {
                        System.out.println(alumnos[i]);
                    }
                    break;
                case 3:
                    System.out.println("Introduce nombre del alumno");
                    nombre=sc.next();
                    for (int i = 0; i < alumnos.length; i++) {
                        if (alumnos[i].getNombre().equals(nombre)) {
                            System.out.println(alumnos[i].getNotas());
                        }
                    }
                    break;
                case 4:
                    System.out.println("introduce nombre del alumno");
                    nombre=sc.next();
                    for (int i = 0; i < alumnos.length; i++) {
                        if (alumnos[i].getNombre().equals(nombre)) {
                            
                       
                               if (alumnos[i].isNotaIntroducida()==true) {
                            alumnos[i].notaMedia(); }else{
                                   System.out.println("Nota no introducida");
                               }
                            
                        }
                    }
                         
                    break;
                default:
                    System.out.println("Opcion no valida");
            }
            
            
        } while (resp!=5);
    }

    private static void rellenar(Alumno[] alumnos) {
        Scanner sc=new java.util.Scanner(System.in);
        String nombre=" ";
        int nif=0;
        for (int i = 0; i < alumnos.length; i++) {
            System.out.println("Introduce nombre");
            nombre=sc.next();
            System.out.println("Introduce nif");
            nif=sc.nextInt();
            alumnos[i]=new Alumno(nombre,nif);
        }
    }

    private static void introduceNotas(Alumno alumno) {
    int nota1,nota2,nota3,nota4,nota5;
    Scanner sc=new Scanner(System.in);
        System.out.println("Introduce nota 1");
        nota1=sc.nextInt();
        System.out.println("Introduce nota 2");
        nota2=sc.nextInt();
        System.out.println("Introduce nota 3");
        nota3=sc.nextInt();
        System.out.println("Introduce nota 4");
        nota4=sc.nextInt();
        System.out.println("Introduce nota 5");
        nota5=sc.nextInt();
        alumno.setNotas(nota1,nota2,nota3,nota4,nota5);
        
    }
    
}
