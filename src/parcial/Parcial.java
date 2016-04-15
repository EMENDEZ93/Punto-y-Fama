
package parcial;

import java.awt.Toolkit;
import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TableView;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.input.KeyEvent;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.scene.text.Font;
import javafx.stage.Stage;


public class Parcial extends Application{

    
        int Fama1 ;
        
        String TFama1 ;
        
        int Punto1 ;
        
        String TPunto1 ;
        
        String TPunto2 ;

        
        
        int intentos ;   
    
        int D1 = ( int ) Math.floor( Math.random( ) * 10 );
        String T1 =  String.valueOf( D1 );
        
        int D2 = ( int ) Math.floor( Math.random( ) * 10 );
        String T2 =  String.valueOf( D2 );

        int D3 = ( int ) Math.floor( Math.random( ) * 10 );
        String T3 =  String.valueOf( D3 );

        int D4 = ( int ) Math.floor( Math.random( ) * 10 );
        String T4 =  String.valueOf( D4 );


        //label para ganador
        Label Gana = new Label( " - Has Ganado FELICITACIONES -" );
         
        //label para mostrar los intentos
        Label LI = new Label( );

        TableView table = new TableView();
        
        TextArea text = new TextArea( );

        Button Ingresar = new Button( "- Ingresar -" );   
        
        TextField Valor1 = new TextField( );
        
        TextField Valor2 = new TextField( );    
        
        TextField Valor3 = new TextField( );    
        
        TextField Valor4 = new TextField( );    

        
    public static void main( String[] args ) {
 
    //ejecutar la app    
    Application.launch( args );
        
    }

