/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejemploparking;

import java.util.Scanner;


public class EjemploParking {
    
    public static void main(String[] args) {
     Scanner sc = new Scanner(System.in);
        Vehiculo [][] vehiculos = new Vehiculo[3][3];
        
        int res = 0, pos = 0;
        char letra;
        String matricula;
        
        do {
            System.out.println("1.Insertar vehiculo 2.Ver 3.Salir");
            res = sc.nextInt();
            
            switch(res){
                case 1:
                    if (pos <9) {
                        for (int i = 0; i < 3; i++) {
                            for (int j = 0; j < 3; j++) {
                                if (vehiculos [i][j]==null) {
                                    System.out.println("C.Coche o M.moto");
                                    letra= sc.next().charAt(0);
                                    System.out.println("Matricula");
                                    matricula = sc.next();
                                    pos++;
                                    if (letra== 'C') {
                                        vehiculos [i][j] = new Coche(matricula);
                                    } else {
                                        vehiculos[i][j] = new Moto(matricula);
                                    }
                                    i = 3;
                                    j = 3;
                                }
                            }
                        }
                    } else {
                        System.out.println("Lleno");
                    }
                    break;
                case 2:
                    for (int i = 0; i < 3; i++) {
                        for (int j = 0; j < 3; j++) {
                            if (vehiculos[i][j]!=null) {
                                System.out.print(vehiculos[i][j]);
                            } else {
                                System.out.print(" ");
                            }
                        }
                        System.out.println(" ");
                    }
                    break;
                case 3:
                    System.out.println("Saliendo");
                    break;
                default:
                    System.out.println("No valido");
                
            }
        } while (res!=3);
        
    }
    
}

