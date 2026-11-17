import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.util.ArrayList;
import java.util.List;

public class TelaPrincipal extends JFrame {

    private JTextField txtEmpresa;
    private JTextField txtFuncionarios;

    private JCheckBox chkDados;
    private JCheckBox chkRecrutamento;
    private JCheckBox chkTreinamento;
    private JCheckBox chkDesempenho;

    public TelaPrincipal() {

        setTitle("HR Digital Transformation Advisor");
        setSize(700, 550);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLocationRelativeTo(null);

        JPanel painel = new JPanel();
        painel.setLayout(new BorderLayout());

        // ----------------------------------
        // Painel Superior
        // ----------------------------------

        JPanel topo = new JPanel(new GridLayout(6,2));

        topo.add(new JLabel("Nome da empresa: "));
        txtEmpresa = new JTextField();
        topo.add(txtEmpresa);

        topo.add(new JLabel("Quatidade de funcionários: "));
        txtFuncionarios = new JTextField();
        topo.add(txtFuncionarios);

        chkDados =
                    new JCheckBox("Dados descentralizados");
        
         chkRecrutamento =
                    new JCheckBox("Recrutamento manual");            
        
        chkTreinamento =
                    new JCheckBox("Falta de treinamento");

        chkDesempenho =
                    new JCheckBox("Problemas de Desempenho");

        topo.add(chkDados);
        topo.add(chkRecrutamento);
        topo.add(chkTreinamento);
        topo.add(chkDesempenho);

        painel.add(topo, BorderLayout.NORTH);

        //---------------------------------------
        // Área de Resultado
        // --------------------------------------

        txtResultado = new JTextArea();
        txtResultado.setEditable(false);

        JScrollPane scroll = 
                    new JScrollPane(txtResultado);

        painel.add(scroll, BorderLayout.CENTER);
    

        //-----------------------------------------
        // Botão
        //-----------------------------------------

        
    } 


}