    @Override
    public void start( Stage Stage ) throws Exception {

    //Saber el numero ganador    
        System.out.println(D1 + " - "+ D2 + " - "+ D3+ " - "+ D4 );
        
        
//______________________________________________________________________________        
    //creacion del GridPane    
        GridPane Grip = new GridPane( );        
       
    //espacio entre nodos vertical    
        Grip.setVgap( 10 );
     
    //espacio entre nodos Horitontal    
        Grip.setHgap( 10 );

    //guia de lineas     
    //  Grip.setGridLinesVisible( true );
//______________________________________________________________________________        

                




//______________________________________________________________________________        
//creacion del boton nuevo
        Button Nuevo = new Button( "- Nuevo Juego -" );
                
        
    Nuevo.setOnAction( event -> Nuevo( event  ) );
   
        
    //posicion del boton en grip    
        Grip.add( Nuevo , 1 , 1 );
//______________________________________________________________________________        

     



        
        

//______________________________________________________________________________        
    //label para anunciar ingresar el numero
        Label Ingrese = new Label( "Ingrese numero:" );
    
    //posicion en en grip    
        Grip.add( Ingrese , 1 , 2 );
//______________________________________________________________________________        




     

//______________________________________________________________________________        
    //creacion del textArea
    
    
            Grip.add( LI , 1 , 5 );        

    
    
    
    //creacion label para jugadas
        Label jugadas = new Label( "Jugadas" );
       
    //posicion del label en el grip 
        Grip.add( jugadas , 3 , 1 );
        
    //creacion del TextArea    
      //  TextArea text = new TextArea( );
    
    //tamaño de textarea   
        text.setPrefSize( 200 , 180 );
       
    //posicion del textarea en el gridPane   
        Grip.add( text , 3 , 2 );
      
    //celdas en filas a tomar para mejor ubicacion  
       GridPane.setRowSpan( text , 6 );
       
      // GridPane.setColumnSpan( text , 3 );
//______________________________________________________________________________        
       



       
      
//______________________________________________________________________________        
//nodos que van agregados al HBox
    
    //creacion del textfiel para el primer dato
    //tamaño del textfiel    
        Valor1.setPrefSize( 22 , 10 );
        Valor1.setOnKeyTyped( e -> handle( e ) );

        
//creacion del textfiel para el segundo dato    
    //tamaño del textfiel    
        Valor2.setPrefSize( 22 , 10 );
        Valor2.setOnKeyTyped( e -> handle( e ) );

        
//creacion del textfiel para el tercer dato 
    //tamaño del textfiel    
        Valor3.setPrefSize( 22 , 10 );
        Valor3.setOnKeyTyped( e -> handle( e ) );
        
        
  //creacion del textfiel para el cuarto dato     
    //tamaño del textfiel    
        Valor4.setPrefSize( 22 , 10 );
        Valor4.setOnKeyTyped( e -> handle( e ) );


//Boton ingresar        
    //tamaño del textfiel      
        Ingresar.setPrefSize( 80 , 20 );
   
//evento para el boton
        Ingresar.setOnAction( event -> Ingresar( event , Valor1 , Valor2 , Valor3 , Valor4 ,  Stage , Grip  ) );

        
//creacion del HBox        
       HBox HB = new HBox();
       
    //espacio entre ellos   
       HB.setSpacing( 10 );
      
    //agregar los nodos   
       HB.getChildren( ).addAll( Valor1 , Valor2 , Valor3 , Valor4 , Ingresar );
       
    //agregarlo al gridpane   
       Grip.add( HB , 1 , 4 );
   
    //tomar una celda de la siguiente columna   
       GridPane.setColumnSpan( HB , 2 );
//______________________________________________________________________________       

 
  
        
        
//______________________________________________________________________________    
        Grip.getChildren( ).addAll(  );
    
    //titulo del escenario    
        Stage.setTitle( "- Juego Fama - Punto -" );
      
    //agregar grip a la escena    
        Scene scene = new Scene( Grip );
             
    //agregar la escena al escenario    
        Stage.setScene( scene );

        Stage.show( );

    }

    
    
//______________________________________________________________________________    
//evento para el boton ingresar    
    private void Ingresar( ActionEvent event , TextField Valor1 , TextField Valor2 , TextField Valor3 , TextField Valor4 , Stage Stage , GridPane Grip ) {

        
       // intentos +=1;
        

        
        //if si es ganador
           if ( Valor1.getText( ).equalsIgnoreCase( T1 ) &&
                Valor2.getText( ).equalsIgnoreCase( T2 ) &&
                Valor3.getText( ).equalsIgnoreCase( T3 ) &&  
                Valor4.getText( ).equalsIgnoreCase( T4 ) ){
                                 
                Gana.setFont( new Font( "Cambria" , 9 ) );
       
                Gana.setVisible( true );
               
            //se muestra el label ganador    
                Grip.add( Gana , 1 , 6 );        
         
                Ingresar.setVisible( false );

//______________________________________________________________________________                
                
        //if para Fama valor1     
            } if ( Valor1.getText( ).equalsIgnoreCase( T1 )) {
            
            Fama1 += 1;    
        
             
            }
          
           //if punto para Valor1 dato2    
          else if ( Valor1.getText( ).equalsIgnoreCase( T2 )) {
           Punto1 += 1;    
        
           
           }
           
           //if punto para Valor1 dato3   
         else if ( Valor1.getText( ).equalsIgnoreCase( T3 )) {
           Punto1 += 1;    
          
           }
           
           //if punto para Valor1 dato2    
         else  if ( Valor1.getText( ).equalsIgnoreCase( T4 )) {
           Punto1 += 1;    
          
           }
 

//______________________________________________________________________________          
 


//______________________________________________________________________________                
                
        //if para Fama valor2     
             if ( Valor2.getText( ).equalsIgnoreCase( T2 ) ) {
            
            Fama1 += 1;    
            
            }
         
             
        //if punto para Valor2 dato1    
          else   if ( Valor2.getText( ).equalsIgnoreCase( T1 ) ) {
             
             Punto1 += 1;    
           
           }
           
           //if punto para Valor2 dato3   
        else   if ( Valor2.getText( ).equalsIgnoreCase( T3 )) {
           Punto1 += 1;    
          
           }
           
           //if punto para Valor2 dato4    
        else   if ( Valor2.getText( ).equalsIgnoreCase( T4 )) {
           Punto1 += 1;    
          
           }
 
//______________________________________________________________________________

           



//______________________________________________________________________________                
                
        //if para Fama valor3     
             if ( Valor3.getText( ).equalsIgnoreCase( T3 ) ) {
            
            Fama1 += 1;    
           
            
            }
         
             
        //if punto para Valor3 dato2    
          else   if ( Valor3.getText( ).equalsIgnoreCase( T2 ) ) {
             
             Punto1 += 1;    
           
           }
           
           //if punto para Valor3 dato1   
        else   if ( Valor3.getText( ).equalsIgnoreCase( T1 )) {
           Punto1 += 1;    
          
           }
           
           //if punto para Valor3 dato4    
        else   if ( Valor3.getText( ).equalsIgnoreCase( T4 )) {
           Punto1 += 1;    
          
           }
 
//______________________________________________________________________________



//______________________________________________________________________________                
                
        //if para Fama valor4     
             if ( Valor4.getText( ).equalsIgnoreCase( T4 ) ) {
            
            Fama1 += 1;    
                       
            }
         
             
        //if punto para Valor4 dato2    
          else   if ( Valor4.getText( ).equalsIgnoreCase( T2 ) ) {
             
             Punto1 += 1;    
           
           }
           
           //if punto para Valor4 dato3   
        else   if ( Valor4.getText( ).equalsIgnoreCase( T3 )) {
           Punto1 += 1;    
          
           }
           
           //if punto para Valor4 dato1    
        else   if ( Valor4.getText( ).equalsIgnoreCase( T1 )) {
           Punto1 += 1;    
          
           }
 
             
       // jTextArea.append(jTextField1.getText()); 
       // jTextArea.append(System.getProperty("line.separator"));     
             
       
                    

         TPunto1 =  String.valueOf( Punto1 );
         
         TFama1 =  String.valueOf( Fama1 );
         
         text.setText( text.getText() + "\n" +"Numero :" + Valor1.getText( ) + Valor2.getText( ) + Valor3.getText( ) + Valor4.getText( )+ "- Fama :" + TFama1 + "- Punto :" + TPunto1 );
                                
        
         Punto1 = 0;
         Fama1 = 0;
         
         
        Valor1.clear();
        Valor2.clear();
        Valor3.clear();
        Valor4.clear();
          

        System.out.println( intentos );

        intentos +=1;
        
        LI.setText("Numeros de intentos :" +  ( 10 - intentos) );
        
        if ( intentos == 10) {
            
        Ingresar.setVisible( false );
 
        intentos = 0;
            
        }
  
    
//______________________________________________________________________________


    }

