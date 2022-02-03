package juros;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Juros_1 extends Frame {
    Button b1, b2;
    Label l1, l2, l3 , l4, l5, l6;
    TextField txt1, txt2, txt3;
    
    public Juros_1(){
        
        setTitle("Exercicio 02 com entrada de um valor");
        setSize(600, 400);
        setResizable(false);
        setLocation(100, 100);
        setBackground(Color.white);
        setLayout(null);
        
        l1 = new Label("CÁLCULO COM JUROS");
        l1.setLocation(50, 50);
        l1.setSize(150, 30);
        
        l2 = new Label("Valor Inicial");
        l2.setLocation(20, 100);
        l2.setSize(100, 30);
        
        l3 = new Label("Taxa de Juros");
        l3.setLocation(20, 150);
        l3.setSize(100, 30);
        
        l4 = new Label("");
        l4.setLocation(150, 230);
        l4.setSize(120, 30);
        
        l5 = new Label("VALOR CALCULADO:");
        l5.setLocation(20, 230);
        l5.setSize(120, 30);
        
        l6 = new Label("N. de meses");
        l6.setLocation(20, 190);
        l6.setSize(100, 30);
        
        txt1 = new TextField("");
        txt1.setSize(110, 25);
        txt1.setLocation(120, 100);
        
        txt2 = new TextField("");
        txt2.setSize(80, 25);
        txt2.setLocation(120, 150);
        
        txt3 = new TextField("");
        txt3.setSize(80, 25);
        txt3.setLocation(120, 190);
        
        b1 = new Button("CALCULAR");
        b1.setSize(120, 50);
        b1.setLocation(80, 300);
        b1.setBackground(new Color(150, 220, 255));
        
        b2 = new Button("SAIR");
        b2.setSize(120, 50);
        b2.setLocation(280, 300);
        b2.setBackground(new Color(150, 220, 255));
        
        b1.addActionListener(handler);
        b2.addActionListener(handler);
        add(b1);
        add(b2);
        add(l1);
        add(l2);
        add(l3);
        add(l4);
        add(l5);
        add(l6);
        add(txt1);
        add(txt2);
        add(txt3);
        
    }
    ButtonHandler handler = new ButtonHandler();
    
    private class ButtonHandler implements ActionListener{
        public void actionPerformed(ActionEvent e){
            String valInicial, taxa, meses;
            double valCalc, vi, tax, m;
            
            if(e.getActionCommand() == "SAIR"){
                System.exit(0);
            }
            else{
                valInicial = txt1.getText();
                taxa = txt2.getText();
                meses = txt3.getText();
                
                vi = Double.parseDouble(valInicial);
                m = Double.parseDouble(meses);
                tax = Double.parseDouble(taxa);
                
                valCalc = vi + (vi*tax*m);
                
                l4.setText(" "+ valCalc);
            }
        }
    }
}
