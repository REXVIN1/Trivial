
package trivial2;
import java.util.*;
/**
 *
 * @author Kevin Gómez Valderas<kgomval118@g.educaand.es>
 */
public class Trivial2 {


    public static void main(String[] args) {
        
        String color = "\u001B[34m";
        
        char margen =206;
        char margen2 =40;
        char margen3 =41;
        
        System.out.println(color+margen2+margen+" -----------------------------------------"+margen+margen2);
        System.out.println(color+margen3+margen+"|         TRIVIAL DE HISTORIA             |"+margen+margen3);
        System.out.println(color+margen2+margen+" -----------------------------------------"+margen+margen2+"\n");
        
        System.out.println("Escriba su nombre: ");
        String nombre = new Scanner(System.in).nextLine();
        
        String preguntas[] = {"¿Cuál fue el detonante de la Primera Guerra Mundial?", "¿Quién fue el primer presidente de Estados Unidos? ", "¿Cuánto duró la Guerra de los Cien Años? ", "¿Qué calavera no regresó tras el primer viaje de Colón a América? ", "¿Qué exploradores dieron la primera vuelta al mundo?", "¿En qué año se disolvió la Unión Soviética?", "¿En qué isla estuvo preso Napoleón? ", "¿En qué año se creó la Organización de las Naciones Unidas?", "¿En qué año pisó el hombre la luna por primera vez? ", "¿Quién fue el primer presidente de la democracia española tras el franquismo? ", "¿En qué ciudad tuvieron una reunión Hitler y Franco?"};
        String respuestas[] = {"El asesinato del archiduque Francisco Fernando de Habsburgo", "George Washington", "duró 116 años", "La Santa María", "Magallanes y Elcano ", "1991", "isla de Santa Elena", "1945", "1969", "Adolfo Suárez", "Hendaya"};
        int preguntas_libres[] = {1,1,1,1,1,1,1,1,1,1,1};
        String ranking[]={"¡Estudiaaa!","¡Debes repasar!","¡Por los pelos!","¡Muy bien!","¡PERFECTO!"};
        
        int puntuacion = 0;
        int num_pregunta = 1;
        int num_elegido = (int)(Math.random()*preguntas.length);
        
        System.out.println("\n"+"Pregunta: "+num_pregunta+"\n"+(preguntas[num_elegido]+"\n")); 
        num_pregunta++;
        String respuesta = new Scanner(System.in).nextLine();
        
        if(respuestas[num_elegido].equalsIgnoreCase(respuesta)){
            System.out.println("\n"+"Bien"+"\n");
            puntuacion++;
        }else{
            System.out.println("\n"+"Mal"+"\n");
        }
        
        preguntas_libres[num_elegido]=0;
        num_elegido = (int)(Math.random()*preguntas.length);
        
        if(preguntas_libres[num_elegido] == 0){
            if(preguntas_libres[num_elegido] != preguntas_libres[0]){
               num_elegido=0;
            }else{
                if(preguntas_libres[num_elegido] != preguntas_libres[1]){
                   num_elegido=1;
                }else{
                    if(preguntas_libres[num_elegido] != preguntas_libres[2]){
                       num_elegido=2;
                    }else{
                        if(preguntas_libres[num_elegido] != preguntas_libres[3]){
                           num_elegido=3;
                        }else{
                            if(preguntas_libres[num_elegido] != preguntas_libres[4]){ 
                               num_elegido=4;
                            }else{
                                if(preguntas_libres[num_elegido] != preguntas_libres[5]){
                                   num_elegido=5;
                                }else{
                                    if(preguntas_libres[num_elegido] != preguntas_libres[6]){
                                       num_elegido=6;
                                    }else{
                                        if(preguntas_libres[num_elegido] != preguntas_libres[7]){
                                           num_elegido=7;
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        System.out.println("\n"+"Pregunta: "+num_pregunta+"\n"+(preguntas[num_elegido]+"\n")); 
        num_pregunta++;
        respuesta = new Scanner(System.in).nextLine();
        
        if(respuestas[num_elegido].equalsIgnoreCase(respuesta)){
            System.out.println("\n"+"Bien"+"\n");
            puntuacion++;
        }else{
            System.out.println("\n"+"Mal"+"\n");
        }
        
        preguntas_libres[num_elegido]=0;
        num_elegido = (int)(Math.random()*preguntas.length);
        
        if(preguntas_libres[num_elegido] == 0){
            if(preguntas_libres[num_elegido] != preguntas_libres[0]){
               num_elegido=0;
            }else{
                if(preguntas_libres[num_elegido] != preguntas_libres[1]){
                   num_elegido=1;
                }else{
                    if(preguntas_libres[num_elegido] != preguntas_libres[2]){
                       num_elegido=2;
                    }else{
                        if(preguntas_libres[num_elegido] != preguntas_libres[3]){
                           num_elegido=3;
                        }else{
                            if(preguntas_libres[num_elegido] != preguntas_libres[4]){ 
                               num_elegido=4;
                            }else{
                                if(preguntas_libres[num_elegido] != preguntas_libres[5]){
                                   num_elegido=5;
                                }else{
                                    if(preguntas_libres[num_elegido] != preguntas_libres[6]){
                                       num_elegido=6;
                                    }else{
                                        if(preguntas_libres[num_elegido] != preguntas_libres[7]){
                                           num_elegido=7;
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        System.out.println("\n"+"Pregunta: "+num_pregunta+"\n"+(preguntas[num_elegido]+"\n")); 
        num_pregunta++;
        respuesta = new Scanner(System.in).nextLine();
        
        if(respuestas[num_elegido].equalsIgnoreCase(respuesta)){
            System.out.println("\n"+"Bien"+"\n");
            puntuacion++;
        }else{
            System.out.println("\n"+"Mal"+"\n");
        }
        
        preguntas_libres[num_elegido]=0;
        num_elegido = (int)(Math.random()*preguntas.length);
        
        if(preguntas_libres[num_elegido] == 0){
            if(preguntas_libres[num_elegido] != preguntas_libres[0]){
               num_elegido=0;
            }else{
                if(preguntas_libres[num_elegido] != preguntas_libres[1]){
                   num_elegido=1;
                }else{
                    if(preguntas_libres[num_elegido] != preguntas_libres[2]){
                       num_elegido=2;
                    }else{
                        if(preguntas_libres[num_elegido] != preguntas_libres[3]){
                           num_elegido=3;
                        }else{
                            if(preguntas_libres[num_elegido] != preguntas_libres[4]){ 
                               num_elegido=4;
                            }else{
                                if(preguntas_libres[num_elegido] != preguntas_libres[5]){
                                   num_elegido=5;
                                }else{
                                    if(preguntas_libres[num_elegido] != preguntas_libres[6]){
                                       num_elegido=6;
                                    }else{
                                        if(preguntas_libres[num_elegido] != preguntas_libres[7]){
                                           num_elegido=7;
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        System.out.println("\n"+"Pregunta: "+num_pregunta+"\n"+(preguntas[num_elegido]+"\n")); 
        num_pregunta++;
        respuesta = new Scanner(System.in).nextLine();
        
        if(respuestas[num_elegido].equalsIgnoreCase(respuesta)){
            System.out.println("\n"+"Bien"+"\n");
            puntuacion++;
        }else{
            System.out.println("\n"+"Mal"+"\n");
        }
        
        preguntas_libres[num_elegido]=0;
        num_elegido = (int)(Math.random()*preguntas.length);
        
        if(preguntas_libres[num_elegido] == 0){
            if(preguntas_libres[num_elegido] != preguntas_libres[0]){
               num_elegido=0;
            }else{
                if(preguntas_libres[num_elegido] != preguntas_libres[1]){
                   num_elegido=1;
                }else{
                    if(preguntas_libres[num_elegido] != preguntas_libres[2]){
                       num_elegido=2;
                    }else{
                        if(preguntas_libres[num_elegido] != preguntas_libres[3]){
                           num_elegido=3;
                        }else{
                            if(preguntas_libres[num_elegido] != preguntas_libres[4]){ 
                               num_elegido=4;
                            }else{
                                if(preguntas_libres[num_elegido] != preguntas_libres[5]){
                                   num_elegido=5;
                                }else{
                                    if(preguntas_libres[num_elegido] != preguntas_libres[6]){
                                       num_elegido=6;
                                    }else{
                                        if(preguntas_libres[num_elegido] != preguntas_libres[7]){
                                           num_elegido=7;
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        System.out.println("\n"+"Pregunta: "+num_pregunta+"\n"+(preguntas[num_elegido]+"\n")); 
        num_pregunta++;
        respuesta = new Scanner(System.in).nextLine();
        
        if(respuestas[num_elegido].equalsIgnoreCase(respuesta)){
            System.out.println("\n"+"Bien"+"\n");
            puntuacion++;
        }else{
            System.out.println("\n"+"Mal"+"\n");
        }
        
        preguntas_libres[num_elegido]=0;
        num_elegido = (int)(Math.random()*preguntas.length);
        
        if(preguntas_libres[num_elegido] == 0){
            if(preguntas_libres[num_elegido] != preguntas_libres[0]){
               num_elegido=0;
            }else{
                if(preguntas_libres[num_elegido] != preguntas_libres[1]){
                   num_elegido=1;
                }else{
                    if(preguntas_libres[num_elegido] != preguntas_libres[2]){
                       num_elegido=2;
                    }else{
                        if(preguntas_libres[num_elegido] != preguntas_libres[3]){
                           num_elegido=3;
                        }else{
                            if(preguntas_libres[num_elegido] != preguntas_libres[4]){ 
                               num_elegido=4;
                            }else{
                                if(preguntas_libres[num_elegido] != preguntas_libres[5]){
                                   num_elegido=5;
                                }else{
                                    if(preguntas_libres[num_elegido] != preguntas_libres[6]){
                                       num_elegido=6;
                                    }else{
                                        if(preguntas_libres[num_elegido] != preguntas_libres[7]){
                                           num_elegido=7;
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        System.out.println("\n"+"Pregunta: "+num_pregunta+"\n"+(preguntas[num_elegido]+"\n")); 
        num_pregunta++;
        respuesta = new Scanner(System.in).nextLine();
        
        if(respuestas[num_elegido].equalsIgnoreCase(respuesta)){
            System.out.println("\n"+"Bien"+"\n");
            puntuacion++;
        }else{
            System.out.println("\n"+"Mal"+"\n");
        }
        
        preguntas_libres[num_elegido]=0;
        num_elegido = (int)(Math.random()*preguntas.length);
        
        if(preguntas_libres[num_elegido] == 0){
            if(preguntas_libres[num_elegido] != preguntas_libres[0]){
               num_elegido=0;
            }else{
                if(preguntas_libres[num_elegido] != preguntas_libres[1]){
                   num_elegido=1;
                }else{
                    if(preguntas_libres[num_elegido] != preguntas_libres[2]){
                       num_elegido=2;
                    }else{
                        if(preguntas_libres[num_elegido] != preguntas_libres[3]){
                           num_elegido=3;
                        }else{
                            if(preguntas_libres[num_elegido] != preguntas_libres[4]){ 
                               num_elegido=4;
                            }else{
                                if(preguntas_libres[num_elegido] != preguntas_libres[5]){
                                   num_elegido=5;
                                }else{
                                    if(preguntas_libres[num_elegido] != preguntas_libres[6]){
                                       num_elegido=6;
                                    }else{
                                        if(preguntas_libres[num_elegido] != preguntas_libres[7]){
                                           num_elegido=7;
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        System.out.println("\n"+"Pregunta: "+num_pregunta+"\n"+(preguntas[num_elegido]+"\n")); 
        num_pregunta++;
        respuesta = new Scanner(System.in).nextLine();
        
        if(respuestas[num_elegido].equalsIgnoreCase(respuesta)){
            System.out.println("\n"+"Bien"+"\n");
            puntuacion++;
        }else{
            System.out.println("\n"+"Mal"+"\n");
        }
        
        preguntas_libres[num_elegido]=0;
        num_elegido = (int)(Math.random()*preguntas.length);
        
        if(preguntas_libres[num_elegido] == 0){
            if(preguntas_libres[num_elegido] != preguntas_libres[0]){
               num_elegido=0;
            }else{
                if(preguntas_libres[num_elegido] != preguntas_libres[1]){
                   num_elegido=1;
                }else{
                    if(preguntas_libres[num_elegido] != preguntas_libres[2]){
                       num_elegido=2;
                    }else{
                        if(preguntas_libres[num_elegido] != preguntas_libres[3]){
                           num_elegido=3;
                        }else{
                            if(preguntas_libres[num_elegido] != preguntas_libres[4]){ 
                               num_elegido=4;
                            }else{
                                if(preguntas_libres[num_elegido] != preguntas_libres[5]){
                                   num_elegido=5;
                                }else{
                                    if(preguntas_libres[num_elegido] != preguntas_libres[6]){
                                       num_elegido=6;
                                    }else{
                                        if(preguntas_libres[num_elegido] != preguntas_libres[7]){
                                           num_elegido=7;
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        System.out.println("\n"+"Pregunta: "+num_pregunta+"\n"+(preguntas[num_elegido]+"\n")); 
        num_pregunta++;
        respuesta = new Scanner(System.in).nextLine();
        
        if(respuestas[num_elegido].equalsIgnoreCase(respuesta)){
            System.out.println("\n"+"Bien"+"\n");
            puntuacion++;
        }else{
            System.out.println("\n"+"Mal"+"\n");
        }
        
        preguntas_libres[num_elegido]=0;
        num_elegido = (int)(Math.random()*preguntas.length);
        
        if(preguntas_libres[num_elegido] == 0){
            if(preguntas_libres[num_elegido] != preguntas_libres[0]){
               num_elegido=0;
            }else{
                if(preguntas_libres[num_elegido] != preguntas_libres[1]){
                   num_elegido=1;
                }else{
                    if(preguntas_libres[num_elegido] != preguntas_libres[2]){
                       num_elegido=2;
                    }else{
                        if(preguntas_libres[num_elegido] != preguntas_libres[3]){
                           num_elegido=3;
                        }else{
                            if(preguntas_libres[num_elegido] != preguntas_libres[4]){ 
                               num_elegido=4;
                            }else{
                                if(preguntas_libres[num_elegido] != preguntas_libres[5]){
                                   num_elegido=5;
                                }else{
                                    if(preguntas_libres[num_elegido] != preguntas_libres[6]){
                                       num_elegido=6;
                                    }else{
                                        if(preguntas_libres[num_elegido] != preguntas_libres[7]){
                                           num_elegido=7;
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        System.out.println("\n"+"Pregunta número: "+num_pregunta);
        num_pregunta++;
        System.out.println(preguntas[num_elegido]);respuesta = new Scanner(System.in).nextLine();
        

        if (respuestas[num_elegido].equalsIgnoreCase(respuesta)){
            System.out.println("\u001B[32m"+"Bien"+"\u001B[0m");
                    puntuacion++;
        }else{
            System.out.println("\u001B[31m"+"Mal"+"\u001B[0m");
        }
        
            System.out.println("\n"+nombre+", Tu puntuación es: "+puntuacion);
            
            if(puntuacion== 0){
                System.out.println("\u001B[31m"+ranking[0]+"\u001B[0m");
            }else{
                if(puntuacion >0 && puntuacion <4){
                   System.out.println("\u001B[31m"+ranking[1]+"\u001B[0m");
                }else{
                    if(puntuacion == 4){
                       System.out.println("\u001B[33m"+ranking[2]+"\u001B[0m");
                    }else{
                        if(puntuacion >5 && puntuacion <8){
                           System.out.println("\u001B[32m"+ranking[3]+"\u001B[0m"); 
                        }else{
                            System.out.println("\u001B[35m"+ranking[4]+"\u001B[0m");
                        }    
                    }        
                }            
            }
    }
}
