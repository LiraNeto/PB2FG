package com.liraneto.view;

import com.liraneto.controller.JSON;
import com.liraneto.controller.JSON2XML;
import com.liraneto.controller.XML;
import com.liraneto.model.json.FichaJSON;
import com.liraneto.model.xml.FichaXML;
import lombok.Data;
import org.apache.commons.lang3.StringUtils;

import javax.swing.*;
import javax.swing.filechooser.FileNameExtensionFilter;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;

@Data
public class GuiForm {
    private JButton buttonOpenJSONFile;
    private JPanel panelMain;
    private JTextField textFieldId;
    private JButton getJSONFromWebButton;

    private JFrame frame;

    public GuiForm() {
        buttonOpenJSONFile.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JFrame parentFrame = new JFrame();

                JFileChooser fileChooser = new JFileChooser();

                FileNameExtensionFilter filter = new FileNameExtensionFilter("JSON Pathbuilder (*.json)", "json");
                fileChooser.setFileFilter(filter);
                fileChooser.setDialogTitle("Specify a JSON Pathbuilder file to open");

                int userSelection = fileChooser.showOpenDialog(parentFrame);

                if (userSelection == JFileChooser.APPROVE_OPTION) {
                    File fileToOpen = fileChooser.getSelectedFile();
                    FichaJSON fichaJSON = JSON.getFichaJSONFromFile(fileToOpen.getAbsolutePath());
                    JSON2XML conversor = new JSON2XML();
                    conversor.setFichaJSON(fichaJSON);
                    conversor.ConverterJSON2XML();

                    FichaXML fichaXml = conversor.getFichaXML();

                    XML xml = new XML(fichaXml);


                    fileChooser = new JFileChooser();
                    filter = new FileNameExtensionFilter("XML Fantasy Ground File (*.xml)", "xml");
                    fileChooser.setFileFilter(filter);
                    fileChooser.setDialogTitle("Specify a XML Fantasy Ground File to save");

                    userSelection = fileChooser.showSaveDialog(parentFrame);

                    if (userSelection == JFileChooser.APPROVE_OPTION) {

                        File fileToSave = fileChooser.getSelectedFile();
                        String filePath = fileToSave.getAbsolutePath();
                        if (!filePath.endsWith(".xml"))
                            filePath = filePath + ".xml";
                        xml.createFileXML(filePath);
                        JOptionPane.showMessageDialog(null, "DONE!", "Conversão finalizada", JOptionPane.INFORMATION_MESSAGE);
                    }
                }
            }
        });
        getJSONFromWebButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String strId = textFieldId.getText();
                if (StringUtils.isNumeric(strId)){
                    FichaJSON fichaJSON = JSON.getFichaJSONFromURL(strId);
                    JSON2XML conversor = new JSON2XML();
                    conversor.setFichaJSON(fichaJSON);
                    conversor.ConverterJSON2XML();

                    FichaXML fichaXml = conversor.getFichaXML();

                    XML xml = new XML(fichaXml);

                    JFrame parentFrame = new JFrame();

                    JFileChooser fileChooser = new JFileChooser();
                    fileChooser.setSelectedFile(new File(fichaJSON.getBuild().getName() + ".xml"));

                    FileNameExtensionFilter filter = new FileNameExtensionFilter("XML Fantasy Ground File (*.xml)", "xml");
                    fileChooser.setFileFilter(filter);
                    fileChooser.setDialogTitle("Specify a XML Fantasy Ground File to save");

                    int userSelection = fileChooser.showOpenDialog(parentFrame);

                    if (userSelection == JFileChooser.APPROVE_OPTION) {

                        File fileToSave = fileChooser.getSelectedFile();
                        String filePath = fileToSave.getAbsolutePath();
                        if (!filePath.endsWith(".xml"))
                            filePath = filePath + ".xml";
                        xml.createFileXML(filePath);
                        JOptionPane.showMessageDialog(null, "DONE!", "Conversão finalizada", JOptionPane.INFORMATION_MESSAGE);
                    }
                } else {
                    JOptionPane.showMessageDialog(null, "ERROR!", "Id needs to be a number!", JOptionPane.ERROR_MESSAGE);
                }
            }
        });
    }

    public static void main(String[] args) {

        GuiForm guiForm = new GuiForm();

        guiForm.setFrame(new JFrame("PB2FG"));

        guiForm.getFrame().setContentPane(guiForm.getPanelMain());
        guiForm.getFrame().setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        guiForm.getFrame().setPreferredSize(new Dimension(230,160));
        guiForm.getFrame().setResizable(false);

        ImageIcon img = new ImageIcon("D:\\Documentos\\Git\\iconfinder_die_1055072.png");
        guiForm.getFrame().setIconImage(img.getImage());
        guiForm.getFrame().pack();
        guiForm.getFrame().setVisible(true);
        guiForm.getFrame().setLocationRelativeTo(null);
    }
}