    private void Nuevo( ActionEvent event ) {

        Valor1.clear();
        Valor2.clear();
        Valor3.clear();
        Valor4.clear();
         
         Fama1 = 0;
        //String TFama1;
        
        Punto1 = 0;
        
        //String TPunto1;
        
        intentos = 0 ; 

        text.clear();
        
        Ingresar.setVisible( true );

        Gana.setVisible( false );
    
        D1 =   (int) (Math.random()*10);
        T1 =  String.valueOf( D1 );
        
        D2 = ( int )( Math.random()*10);
        T2 =  String.valueOf( D2 );

        D3 = ( int ) ( Math.random()*10);
        T3 =  String.valueOf( D3 );

       D4 = ( int )( Math.random()*10);
        T4 =  String.valueOf( D4 );
    
         System.out.println(D1 + " - "+ D2 + " - "+ D3+ " - "+ D4 );

         
        
        
    }

    private void handle(KeyEvent e) {

        String str = e.getCharacter();
        
        int len = str.length();
        
        for ( int i = 0 ; i < len ; i ++ ) {
            
        Character C = str.charAt(i);
        
        if ( !Character.isDigit(C)) {
            
        e.consume();
        
        //sonido de alerta
        Toolkit.getDefaultToolkit().beep();
        
        }
        
        }
    
    
    }
    
}
