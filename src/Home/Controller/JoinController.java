package Home.Controller;

import com.jfoenix.controls.JFXButton;
import com.jfoenix.controls.JFXDialog;
import com.jfoenix.controls.JFXDialogLayout;
import com.jfoenix.controls.events.JFXDialogEvent;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.effect.BoxBlur;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.StackPane;
import javafx.stage.FileChooser;
import javafx.stage.Stage;
import java.io.*;
import java.net.URL;
import java.util.ResourceBundle;

public class JoinController implements Initializable {
        private double x, y;
        String Path = null;
        String New_Path = null;
        String file_name = null;

        @FXML
        private StackPane rootPane2;

        @FXML
        private AnchorPane AnchorPane2;

        @FXML
        private Button Browse;

        @FXML
        private Button Home;

        @FXML
        private Button JoinMenu;

        @FXML
        private Button SplitMenu;

        @FXML
        private Button Help;

        @FXML
        private Button About;

        @FXML
        private Button Close;

        @FXML
        private JFXButton BtnClose;

        @FXML
        private TextField txt;

        @FXML
        private ImageView progress;

        @FXML
        private TextField txt1;

        @FXML
        private Button Save;

        @Override
        public void initialize(URL url, ResourceBundle resourceBundle) {

        }
        @FXML
        private void  HandleClicks(ActionEvent event) throws IOException
        {
            if (event.getSource() == Home)
            {
                Parent HomeParent = FXMLLoader.load(getClass().getResource("../FXML/Home.fxml"));
                Scene HomeScene = new Scene(HomeParent);
                Stage window = (Stage) ((Node)event.getSource()).getScene().getWindow();
                window.setScene(HomeScene);
                window.show();
                HomeParent.setOnMousePressed(event1 -> {
                    x = event1.getSceneX();
                    y = event1.getSceneY();
                });
                HomeParent.setOnMouseDragged(event1 -> {

                    window.setX(event1.getScreenX() - x);
                    window.setY(event1.getScreenY() - y);

                });
            }
            else
            {

            }
            if (event.getSource() == JoinMenu)
            {
                Parent JoinParent = FXMLLoader.load(getClass().getResource("../FXML/Join.fxml"));
                Scene JoinScene = new Scene(JoinParent);
                Stage window = (Stage) ((Node)event.getSource()).getScene().getWindow();
                window.setScene(JoinScene);
                window.show();
                JoinParent.setOnMousePressed(event1 -> {
                    x = event1.getSceneX();
                    y = event1.getSceneY();
                });
                JoinParent.setOnMouseDragged(event1 -> {

                    window.setX(event1.getScreenX() - x);
                    window.setY(event1.getScreenY() - y);

                });
            }
            else
            {

            }
            if (event.getSource() == SplitMenu)
            {
                Parent SplitParent = FXMLLoader.load(getClass().getResource("../FXML/Split.fxml"));
                Scene SplitScene = new Scene(SplitParent);
                Stage window = (Stage) ((Node)event.getSource()).getScene().getWindow();
                window.setScene(SplitScene);
                window.show();
                SplitParent.setOnMousePressed(event1 -> {
                    x = event1.getSceneX();
                    y = event1.getSceneY();
                });
                SplitParent.setOnMouseDragged(event1 -> {

                    window.setX(event1.getScreenX() - x);
                    window.setY(event1.getScreenY() - y);

                });
            }
            else
            {

            }
            if (event.getSource() == Help)
            {
                Parent SplitParent = FXMLLoader.load(getClass().getResource("../FXML/Help.fxml"));
                Scene SplitScene = new Scene(SplitParent);
                Stage window = (Stage) ((Node)event.getSource()).getScene().getWindow();
                window.setScene(SplitScene);
                window.show();
                SplitParent.setOnMousePressed(event1 -> {
                    x = event1.getSceneX();
                    y = event1.getSceneY();
                });
                SplitParent.setOnMouseDragged(event1 -> {

                    window.setX(event1.getScreenX() - x);
                    window.setY(event1.getScreenY() - y);

                });
            }
            else
            {

            }
            if (event.getSource() == About)
            {
                Parent SplitParent = FXMLLoader.load(getClass().getResource("../FXML/About.fxml"));
                Scene SplitScene = new Scene(SplitParent);
                Stage window = (Stage) ((Node)event.getSource()).getScene().getWindow();
                window.setScene(SplitScene);
                window.show();
                SplitParent.setOnMousePressed(event1 -> {
                    x = event1.getSceneX();
                    y = event1.getSceneY();
                });
                SplitParent.setOnMouseDragged(event1 -> {

                    window.setX(event1.getScreenX() - x);
                    window.setY(event1.getScreenY() - y);

                });
            }
            else
            {

            }

            if (event.getSource() == Save)
        {
            FileChooser fc = new FileChooser();
            File SelectedFile = fc.showSaveDialog(null);
            if (SelectedFile != null)
            {
                txt1.setText(SelectedFile.getAbsolutePath());
                New_Path = txt1.getText();
            }
            else
            {    BoxBlur blur = new BoxBlur(3,3,3);
                JFXDialogLayout Dialouglayout = new JFXDialogLayout();
                JFXButton btnclose = new JFXButton("Close");
                btnclose.getStyleClass().add("button1");
                JFXDialog Dialog = new JFXDialog(rootPane2 , Dialouglayout, JFXDialog.DialogTransition.TOP);
                btnclose.addEventHandler(MouseEvent.MOUSE_CLICKED, (MouseEvent mouseevent )->{
                    Dialog.close();
                });
                Dialouglayout.setHeading(new Label("Not A Valid File! "));
                Dialouglayout.setActions(btnclose);
                Dialog.show();
                Dialog.setOnDialogClosed((JFXDialogEvent event1 ) ->{
                    AnchorPane2.setEffect(null);
                });
                AnchorPane2.setEffect(blur);

                System.out.println("Not A Valid File");
            }
        }
            if (event.getSource() == Browse)
            {
                FileChooser fc = new FileChooser();
                File SelectedFile = fc.showOpenDialog(null);
                if (SelectedFile != null)
                {
                    txt.setText(SelectedFile.getAbsolutePath());
                    Path = txt.getText();
                }
                else
                { BoxBlur blur = new BoxBlur(3,3,3);
                    JFXDialogLayout Dialouglayout = new JFXDialogLayout();
                    JFXButton btnclose = new JFXButton("Close");
                    btnclose.getStyleClass().add("button1");
                    JFXDialog Dialog = new JFXDialog(rootPane2 , Dialouglayout, JFXDialog.DialogTransition.TOP);
                    btnclose.addEventHandler(MouseEvent.MOUSE_CLICKED, (MouseEvent mouseevent )->{
                        Dialog.close();
                    });
                    Dialouglayout.setHeading(new Label("Not A Valid File!"));
                    Dialouglayout.setActions(btnclose);
                    Dialog.show();
                    Dialog.setOnDialogClosed((JFXDialogEvent event1 ) ->{
                        AnchorPane2.setEffect(null);
                    });
                    AnchorPane2.setEffect(blur);

                    System.out.println("Not A Valid File");
                }
            }

        }
        @FXML
        public Void Joinit(ActionEvent event)
        {
            try{
                byte b[] = new byte[10000]; // Create Byte Array With 10,000 bytes size

                // Below two lines used for taking input from user
                InputStreamReader ins = new InputStreamReader(System.in);
                BufferedReader br = new BufferedReader(ins);

                String part_path = Path; // Read file path of first part from user

                // Get file name from part file
                file_name = part_path.substring(0, part_path.lastIndexOf("."));

                // Get part number from part path
                String part_no = part_path.substring(part_path.lastIndexOf(".")+1);

                // Parse file Extension from file name
                String file_extension = file_name.substring(file_name.lastIndexOf("."));

                String new_path = New_Path; // Read original or new file name from user

                // Assign new file path to file class
                File combine_file_path = new File(New_Path);

                // Get file parent for checking if path is exist or not
                String path_parent = combine_file_path.getParent();

                // Checking for new file path extension and part file extension is matched or not
                // Flag variable is used for further validation checking
                int flag=0;
                if(new_path.endsWith(file_extension)){
                    flag=1;
                }

                // Assign part file path and original file parent path to file class
                File check_part_file_path = new File(part_path);
                File check_new_file_path = new File(path_parent);

                // Part path and original file parent path is exists or not
                // If this if will become true parts will be joined. Otherwise get error message
                if(check_part_file_path.exists() && flag==1 && check_new_file_path.exists()){

                    //Assign original file path to FileOutputStream
                    FileOutputStream fos = new FileOutputStream(new_path);

                    int x=1;
                    int read_bytes;
                    String parts_name_path = "";

                    // While loop executes untill all parts are not joined
                    while(true){
                        parts_name_path = "";

                        // if-else used for making parts name same as that were made at the time of splitting
                        if(part_no.startsWith("00")){
                            parts_name_path = file_name + ".00" + x;
                        }
                        else{
                            parts_name_path = file_name + ".0" + x;
                        }

                        // Assingn file path to file class
                        File f = new File(parts_name_path);

                        // If file path exists then file parts will join
                        if(f.exists()){

                            // FileInputStream class used to read data from file
                            FileInputStream fis = new FileInputStream(parts_name_path);

                            // Loop will execute till fis.available() not equals to 0
                            while(fis.available() !=0){
                                read_bytes = fis.read(b, 0, 10000); // Read 10,000 bytes in every iteration through FileInputStream
                                fos.write(b, 0, read_bytes); // Write 10,000 bytes data in a file through FileOutputStream
                            }
                            System.out.println("*** Part " + x + " Joined ***");
                            fis.close(); //fis.close() execute everytime after every parts completion
                            x++; // Increment x value by 1 everytime
                        }

                        // All parts are joined. Prints file joined message then break will exit form while
                        else{
                            BoxBlur blur1 = new BoxBlur(3,3,3);
                            JFXDialogLayout Dialouglayout1 = new JFXDialogLayout();
                            JFXButton btnclose1 = new JFXButton("Close");
                            btnclose1.getStyleClass().add("button1");
                            JFXDialog Dialog = new JFXDialog(rootPane2 , Dialouglayout1, JFXDialog.DialogTransition.TOP);
                            btnclose1.addEventHandler(MouseEvent.MOUSE_CLICKED, (MouseEvent mouseevent )->{
                                Dialog.close();
                            });
                            Dialouglayout1.setHeading(new Label("Files Joined Succesfully!!!!"));
                            Dialouglayout1.setActions(btnclose1);
                            Dialog.show();
                            Dialog.setOnDialogClosed((JFXDialogEvent event1 ) ->{
                                AnchorPane2.setEffect(null);
                            });
                            AnchorPane2.setEffect(blur1);
                            break;
                        }
                    }
                }

                // If user entered wrong original or new file path
                else if(!(check_new_file_path.exists())){
                    BoxBlur blur = new BoxBlur(3,3,3);
                    JFXDialogLayout Dialouglayout = new JFXDialogLayout();
                    JFXButton btnclose = new JFXButton("Close");
                    btnclose.getStyleClass().add("button1");
                    JFXDialog Dialog = new JFXDialog(rootPane2 , Dialouglayout, JFXDialog.DialogTransition.TOP);
                    btnclose.addEventHandler(MouseEvent.MOUSE_CLICKED, (MouseEvent mouseevent )->{
                        Dialog.close();
                    });
                    Dialouglayout.setHeading(new Label("Please Enter Correct Path "));
                    Dialouglayout.setActions(btnclose);
                    Dialog.show();
                    Dialog.setOnDialogClosed((JFXDialogEvent event1 ) ->{
                        AnchorPane2.setEffect(null);
                    });
                    AnchorPane2.setEffect(blur);

                    System.out.println("*** You Wrote Wrong Path of New File. ***");

                }

                // If original file extension and parts file extension does not match
                else if(flag==0){
                    BoxBlur blur = new BoxBlur(3,3,3);
                    JFXDialogLayout Dialouglayout = new JFXDialogLayout();
                    JFXButton btnclose = new JFXButton("Close");
                    btnclose.getStyleClass().add("button1");
                    JFXDialog Dialog = new JFXDialog(rootPane2 , Dialouglayout, JFXDialog.DialogTransition.TOP);
                    btnclose.addEventHandler(MouseEvent.MOUSE_CLICKED, (MouseEvent mouseevent )->{
                        Dialog.close();
                    });
                    Dialouglayout.setHeading(new Label("New File Extension Doesn't Match With Extension of Original File."));
                    Dialouglayout.setActions(btnclose);
                    Dialog.show();
                    Dialog.setOnDialogClosed((JFXDialogEvent event1 ) ->{
                        AnchorPane2.setEffect(null);
                    });
                    AnchorPane2.setEffect(blur);
                }

                // If entered wrong file name
                else{
                    BoxBlur blur = new BoxBlur(3,3,3);
                    JFXDialogLayout Dialouglayout = new JFXDialogLayout();
                    JFXButton btnclose = new JFXButton("Close");
                    btnclose.getStyleClass().add("button1");
                    JFXDialog Dialog = new JFXDialog(rootPane2 , Dialouglayout, JFXDialog.DialogTransition.TOP);
                    btnclose.addEventHandler(MouseEvent.MOUSE_CLICKED, (MouseEvent mouseevent )->{
                        Dialog.close();
                    });
                    Dialouglayout.setHeading(new Label("File Path of First Part Doesn't Exist"));
                    Dialouglayout.setActions(btnclose);
                    Dialog.show();
                    Dialog.setOnDialogClosed((JFXDialogEvent event1 ) ->{
                        AnchorPane2.setEffect(null);
                    });
                    AnchorPane2.setEffect(blur);
                    System.out.println("####### File Path of First Part Doesn't Exist #######");
                }

            } // Try End

            catch(Exception e){
                e.printStackTrace();
            }
            return null;
        }




@FXML
        private void ExitApp(MouseEvent event)
        {
            if (event.getSource() == Close)
            {
                System.exit(0);
            }
            else if (event.getSource() == BtnClose)
            {
                System.exit(0);
            }
        }
    }





